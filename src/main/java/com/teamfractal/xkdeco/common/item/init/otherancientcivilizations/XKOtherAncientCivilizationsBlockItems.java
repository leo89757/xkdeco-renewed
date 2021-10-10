package com.teamfractal.xkdeco.common.item.init.otherancientcivilizations;

import com.teamfractal.xkdeco.common.block.init.otherancientcivilizations.XKOtherAncientCivilizationsBlocks;
import com.teamfractal.xkdeco.common.creativeTab.init.XKTabs;
import com.teamfractal.xkdeco.common.util.XKRegistryHandler;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;

public class XKOtherAncientCivilizationsBlockItems {
    public static RegistryObject<Item> mayaStone;
    public static RegistryObject<Item> mayaStoneSlab;
    public static RegistryObject<Item> mayaStoneStair;
    public static RegistryObject<Item> mayaStonebricks;
    public static RegistryObject<Item> mayaStonebrickSlab;
    public static RegistryObject<Item> mayaStonebrickStair;
    public static RegistryObject<Item> mayaBricks;
    public static RegistryObject<Item> mayaBrickSlab;
    public static RegistryObject<Item> mayaBrickStair;
    public static RegistryObject<Item> mayaPolishedStonebricks;
    public static RegistryObject<Item> mayaPolishedStonebrickSlab;
    public static RegistryObject<Item> mayaChiseledStonebricks;
    public static RegistryObject<Item> mayaCutStonebricks;
    public static RegistryObject<Item> mayaPillar;
    public static RegistryObject<Item> mayaStonebrickColumn;
    public static RegistryObject<Item> mayaColumn;
    public static RegistryObject<Item> mayaStonebrickWall;
    public static RegistryObject<Item> mayaBrickWall;
    public static RegistryObject<Item> mayaMossyStonebricks;
    public static RegistryObject<Item> mayaMossyStonebrickSlab;
    public static RegistryObject<Item> mayaMossyStonebrickStair;
    public static RegistryObject<Item> mayaMossyStonebrickWall;
    public static RegistryObject<Item> mayaMossyBricks;
    public static RegistryObject<Item> mayaMossyBrickSlab;
    public static RegistryObject<Item> mayaMossyBrickStair;
    public static RegistryObject<Item> mayaMossyBrickWall;
    public static RegistryObject<Item> mayaPictogramStone;
    public static RegistryObject<Item> mayaCalendar;
    public static RegistryObject<Item> mayaCrystalSkull;

    public static void register(){
        mayaStone = XKRegistryHandler.Items.register("maya_stone", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaStone.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaStoneSlab = XKRegistryHandler.Items.register("maya_stone_slab", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaStoneSlab.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaStoneStair = XKRegistryHandler.Items.register("maya_stone_stair", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaStoneStair.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaStonebricks = XKRegistryHandler.Items.register("maya_stonebricks", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaStonebricks.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaStonebrickSlab = XKRegistryHandler.Items.register("maya_stonebrick_slab", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaStonebrickSlab.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaStonebrickStair = XKRegistryHandler.Items.register("maya_stonebrick_stair", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaStonebrickStair.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaBricks = XKRegistryHandler.Items.register("maya_bricks", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaBricks.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaBrickSlab = XKRegistryHandler.Items.register("maya_brick_slab", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaBrickSlab.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaBrickStair = XKRegistryHandler.Items.register("maya_brick_stair", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaBrickStair.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaPolishedStonebricks = XKRegistryHandler.Items.register("maya_polished_stonebricks", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaPolishedStonebricks.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaPolishedStonebrickSlab = XKRegistryHandler.Items.register("maya_polished_stonebrick_slab", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaPolishedStonebrickSlab.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaChiseledStonebricks = XKRegistryHandler.Items.register("maya_chiseled_stonebricks", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaChiseledStonebricks.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaCutStonebricks = XKRegistryHandler.Items.register("maya_cut_stonebricks", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaCutStonebricks.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaPillar = XKRegistryHandler.Items.register("maya_pillar", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaPillar.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaStonebrickColumn = XKRegistryHandler.Items.register("maya_stonebrick_column", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaStonebrickColumn.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaColumn = XKRegistryHandler.Items.register("maya_column", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaColumn.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaStonebrickWall = XKRegistryHandler.Items.register("maya_stonebrick_wall", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaStonebrickWall.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaBrickWall = XKRegistryHandler.Items.register("maya_brick_wall", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaBrickWall.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaMossyStonebricks = XKRegistryHandler.Items.register("maya_mossy_stonebricks", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaMossyStonebricks.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaMossyStonebrickSlab = XKRegistryHandler.Items.register("maya_mossy_stonebrick_slab", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaMossyStonebrickSlab.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaMossyStonebrickStair = XKRegistryHandler.Items.register("maya_mossy_stonebrick_stair", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaMossyStonebrickStair.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaMossyStonebrickWall = XKRegistryHandler.Items.register("maya_mossy_stonebrick_wall", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaMossyStonebrickWall.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaMossyBricks = XKRegistryHandler.Items.register("maya_mossy_bricks", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaMossyBricks.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaMossyBrickSlab = XKRegistryHandler.Items.register("maya_mossy_brick_slab", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaMossyBrickSlab.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaMossyBrickStair = XKRegistryHandler.Items.register("maya_mossy_brick_stair", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaMossyBrickStair.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaMossyBrickWall = XKRegistryHandler.Items.register("maya_mossy_brick_wall", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaMossyBrickWall.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaPictogramStone = XKRegistryHandler.Items.register("maya_pictogram_stone", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaPictogramStone.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaCalendar = XKRegistryHandler.Items.register("maya_calendar", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaCalendar.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
        mayaCrystalSkull = XKRegistryHandler.Items.register("maya_crystal_skull", () -> new BlockItem(XKOtherAncientCivilizationsBlocks.mayaCrystalSkull.get(),new Item.Properties().tab(XKTabs.xkotherancientcivilizations)));
    }
}
