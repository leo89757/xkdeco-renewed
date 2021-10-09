package com.teamfractal.xkdeco.common.creativeTab.init;

import com.teamfractal.xkdeco.common.block.init.basic.XKBasicBlocks;
import com.teamfractal.xkdeco.common.block.init.eastern.XKEasternRoofRelevantBlocks;
import com.teamfractal.xkdeco.common.block.init.western.XKWesternRoofRelevantBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class XKTabs {
    public static final CreativeModeTab xkbasic = new CreativeModeTab("xkdeco_basic") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(XKBasicBlocks.fishTank.get());
        }
    };
    /*public static final CreativeModeTab xkotherancientcivilizations = new CreativeModeTab("xkdeco_other_ancient_civilizations") {
        @Override
        public ItemStack makeIcon() {
            return null;
        }
    };
    public static final CreativeModeTab xknature = new CreativeModeTab("xkdeco_nature") {
        @Override
        public ItemStack makeIcon() {
            return null;
        }
    };*/
    public static final CreativeModeTab xkeastern = new CreativeModeTab("xkdeco_eastern") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(XKEasternRoofRelevantBlocks.blackRoofRidgeBlock.get());
        }
    };
    /*public static final CreativeModeTab xkpunk = new CreativeModeTab("xkdeco_punk") {
        @Override
        public ItemStack makeIcon() {
            return null;
        }
    };*/
    public static final CreativeModeTab xkwestern = new CreativeModeTab("xkdeco_western") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(XKWesternRoofRelevantBlocks.blueRoofRidgeBlock.get());
        }
    };
}
