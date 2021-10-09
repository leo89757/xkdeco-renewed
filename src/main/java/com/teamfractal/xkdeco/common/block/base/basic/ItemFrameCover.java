package com.teamfractal.xkdeco.common.block.base.basic;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
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

public class ItemFrameCover extends Block implements SimpleWaterloggedBlock {
    public static final DirectionProperty FACING = DirectionalBlock.FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public ItemFrameCover(int lightLevel){
        super(Block.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(1f, 3f).noOcclusion().lightLevel(s -> lightLevel)
                .isRedstoneConductor((bs, br, bp) -> false));
        this.registerDefaultState(this.getStateDefinition().any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
    }


    @Override
    public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
        return true;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        switch ((Direction) state.getValue(FACING)) {
            case SOUTH :
            default :
                return Shapes
                        .join(Shapes.or(Block.box(1, 1, 0, 15, 15, 4)),
                                Shapes.or(Block.box(2, 2, 0, 14, 14, 3)), BooleanOp.ONLY_FIRST);
            case NORTH :
                return Shapes
                        .join(Shapes.or(Block.box(1, 1, 12, 15, 15, 16)),
                                Shapes.or(Block.box(2, 2, 13, 14, 14, 16)), BooleanOp.ONLY_FIRST);
            case EAST :
                return Shapes
                        .join(Shapes.or(Block.box(0, 1, 1, 4, 15, 15)),
                                Shapes.or(Block.box(0, 2, 2, 3, 14, 14)), BooleanOp.ONLY_FIRST);
            case WEST :
                return Shapes
                        .join(Shapes.or(Block.box(12, 1, 1, 16, 15, 15)),
                                Shapes.or(Block.box(13, 2, 2, 16, 14, 14)), BooleanOp.ONLY_FIRST);
            case UP :
                return Shapes
                        .join(Shapes.or(Block.box(1, 0, 1, 15, 4, 15)),
                                Shapes.or(Block.box(2, 0, 2, 14, 3, 14)), BooleanOp.ONLY_FIRST);
            case DOWN :
                return Shapes
                        .join(Shapes.or(Block.box(1, 12, 1, 15, 16, 15)),
                                Shapes.or(Block.box(2, 13, 2, 14, 16, 14)), BooleanOp.ONLY_FIRST);
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
        Direction facing = context.getClickedFace();
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
    public float getEnchantPowerBonus(BlockState state, LevelReader world, BlockPos pos) {
        return 1f;
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(Items.BOOK, (int) (4)));
    }
}