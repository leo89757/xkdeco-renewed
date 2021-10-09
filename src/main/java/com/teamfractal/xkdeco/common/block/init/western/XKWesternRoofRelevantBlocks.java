package com.teamfractal.xkdeco.common.block.init.western;

import com.teamfractal.xkdeco.common.block.base.GenericSlabBlock;
import com.teamfractal.xkdeco.common.block.base.GenericStairBlock;
import com.teamfractal.xkdeco.common.block.base.GenericStoneBlock;
import com.teamfractal.xkdeco.common.block.base.TileStairBlock;
import com.teamfractal.xkdeco.common.block.base.roofrelevant.RoofRidgeBlock;
import com.teamfractal.xkdeco.common.util.XKRegistryHandler;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;

public class XKWesternRoofRelevantBlocks {
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
        greenEaveBlock = XKRegistryHandler.Blocks.register("green_roof_eave", GenericStairBlock::new);
        greenEaveSideBlock = XKRegistryHandler.Blocks.register("green_roof_eave_side", GenericStairBlock::new);
        greenRoofBlock = XKRegistryHandler.Blocks.register("green_roof", GenericStairBlock::new);
        greenRoofGentleBlock = XKRegistryHandler.Blocks.register("green_roof_gentle", GenericStairBlock::new);
        greenRoofGentleSideBlock = XKRegistryHandler.Blocks.register("green_roof_gentle_side", GenericStairBlock::new);
        greenRoofRidgeBlock = XKRegistryHandler.Blocks.register("green_roof_ridge", RoofRidgeBlock::new);
        greenRoofSideBlock = XKRegistryHandler.Blocks.register("green_roof_side", GenericStairBlock::new);
        greenRoofSteepBlock = XKRegistryHandler.Blocks.register("green_roof_steep", GenericStairBlock::new);
        greenRoofSteepSideBlock = XKRegistryHandler.Blocks.register("green_roof_steep_side", GenericStairBlock::new);
        greenTilesBlock = XKRegistryHandler.Blocks.register("green_tiles", GenericStoneBlock::new);
        greenTileSlabBlock = XKRegistryHandler.Blocks.register("green_tile_slab", GenericSlabBlock::new);
        greenTileStairBlock = XKRegistryHandler.Blocks.register("green_tile_stair", TileStairBlock::new);

        redEaveBlock = XKRegistryHandler.Blocks.register("red_roof_eave", GenericStairBlock::new);
        redEaveSideBlock = XKRegistryHandler.Blocks.register("red_roof_eave_side", GenericStairBlock::new);
        redRoofBlock = XKRegistryHandler.Blocks.register("red_roof", GenericStairBlock::new);
        redRoofGentleBlock = XKRegistryHandler.Blocks.register("red_roof_gentle", GenericStairBlock::new);
        redRoofGentleSideBlock = XKRegistryHandler.Blocks.register("red_roof_gentle_side", GenericStairBlock::new);
        redRoofRidgeBlock = XKRegistryHandler.Blocks.register("red_roof_ridge", RoofRidgeBlock::new);
        redRoofSideBlock = XKRegistryHandler.Blocks.register("red_roof_side", GenericStairBlock::new);
        redRoofSteepBlock = XKRegistryHandler.Blocks.register("red_roof_steep", GenericStairBlock::new);
        redRoofSteepSideBlock = XKRegistryHandler.Blocks.register("red_roof_steep_side", GenericStairBlock::new);
        redTilesBlock = XKRegistryHandler.Blocks.register("red_tiles", GenericStoneBlock::new);
        redTileSlabBlock = XKRegistryHandler.Blocks.register("red_tile_slab", GenericSlabBlock::new);
        redTileStairBlock = XKRegistryHandler.Blocks.register("red_tile_stair", TileStairBlock::new);

        blueEaveBlock = XKRegistryHandler.Blocks.register("blue_roof_eave", GenericStairBlock::new);
        blueEaveSideBlock = XKRegistryHandler.Blocks.register("blue_roof_eave_side", GenericStairBlock::new);
        blueRoofBlock = XKRegistryHandler.Blocks.register("blue_roof", GenericStairBlock::new);
        blueRoofGentleBlock = XKRegistryHandler.Blocks.register("blue_roof_gentle", GenericStairBlock::new);
        blueRoofGentleSideBlock = XKRegistryHandler.Blocks.register("blue_roof_gentle_side", GenericStairBlock::new);
        blueRoofRidgeBlock = XKRegistryHandler.Blocks.register("blue_roof_ridge", RoofRidgeBlock::new);
        blueRoofSideBlock = XKRegistryHandler.Blocks.register("blue_roof_side", GenericStairBlock::new);
        blueRoofSteepBlock = XKRegistryHandler.Blocks.register("blue_roof_steep", GenericStairBlock::new);
        blueRoofSteepSideBlock = XKRegistryHandler.Blocks.register("blue_roof_steep_side", GenericStairBlock::new);
        blueTilesBlock = XKRegistryHandler.Blocks.register("blue_tiles", GenericStoneBlock::new);
        blueTileSlabBlock = XKRegistryHandler.Blocks.register("blue_tile_slab", GenericSlabBlock::new);
        blueTileStairBlock = XKRegistryHandler.Blocks.register("blue_tile_stair", TileStairBlock::new);
    }
}
