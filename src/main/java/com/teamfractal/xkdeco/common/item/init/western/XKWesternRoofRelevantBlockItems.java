package com.teamfractal.xkdeco.common.item.init.western;

import com.teamfractal.xkdeco.common.block.init.western.XKWesternRoofRelevantBlocks;
import com.teamfractal.xkdeco.common.creativeTab.init.XKTabs;
import com.teamfractal.xkdeco.common.util.XKRegistryHandler;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;

public class XKWesternRoofRelevantBlockItems {
    public static RegistryObject<Item> greenEaveBlock;
    public static RegistryObject<Item> greenEaveSideBlock;
    public static RegistryObject<Item> greenRoofBlock;
    public static RegistryObject<Item> greenRoofGentleBlock;
    public static RegistryObject<Item> greenRoofGentleSideBlock;
    public static RegistryObject<Item> greenRoofRidgeBlock;
    public static RegistryObject<Item> greenRoofSideBlock;
    public static RegistryObject<Item> greenRoofSteepBlock;
    public static RegistryObject<Item> greenRoofSteepSideBlock;
    public static RegistryObject<Item> greenTilesBlock;
    public static RegistryObject<Item> greenTileSlabBlock;
    public static RegistryObject<Item> greenTileStairBlock;

    public static RegistryObject<Item> redEaveBlock;
    public static RegistryObject<Item> redEaveSideBlock;
    public static RegistryObject<Item> redRoofBlock;
    public static RegistryObject<Item> redRoofGentleBlock;
    public static RegistryObject<Item> redRoofGentleSideBlock;
    public static RegistryObject<Item> redRoofRidgeBlock;
    public static RegistryObject<Item> redRoofSideBlock;
    public static RegistryObject<Item> redRoofSteepBlock;
    public static RegistryObject<Item> redRoofSteepSideBlock;
    public static RegistryObject<Item> redTilesBlock;
    public static RegistryObject<Item> redTileSlabBlock;
    public static RegistryObject<Item> redTileStairBlock;

    public static RegistryObject<Item> blueEaveBlock;
    public static RegistryObject<Item> blueEaveSideBlock;
    public static RegistryObject<Item> blueRoofBlock;
    public static RegistryObject<Item> blueRoofGentleBlock;
    public static RegistryObject<Item> blueRoofGentleSideBlock;
    public static RegistryObject<Item> blueRoofRidgeBlock;
    public static RegistryObject<Item> blueRoofSideBlock;
    public static RegistryObject<Item> blueRoofSteepBlock;
    public static RegistryObject<Item> blueRoofSteepSideBlock;
    public static RegistryObject<Item> blueTilesBlock;
    public static RegistryObject<Item> blueTileSlabBlock;
    public static RegistryObject<Item> blueTileStairBlock;

    public static void register(){
        greenEaveBlock = XKRegistryHandler.Items.register("green_roof_eave"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.greenEaveBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        greenEaveSideBlock = XKRegistryHandler.Items.register("green_roof_eave_side"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.greenEaveSideBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        greenRoofBlock = XKRegistryHandler.Items.register("green_roof"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.greenRoofBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        greenRoofGentleBlock = XKRegistryHandler.Items.register("green_roof_gentle"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.greenRoofGentleBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        greenRoofGentleSideBlock = XKRegistryHandler.Items.register("green_roof_gentle_side"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.greenRoofGentleSideBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        greenRoofRidgeBlock = XKRegistryHandler.Items.register("green_roof_ridge"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.greenRoofRidgeBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        greenRoofSideBlock = XKRegistryHandler.Items.register("green_roof_side"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.greenRoofSideBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        greenRoofSteepBlock = XKRegistryHandler.Items.register("green_roof_steep"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.greenRoofSteepBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        greenRoofSteepSideBlock = XKRegistryHandler.Items.register("green_roof_steep_side"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.greenRoofSteepSideBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        greenTilesBlock = XKRegistryHandler.Items.register("green_tiles"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.greenTilesBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        greenTileSlabBlock = XKRegistryHandler.Items.register("green_tile_slab"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.greenTileSlabBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        greenTileStairBlock = XKRegistryHandler.Items.register("green_tile_stair"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.greenTileStairBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));

        redEaveBlock = XKRegistryHandler.Items.register("red_roof_eave"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.redEaveBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        redEaveSideBlock = XKRegistryHandler.Items.register("red_roof_eave_side"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.redEaveSideBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        redRoofBlock = XKRegistryHandler.Items.register("red_roof"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.redRoofBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        redRoofGentleBlock = XKRegistryHandler.Items.register("red_roof_gentle"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.redRoofGentleBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        redRoofGentleSideBlock = XKRegistryHandler.Items.register("red_roof_gentle_side"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.redRoofGentleSideBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        redRoofRidgeBlock = XKRegistryHandler.Items.register("red_roof_ridge"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.redRoofRidgeBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        redRoofSideBlock = XKRegistryHandler.Items.register("red_roof_side"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.redRoofSideBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        redRoofSteepBlock = XKRegistryHandler.Items.register("red_roof_steep"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.redRoofSteepBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        redRoofSteepSideBlock = XKRegistryHandler.Items.register("red_roof_steep_side"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.redRoofSteepSideBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        redTilesBlock = XKRegistryHandler.Items.register("red_tiles"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.redTilesBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        redTileSlabBlock = XKRegistryHandler.Items.register("red_tile_slab"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.redTileSlabBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        redTileStairBlock = XKRegistryHandler.Items.register("red_tile_stair"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.redTileStairBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));

        blueEaveBlock = XKRegistryHandler.Items.register("blue_roof_eave"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.blueEaveBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        blueEaveSideBlock = XKRegistryHandler.Items.register("blue_roof_eave_side"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.blueEaveSideBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        blueRoofBlock = XKRegistryHandler.Items.register("blue_roof"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.blueRoofBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        blueRoofGentleBlock = XKRegistryHandler.Items.register("blue_roof_gentle"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.blueRoofGentleBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        blueRoofGentleSideBlock = XKRegistryHandler.Items.register("blue_roof_gentle_side"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.blueRoofGentleSideBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        blueRoofRidgeBlock = XKRegistryHandler.Items.register("blue_roof_ridge"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.blueRoofRidgeBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        blueRoofSideBlock = XKRegistryHandler.Items.register("blue_roof_side"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.blueRoofSideBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        blueRoofSteepBlock = XKRegistryHandler.Items.register("blue_roof_steep"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.blueRoofSteepBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        blueRoofSteepSideBlock = XKRegistryHandler.Items.register("blue_roof_steep_side"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.blueRoofSteepSideBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        blueTilesBlock = XKRegistryHandler.Items.register("blue_tiles"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.blueTilesBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        blueTileSlabBlock = XKRegistryHandler.Items.register("blue_tile_slab"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.blueTileSlabBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        blueTileStairBlock = XKRegistryHandler.Items.register("blue_tile_stair"
                , () -> new BlockItem(XKWesternRoofRelevantBlocks.blueTileStairBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
    }
}
