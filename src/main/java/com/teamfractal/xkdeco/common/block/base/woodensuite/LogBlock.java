package com.teamfractal.xkdeco.common.block.base.woodensuite;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraftforge.common.IPlantable;

import java.util.Collections;
import java.util.List;

public class LogBlock extends Block {
    public static final DirectionProperty FACING = DirectionalBlock.FACING;
    public LogBlock(){
        super(Block.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2f, 2f).lightLevel(s -> 0));
        this.registerDefaultState(this.getStateDefinition().any().setValue(FACING, Direction.SOUTH));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
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
            facing = Direction.SOUTH;;
        return this.defaultBlockState().setValue(FACING, facing);
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 5;
    }

    @Override
    public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction direction, IPlantable plantable) {
        return true;
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }
}
