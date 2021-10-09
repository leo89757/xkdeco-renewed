package com.teamfractal.xkdeco.common.block.init.eastern;

import com.teamfractal.xkdeco.common.block.base.GenericSlabBlock;
import com.teamfractal.xkdeco.common.block.base.GenericStairBlock;
import com.teamfractal.xkdeco.common.block.base.GenericStoneBlock;
import com.teamfractal.xkdeco.common.block.base.TileStairBlock;
import com.teamfractal.xkdeco.common.block.base.roofrelevant.RoofFlatBlock;
import com.teamfractal.xkdeco.common.block.base.roofrelevant.RoofRidgeBlock;
import com.teamfractal.xkdeco.common.util.XKRegistryHandler;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;

public class XKEasternRoofRelevantBlocks {

    public static RegistryObject<Block> blackEaveBlock;
    public static RegistryObject<Block> blackEaveSideBlock;
    public static RegistryObject<Block> blackRidgeDecoBlock;
    public static RegistryObject<Block> blackRidgeDecoCenterBlock;
    public static RegistryObject<Block> blackRidgeDecoObliqueBlock;
    public static RegistryObject<Block> blackRoofBlock;
    public static RegistryObject<Block> blackRoofFlatBlock;
    public static RegistryObject<Block> blackRoofGentleBlock;
    public static RegistryObject<Block> blackRoofGentleSideBlock;
    public static RegistryObject<Block> blackRoofRidgeBlock;
    public static RegistryObject<Block> blackRoofSideBlock;
    public static RegistryObject<Block> blackRoofSteepBlock;
    public static RegistryObject<Block> blackRoofSteepSideBlock;
    public static RegistryObject<Block> blackTilesBlock;
    public static RegistryObject<Block> blackTileSlabBlock;
    public static RegistryObject<Block> blackTileStairBlock;
    public static RegistryObject<Block> smallBlackEaveBlock;
    public static RegistryObject<Block> smallBlackEaveSideBlock;
    public static RegistryObject<Block> smallBlackRoofGentleSideBlock;
    public static RegistryObject<Block> smallBlackRoofSideBlock;
    public static RegistryObject<Block> smallBlackRoofSteepSideBlock;

    public static RegistryObject<Block> cyanEaveBlock;
    public static RegistryObject<Block> cyanEaveSideBlock;
    public static RegistryObject<Block> cyanRidgeDecoBlock;
    public static RegistryObject<Block> cyanRidgeDecoCenterBlock;
    public static RegistryObject<Block> cyanRidgeDecoObliqueBlock;
    public static RegistryObject<Block> cyanRoofBlock;
    public static RegistryObject<Block> cyanRoofFlatBlock;
    public static RegistryObject<Block> cyanRoofGentleBlock;
    public static RegistryObject<Block> cyanRoofGentleSideBlock;
    public static RegistryObject<Block> cyanRoofRidgeBlock;
    public static RegistryObject<Block> cyanRoofSideBlock;
    public static RegistryObject<Block> cyanRoofSteepBlock;
    public static RegistryObject<Block> cyanRoofSteepSideBlock;
    public static RegistryObject<Block> cyanTilesBlock;
    public static RegistryObject<Block> cyanTileSlabBlock;
    public static RegistryObject<Block> cyanTileStairBlock;
    public static RegistryObject<Block> smallCyanEaveBlock;
    public static RegistryObject<Block> smallCyanEaveSideBlock;
    public static RegistryObject<Block> smallCyanRoofGentleSideBlock;
    public static RegistryObject<Block> smallCyanRoofSideBlock;
    public static RegistryObject<Block> smallCyanRoofSteepSideBlock;

    public static RegistryObject<Block> yellowEaveBlock;
    public static RegistryObject<Block> yellowEaveSideBlock;
    public static RegistryObject<Block> yellowRidgeDecoBlock;
    public static RegistryObject<Block> yellowRidgeDecoCenterBlock;
    public static RegistryObject<Block> yellowRidgeDecoObliqueBlock;
    public static RegistryObject<Block> yellowRoofBlock;
    public static RegistryObject<Block> yellowRoofFlatBlock;
    public static RegistryObject<Block> yellowRoofGentleBlock;
    public static RegistryObject<Block> yellowRoofGentleSideBlock;
    public static RegistryObject<Block> yellowRoofRidgeBlock;
    public static RegistryObject<Block> yellowRoofSideBlock;
    public static RegistryObject<Block> yellowRoofSteepBlock;
    public static RegistryObject<Block> yellowRoofSteepSideBlock;
    public static RegistryObject<Block> yellowTilesBlock;
    public static RegistryObject<Block> yellowTileSlabBlock;
    public static RegistryObject<Block> yellowTileStairBlock;
    public static RegistryObject<Block> smallYellowEaveBlock;
    public static RegistryObject<Block> smallYellowEaveSideBlock;
    public static RegistryObject<Block> smallYellowRoofGentleSideBlock;
    public static RegistryObject<Block> smallYellowRoofSideBlock;
    public static RegistryObject<Block> smallYellowRoofSteepSideBlock;



    public static void register(){
        blackEaveBlock = XKRegistryHandler.Blocks.register("black_roof_eave", GenericStairBlock::new);
        blackEaveSideBlock = XKRegistryHandler.Blocks.register("black_roof_eave_side", GenericStairBlock::new);
        blackRidgeDecoBlock = XKRegistryHandler.Blocks.register("black_ridge_deco", GenericStairBlock::new);
        blackRidgeDecoCenterBlock = XKRegistryHandler.Blocks.register("black_ridge_deco_center", GenericSlabBlock::new);
        blackRidgeDecoObliqueBlock = XKRegistryHandler.Blocks.register("black_ridge_deco_oblique", GenericStairBlock::new);
        blackRoofBlock = XKRegistryHandler.Blocks.register("black_roof", GenericStairBlock::new);
        blackRoofFlatBlock = XKRegistryHandler.Blocks.register("black_roof_flat", RoofFlatBlock::new);
        blackRoofGentleBlock = XKRegistryHandler.Blocks.register("black_roof_gentle", GenericStairBlock::new);
        blackRoofGentleSideBlock = XKRegistryHandler.Blocks.register("black_roof_gentle_side", GenericStairBlock::new);
        blackRoofRidgeBlock = XKRegistryHandler.Blocks.register("black_roof_ridge", RoofRidgeBlock::new);
        blackRoofSideBlock = XKRegistryHandler.Blocks.register("black_roof_side", GenericStairBlock::new);
        blackRoofSteepBlock = XKRegistryHandler.Blocks.register("black_roof_steep", GenericStairBlock::new);
        blackRoofSteepSideBlock = XKRegistryHandler.Blocks.register("black_roof_steep_side", GenericStairBlock::new);
        blackTilesBlock = XKRegistryHandler.Blocks.register("black_tiles", GenericStoneBlock::new);
        blackTileSlabBlock = XKRegistryHandler.Blocks.register("black_tile_slab", GenericSlabBlock::new);
        blackTileStairBlock = XKRegistryHandler.Blocks.register("black_tile_stair", TileStairBlock::new);
        smallBlackEaveBlock = XKRegistryHandler.Blocks.register("small_black_roof_eave", GenericStairBlock::new);
        smallBlackEaveSideBlock = XKRegistryHandler.Blocks.register("small_black_roof_eave_side", GenericStairBlock::new);
        smallBlackRoofGentleSideBlock = XKRegistryHandler.Blocks.register("small_black_roof_gentle_side", GenericStairBlock::new);
        smallBlackRoofSideBlock = XKRegistryHandler.Blocks.register("small_black_roof_side", GenericStairBlock::new);
        smallBlackRoofSteepSideBlock = XKRegistryHandler.Blocks.register("small_black_roof_steep_side", GenericStairBlock::new);


        cyanEaveBlock = XKRegistryHandler.Blocks.register("cyan_roof_eave", GenericStairBlock::new);
        cyanEaveSideBlock = XKRegistryHandler.Blocks.register("cyan_roof_eave_side", GenericStairBlock::new);
        cyanRidgeDecoBlock = XKRegistryHandler.Blocks.register("cyan_ridge_deco", GenericStairBlock::new);
        cyanRidgeDecoCenterBlock = XKRegistryHandler.Blocks.register("cyan_ridge_deco_center", GenericSlabBlock::new);
        cyanRidgeDecoObliqueBlock = XKRegistryHandler.Blocks.register("cyan_ridge_deco_oblique", GenericStairBlock::new);
        cyanRoofBlock = XKRegistryHandler.Blocks.register("cyan_roof", GenericStairBlock::new);
        cyanRoofFlatBlock = XKRegistryHandler.Blocks.register("cyan_roof_flat", RoofFlatBlock::new);
        cyanRoofGentleBlock = XKRegistryHandler.Blocks.register("cyan_roof_gentle", GenericStairBlock::new);
        cyanRoofGentleSideBlock = XKRegistryHandler.Blocks.register("cyan_roof_gentle_side", GenericStairBlock::new);
        cyanRoofRidgeBlock = XKRegistryHandler.Blocks.register("cyan_roof_ridge", RoofRidgeBlock::new);
        cyanRoofSideBlock = XKRegistryHandler.Blocks.register("cyan_roof_side", GenericStairBlock::new);
        cyanRoofSteepBlock = XKRegistryHandler.Blocks.register("cyan_roof_steep", GenericStairBlock::new);
        cyanRoofSteepSideBlock = XKRegistryHandler.Blocks.register("cyan_roof_steep_side", GenericStairBlock::new);
        cyanTilesBlock = XKRegistryHandler.Blocks.register("cyan_tiles", GenericStoneBlock::new);
        cyanTileSlabBlock = XKRegistryHandler.Blocks.register("cyan_tile_slab", GenericSlabBlock::new);
        cyanTileStairBlock = XKRegistryHandler.Blocks.register("cyan_tile_stair", TileStairBlock::new);
        smallCyanEaveBlock = XKRegistryHandler.Blocks.register("small_cyan_roof_eave", GenericStairBlock::new);
        smallCyanEaveSideBlock = XKRegistryHandler.Blocks.register("small_cyan_roof_eave_side", GenericStairBlock::new);
        smallCyanRoofGentleSideBlock = XKRegistryHandler.Blocks.register("small_cyan_roof_gentle_side", GenericStairBlock::new);
        smallCyanRoofSideBlock = XKRegistryHandler.Blocks.register("small_cyan_roof_side", GenericStairBlock::new);
        smallCyanRoofSteepSideBlock = XKRegistryHandler.Blocks.register("small_cyan_roof_steep_side", GenericStairBlock::new);

        yellowEaveBlock = XKRegistryHandler.Blocks.register("yellow_roof_eave", GenericStairBlock::new);
        yellowEaveSideBlock = XKRegistryHandler.Blocks.register("yellow_roof_eave_side", GenericStairBlock::new);
        yellowRidgeDecoBlock = XKRegistryHandler.Blocks.register("yellow_ridge_deco", GenericStairBlock::new);
        yellowRidgeDecoCenterBlock = XKRegistryHandler.Blocks.register("yellow_ridge_deco_center", GenericSlabBlock::new);
        yellowRidgeDecoObliqueBlock = XKRegistryHandler.Blocks.register("yellow_ridge_deco_oblique", GenericStairBlock::new);
        yellowRoofBlock = XKRegistryHandler.Blocks.register("yellow_roof", GenericStairBlock::new);
        yellowRoofFlatBlock = XKRegistryHandler.Blocks.register("yellow_roof_flat", RoofFlatBlock::new);
        yellowRoofGentleBlock = XKRegistryHandler.Blocks.register("yellow_roof_gentle", GenericStairBlock::new);
        yellowRoofGentleSideBlock = XKRegistryHandler.Blocks.register("yellow_roof_gentle_side", GenericStairBlock::new);
        yellowRoofRidgeBlock = XKRegistryHandler.Blocks.register("yellow_roof_ridge", RoofRidgeBlock::new);
        yellowRoofSideBlock = XKRegistryHandler.Blocks.register("yellow_roof_side", GenericStairBlock::new);
        yellowRoofSteepBlock = XKRegistryHandler.Blocks.register("yellow_roof_steep", GenericStairBlock::new);
        yellowRoofSteepSideBlock = XKRegistryHandler.Blocks.register("yellow_roof_steep_side", GenericStairBlock::new);
        yellowTilesBlock = XKRegistryHandler.Blocks.register("yellow_tiles", GenericStoneBlock::new);
        yellowTileSlabBlock = XKRegistryHandler.Blocks.register("yellow_tile_slab", GenericSlabBlock::new);
        yellowTileStairBlock = XKRegistryHandler.Blocks.register("yellow_tile_stair", TileStairBlock::new);
        smallYellowEaveBlock = XKRegistryHandler.Blocks.register("small_yellow_roof_eave", GenericStairBlock::new);
        smallYellowEaveSideBlock = XKRegistryHandler.Blocks.register("small_yellow_roof_eave_side", GenericStairBlock::new);
        smallYellowRoofGentleSideBlock = XKRegistryHandler.Blocks.register("small_yellow_roof_gentle_side", GenericStairBlock::new);
        smallYellowRoofSideBlock = XKRegistryHandler.Blocks.register("small_yellow_roof_side", GenericStairBlock::new);
        smallYellowRoofSteepSideBlock = XKRegistryHandler.Blocks.register("small_yellow_roof_steep_side", GenericStairBlock::new);


    }
}
