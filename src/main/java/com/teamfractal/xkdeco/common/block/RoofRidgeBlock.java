package com.teamfractal.xkdeco.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
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

public class RoofRidgeBlock extends WallBlock {
    public RoofRidgeBlock(){
        super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1f, 10f).lightLevel(s -> 0).
                noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
    }
    private static final VoxelShape CENTER_POLE_SHAPE = Block.box(7.0D, 0.0D, 7.0D, 9.0D, 16.0D, 9.0D);
    private static final VoxelShape WALL_CONNECTION_NORTH_SIDE_SHAPE = Block.box(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 9.0D);
    private static final VoxelShape WALL_CONNECTION_SOUTH_SIDE_SHAPE = Block.box(7.0D, 0.0D, 7.0D, 9.0D, 16.0D, 16.0D);
    private static final VoxelShape WALL_CONNECTION_WEST_SIDE_SHAPE = Block.box(0.0D, 0.0D, 7.0D, 9.0D, 16.0D, 9.0D);
    private static final VoxelShape WALL_CONNECTION_EAST_SIDE_SHAPE = Block.box(7.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D);
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
        return updateShape(iworldreader, blockstate5, blockpos5, blockstate4, flag, flag1, flag2, flag3);
    }

    private BlockState updateShape(LevelReader p_57980_, BlockState p_57981_, BlockPos p_57982_, BlockState p_57983_, boolean p_57984_, boolean p_57985_, boolean p_57986_, boolean p_57987_) {
        VoxelShape voxelshape = p_57983_.getCollisionShape(p_57980_, p_57982_).getFaceShape(Direction.DOWN);
        BlockState blockstate = this.updateSides(p_57981_, p_57984_, p_57985_, p_57986_, p_57987_, voxelshape);
        return blockstate.setValue(UP, Boolean.valueOf(this.shouldRaisePost(blockstate, p_57983_, voxelshape)));
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }
}
