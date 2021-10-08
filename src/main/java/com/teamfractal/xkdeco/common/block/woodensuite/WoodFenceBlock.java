package com.teamfractal.xkdeco.common.block.woodensuite;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;

import java.util.Collections;
import java.util.List;

public class WoodFenceBlock extends FenceBlock {
    public WoodFenceBlock(){
        super(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2f, 3f).lightLevel(s -> 0).noOcclusion()
                .isRedstoneConductor((bs, br, bp) -> false));
    }

    @Override
    public boolean connectsTo(BlockState state, boolean checkattach, Direction face) {
        boolean flag = state.getBlock() instanceof FenceBlock && state.getMaterial() == this.material;
        boolean flag1 = state.getBlock() instanceof FenceGateBlock && FenceGateBlock.connectsToDirection(state, face);
        return !isExceptionForConnection(state.getBlock().defaultBlockState()) && checkattach || flag || flag1;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 5;
    }


    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }
}

