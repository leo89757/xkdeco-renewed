package com.teamfractal.xkdeco.common.block.base;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.WallSide;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Collections;
import java.util.List;

public class GenericWallBlock extends WallBlock {
    public GenericWallBlock(){
        super(Properties.of(Material.STONE).sound(SoundType.STONE).strength(1f, 10f).lightLevel(s -> 0).
                noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
    }
    private static final VoxelShape NORTH_TEST = Block.box(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 9.0D);
    private static final VoxelShape EAST_TEST = Block.box(7.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D);
    private static final VoxelShape WEST_TEST = Block.box(0.0D, 0.0D, 7.0D, 9.0D, 16.0D, 9.0D);
    private static final VoxelShape SOUTH_TEST = Block.box(7.0D, 0.0D, 7.0D, 9.0D, 16.0D, 16.0D);
    private static final VoxelShape POST_TEST = Block.box(7.0D, 0.0D, 7.0D, 9.0D, 16.0D, 9.0D);
    private boolean shouldConnect(BlockState state, boolean checkattach, Direction face) {
        boolean flag = state.getBlock() instanceof WallBlock
                || state.getBlock() instanceof FenceGateBlock && FenceGateBlock.connectsToDirection(state, face);
        return !isExceptionForConnection(state.getBlock().defaultBlockState()) && checkattach || flag;
    }


    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        LevelReader iworldreader = context.getLevel();
        BlockPos blockpos = context.getClickedPos();
        FluidState fluidstate = context.getLevel().getFluidState(context.getClickedPos());
        BlockPos blockpos1 = blockpos.north();
        BlockPos blockpos2 = blockpos.east();
        BlockPos blockpos3 = blockpos.south();
        BlockPos blockpos4 = blockpos.west();
        BlockPos blockpos5 = blockpos.above();
        BlockState blockstate = iworldreader.getBlockState(blockpos1);
        BlockState blockstate1 = iworldreader.getBlockState(blockpos2);
        BlockState blockstate2 = iworldreader.getBlockState(blockpos3);
        BlockState blockstate3 = iworldreader.getBlockState(blockpos4);
        BlockState blockstate4 = iworldreader.getBlockState(blockpos5);
        boolean flag = this.shouldConnect(blockstate, blockstate.isFaceSturdy(iworldreader, blockpos1, Direction.SOUTH), Direction.SOUTH);
        boolean flag1 = this.shouldConnect(blockstate1, blockstate1.isFaceSturdy(iworldreader, blockpos2, Direction.WEST), Direction.WEST);
        boolean flag2 = this.shouldConnect(blockstate2, blockstate2.isFaceSturdy(iworldreader, blockpos3, Direction.NORTH), Direction.NORTH);
        boolean flag3 = this.shouldConnect(blockstate3, blockstate3.isFaceSturdy(iworldreader, blockpos4, Direction.EAST), Direction.EAST);
        BlockState blockstate5 = this.defaultBlockState().setValue(WATERLOGGED, fluidstate.getType() == Fluids.WATER);
        return func_235626_a_(iworldreader, blockstate5, blockpos5, blockstate4, flag, flag1, flag2, flag3);
    }

    private BlockState func_235626_a_(LevelReader p_57980_, BlockState p_57981_, BlockPos p_57982_, BlockState p_57983_, boolean p_57984_, boolean p_57985_, boolean p_57986_, boolean p_57987_) {
        VoxelShape voxelshape = p_57983_.getCollisionShape(p_57980_, p_57982_).getFaceShape(Direction.DOWN);
        BlockState blockstate = this.updateSides(p_57981_, p_57984_, p_57985_, p_57986_, p_57987_, voxelshape);
        return blockstate.setValue(UP, this.shouldRaisePost(blockstate, p_57983_, voxelshape));

    }

    @Override /**
     * Update the provided state given the provided neighbor facing and neighbor
     * state, returning a new state. For example, fences make their connections to
     * the passed in state if possible, and wet concrete powder immediately returns
     * its solidified counterpart. Note that this method should ideally consider
     * only the specific face passed in.
     */
    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, LevelAccessor worldIn, BlockPos currentPos,
                                  BlockPos facingPos) {
        if (stateIn.getValue(WATERLOGGED)) {
            worldIn.getLiquidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(worldIn));
        }
        if (facing == Direction.DOWN) {
            return super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
        } else {
            return facing == Direction.UP
                    ? this.topUpdate(worldIn, stateIn, facingPos, facingState)
                    : this.sideUpdate(worldIn, currentPos, stateIn, facingPos, facingState, facing);
        }
    }

    private BlockState topUpdate(LevelReader reader, BlockState state1, BlockPos pos, BlockState state2) {
        boolean flag = isConnected(state1, NORTH_WALL);
        boolean flag1 = isConnected(state1, EAST_WALL);
        boolean flag2 = isConnected(state1, SOUTH_WALL);
        boolean flag3 = isConnected(state1, WEST_WALL);
        return this.func_235626_a_(reader, state1, pos, state2, flag, flag1, flag2, flag3);
    }

    private BlockState sideUpdate(LevelReader reader, BlockPos p_235627_2_, BlockState p_235627_3_, BlockPos p_235627_4_,
                                  BlockState p_235627_5_, Direction directionIn) {
        Direction direction = directionIn.getOpposite();
        boolean flag = directionIn == Direction.NORTH
                ? this.shouldConnect(p_235627_5_, p_235627_5_.isFaceSturdy(reader, p_235627_4_, direction), direction)
                : isConnected(p_235627_3_, NORTH_WALL);
        boolean flag1 = directionIn == Direction.EAST
                ? this.shouldConnect(p_235627_5_, p_235627_5_.isFaceSturdy(reader, p_235627_4_, direction), direction)
                : isConnected(p_235627_3_, EAST_WALL);
        boolean flag2 = directionIn == Direction.SOUTH
                ? this.shouldConnect(p_235627_5_, p_235627_5_.isFaceSturdy(reader, p_235627_4_, direction), direction)
                : isConnected(p_235627_3_, SOUTH_WALL);
        boolean flag3 = directionIn == Direction.WEST
                ? this.shouldConnect(p_235627_5_, p_235627_5_.isFaceSturdy(reader, p_235627_4_, direction), direction)
                : isConnected(p_235627_3_, WEST_WALL);
        BlockPos blockpos = p_235627_2_.above();
        BlockState blockstate = reader.getBlockState(blockpos);
        return this.func_235626_a_(reader, p_235627_3_, blockpos, blockstate, flag, flag1, flag2, flag3);
    }

    private static boolean isConnected(BlockState state, Property<WallSide> heightProperty) {
        return state.getValue(heightProperty) != WallSide.NONE;
    }

    private BlockState updateSides(BlockState p_58025_, boolean p_58026_, boolean p_58027_, boolean p_58028_, boolean p_58029_, VoxelShape p_58030_) {
        return p_58025_.setValue(NORTH_WALL, this.makeWallState(p_58026_, p_58030_, NORTH_TEST)).setValue(EAST_WALL, this.makeWallState(p_58027_, p_58030_, EAST_TEST)).setValue(SOUTH_WALL, this.makeWallState(p_58028_, p_58030_, SOUTH_TEST)).setValue(WEST_WALL, this.makeWallState(p_58029_, p_58030_, WEST_TEST));
    }

    private boolean shouldRaisePost(BlockState p_58007_, BlockState p_58008_, VoxelShape p_58009_) {
        boolean flag = p_58008_.getBlock() instanceof WallBlock && p_58008_.getValue(UP);
        if (flag) {
            return true;
        } else {
            WallSide wallside = p_58007_.getValue(NORTH_WALL);
            WallSide wallside1 = p_58007_.getValue(SOUTH_WALL);
            WallSide wallside2 = p_58007_.getValue(EAST_WALL);
            WallSide wallside3 = p_58007_.getValue(WEST_WALL);
            boolean flag1 = wallside1 == WallSide.NONE;
            boolean flag2 = wallside3 == WallSide.NONE;
            boolean flag3 = wallside2 == WallSide.NONE;
            boolean flag4 = wallside == WallSide.NONE;
            boolean flag5 = flag4 && flag1 && flag2 && flag3 || flag4 != flag1 || flag2 != flag3;
            if (flag5) {
                return true;
            } else {
                boolean flag6 = wallside == WallSide.TALL && wallside1 == WallSide.TALL || wallside2 == WallSide.TALL && wallside3 == WallSide.TALL;
                if (flag6) {
                    return false;
                } else {
                    return p_58008_.is(BlockTags.WALL_POST_OVERRIDE) || isCovered(p_58009_, POST_TEST);
                }
            }
        }
    }

    private WallSide makeWallState(boolean p_58042_, VoxelShape p_58043_, VoxelShape p_58044_) {
        if (p_58042_) {
            return isCovered(p_58043_, p_58044_) ? WallSide.TALL : WallSide.LOW;
        } else {
            return WallSide.NONE;
        }
    }
    private static boolean isCovered(VoxelShape p_58039_, VoxelShape p_58040_) {
        return !Shapes.joinIsNotEmpty(p_58040_, p_58039_, BooleanOp.ONLY_FIRST);
    }




    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }
}
