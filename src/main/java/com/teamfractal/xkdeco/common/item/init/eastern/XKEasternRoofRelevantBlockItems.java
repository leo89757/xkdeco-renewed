package com.teamfractal.xkdeco.common.item.init.eastern;

import com.teamfractal.xkdeco.common.block.init.eastern.XKEasternRoofRelevantBlocks;
import com.teamfractal.xkdeco.common.creativeTab.init.XKTabs;
import com.teamfractal.xkdeco.common.util.XKRegistryHandler;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;

public class XKEasternRoofRelevantBlockItems {
    public static RegistryObject<Item> blackTilesBlock;
    public static RegistryObject<Item> blackTileSlabBlock;
    public static RegistryObject<Item> blackTileStairBlock;

    public static RegistryObject<Item> blackEaveBlock;
    public static RegistryObject<Item> blackEaveSideBlock;
    public static RegistryObject<Item> blackRidgeDecoBlock;
    public static RegistryObject<Item> blackRidgeDecoCenterBlock;
    public static RegistryObject<Item> blackRidgeDecoObliqueBlock;
    public static RegistryObject<Item> blackRoofBlock;
    public static RegistryObject<Item> blackRoofFlatBlock;
    public static RegistryObject<Item> blackRoofGentleBlock;
    public static RegistryObject<Item> blackRoofGentleSideBlock;
    public static RegistryObject<Item> blackRoofRidgeBlock;
    public static RegistryObject<Item> blackRoofSideBlock;
    public static RegistryObject<Item> blackRoofSteepBlock;
    public static RegistryObject<Item> blackRoofSteepSideBlock;
    public static RegistryObject<Item> smallBlackEaveBlock;
    public static RegistryObject<Item> smallBlackEaveSideBlock;
    public static RegistryObject<Item> smallBlackRoofGentleSideBlock;
    public static RegistryObject<Item> smallBlackRoofSideBlock;
    public static RegistryObject<Item> smallBlackRoofSteepSideBlock;

    public static RegistryObject<Item> cyanTilesBlock;
    public static RegistryObject<Item> cyanTileSlabBlock;
    public static RegistryObject<Item> cyanTileStairBlock;

    public static RegistryObject<Item> cyanEaveBlock;
    public static RegistryObject<Item> cyanEaveSideBlock;
    public static RegistryObject<Item> cyanRidgeDecoBlock;
    public static RegistryObject<Item> cyanRidgeDecoCenterBlock;
    public static RegistryObject<Item> cyanRidgeDecoObliqueBlock;
    public static RegistryObject<Item> cyanRoofBlock;
    public static RegistryObject<Item> cyanRoofFlatBlock;
    public static RegistryObject<Item> cyanRoofGentleBlock;
    public static RegistryObject<Item> cyanRoofGentleSideBlock;
    public static RegistryObject<Item> cyanRoofRidgeBlock;
    public static RegistryObject<Item> cyanRoofSideBlock;
    public static RegistryObject<Item> cyanRoofSteepBlock;
    public static RegistryObject<Item> cyanRoofSteepSideBlock;
    public static RegistryObject<Item> smallCyanEaveBlock;
    public static RegistryObject<Item> smallCyanEaveSideBlock;
    public static RegistryObject<Item> smallCyanRoofGentleSideBlock;
    public static RegistryObject<Item> smallCyanRoofSideBlock;
    public static RegistryObject<Item> smallCyanRoofSteepSideBlock;

    public static RegistryObject<Item> yellowTilesBlock;
    public static RegistryObject<Item> yellowTileSlabBlock;
    public static RegistryObject<Item> yellowTileStairBlock;

    public static RegistryObject<Item> yellowEaveBlock;
    public static RegistryObject<Item> yellowEaveSideBlock;
    public static RegistryObject<Item> yellowRidgeDecoBlock;
    public static RegistryObject<Item> yellowRidgeDecoCenterBlock;
    public static RegistryObject<Item> yellowRidgeDecoObliqueBlock;
    public static RegistryObject<Item> yellowRoofBlock;
    public static RegistryObject<Item> yellowRoofFlatBlock;
    public static RegistryObject<Item> yellowRoofGentleBlock;
    public static RegistryObject<Item> yellowRoofGentleSideBlock;
    public static RegistryObject<Item> yellowRoofRidgeBlock;
    public static RegistryObject<Item> yellowRoofSideBlock;
    public static RegistryObject<Item> yellowRoofSteepBlock;
    public static RegistryObject<Item> yellowRoofSteepSideBlock;
    public static RegistryObject<Item> smallYellowEaveBlock;
    public static RegistryObject<Item> smallYellowEaveSideBlock;
    public static RegistryObject<Item> smallYellowRoofGentleSideBlock;
    public static RegistryObject<Item> smallYellowRoofSideBlock;
    public static RegistryObject<Item> smallYellowRoofSteepSideBlock;



    public static void register(){
        blackTilesBlock = XKRegistryHandler.Items.register("black_tiles"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.blackTilesBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        blackTileSlabBlock = XKRegistryHandler.Items.register("black_tile_slab"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.blackTileSlabBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        blackTileStairBlock = XKRegistryHandler.Items.register("black_tile_stair"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.blackTileStairBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        cyanTilesBlock = XKRegistryHandler.Items.register("cyan_tiles"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.cyanTilesBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        cyanTileSlabBlock = XKRegistryHandler.Items.register("cyan_tile_slab"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.cyanTileSlabBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        cyanTileStairBlock = XKRegistryHandler.Items.register("cyan_tile_stair"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.cyanTileStairBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        yellowTilesBlock = XKRegistryHandler.Items.register("yellow_tiles"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.yellowTilesBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        yellowTileSlabBlock = XKRegistryHandler.Items.register("yellow_tile_slab"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.yellowTileSlabBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        yellowTileStairBlock = XKRegistryHandler.Items.register("yellow_tile_stair"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.yellowTileStairBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));

        blackEaveBlock = XKRegistryHandler.Items.register("black_roof_eave"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.blackEaveBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        blackEaveSideBlock = XKRegistryHandler.Items.register("black_roof_eave_side"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.blackEaveSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        blackRidgeDecoBlock = XKRegistryHandler.Items.register("black_ridge_deco"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.blackRidgeDecoBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        blackRidgeDecoCenterBlock = XKRegistryHandler.Items.register("black_ridge_deco_center"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.blackRidgeDecoCenterBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        blackRidgeDecoObliqueBlock = XKRegistryHandler.Items.register("black_ridge_deco_oblique"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.blackRidgeDecoObliqueBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        blackRoofBlock = XKRegistryHandler.Items.register("black_roof"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.blackRoofBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        blackRoofFlatBlock = XKRegistryHandler.Items.register("black_roof_flat"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.blackRoofFlatBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        blackRoofGentleBlock = XKRegistryHandler.Items.register("black_roof_gentle"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.blackRoofGentleBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        blackRoofGentleSideBlock = XKRegistryHandler.Items.register("black_roof_gentle_side"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.blackRoofGentleSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        blackRoofRidgeBlock = XKRegistryHandler.Items.register("black_roof_ridge"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.blackRoofRidgeBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        blackRoofSideBlock = XKRegistryHandler.Items.register("black_roof_side"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.blackRoofSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        blackRoofSteepBlock = XKRegistryHandler.Items.register("black_roof_steep"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.blackRoofSteepBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        blackRoofSteepSideBlock = XKRegistryHandler.Items.register("black_roof_steep_side"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.blackRoofSteepSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        smallBlackEaveBlock = XKRegistryHandler.Items.register("small_black_roof_eave"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.smallBlackEaveBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        smallBlackEaveSideBlock = XKRegistryHandler.Items.register("small_black_roof_eave_side"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.smallBlackEaveSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        smallBlackRoofGentleSideBlock = XKRegistryHandler.Items.register("small_black_roof_gentle_side"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.smallBlackRoofGentleSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        smallBlackRoofSideBlock = XKRegistryHandler.Items.register("small_black_roof_side"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.smallBlackRoofSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        smallBlackRoofSteepSideBlock = XKRegistryHandler.Items.register("small_black_roof_steep_side"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.smallBlackRoofSteepSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));

        cyanEaveBlock = XKRegistryHandler.Items.register("cyan_roof_eave"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.cyanEaveBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        cyanEaveSideBlock = XKRegistryHandler.Items.register("cyan_roof_eave_side"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.cyanEaveSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        cyanRidgeDecoBlock = XKRegistryHandler.Items.register("cyan_ridge_deco"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.cyanRidgeDecoBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        cyanRidgeDecoCenterBlock = XKRegistryHandler.Items.register("cyan_ridge_deco_center"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.cyanRidgeDecoCenterBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        cyanRidgeDecoObliqueBlock = XKRegistryHandler.Items.register("cyan_ridge_deco_oblique"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.cyanRidgeDecoObliqueBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        cyanRoofBlock = XKRegistryHandler.Items.register("cyan_roof"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.cyanRoofBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        cyanRoofFlatBlock = XKRegistryHandler.Items.register("cyan_roof_flat"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.cyanRoofFlatBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        cyanRoofGentleBlock = XKRegistryHandler.Items.register("cyan_roof_gentle"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.cyanRoofGentleBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        cyanRoofGentleSideBlock = XKRegistryHandler.Items.register("cyan_roof_gentle_side"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.cyanRoofGentleSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        cyanRoofRidgeBlock = XKRegistryHandler.Items.register("cyan_roof_ridge"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.cyanRoofRidgeBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        cyanRoofSideBlock = XKRegistryHandler.Items.register("cyan_roof_side"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.cyanRoofSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        cyanRoofSteepBlock = XKRegistryHandler.Items.register("cyan_roof_steep"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.cyanRoofSteepBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        cyanRoofSteepSideBlock = XKRegistryHandler.Items.register("cyan_roof_steep_side"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.cyanRoofSteepSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        smallCyanEaveBlock = XKRegistryHandler.Items.register("small_cyan_roof_eave"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.smallCyanEaveBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        smallCyanEaveSideBlock = XKRegistryHandler.Items.register("small_cyan_roof_eave_side"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.smallCyanEaveSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        smallCyanRoofGentleSideBlock = XKRegistryHandler.Items.register("small_cyan_roof_gentle_side"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.smallCyanRoofGentleSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        smallCyanRoofSideBlock = XKRegistryHandler.Items.register("small_cyan_roof_side"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.smallCyanRoofSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        smallCyanRoofSteepSideBlock = XKRegistryHandler.Items.register("small_cyan_roof_steep_side"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.smallCyanRoofSteepSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));

        yellowEaveBlock = XKRegistryHandler.Items.register("yellow_roof_eave"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.yellowEaveBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        yellowEaveSideBlock = XKRegistryHandler.Items.register("yellow_roof_eave_side"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.yellowEaveSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        yellowRidgeDecoBlock = XKRegistryHandler.Items.register("yellow_ridge_deco"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.yellowRidgeDecoBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        yellowRidgeDecoCenterBlock = XKRegistryHandler.Items.register("yellow_ridge_deco_center"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.yellowRidgeDecoCenterBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        yellowRidgeDecoObliqueBlock = XKRegistryHandler.Items.register("yellow_ridge_deco_oblique"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.yellowRidgeDecoObliqueBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        yellowRoofBlock = XKRegistryHandler.Items.register("yellow_roof"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.yellowRoofBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        yellowRoofFlatBlock = XKRegistryHandler.Items.register("yellow_roof_flat"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.yellowRoofFlatBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        yellowRoofGentleBlock = XKRegistryHandler.Items.register("yellow_roof_gentle"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.yellowRoofGentleBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        yellowRoofGentleSideBlock = XKRegistryHandler.Items.register("yellow_roof_gentle_side"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.yellowRoofGentleSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        yellowRoofRidgeBlock = XKRegistryHandler.Items.register("yellow_roof_ridge"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.yellowRoofRidgeBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        yellowRoofSideBlock = XKRegistryHandler.Items.register("yellow_roof_side"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.yellowRoofSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        yellowRoofSteepBlock = XKRegistryHandler.Items.register("yellow_roof_steep"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.yellowRoofSteepBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        yellowRoofSteepSideBlock = XKRegistryHandler.Items.register("yellow_roof_steep_side"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.yellowRoofSteepSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        smallYellowEaveBlock = XKRegistryHandler.Items.register("small_yellow_roof_eave"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.smallYellowEaveBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        smallYellowEaveSideBlock = XKRegistryHandler.Items.register("small_yellow_roof_eave_side"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.smallYellowEaveSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        smallYellowRoofGentleSideBlock = XKRegistryHandler.Items.register("small_yellow_roof_gentle_side"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.smallYellowRoofGentleSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        smallYellowRoofSideBlock = XKRegistryHandler.Items.register("small_yellow_roof_side"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.smallYellowRoofSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        smallYellowRoofSteepSideBlock = XKRegistryHandler.Items.register("small_yellow_roof_steep_side"
                , () -> new BlockItem(XKEasternRoofRelevantBlocks.smallYellowRoofSteepSideBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));


    }
}
