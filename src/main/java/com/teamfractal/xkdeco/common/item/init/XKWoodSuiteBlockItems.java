package com.teamfractal.xkdeco.common.item.init;

import com.teamfractal.xkdeco.common.block.WoodStairBlock;
import com.teamfractal.xkdeco.common.block.WoodWallBlock;
import com.teamfractal.xkdeco.common.block.colrelevant.WoodColumnHeadBlock;
import com.teamfractal.xkdeco.common.block.init.XKWoodSuiteBlocks;
import com.teamfractal.xkdeco.common.block.woodensuite.*;
import com.teamfractal.xkdeco.common.creativeTab.init.XKTabs;
import com.teamfractal.xkdeco.common.util.XKRegistryHandler;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;

public class XKWoodSuiteBlockItems {
    public static RegistryObject<Item> ebonyBigTableBlock;
    public static RegistryObject<Item> ebonyBracketInterpolationBlock;
    public static RegistryObject<Item> ebonyBracketInterpolationHollowBlock;
    public static RegistryObject<Item> ebonyBracketSetBlock;
    public static RegistryObject<Item> ebonyChairBlock;
    public static RegistryObject<Item> ebonyColumnHeadBlock;
    public static RegistryObject<Item> ebonyColumnHollowWallBlock;
    public static RegistryObject<Item> ebonyColumnMudWallBlock;
    public static RegistryObject<Item> ebonyColumnWoodWallBlock;
    public static RegistryObject<Item> ebonyDeskBlock;
    public static RegistryObject<Item> ebonyDoorBlock;
    public static RegistryObject<Item> ebonyDoubleDoorsBlock;
    public static RegistryObject<Item> ebonyFenceBlock;
    public static RegistryObject<Item> ebonyFenceGateBlock;
    public static RegistryObject<Item> ebonyFenceHeadBlock;
    public static RegistryObject<Item> ebonyFenceObliqueBlock;
    public static RegistryObject<Item> ebonyFenceObliqueSteepBlock;
    public static RegistryObject<Item> ebonyFlipWindowBlock;
    public static RegistryObject<Item> ebonyGooseneckChairBlock;
    public static RegistryObject<Item> ebonyGooseneckChairColumnBlock;
    public static RegistryObject<Item> ebonyImplicateBlock;
    public static RegistryObject<Item> ebonyLogBlock;
    public static RegistryObject<Item> ebonyObliqueBraceBlock;
    public static RegistryObject<Item> ebonyPlanksBlock;
    public static RegistryObject<Item> ebonyScreenBlock;
    public static RegistryObject<Item> ebonyShelfBlock;
    public static RegistryObject<Item> ebonySlabBlock;
    public static RegistryObject<Item> ebonyStairsBlock;
    public static RegistryObject<Item> ebonyTableBlock;
    public static RegistryObject<Item> ebonyTrapdoorBlock;
    public static RegistryObject<Item> ebonyWallBlock;
    public static RegistryObject<Item> ebonyWindowBlock;
    public static RegistryObject<Item> ebonyWoodBlock;

    public static RegistryObject<Item> mahoganyBigTableBlock;
    public static RegistryObject<Item> mahoganyBracketInterpolationBlock;
    public static RegistryObject<Item> mahoganyBracketInterpolationHollowBlock;
    public static RegistryObject<Item> mahoganyBracketSetBlock;
    public static RegistryObject<Item> mahoganyChairBlock;
    public static RegistryObject<Item> mahoganyColumnHeadBlock;
    public static RegistryObject<Item> mahoganyColumnHollowWallBlock;
    public static RegistryObject<Item> mahoganyColumnMudWallBlock;
    public static RegistryObject<Item> mahoganyColumnWoodWallBlock;
    public static RegistryObject<Item> mahoganyDeskBlock;
    public static RegistryObject<Item> mahoganyDoorBlock;
    public static RegistryObject<Item> mahoganyDoubleDoorsBlock;
    public static RegistryObject<Item> mahoganyFenceBlock;
    public static RegistryObject<Item> mahoganyFenceGateBlock;
    public static RegistryObject<Item> mahoganyFenceHeadBlock;
    public static RegistryObject<Item> mahoganyFenceObliqueBlock;
    public static RegistryObject<Item> mahoganyFenceObliqueSteepBlock;
    public static RegistryObject<Item> mahoganyFlipWindowBlock;
    public static RegistryObject<Item> mahoganyGooseneckChairBlock;
    public static RegistryObject<Item> mahoganyGooseneckChairColumnBlock;
    public static RegistryObject<Item> mahoganyImplicateBlock;
    public static RegistryObject<Item> mahoganyLogBlock;
    public static RegistryObject<Item> mahoganyObliqueBraceBlock;
    public static RegistryObject<Item> mahoganyPlanksBlock;
    public static RegistryObject<Item> mahoganyScreenBlock;
    public static RegistryObject<Item> mahoganyShelfBlock;
    public static RegistryObject<Item> mahoganySlabBlock;
    public static RegistryObject<Item> mahoganyStairsBlock;
    public static RegistryObject<Item> mahoganyTableBlock;
    public static RegistryObject<Item> mahoganyTrapdoorBlock;
    public static RegistryObject<Item> mahoganyWallBlock;
    public static RegistryObject<Item> mahoganyWindowBlock;
    public static RegistryObject<Item> mahoganyWoodBlock;

    public static void register(){
        ebonyBigTableBlock = XKRegistryHandler.Items.register("ebony_big_table"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyBigTableBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyBracketInterpolationBlock = XKRegistryHandler.Items.register("ebony_bracket_interpolation"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyBracketInterpolationBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyBracketInterpolationHollowBlock = XKRegistryHandler.Items.register("ebony_bracket_interpolation_hollow"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyBracketInterpolationHollowBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyBracketSetBlock = XKRegistryHandler.Items.register("ebony_bracket_set"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyBracketSetBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyChairBlock = XKRegistryHandler.Items.register("ebony_chair"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyChairBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyColumnHeadBlock = XKRegistryHandler.Items.register("ebony_column_head"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyColumnHeadBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyColumnHollowWallBlock = XKRegistryHandler.Items.register("ebony_column_hollow_wall"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyColumnHollowWallBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyColumnMudWallBlock = XKRegistryHandler.Items.register("ebony_column_mud_wall"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyColumnMudWallBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyColumnWoodWallBlock = XKRegistryHandler.Items.register("ebony_column_wood_wall"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyColumnWoodWallBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyDeskBlock = XKRegistryHandler.Items.register("ebony_desk"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyDeskBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyDoorBlock = XKRegistryHandler.Items.register("ebony_door"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyDoorBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyDoubleDoorsBlock = XKRegistryHandler.Items.register("ebony_double_doors"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyDoubleDoorsBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyFenceBlock = XKRegistryHandler.Items.register("ebony_fence"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyFenceBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyFenceGateBlock = XKRegistryHandler.Items.register("ebony_fence_gate"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyFenceGateBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyFenceHeadBlock = XKRegistryHandler.Items.register("ebony_fence_head"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyFenceHeadBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyFenceObliqueBlock = XKRegistryHandler.Items.register("ebony_fence_oblique"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyFenceObliqueBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyFenceObliqueSteepBlock = XKRegistryHandler.Items.register("ebony_fence_oblique_steep"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyFenceObliqueSteepBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyFlipWindowBlock = XKRegistryHandler.Items.register("ebony_flip_window"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyFlipWindowBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyGooseneckChairBlock = XKRegistryHandler.Items.register("ebony_gooseneck_chair"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyGooseneckChairBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyGooseneckChairColumnBlock = XKRegistryHandler.Items.register("ebony_gooseneck_chair_column"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyGooseneckChairColumnBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyImplicateBlock = XKRegistryHandler.Items.register("ebony_implicate"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyImplicateBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyObliqueBraceBlock = XKRegistryHandler.Items.register("ebony_oblique_brace"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyObliqueBraceBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyLogBlock = XKRegistryHandler.Items.register("ebony_log"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyLogBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyWoodBlock = XKRegistryHandler.Items.register("ebony_wood"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyWoodBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyPlanksBlock = XKRegistryHandler.Items.register("ebony_planks"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyPlanksBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyScreenBlock = XKRegistryHandler.Items.register("ebony_screen"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyScreenBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyShelfBlock = XKRegistryHandler.Items.register("ebony_shelf"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyShelfBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonySlabBlock = XKRegistryHandler.Items.register("ebony_slab"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonySlabBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyStairsBlock = XKRegistryHandler.Items.register("ebony_stairs"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyStairsBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyTableBlock = XKRegistryHandler.Items.register("ebony_table"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyTableBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyTrapdoorBlock = XKRegistryHandler.Items.register("ebony_trapdoor"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyTrapdoorBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyWallBlock = XKRegistryHandler.Items.register("ebony_wall"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyWallBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        ebonyWindowBlock = XKRegistryHandler.Items.register("ebony_window"
                , () -> new BlockItem(XKWoodSuiteBlocks.ebonyWindowBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));

        mahoganyBigTableBlock = XKRegistryHandler.Items.register("mahogany_big_table"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyBigTableBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyBracketInterpolationBlock = XKRegistryHandler.Items.register("mahogany_bracket_interpolation"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyBracketInterpolationBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyBracketInterpolationHollowBlock = XKRegistryHandler.Items.register("mahogany_bracket_interpolation_hollow"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyBracketInterpolationHollowBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyBracketSetBlock = XKRegistryHandler.Items.register("mahogany_bracket_set"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyBracketSetBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyChairBlock = XKRegistryHandler.Items.register("mahogany_chair"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyChairBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyColumnHeadBlock = XKRegistryHandler.Items.register("mahogany_column_head"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyColumnHeadBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyColumnHollowWallBlock = XKRegistryHandler.Items.register("mahogany_column_hollow_wall"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyColumnHollowWallBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyColumnMudWallBlock = XKRegistryHandler.Items.register("mahogany_column_mud_wall"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyColumnMudWallBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyColumnWoodWallBlock = XKRegistryHandler.Items.register("mahogany_column_wood_wall"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyColumnWoodWallBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyDeskBlock = XKRegistryHandler.Items.register("mahogany_desk"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyDeskBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyDoorBlock = XKRegistryHandler.Items.register("mahogany_door"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyDoorBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyDoubleDoorsBlock = XKRegistryHandler.Items.register("mahogany_double_doors"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyDoubleDoorsBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyFenceBlock = XKRegistryHandler.Items.register("mahogany_fence"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyFenceBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyFenceGateBlock = XKRegistryHandler.Items.register("mahogany_fence_gate"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyFenceGateBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyFenceHeadBlock = XKRegistryHandler.Items.register("mahogany_fence_head"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyFenceHeadBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyFenceObliqueBlock = XKRegistryHandler.Items.register("mahogany_fence_oblique"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyFenceObliqueBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyFenceObliqueSteepBlock = XKRegistryHandler.Items.register("mahogany_fence_oblique_steep"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyFenceObliqueSteepBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyFlipWindowBlock = XKRegistryHandler.Items.register("mahogany_flip_window"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyFlipWindowBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyGooseneckChairBlock = XKRegistryHandler.Items.register("mahogany_gooseneck_chair"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyGooseneckChairBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyGooseneckChairColumnBlock = XKRegistryHandler.Items.register("mahogany_gooseneck_chair_column"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyGooseneckChairColumnBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyImplicateBlock = XKRegistryHandler.Items.register("mahogany_implicate"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyImplicateBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyObliqueBraceBlock = XKRegistryHandler.Items.register("mahogany_oblique_brace"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyObliqueBraceBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyLogBlock = XKRegistryHandler.Items.register("mahogany_log"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyLogBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyWoodBlock = XKRegistryHandler.Items.register("mahogany_wood"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyWoodBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyPlanksBlock = XKRegistryHandler.Items.register("mahogany_planks"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyPlanksBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyScreenBlock = XKRegistryHandler.Items.register("mahogany_screen"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyScreenBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyShelfBlock = XKRegistryHandler.Items.register("mahogany_shelf"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyShelfBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganySlabBlock = XKRegistryHandler.Items.register("mahogany_slab"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganySlabBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyStairsBlock = XKRegistryHandler.Items.register("mahogany_stairs"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyStairsBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyTableBlock = XKRegistryHandler.Items.register("mahogany_table"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyTableBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyTrapdoorBlock = XKRegistryHandler.Items.register("mahogany_trapdoor"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyTrapdoorBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyWallBlock = XKRegistryHandler.Items.register("mahogany_wall"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyWallBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
        mahoganyWindowBlock = XKRegistryHandler.Items.register("mahogany_window"
                , () -> new BlockItem(XKWoodSuiteBlocks.mahoganyWindowBlock.get(),new Item.Properties().tab(XKTabs.xkeastern)));
    }
}
