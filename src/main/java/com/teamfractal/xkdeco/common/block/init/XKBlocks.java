package com.teamfractal.xkdeco.common.block.init;

import com.teamfractal.xkdeco.common.block.*;
import com.teamfractal.xkdeco.common.util.XKRegistryHandler;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;

public class XKBlocks {

    public static RegistryObject<Block> blackEaveBlock;
    public static RegistryObject<Block> blackEaveSideBlock;
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

    public static RegistryObject<Block> cyanEaveBlock;
    public static RegistryObject<Block> cyanEaveSideBlock;
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

    public static RegistryObject<Block> yellowEaveBlock;
    public static RegistryObject<Block> yellowEaveSideBlock;
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

    public static RegistryObject<Block> greenEaveBlock;
    public static RegistryObject<Block> greenEaveSideBlock;
    public static RegistryObject<Block> greenRoofBlock;
    public static RegistryObject<Block> greenRoofGentleBlock;
    public static RegistryObject<Block> greenRoofGentleSideBlock;
    public static RegistryObject<Block> greenRoofRidgeBlock;
    public static RegistryObject<Block> greenRoofSideBlock;
    public static RegistryObject<Block> greenRoofSteepBlock;
    public static RegistryObject<Block> greenRoofSteepSideBlock;
    public static RegistryObject<Block> greenTilesBlock;
    public static RegistryObject<Block> greenTileSlabBlock;
    public static RegistryObject<Block> greenTileStairBlock;

    public static RegistryObject<Block> redEaveBlock;
    public static RegistryObject<Block> redEaveSideBlock;
    public static RegistryObject<Block> redRoofBlock;
    public static RegistryObject<Block> redRoofGentleBlock;
    public static RegistryObject<Block> redRoofGentleSideBlock;
    public static RegistryObject<Block> redRoofRidgeBlock;
    public static RegistryObject<Block> redRoofSideBlock;
    public static RegistryObject<Block> redRoofSteepBlock;
    public static RegistryObject<Block> redRoofSteepSideBlock;
    public static RegistryObject<Block> redTilesBlock;
    public static RegistryObject<Block> redTileSlabBlock;
    public static RegistryObject<Block> redTileStairBlock;

    public static RegistryObject<Block> blueEaveBlock;
    public static RegistryObject<Block> blueEaveSideBlock;
    public static RegistryObject<Block> blueRoofBlock;
    public static RegistryObject<Block> blueRoofGentleBlock;
    public static RegistryObject<Block> blueRoofGentleSideBlock;
    public static RegistryObject<Block> blueRoofRidgeBlock;
    public static RegistryObject<Block> blueRoofSideBlock;
    public static RegistryObject<Block> blueRoofSteepBlock;
    public static RegistryObject<Block> blueRoofSteepSideBlock;
    public static RegistryObject<Block> blueTilesBlock;
    public static RegistryObject<Block> blueTileSlabBlock;
    public static RegistryObject<Block> blueTileStairBlock;

    public static void register(){
        blackEaveBlock = XKRegistryHandler.Blocks.register("black_roof_eave", EaveBlock::new);
        blackEaveSideBlock = XKRegistryHandler.Blocks.register("black_roof_eave_side", EaveSideBlock::new);
        blackRoofBlock = XKRegistryHandler.Blocks.register("black_roof", RoofBlock::new);
        blackRoofFlatBlock = XKRegistryHandler.Blocks.register("black_roof_flat", RoofFlatBlock::new);
        blackRoofGentleBlock = XKRegistryHandler.Blocks.register("black_roof_gentle", RoofGentleBlock::new);
        blackRoofGentleSideBlock = XKRegistryHandler.Blocks.register("black_roof_gentle_side", RoofGentleSideBlock::new);
        blackRoofRidgeBlock = XKRegistryHandler.Blocks.register("black_roof_ridge", RoofRidgeBlock::new);
        blackRoofSideBlock = XKRegistryHandler.Blocks.register("black_roof_side", RoofSideBlock::new);
        blackRoofSteepBlock = XKRegistryHandler.Blocks.register("black_roof_steep", RoofSteepBlock::new);
        blackRoofSteepSideBlock = XKRegistryHandler.Blocks.register("black_roof_steep_side", RoofSteepSideBlock::new);
        blackTilesBlock = XKRegistryHandler.Blocks.register("black_tiles", TilesBlock::new);
        blackTileSlabBlock = XKRegistryHandler.Blocks.register("black_tile_slab", TileSlabBlock::new);
        blackTileStairBlock = XKRegistryHandler.Blocks.register("black_tile_stair", TileStairBlock::new);

        cyanEaveBlock = XKRegistryHandler.Blocks.register("cyan_roof_eave", EaveBlock::new);
        cyanEaveSideBlock = XKRegistryHandler.Blocks.register("cyan_roof_eave_side", EaveSideBlock::new);
        cyanRoofBlock = XKRegistryHandler.Blocks.register("cyan_roof", RoofBlock::new);
        cyanRoofFlatBlock = XKRegistryHandler.Blocks.register("cyan_roof_flat", RoofFlatBlock::new);
        cyanRoofGentleBlock = XKRegistryHandler.Blocks.register("cyan_roof_gentle", RoofGentleBlock::new);
        cyanRoofGentleSideBlock = XKRegistryHandler.Blocks.register("cyan_roof_gentle_side", RoofGentleSideBlock::new);
        cyanRoofRidgeBlock = XKRegistryHandler.Blocks.register("cyan_roof_ridge", RoofRidgeBlock::new);
        cyanRoofSideBlock = XKRegistryHandler.Blocks.register("cyan_roof_side", RoofSideBlock::new);
        cyanRoofSteepBlock = XKRegistryHandler.Blocks.register("cyan_roof_steep", RoofSteepBlock::new);
        cyanRoofSteepSideBlock = XKRegistryHandler.Blocks.register("cyan_roof_steep_side", RoofSteepSideBlock::new);
        cyanTilesBlock = XKRegistryHandler.Blocks.register("cyan_tiles", TilesBlock::new);
        cyanTileSlabBlock = XKRegistryHandler.Blocks.register("cyan_tile_slab", TileSlabBlock::new);
        cyanTileStairBlock = XKRegistryHandler.Blocks.register("cyan_tile_stair", TileStairBlock::new);

        yellowEaveBlock = XKRegistryHandler.Blocks.register("yellow_roof_eave", EaveBlock::new);
        yellowEaveSideBlock = XKRegistryHandler.Blocks.register("yellow_roof_eave_side", EaveSideBlock::new);
        yellowRoofBlock = XKRegistryHandler.Blocks.register("yellow_roof", RoofBlock::new);
        yellowRoofFlatBlock = XKRegistryHandler.Blocks.register("yellow_roof_flat", RoofFlatBlock::new);
        yellowRoofGentleBlock = XKRegistryHandler.Blocks.register("yellow_roof_gentle", RoofGentleBlock::new);
        yellowRoofGentleSideBlock = XKRegistryHandler.Blocks.register("yellow_roof_gentle_side", RoofGentleSideBlock::new);
        yellowRoofRidgeBlock = XKRegistryHandler.Blocks.register("yellow_roof_ridge", RoofRidgeBlock::new);
        yellowRoofSideBlock = XKRegistryHandler.Blocks.register("yellow_roof_side", RoofSideBlock::new);
        yellowRoofSteepBlock = XKRegistryHandler.Blocks.register("yellow_roof_steep", RoofSteepBlock::new);
        yellowRoofSteepSideBlock = XKRegistryHandler.Blocks.register("yellow_roof_steep_side", RoofSteepSideBlock::new);
        yellowTilesBlock = XKRegistryHandler.Blocks.register("yellow_tiles", TilesBlock::new);
        yellowTileSlabBlock = XKRegistryHandler.Blocks.register("yellow_tile_slab", TileSlabBlock::new);
        yellowTileStairBlock = XKRegistryHandler.Blocks.register("yellow_tile_stair", TileStairBlock::new);

        greenEaveBlock = XKRegistryHandler.Blocks.register("green_roof_eave", EaveBlock::new);
        greenEaveSideBlock = XKRegistryHandler.Blocks.register("green_roof_eave_side", EaveSideBlock::new);
        greenRoofBlock = XKRegistryHandler.Blocks.register("green_roof", RoofBlock::new);
        greenRoofGentleBlock = XKRegistryHandler.Blocks.register("green_roof_gentle", RoofGentleBlock::new);
        greenRoofGentleSideBlock = XKRegistryHandler.Blocks.register("green_roof_gentle_side", RoofGentleSideBlock::new);
        greenRoofRidgeBlock = XKRegistryHandler.Blocks.register("green_roof_ridge", RoofRidgeBlock::new);
        greenRoofSideBlock = XKRegistryHandler.Blocks.register("green_roof_side", RoofSideBlock::new);
        greenRoofSteepBlock = XKRegistryHandler.Blocks.register("green_roof_steep", RoofSteepBlock::new);
        greenRoofSteepSideBlock = XKRegistryHandler.Blocks.register("green_roof_steep_side", RoofSteepSideBlock::new);
        greenTilesBlock = XKRegistryHandler.Blocks.register("green_tiles", TilesBlock::new);
        greenTileSlabBlock = XKRegistryHandler.Blocks.register("green_tile_slab", TileSlabBlock::new);
        greenTileStairBlock = XKRegistryHandler.Blocks.register("green_tile_stair", TileStairBlock::new);

        redEaveBlock = XKRegistryHandler.Blocks.register("red_roof_eave", EaveBlock::new);
        redEaveSideBlock = XKRegistryHandler.Blocks.register("red_roof_eave_side", EaveSideBlock::new);
        redRoofBlock = XKRegistryHandler.Blocks.register("red_roof", RoofBlock::new);
        redRoofGentleBlock = XKRegistryHandler.Blocks.register("red_roof_gentle", RoofGentleBlock::new);
        redRoofGentleSideBlock = XKRegistryHandler.Blocks.register("red_roof_gentle_side", RoofGentleSideBlock::new);
        redRoofRidgeBlock = XKRegistryHandler.Blocks.register("red_roof_ridge", RoofRidgeBlock::new);
        redRoofSideBlock = XKRegistryHandler.Blocks.register("red_roof_side", RoofSideBlock::new);
        redRoofSteepBlock = XKRegistryHandler.Blocks.register("red_roof_steep", RoofSteepBlock::new);
        redRoofSteepSideBlock = XKRegistryHandler.Blocks.register("red_roof_steep_side", RoofSteepSideBlock::new);
        redTilesBlock = XKRegistryHandler.Blocks.register("red_tiles", TilesBlock::new);
        redTileSlabBlock = XKRegistryHandler.Blocks.register("red_tile_slab", TileSlabBlock::new);
        redTileStairBlock = XKRegistryHandler.Blocks.register("red_tile_stair", TileStairBlock::new);

        blueEaveBlock = XKRegistryHandler.Blocks.register("blue_roof_eave", EaveBlock::new);
        blueEaveSideBlock = XKRegistryHandler.Blocks.register("blue_roof_eave_side", EaveSideBlock::new);
        blueRoofBlock = XKRegistryHandler.Blocks.register("blue_roof", RoofBlock::new);
        blueRoofGentleBlock = XKRegistryHandler.Blocks.register("blue_roof_gentle", RoofGentleBlock::new);
        blueRoofGentleSideBlock = XKRegistryHandler.Blocks.register("blue_roof_gentle_side", RoofGentleSideBlock::new);
        blueRoofRidgeBlock = XKRegistryHandler.Blocks.register("blue_roof_ridge", RoofRidgeBlock::new);
        blueRoofSideBlock = XKRegistryHandler.Blocks.register("blue_roof_side", RoofSideBlock::new);
        blueRoofSteepBlock = XKRegistryHandler.Blocks.register("blue_roof_steep", RoofSteepBlock::new);
        blueRoofSteepSideBlock = XKRegistryHandler.Blocks.register("blue_roof_steep_side", RoofSteepSideBlock::new);
        blueTilesBlock = XKRegistryHandler.Blocks.register("blue_tiles", TilesBlock::new);
        blueTileSlabBlock = XKRegistryHandler.Blocks.register("blue_tile_slab", TileSlabBlock::new);
        blueTileStairBlock = XKRegistryHandler.Blocks.register("blue_tile_stair", TileStairBlock::new);
    }
}
