package com.teamfractal.xkdeco.common.block.base.natural;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;

import java.util.Collections;
import java.util.List;

public class MultiSoundStairBlock extends StairBlock {
    public MultiSoundStairBlock(Material m,SoundType so){
        super(() -> new Block(Properties.of(m).sound(so).strength(1f, 10f).lightLevel(s -> 0)
                        .noOcclusion().isRedstoneConductor((bs, br, bp) -> false)).defaultBlockState(),
                Properties.of(m).sound(so).strength(1f, 10f).lightLevel(s -> 0).noOcclusion()
                        .isRedstoneConductor((bs, br, bp) -> false));
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }
}
