package com.teamfractal.xkdeco.common.item.init;

import com.teamfractal.xkdeco.common.block.init.XKBlocks;
import com.teamfractal.xkdeco.common.creativeTab.init.XKTabs;
import com.teamfractal.xkdeco.common.util.XKRegistryHandler;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;

public class XKItems {
    public static RegistryObject<Item> blackEaveBlock;
    public static RegistryObject<Item> blackEaveSideBlock;
    public static RegistryObject<Item> blackRoofBlock;
    public static RegistryObject<Item> blackRoofFlatBlock;
    public static RegistryObject<Item> blackRoofGentleBlock;
    public static RegistryObject<Item> blackRoofGentleSideBlock;
    public static RegistryObject<Item> blackRoofRidgeBlock;
    public static RegistryObject<Item> blackRoofSideBlock;
    public static RegistryObject<Item> blackRoofSteepBlock;
    public static RegistryObject<Item> blackRoofSteepSideBlock;
    public static RegistryObject<Item> blackTilesBlock;
    public static RegistryObject<Item> blackTileSlabBlock;
    public static RegistryObject<Item> blackTileStairBlock;

    public static RegistryObject<Item> cyanEaveBlock;
    public static RegistryObject<Item> cyanEaveSideBlock;
    public static RegistryObject<Item> cyanRoofBlock;
    public static RegistryObject<Item> cyanRoofFlatBlock;
    public static RegistryObject<Item> cyanRoofGentleBlock;
    public static RegistryObject<Item> cyanRoofGentleSideBlock;
    public static RegistryObject<Item> cyanRoofRidgeBlock;
    public static RegistryObject<Item> cyanRoofSideBlock;
    public static RegistryObject<Item> cyanRoofSteepBlock;
    public static RegistryObject<Item> cyanRoofSteepSideBlock;
    public static RegistryObject<Item> cyanTilesBlock;
    public static RegistryObject<Item> cyanTileSlabBlock;
    public static RegistryObject<Item> cyanTileStairBlock;

    public static RegistryObject<Item> yellowEaveBlock;
    public static RegistryObject<Item> yellowEaveSideBlock;
    public static RegistryObject<Item> yellowRoofBlock;
    public static RegistryObject<Item> yellowRoofFlatBlock;
    public static RegistryObject<Item> yellowRoofGentleBlock;
    public static RegistryObject<Item> yellowRoofGentleSideBlock;
    public static RegistryObject<Item> yellowRoofRidgeBlock;
    public static RegistryObject<Item> yellowRoofSideBlock;
    public static RegistryObject<Item> yellowRoofSteepBlock;
    public static RegistryObject<Item> yellowRoofSteepSideBlock;
    public static RegistryObject<Item> yellowTilesBlock;
    public static RegistryObject<Item> yellowTileSlabBlock;
    public static RegistryObject<Item> yellowTileStairBlock;

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
        blackEaveBlock = XKRegistryHandler.Items.register("black_roof_eave"
                , () -> new BlockItem(XKBlocks.blackEaveBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        blackEaveSideBlock = XKRegistryHandler.Items.register("black_roof_eave_side"
                , () -> new BlockItem(XKBlocks.blackEaveSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        blackRoofBlock = XKRegistryHandler.Items.register("black_roof"
                , () -> new BlockItem(XKBlocks.blackRoofBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        blackRoofFlatBlock = XKRegistryHandler.Items.register("black_roof_flat"
                , () -> new BlockItem(XKBlocks.blackRoofFlatBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        blackRoofGentleBlock = XKRegistryHandler.Items.register("black_roof_gentle"
                , () -> new BlockItem(XKBlocks.blackRoofGentleBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        blackRoofGentleSideBlock = XKRegistryHandler.Items.register("black_roof_gentle_side"
                , () -> new BlockItem(XKBlocks.blackRoofGentleSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        blackRoofRidgeBlock = XKRegistryHandler.Items.register("black_roof_ridge"
                , () -> new BlockItem(XKBlocks.blackRoofRidgeBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        blackRoofSideBlock = XKRegistryHandler.Items.register("black_roof_side"
                , () -> new BlockItem(XKBlocks.blackRoofSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        blackRoofSteepBlock = XKRegistryHandler.Items.register("black_roof_steep"
                , () -> new BlockItem(XKBlocks.blackRoofSteepBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        blackRoofSteepSideBlock = XKRegistryHandler.Items.register("black_roof_steep_side"
                , () -> new BlockItem(XKBlocks.blackRoofSteepSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        blackTilesBlock = XKRegistryHandler.Items.register("black_tiles"
                , () -> new BlockItem(XKBlocks.blackTilesBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        blackTileSlabBlock = XKRegistryHandler.Items.register("black_tile_slab"
                , () -> new BlockItem(XKBlocks.blackTileSlabBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        blackTileStairBlock = XKRegistryHandler.Items.register("black_tile_stair"
                , () -> new BlockItem(XKBlocks.blackTileStairBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));

        cyanEaveBlock = XKRegistryHandler.Items.register("cyan_roof_eave"
                , () -> new BlockItem(XKBlocks.cyanEaveBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        cyanEaveSideBlock = XKRegistryHandler.Items.register("cyan_roof_eave_side"
                , () -> new BlockItem(XKBlocks.cyanEaveSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        cyanRoofBlock = XKRegistryHandler.Items.register("cyan_roof"
                , () -> new BlockItem(XKBlocks.cyanRoofBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        cyanRoofFlatBlock = XKRegistryHandler.Items.register("cyan_roof_flat"
                , () -> new BlockItem(XKBlocks.cyanRoofFlatBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        cyanRoofGentleBlock = XKRegistryHandler.Items.register("cyan_roof_gentle"
                , () -> new BlockItem(XKBlocks.cyanRoofGentleBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        cyanRoofGentleSideBlock = XKRegistryHandler.Items.register("cyan_roof_gentle_side"
                , () -> new BlockItem(XKBlocks.cyanRoofGentleSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        cyanRoofRidgeBlock = XKRegistryHandler.Items.register("cyan_roof_ridge"
                , () -> new BlockItem(XKBlocks.cyanRoofRidgeBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        cyanRoofSideBlock = XKRegistryHandler.Items.register("cyan_roof_side"
                , () -> new BlockItem(XKBlocks.cyanRoofSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        cyanRoofSteepBlock = XKRegistryHandler.Items.register("cyan_roof_steep"
                , () -> new BlockItem(XKBlocks.cyanRoofSteepBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        cyanRoofSteepSideBlock = XKRegistryHandler.Items.register("cyan_roof_steep_side"
                , () -> new BlockItem(XKBlocks.cyanRoofSteepSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        cyanTilesBlock = XKRegistryHandler.Items.register("cyan_tiles"
                , () -> new BlockItem(XKBlocks.cyanTilesBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        cyanTileSlabBlock = XKRegistryHandler.Items.register("cyan_tile_slab"
                , () -> new BlockItem(XKBlocks.cyanTileSlabBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        cyanTileStairBlock = XKRegistryHandler.Items.register("cyan_tile_stair"
                , () -> new BlockItem(XKBlocks.cyanTileStairBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));

        yellowEaveBlock = XKRegistryHandler.Items.register("yellow_roof_eave"
                , () -> new BlockItem(XKBlocks.yellowEaveBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        yellowEaveSideBlock = XKRegistryHandler.Items.register("yellow_roof_eave_side"
                , () -> new BlockItem(XKBlocks.yellowEaveSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        yellowRoofBlock = XKRegistryHandler.Items.register("yellow_roof"
                , () -> new BlockItem(XKBlocks.yellowRoofBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        yellowRoofFlatBlock = XKRegistryHandler.Items.register("yellow_roof_flat"
                , () -> new BlockItem(XKBlocks.yellowRoofFlatBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        yellowRoofGentleBlock = XKRegistryHandler.Items.register("yellow_roof_gentle"
                , () -> new BlockItem(XKBlocks.yellowRoofGentleBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        yellowRoofGentleSideBlock = XKRegistryHandler.Items.register("yellow_roof_gentle_side"
                , () -> new BlockItem(XKBlocks.yellowRoofGentleSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        yellowRoofRidgeBlock = XKRegistryHandler.Items.register("yellow_roof_ridge"
                , () -> new BlockItem(XKBlocks.yellowRoofRidgeBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        yellowRoofSideBlock = XKRegistryHandler.Items.register("yellow_roof_side"
                , () -> new BlockItem(XKBlocks.yellowRoofSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        yellowRoofSteepBlock = XKRegistryHandler.Items.register("yellow_roof_steep"
                , () -> new BlockItem(XKBlocks.yellowRoofSteepBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        yellowRoofSteepSideBlock = XKRegistryHandler.Items.register("yellow_roof_steep_side"
                , () -> new BlockItem(XKBlocks.yellowRoofSteepSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        yellowTilesBlock = XKRegistryHandler.Items.register("yellow_tiles"
                , () -> new BlockItem(XKBlocks.yellowTilesBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        yellowTileSlabBlock = XKRegistryHandler.Items.register("yellow_tile_slab"
                , () -> new BlockItem(XKBlocks.yellowTileSlabBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        yellowTileStairBlock = XKRegistryHandler.Items.register("yellow_tile_stair"
                , () -> new BlockItem(XKBlocks.yellowTileStairBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));

        greenEaveBlock = XKRegistryHandler.Items.register("green_roof_eave"
                , () -> new BlockItem(XKBlocks.greenEaveBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        greenEaveSideBlock = XKRegistryHandler.Items.register("green_roof_eave_side"
                , () -> new BlockItem(XKBlocks.greenEaveSideBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        greenRoofBlock = XKRegistryHandler.Items.register("green_roof"
                , () -> new BlockItem(XKBlocks.greenRoofBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        greenRoofGentleBlock = XKRegistryHandler.Items.register("green_roof_gentle"
                , () -> new BlockItem(XKBlocks.greenRoofGentleBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        greenRoofGentleSideBlock = XKRegistryHandler.Items.register("green_roof_gentle_side"
                , () -> new BlockItem(XKBlocks.greenRoofGentleSideBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        greenRoofRidgeBlock = XKRegistryHandler.Items.register("green_roof_ridge"
                , () -> new BlockItem(XKBlocks.greenRoofRidgeBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        greenRoofSideBlock = XKRegistryHandler.Items.register("green_roof_side"
                , () -> new BlockItem(XKBlocks.greenRoofSideBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        greenRoofSteepBlock = XKRegistryHandler.Items.register("green_roof_steep"
                , () -> new BlockItem(XKBlocks.greenRoofSteepBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        greenRoofSteepSideBlock = XKRegistryHandler.Items.register("green_roof_steep_side"
                , () -> new BlockItem(XKBlocks.greenRoofSteepSideBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        greenTilesBlock = XKRegistryHandler.Items.register("green_tiles"
                , () -> new BlockItem(XKBlocks.greenTilesBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        greenTileSlabBlock = XKRegistryHandler.Items.register("green_tile_slab"
                , () -> new BlockItem(XKBlocks.greenTileSlabBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        greenTileStairBlock = XKRegistryHandler.Items.register("green_tile_stair"
                , () -> new BlockItem(XKBlocks.greenTileStairBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));

        redEaveBlock = XKRegistryHandler.Items.register("red_roof_eave"
                , () -> new BlockItem(XKBlocks.redEaveBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        redEaveSideBlock = XKRegistryHandler.Items.register("red_roof_eave_side"
                , () -> new BlockItem(XKBlocks.redEaveSideBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        redRoofBlock = XKRegistryHandler.Items.register("red_roof"
                , () -> new BlockItem(XKBlocks.redRoofBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        redRoofGentleBlock = XKRegistryHandler.Items.register("red_roof_gentle"
                , () -> new BlockItem(XKBlocks.redRoofGentleBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        redRoofGentleSideBlock = XKRegistryHandler.Items.register("red_roof_gentle_side"
                , () -> new BlockItem(XKBlocks.redRoofGentleSideBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        redRoofRidgeBlock = XKRegistryHandler.Items.register("red_roof_ridge"
                , () -> new BlockItem(XKBlocks.redRoofRidgeBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        redRoofSideBlock = XKRegistryHandler.Items.register("red_roof_side"
                , () -> new BlockItem(XKBlocks.redRoofSideBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        redRoofSteepBlock = XKRegistryHandler.Items.register("red_roof_steep"
                , () -> new BlockItem(XKBlocks.redRoofSteepBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        redRoofSteepSideBlock = XKRegistryHandler.Items.register("red_roof_steep_side"
                , () -> new BlockItem(XKBlocks.redRoofSteepSideBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        redTilesBlock = XKRegistryHandler.Items.register("red_tiles"
                , () -> new BlockItem(XKBlocks.redTilesBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        redTileSlabBlock = XKRegistryHandler.Items.register("red_tile_slab"
                , () -> new BlockItem(XKBlocks.redTileSlabBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        redTileStairBlock = XKRegistryHandler.Items.register("red_tile_stair"
                , () -> new BlockItem(XKBlocks.redTileStairBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));

        blueEaveBlock = XKRegistryHandler.Items.register("blue_roof_eave"
                , () -> new BlockItem(XKBlocks.blueEaveBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        blueEaveSideBlock = XKRegistryHandler.Items.register("blue_roof_eave_side"
                , () -> new BlockItem(XKBlocks.blueEaveSideBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        blueRoofBlock = XKRegistryHandler.Items.register("blue_roof"
                , () -> new BlockItem(XKBlocks.blueRoofBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        blueRoofGentleBlock = XKRegistryHandler.Items.register("blue_roof_gentle"
                , () -> new BlockItem(XKBlocks.blueRoofGentleBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        blueRoofGentleSideBlock = XKRegistryHandler.Items.register("blue_roof_gentle_side"
                , () -> new BlockItem(XKBlocks.blueRoofGentleSideBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        blueRoofRidgeBlock = XKRegistryHandler.Items.register("blue_roof_ridge"
                , () -> new BlockItem(XKBlocks.blueRoofRidgeBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        blueRoofSideBlock = XKRegistryHandler.Items.register("blue_roof_side"
                , () -> new BlockItem(XKBlocks.blueRoofSideBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        blueRoofSteepBlock = XKRegistryHandler.Items.register("blue_roof_steep"
                , () -> new BlockItem(XKBlocks.blueRoofSteepBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        blueRoofSteepSideBlock = XKRegistryHandler.Items.register("blue_roof_steep_side"
                , () -> new BlockItem(XKBlocks.blueRoofSteepSideBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        blueTilesBlock = XKRegistryHandler.Items.register("blue_tiles"
                , () -> new BlockItem(XKBlocks.blueTilesBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        blueTileSlabBlock = XKRegistryHandler.Items.register("blue_tile_slab"
                , () -> new BlockItem(XKBlocks.blueTileSlabBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
        blueTileStairBlock = XKRegistryHandler.Items.register("blue_tile_stair"
                , () -> new BlockItem(XKBlocks.blueTileStairBlock.get(),new Item.Properties().tab(XKTabs.xkwestern)));
    }
}
