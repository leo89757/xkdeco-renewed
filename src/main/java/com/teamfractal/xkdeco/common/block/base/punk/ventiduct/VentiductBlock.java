package com.teamfractal.xkdeco.common.block.base.punk.ventiduct;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Collections;
import java.util.List;

public class VentiductBlock extends Block implements SimpleWaterloggedBlock {
    public static final DirectionProperty FACING = DirectionalBlock.FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public VentiductBlock(){
        super(Block.Properties.of(Material.METAL).sound(SoundType.METAL).strength(1f, 10f).lightLevel(s -> 0)
                .noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
        this.registerDefaultState(this.getStateDefinition().any().setValue(FACING, Direction.SOUTH).setValue(WATERLOGGED, false));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        switch ((Direction) state.getValue(FACING)) {
            case SOUTH :
            case NORTH :
            default :
                return Shapes
                        .join(Shapes.or(Block.box(0, 0, 0, 16, 16, 16)),
                                Shapes.or(Block.box(2, 0, 2, 14, 16, 14)), BooleanOp.ONLY_FIRST);
            case EAST :
            case WEST :
                return Shapes
                        .join(Shapes.or(Block.box(0, 0, 0, 16, 16, 16)),
                                Shapes.or(Block.box(2, 2, 0, 14, 14, 16)), BooleanOp.ONLY_FIRST);
            case UP :
            case DOWN :
                return Shapes
                        .join(Shapes.or(Block.box(0, 0, 0, 16, 16, 16)),
                                Shapes.or(Block.box(0, 2, 2, 16, 14, 14)), BooleanOp.ONLY_FIRST);
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED);
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        if (rot == Rotation.CLOCKWISE_90 || rot == Rotation.COUNTERCLOCKWISE_90) {
            if ((Direction) state.getValue(FACING) == Direction.WEST || (Direction) state.getValue(FACING) == Direction.EAST) {
                return state.setValue(FACING, Direction.UP);
            } else if ((Direction) state.getValue(FACING) == Direction.UP || (Direction) state.getValue(FACING) == Direction.DOWN) {
                return state.setValue(FACING, Direction.WEST);
            }
        }
        return state;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction facing = context.getClickedFace();
        if (facing == Direction.WEST || facing == Direction.EAST)
            facing = Direction.UP;
        else if (facing == Direction.NORTH || facing == Direction.SOUTH)
            facing = Direction.EAST;
        else
            facing = Direction.SOUTH;
        boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;;
        return this.defaultBlockState().setValue(FACING, facing).setValue(WATERLOGGED, flag);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos,
                                  BlockPos facingPos) {
        if (state.getValue(WATERLOGGED)) {
            world.getLiquidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
        }
        return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }
}
