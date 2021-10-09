package com.teamfractal.xkdeco.common.block.base.natural;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;

import java.util.Collections;
import java.util.List;

public class XKLeavesBlock extends LeavesBlock {
    public XKLeavesBlock(){
        super(BlockBehaviour.Properties.of(Material.LEAVES).sound(SoundType.CROP).strength(0.5f, 0.5f).lightLevel(s -> 0)
                .noOcclusion());
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }
}
