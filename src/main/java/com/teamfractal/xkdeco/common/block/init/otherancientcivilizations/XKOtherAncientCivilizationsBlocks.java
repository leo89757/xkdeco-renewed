package com.teamfractal.xkdeco.common.block.init.otherancientcivilizations;

import com.teamfractal.xkdeco.common.block.base.*;
import com.teamfractal.xkdeco.common.block.base.basic.ItemFrameCover;
import com.teamfractal.xkdeco.common.block.base.other.CrystalSkullBlock;
import com.teamfractal.xkdeco.common.block.base.western.colrelevant.ColumnBlock;
import com.teamfractal.xkdeco.common.util.XKRegistryHandler;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;

public class XKOtherAncientCivilizationsBlocks {
    public static RegistryObject<Block> mayaStone;
    public static RegistryObject<Block> mayaStoneSlab;
    public static RegistryObject<Block> mayaStoneStair;
    public static RegistryObject<Block> mayaStonebricks;
    public static RegistryObject<Block> mayaStonebrickSlab;
    public static RegistryObject<Block> mayaStonebrickStair;
    public static RegistryObject<Block> mayaBricks;
    public static RegistryObject<Block> mayaBrickSlab;
    public static RegistryObject<Block> mayaBrickStair;
    public static RegistryObject<Block> mayaPolishedStonebricks;
    public static RegistryObject<Block> mayaPolishedStonebrickSlab;
    public static RegistryObject<Block> mayaChiseledStonebricks;
    public static RegistryObject<Block> mayaCutStonebricks;
    public static RegistryObject<Block> mayaPillar;
    public static RegistryObject<Block> mayaStonebrickColumn;
    public static RegistryObject<Block> mayaColumn;
    public static RegistryObject<Block> mayaStonebrickWall;
    public static RegistryObject<Block> mayaBrickWall;
    public static RegistryObject<Block> mayaMossyStonebricks;
    public static RegistryObject<Block> mayaMossyStonebrickSlab;
    public static RegistryObject<Block> mayaMossyStonebrickStair;
    public static RegistryObject<Block> mayaMossyStonebrickWall;
    public static RegistryObject<Block> mayaMossyBricks;
    public static RegistryObject<Block> mayaMossyBrickSlab;
    public static RegistryObject<Block> mayaMossyBrickStair;
    public static RegistryObject<Block> mayaMossyBrickWall;
    public static RegistryObject<Block> mayaPictogramStone;
    public static RegistryObject<Block> mayaCalendar;
    public static RegistryObject<Block> mayaCrystalSkull;

    public static void register(){
        mayaStone = XKRegistryHandler.Blocks.register("maya_stone", GenericStoneBlock::new);
        mayaStoneSlab = XKRegistryHandler.Blocks.register("maya_stone_slab", GenericSlabBlock::new);
        mayaStoneStair = XKRegistryHandler.Blocks.register("maya_stone_stair", GenericStairBlock::new);
        mayaStonebricks = XKRegistryHandler.Blocks.register("maya_stonebricks", GenericStoneBlock::new);
        mayaStonebrickSlab = XKRegistryHandler.Blocks.register("maya_stonebrick_slab", GenericSlabBlock::new);
        mayaStonebrickStair = XKRegistryHandler.Blocks.register("maya_stonebrick_stair", GenericStairBlock::new);
        mayaBricks = XKRegistryHandler.Blocks.register("maya_bricks", GenericStoneBlock::new);
        mayaBrickSlab = XKRegistryHandler.Blocks.register("maya_brick_slab", GenericSlabBlock::new);
        mayaBrickStair = XKRegistryHandler.Blocks.register("maya_brick_stair", GenericStairBlock::new);
        mayaPolishedStonebricks = XKRegistryHandler.Blocks.register("maya_polished_stonebricks", GenericStoneBlock::new);
        mayaPolishedStonebrickSlab = XKRegistryHandler.Blocks.register("maya_polished_stonebrick_slab", GenericSlabBlock::new);
        mayaChiseledStonebricks = XKRegistryHandler.Blocks.register("maya_chiseled_stonebricks", GenericStoneBlock::new);
        mayaCutStonebricks = XKRegistryHandler.Blocks.register("maya_cut_stonebricks", GenericStoneBlock::new);
        mayaPillar = XKRegistryHandler.Blocks.register("maya_pillar", GenericHexDirectionalBlock::new);
        mayaStonebrickColumn = XKRegistryHandler.Blocks.register("maya_stonebrick_column", ColumnBlock::new);
        mayaColumn = XKRegistryHandler.Blocks.register("maya_column", ColumnBlock::new);
        mayaStonebrickWall = XKRegistryHandler.Blocks.register("maya_stonebrick_wall", GenericWallBlock::new);
        mayaBrickWall = XKRegistryHandler.Blocks.register("maya_brick_wall", GenericWallBlock::new);
        mayaMossyStonebricks = XKRegistryHandler.Blocks.register("maya_mossy_stonebricks", GenericStoneBlock::new);
        mayaMossyStonebrickSlab = XKRegistryHandler.Blocks.register("maya_mossy_stonebrick_slab", GenericSlabBlock::new);
        mayaMossyStonebrickStair = XKRegistryHandler.Blocks.register("maya_mossy_stonebrick_stair", GenericStairBlock::new);
        mayaMossyStonebrickWall = XKRegistryHandler.Blocks.register("maya_mossy_stonebrick_wall", GenericWallBlock::new);
        mayaMossyBricks = XKRegistryHandler.Blocks.register("maya_mossy_bricks", GenericStoneBlock::new);
        mayaMossyBrickSlab = XKRegistryHandler.Blocks.register("maya_mossy_brick_slab", GenericSlabBlock::new);
        mayaMossyBrickStair = XKRegistryHandler.Blocks.register("maya_mossy_brick_stair", GenericStairBlock::new);
        mayaMossyBrickWall = XKRegistryHandler.Blocks.register("maya_mossy_brick_wall", GenericWallBlock::new);
        mayaPictogramStone = XKRegistryHandler.Blocks.register("maya_pictogram_stone", GenericStoneBlock::new);
        mayaCalendar = XKRegistryHandler.Blocks.register("maya_calendar", () -> new ItemFrameCover(0));
        mayaCrystalSkull = XKRegistryHandler.Blocks.register("maya_crystal_skull", CrystalSkullBlock::new);
    }
}
