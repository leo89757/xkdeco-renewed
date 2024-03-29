package com.teamfractal.xkdeco.common.item.init.natural;

import com.teamfractal.xkdeco.common.block.init.natural.XKNaturalBlocks;
import com.teamfractal.xkdeco.common.creativeTab.init.XKTabs;
import com.teamfractal.xkdeco.common.util.XKRegistryHandler;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;

public class XKNaturalBlockItems {
    public static RegistryObject<Item> dirtslab;
    public static RegistryObject<Item> dirtPathSlab;
    public static RegistryObject<Item> grassBlockSlab;
    public static RegistryObject<Item> myceliumSlab;
    public static RegistryObject<Item> podzolSlab;
    public static RegistryObject<Item> netherrackSlab;
    public static RegistryObject<Item> crimsonNyliumSlab;
    public static RegistryObject<Item> warpedNyliumSlab;
    public static RegistryObject<Item> endStoneSlab;
    public static RegistryObject<Item> dirtCobblestone;
    public static RegistryObject<Item> grassCobblestone;
    public static RegistryObject<Item> sandyCobblestone;
    public static RegistryObject<Item> snowyCobblestone;
    public static RegistryObject<Item> cobblestonePath;
    public static RegistryObject<Item> dirtCobblestonePath;
    public static RegistryObject<Item> grassCobblestonePath;
    public static RegistryObject<Item> sandyCobblestonePath;
    public static RegistryObject<Item> snowyCobblestonePath;
    public static RegistryObject<Item> dirtCobblestoneSlab;
    public static RegistryObject<Item> grassCobblestoneSlab;
    public static RegistryObject<Item> sandyCobblestoneSlab;
    public static RegistryObject<Item> snowyCobblestoneSlab;
    public static RegistryObject<Item> cobblestonePathSlab;
    public static RegistryObject<Item> dirtCobblestonePathSlab;
    public static RegistryObject<Item> grassCobblestonePathSlab;
    public static RegistryObject<Item> sandyCobblestonePathSlab;
    public static RegistryObject<Item> snowyCobblestonePathSlab;
    public static RegistryObject<Item> dirtCobblestoneStair;
    public static RegistryObject<Item> grassCobblestoneStair;
    public static RegistryObject<Item> sandyCobblestoneStair;
    public static RegistryObject<Item> snowyCobblestoneStair;
    public static RegistryObject<Item> cobblestonePathStair;
    public static RegistryObject<Item> dirtCobblestonePathStair;
    public static RegistryObject<Item> grassCobblestonePathStair;
    public static RegistryObject<Item> sandyCobblestonePathStair;
    public static RegistryObject<Item> snowyCobblestonePathStair;
    public static RegistryObject<Item> ginkgoLeaves;
    public static RegistryObject<Item> orangeMapleLeaves;
    public static RegistryObject<Item> redMapleLeaves;
    public static RegistryObject<Item> peachBlossom;
    public static RegistryObject<Item> peachBlossomLeaves;
    public static RegistryObject<Item> cherryBlossom;
    public static RegistryObject<Item> cherryBlossomLeaves;
    public static RegistryObject<Item> whiteCherryBlossom;
    public static RegistryObject<Item> whiteCherryBlossomLeaves;
    public static RegistryObject<Item> grassableLeaves;
    public static RegistryObject<Item> willowLeaves;
    public static RegistryObject<Item> willowLeavesEnd;

    public static void register(){
        dirtslab = XKRegistryHandler.Items.register("dirtslab", () -> new BlockItem(XKNaturalBlocks.dirtslab.get(),new Item.Properties().tab(XKTabs.xknature)));
        dirtPathSlab = XKRegistryHandler.Items.register("dirt_path_slab",() -> new BlockItem(XKNaturalBlocks.dirtPathSlab.get(),new Item.Properties().tab(XKTabs.xknature)));
        grassBlockSlab = XKRegistryHandler.Items.register("grass_block_slab", () -> new BlockItem(XKNaturalBlocks.grassBlockSlab.get(),new Item.Properties().tab(XKTabs.xknature)));
        myceliumSlab = XKRegistryHandler.Items.register("mycelium_slab", () -> new BlockItem(XKNaturalBlocks.myceliumSlab.get(),new Item.Properties().tab(XKTabs.xknature)));
        podzolSlab = XKRegistryHandler.Items.register("podzol_slab", () -> new BlockItem(XKNaturalBlocks.podzolSlab.get(),new Item.Properties().tab(XKTabs.xknature)));
        netherrackSlab = XKRegistryHandler.Items.register("netherrack_slab", () -> new BlockItem(XKNaturalBlocks.netherrackSlab.get(),new Item.Properties().tab(XKTabs.xknature)));
        crimsonNyliumSlab = XKRegistryHandler.Items.register("crimson_nylium_slab", () -> new BlockItem(XKNaturalBlocks.crimsonNyliumSlab.get(),new Item.Properties().tab(XKTabs.xknature)));
        warpedNyliumSlab = XKRegistryHandler.Items.register("warped_nylium_slab", () -> new BlockItem(XKNaturalBlocks.warpedNyliumSlab.get(),new Item.Properties().tab(XKTabs.xknature)));
        endStoneSlab = XKRegistryHandler.Items.register("end_stone_slab", () -> new BlockItem(XKNaturalBlocks.endStoneSlab.get(),new Item.Properties().tab(XKTabs.xknature)));
        dirtCobblestone = XKRegistryHandler.Items.register("dirt_cobblestone", () -> new BlockItem(XKNaturalBlocks.dirtCobblestone.get(),new Item.Properties().tab(XKTabs.xknature)));
        grassCobblestone = XKRegistryHandler.Items.register("grass_cobblestone", () -> new BlockItem(XKNaturalBlocks.grassCobblestone.get(),new Item.Properties().tab(XKTabs.xknature)));
        sandyCobblestone = XKRegistryHandler.Items.register("sandy_cobblestone", () -> new BlockItem(XKNaturalBlocks.sandyCobblestone.get(),new Item.Properties().tab(XKTabs.xknature)));
        snowyCobblestone = XKRegistryHandler.Items.register("snowy_cobblestone", () -> new BlockItem(XKNaturalBlocks.snowyCobblestone.get(),new Item.Properties().tab(XKTabs.xknature)));
        cobblestonePath = XKRegistryHandler.Items.register("cobblestone_path", () -> new BlockItem(XKNaturalBlocks.cobblestonePath.get(),new Item.Properties().tab(XKTabs.xknature)));
        dirtCobblestonePath = XKRegistryHandler.Items.register("dirt_cobblestone_path", () -> new BlockItem(XKNaturalBlocks.dirtCobblestonePath.get(),new Item.Properties().tab(XKTabs.xknature)));
        grassCobblestonePath = XKRegistryHandler.Items.register("grass_cobblestone_path", () -> new BlockItem(XKNaturalBlocks.grassCobblestonePath.get(),new Item.Properties().tab(XKTabs.xknature)));
        sandyCobblestonePath = XKRegistryHandler.Items.register("sandy_cobblestone_path", () -> new BlockItem(XKNaturalBlocks.sandyCobblestonePath.get(),new Item.Properties().tab(XKTabs.xknature)));
        snowyCobblestonePath = XKRegistryHandler.Items.register("snowy_cobblestone_path", () -> new BlockItem(XKNaturalBlocks.snowyCobblestonePath.get(),new Item.Properties().tab(XKTabs.xknature)));
        dirtCobblestoneSlab = XKRegistryHandler.Items.register("dirt_cobblestone_slab", () -> new BlockItem(XKNaturalBlocks.dirtCobblestoneSlab.get(),new Item.Properties().tab(XKTabs.xknature)));
        grassCobblestoneSlab = XKRegistryHandler.Items.register("grass_cobblestone_slab", () -> new BlockItem(XKNaturalBlocks.grassCobblestoneSlab.get(),new Item.Properties().tab(XKTabs.xknature)));
        sandyCobblestoneSlab = XKRegistryHandler.Items.register("sandy_cobblestone_slab", () -> new BlockItem(XKNaturalBlocks.sandyCobblestoneSlab.get(),new Item.Properties().tab(XKTabs.xknature)));
        snowyCobblestoneSlab = XKRegistryHandler.Items.register("snowy_cobblestone_slab", () -> new BlockItem(XKNaturalBlocks.snowyCobblestoneSlab.get(),new Item.Properties().tab(XKTabs.xknature)));
        cobblestonePathSlab = XKRegistryHandler.Items.register("cobblestone_path_slab", () -> new BlockItem(XKNaturalBlocks.cobblestonePathSlab.get(),new Item.Properties().tab(XKTabs.xknature)));
        dirtCobblestonePathSlab = XKRegistryHandler.Items.register("dirt_cobblestone_path_slab", () -> new BlockItem(XKNaturalBlocks.dirtCobblestonePathSlab.get(),new Item.Properties().tab(XKTabs.xknature)));
        grassCobblestonePathSlab = XKRegistryHandler.Items.register("grass_cobblestone_path_slab", () -> new BlockItem(XKNaturalBlocks.grassCobblestonePathSlab.get(),new Item.Properties().tab(XKTabs.xknature)));
        sandyCobblestonePathSlab = XKRegistryHandler.Items.register("sandy_cobblestone_path_slab", () -> new BlockItem(XKNaturalBlocks.sandyCobblestonePathSlab.get(),new Item.Properties().tab(XKTabs.xknature)));
        snowyCobblestonePathSlab = XKRegistryHandler.Items.register("snowy_cobblestone_path_slab", () -> new BlockItem(XKNaturalBlocks.snowyCobblestonePathSlab.get(),new Item.Properties().tab(XKTabs.xknature)));
        dirtCobblestoneStair = XKRegistryHandler.Items.register("dirt_cobblestone_stair", () -> new BlockItem(XKNaturalBlocks.dirtCobblestoneStair.get(),new Item.Properties().tab(XKTabs.xknature)));
        grassCobblestoneStair = XKRegistryHandler.Items.register("grass_cobblestone_stair", () -> new BlockItem(XKNaturalBlocks.grassCobblestoneStair.get(),new Item.Properties().tab(XKTabs.xknature)));
        sandyCobblestoneStair = XKRegistryHandler.Items.register("sandy_cobblestone_stair", () -> new BlockItem(XKNaturalBlocks.sandyCobblestoneStair.get(),new Item.Properties().tab(XKTabs.xknature)));
        snowyCobblestoneStair = XKRegistryHandler.Items.register("snowy_cobblestone_stair", () -> new BlockItem(XKNaturalBlocks.snowyCobblestoneStair.get(),new Item.Properties().tab(XKTabs.xknature)));
        cobblestonePathStair = XKRegistryHandler.Items.register("cobblestone_path_stair", () -> new BlockItem(XKNaturalBlocks.cobblestonePathStair.get(),new Item.Properties().tab(XKTabs.xknature)));
        dirtCobblestonePathStair = XKRegistryHandler.Items.register("dirt_cobblestone_path_stair", () -> new BlockItem(XKNaturalBlocks.dirtCobblestonePathStair.get(),new Item.Properties().tab(XKTabs.xknature)));
        grassCobblestonePathStair = XKRegistryHandler.Items.register("grass_cobblestone_path_stair", () -> new BlockItem(XKNaturalBlocks.grassCobblestonePathStair.get(),new Item.Properties().tab(XKTabs.xknature)));
        sandyCobblestonePathStair = XKRegistryHandler.Items.register("sandy_cobblestone_path_stair", () -> new BlockItem(XKNaturalBlocks.sandyCobblestonePathStair.get(),new Item.Properties().tab(XKTabs.xknature)));
        snowyCobblestonePathStair = XKRegistryHandler.Items.register("snowy_cobblestone_path_stair", () -> new BlockItem(XKNaturalBlocks.snowyCobblestonePathStair.get(),new Item.Properties().tab(XKTabs.xknature)));
        ginkgoLeaves = XKRegistryHandler.Items.register("ginkgo_leaves", () -> new BlockItem(XKNaturalBlocks.ginkgoLeaves.get(),new Item.Properties().tab(XKTabs.xknature)));
        orangeMapleLeaves = XKRegistryHandler.Items.register("orange_maple_leaves", () -> new BlockItem(XKNaturalBlocks.orangeMapleLeaves.get(),new Item.Properties().tab(XKTabs.xknature)));
        redMapleLeaves = XKRegistryHandler.Items.register("red_maple_leaves", () -> new BlockItem(XKNaturalBlocks.redMapleLeaves.get(),new Item.Properties().tab(XKTabs.xknature)));
        peachBlossom = XKRegistryHandler.Items.register("peach_blossom", () -> new BlockItem(XKNaturalBlocks.peachBlossom.get(),new Item.Properties().tab(XKTabs.xknature)));
        peachBlossomLeaves = XKRegistryHandler.Items.register("peach_blossom_leaves", () -> new BlockItem(XKNaturalBlocks.peachBlossomLeaves.get(),new Item.Properties().tab(XKTabs.xknature)));
        cherryBlossom = XKRegistryHandler.Items.register("cherry_blossom", () -> new BlockItem(XKNaturalBlocks.cherryBlossom.get(),new Item.Properties().tab(XKTabs.xknature)));
        cherryBlossomLeaves = XKRegistryHandler.Items.register("cherry_blossom_leaves", () -> new BlockItem(XKNaturalBlocks.cherryBlossomLeaves.get(),new Item.Properties().tab(XKTabs.xknature)));
        whiteCherryBlossom = XKRegistryHandler.Items.register("white_cherry_blossom", () -> new BlockItem(XKNaturalBlocks.whiteCherryBlossom.get(),new Item.Properties().tab(XKTabs.xknature)));
        whiteCherryBlossomLeaves = XKRegistryHandler.Items.register("white_cherry_blossom_leaves", () -> new BlockItem(XKNaturalBlocks.whiteCherryBlossomLeaves.get(),new Item.Properties().tab(XKTabs.xknature)));
        grassableLeaves = XKRegistryHandler.Items.register("grassable_leaves", () -> new BlockItem(XKNaturalBlocks.grassableLeaves.get(),new Item.Properties().tab(XKTabs.xknature)));
        willowLeaves = XKRegistryHandler.Items.register("willow_leaves", () -> new BlockItem(XKNaturalBlocks.willowLeaves.get(),new Item.Properties().tab(XKTabs.xknature)));
        willowLeavesEnd = XKRegistryHandler.Items.register("willow_leaves_end", () -> new BlockItem(XKNaturalBlocks.willowLeavesEnd.get(),new Item.Properties().tab(XKTabs.xknature)));
    }
}
