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

public class VentiductObliqueSecondBlock extends Block implements SimpleWaterloggedBlock {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public VentiductObliqueSecondBlock(){
        super(Properties.of(Material.METAL).sound(SoundType.METAL).strength(1f, 10f).lightLevel(s -> 0)
                .noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
        this.registerDefaultState(this.getStateDefinition().any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        switch ((Direction) state.getValue(FACING)) {
            case SOUTH :
            default :
                return Shapes
                        .join(
                                Shapes.or(Block.box(0, 0, 0, 16, 16, 4), Block.box(0, -2, 4, 16, 16, 6),
                                        Block.box(0, -4, 6, 16, 16, 8), Block.box(0, -6, 8, 16, 16, 10),
                                        Block.box(0, -8, 10, 16, 16, 12), Block.box(0, -10, 12, 16, 14, 14),
                                        Block.box(0, -12, 14, 16, 12, 16)),
                                Shapes.or(Block.box(2, 2, 0, 14, 14, 4), Block.box(2, 0, 4, 14, 14, 6),
                                        Block.box(2, -2, 6, 14, 14, 8), Block.box(2, -4, 8, 14, 14, 10),
                                        Block.box(2, -6, 10, 14, 14, 12), Block.box(2, -8, 12, 14, 12, 14),
                                        Block.box(2, -10, 14, 14, 10, 16)),
                                BooleanOp.ONLY_FIRST);
            case NORTH :
                return Shapes.
                        join(
                                Shapes.or(Block.box(0, 0, 12, 16, 16, 16), Block.box(0, -2, 10, 16, 16, 12),
                                        Block.box(0, -4, 8, 16, 16, 10), Block.box(0, -6, 6, 16, 16, 8), Block.box(0, -8, 4, 16, 16, 6),
                                        Block.box(0, -10, 2, 16, 14, 4), Block.box(0, -12, 0, 16, 12, 2)),
                                Shapes.or(Block.box(2, 2, 12, 14, 14, 16), Block.box(2, 0, 10, 14, 14, 12),
                                        Block.box(2, -2, 8, 14, 14, 10), Block.box(2, -4, 6, 14, 14, 8), Block.box(2, -6, 4, 14, 14, 6),
                                        Block.box(2, -8, 2, 14, 12, 4), Block.box(2, -10, 0, 14, 10, 2)),
                                BooleanOp.ONLY_FIRST);
            case EAST :
                return Shapes
                        .join(
                                Shapes.or(Block.box(0, 0, 0, 4, 16, 16), Block.box(4, -2, 0, 6, 16, 16),
                                        Block.box(6, -4, 0, 8, 16, 16), Block.box(8, -6, 0, 10, 16, 16),
                                        Block.box(10, -8, 0, 12, 16, 16), Block.box(12, -10, 0, 14, 14, 16),
                                        Block.box(14, -12, 0, 16, 12, 16)),
                                Shapes.or(Block.box(0, 2, 2, 4, 14, 14), Block.box(4, 0, 2, 6, 14, 14),
                                        Block.box(6, -2, 2, 8, 14, 14), Block.box(8, -4, 2, 10, 14, 14),
                                        Block.box(10, -6, 2, 12, 14, 14), Block.box(12, -8, 2, 14, 12, 14),
                                        Block.box(14, -10, 2, 16, 10, 14)),
                                BooleanOp.ONLY_FIRST);
            case WEST :
                return Shapes
                        .join(
                                Shapes.or(Block.box(12, 0, 0, 16, 16, 16), Block.box(10, -2, 0, 12, 16, 16),
                                        Block.box(8, -4, 0, 10, 16, 16), Block.box(6, -6, 0, 8, 16, 16), Block.box(4, -8, 0, 6, 16, 16),
                                        Block.box(2, -10, 0, 4, 14, 16), Block.box(0, -12, 0, 2, 12, 16)),
                                Shapes.or(Block.box(12, 2, 2, 16, 14, 14), Block.box(10, 0, 2, 12, 14, 14),
                                        Block.box(8, -2, 2, 10, 14, 14), Block.box(6, -4, 2, 8, 14, 14), Block.box(4, -6, 2, 6, 14, 14),
                                        Block.box(2, -8, 2, 4, 12, 14), Block.box(0, -10, 2, 2, 10, 14)),
                                BooleanOp.ONLY_FIRST);
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED);
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;;
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(WATERLOGGED, flag);
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
