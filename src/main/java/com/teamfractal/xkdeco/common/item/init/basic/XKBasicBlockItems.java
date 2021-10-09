package com.teamfractal.xkdeco.common.item.init.basic;

import com.teamfractal.xkdeco.common.block.init.basic.XKBasicBlocks;
import com.teamfractal.xkdeco.common.creativeTab.init.XKTabs;
import com.teamfractal.xkdeco.common.util.XKRegistryHandler;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;

public class XKBasicBlockItems {
    public static RegistryObject<Item> smallBookStack;
    public static RegistryObject<Item> bigBookStack;
    public static RegistryObject<Item> emptyFishTank;
    public static RegistryObject<Item> fishTank;
    public static RegistryObject<Item> glassTiles;
    public static RegistryObject<Item> glassTileSlab;
    public static RegistryObject<Item> glassTileStair;
    public static RegistryObject<Item> glassTrapdoor;
    public static RegistryObject<Item> glassDoor;
    public static RegistryObject<Item> emptyBottleStack;
    public static RegistryObject<Item> bottleStack;
    public static RegistryObject<Item> woodGlobe;
    public static RegistryObject<Item> globe;
    public static RegistryObject<Item> solarSystemModel;
    public static RegistryObject<Item> solarSystemModelBig;
    public static RegistryObject<Item> telescope;
    public static RegistryObject<Item> simpleWoodenTable;
    public static RegistryObject<Item> simpleWoodenStool;
    public static RegistryObject<Item> itemFrameCover;
    public static RegistryObject<Item> glowItemFrameCover;
    public static RegistryObject<Item> signEntrance;
    public static RegistryObject<Item> signExit;
    public static RegistryObject<Item> signLeft;
    public static RegistryObject<Item> signRight;
    public static RegistryObject<Item> smallSignLeft;
    public static RegistryObject<Item> smallSignRight;
    public static RegistryObject<Item> smallSignGround;
    public static RegistryObject<Item> emergencyExitLeft;
    public static RegistryObject<Item> emergencyExitRight;
    public static RegistryObject<Item> emergencyExit;
    public static RegistryObject<Item> emergencyExitGround;

    public static void register(){
        smallBookStack = XKRegistryHandler.Items.register("small_book_stack", () -> new BlockItem(XKBasicBlocks.smallBookStack.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        bigBookStack = XKRegistryHandler.Items.register("big_book_stack", () -> new BlockItem(XKBasicBlocks.bigBookStack.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        emptyFishTank = XKRegistryHandler.Items.register("empty_fish_tank", () -> new BlockItem(XKBasicBlocks.emptyFishTank.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        fishTank = XKRegistryHandler.Items.register("fish_tank", () -> new BlockItem(XKBasicBlocks.fishTank.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        glassTiles = XKRegistryHandler.Items.register("glass_tiles", () -> new BlockItem(XKBasicBlocks.glassTiles.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        glassTileSlab = XKRegistryHandler.Items.register("glass_tile_slab", () -> new BlockItem(XKBasicBlocks.glassTileSlab.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        glassTileStair = XKRegistryHandler.Items.register("glass_tile_stair", () -> new BlockItem(XKBasicBlocks.glassTileStair.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        glassTrapdoor = XKRegistryHandler.Items.register("glass_trapdoor", () -> new BlockItem(XKBasicBlocks.glassTrapdoor.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        glassDoor = XKRegistryHandler.Items.register("glass_door", () -> new BlockItem(XKBasicBlocks.glassDoor.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        emptyBottleStack = XKRegistryHandler.Items.register("empty_bottle_stack", () -> new BlockItem(XKBasicBlocks.emptyBottleStack.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        bottleStack = XKRegistryHandler.Items.register("bottle_stack", () -> new BlockItem(XKBasicBlocks.bottleStack.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        woodGlobe = XKRegistryHandler.Items.register("wood_globe", () -> new BlockItem(XKBasicBlocks.woodGlobe.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        globe = XKRegistryHandler.Items.register("globe", () -> new BlockItem(XKBasicBlocks.globe.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        solarSystemModel = XKRegistryHandler.Items.register("solar_system_model", () -> new BlockItem(XKBasicBlocks.solarSystemModel.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        solarSystemModelBig = XKRegistryHandler.Items.register("solar_system_model_big", () -> new BlockItem(XKBasicBlocks.solarSystemModelBig.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        telescope = XKRegistryHandler.Items.register("telescope", () -> new BlockItem(XKBasicBlocks.telescope.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        simpleWoodenTable = XKRegistryHandler.Items.register("simple_wooden_table", () -> new BlockItem(XKBasicBlocks.simpleWoodenTable.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        simpleWoodenStool = XKRegistryHandler.Items.register("simple_wooden_stool", () -> new BlockItem(XKBasicBlocks.simpleWoodenStool.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        itemFrameCover = XKRegistryHandler.Items.register("item_frame_cover", () -> new BlockItem(XKBasicBlocks.itemFrameCover.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        glowItemFrameCover = XKRegistryHandler.Items.register("glow_item_frame_cover", () -> new BlockItem(XKBasicBlocks.glowItemFrameCover.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        signEntrance = XKRegistryHandler.Items.register("sign_entrance", () -> new BlockItem(XKBasicBlocks.signEntrance.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        signExit = XKRegistryHandler.Items.register("sign_exit", () -> new BlockItem(XKBasicBlocks.signExit.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        signLeft = XKRegistryHandler.Items.register("sign_left", () -> new BlockItem(XKBasicBlocks.signLeft.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        signRight = XKRegistryHandler.Items.register("sign_right", () -> new BlockItem(XKBasicBlocks.signRight.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        smallSignLeft = XKRegistryHandler.Items.register("small_sign_left", () -> new BlockItem(XKBasicBlocks.smallSignLeft.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        smallSignRight = XKRegistryHandler.Items.register("small_sign_right", () -> new BlockItem(XKBasicBlocks.smallSignRight.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        smallSignGround = XKRegistryHandler.Items.register("small_sign_ground", () -> new BlockItem(XKBasicBlocks.smallSignGround.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        emergencyExitLeft = XKRegistryHandler.Items.register("emergency_exit_left", () -> new BlockItem(XKBasicBlocks.emergencyExitLeft.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        emergencyExitRight = XKRegistryHandler.Items.register("emergency_exit_right", () -> new BlockItem(XKBasicBlocks.emergencyExitRight.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        emergencyExit = XKRegistryHandler.Items.register("emergency_exit", () -> new BlockItem(XKBasicBlocks.emergencyExit.get(),new Item.Properties().tab(XKTabs.xkbasic)));
        emergencyExitGround = XKRegistryHandler.Items.register("emergency_exit_ground", () -> new BlockItem(XKBasicBlocks.emergencyExitGround.get(),new Item.Properties().tab(XKTabs.xkbasic)));
    }
}
