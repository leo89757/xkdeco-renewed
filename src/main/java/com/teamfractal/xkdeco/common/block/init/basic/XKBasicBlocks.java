package com.teamfractal.xkdeco.common.block.init.basic;

import com.teamfractal.xkdeco.common.block.base.basic.*;
import com.teamfractal.xkdeco.common.util.XKRegistryHandler;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;

public class XKBasicBlocks {
    public static RegistryObject<Block> smallBookStack;
    public static RegistryObject<Block> bigBookStack;
    public static RegistryObject<Block> emptyFishTank;
    public static RegistryObject<Block> fishTank;
    public static RegistryObject<Block> glassTiles;
    public static RegistryObject<Block> glassTileSlab;
    public static RegistryObject<Block> glassTileStair;
    public static RegistryObject<Block> glassTrapdoor;
    public static RegistryObject<Block> glassDoor;
    public static RegistryObject<Block> emptyBottleStack;
    public static RegistryObject<Block> bottleStack;
    public static RegistryObject<Block> woodGlobe;
    public static RegistryObject<Block> globe;
    public static RegistryObject<Block> solarSystemModel;
    public static RegistryObject<Block> solarSystemModelBig;
    public static RegistryObject<Block> telescope;
    public static RegistryObject<Block> simpleWoodenTable;
    public static RegistryObject<Block> simpleWoodenStool;
    public static RegistryObject<Block> itemFrameCover;
    public static RegistryObject<Block> glowItemFrameCover;
    public static RegistryObject<Block> signEntrance;
    public static RegistryObject<Block> signExit;
    public static RegistryObject<Block> signLeft;
    public static RegistryObject<Block> signRight;
    public static RegistryObject<Block> smallSignLeft;
    public static RegistryObject<Block> smallSignRight;
    public static RegistryObject<Block> smallSignGround;
    public static RegistryObject<Block> emergencyExitLeft;
    public static RegistryObject<Block> emergencyExitRight;
    public static RegistryObject<Block> emergencyExit;
    public static RegistryObject<Block> emergencyExitGround;

    public static void register(){
        smallBookStack = XKRegistryHandler.Blocks.register("small_book_stack", SmallBookStackBlock::new);
        bigBookStack = XKRegistryHandler.Blocks.register("big_book_stack", BookStackBlock::new);
        emptyFishTank = XKRegistryHandler.Blocks.register("empty_fish_tank", FishTankBlock::new);
        fishTank = XKRegistryHandler.Blocks.register("fish_tank", FishTankBlock::new);
        glassTiles = XKRegistryHandler.Blocks.register("glass_tiles", FragileBlock::new);
        glassTileSlab = XKRegistryHandler.Blocks.register("glass_tile_slab", FragileSlabBlock::new);
        glassTileStair = XKRegistryHandler.Blocks.register("glass_tile_stair", FragileStairBlock::new);
        glassTrapdoor = XKRegistryHandler.Blocks.register("glass_trapdoor", FragileTrapdoorBlock::new);
        glassDoor = XKRegistryHandler.Blocks.register("glass_door", FragileDoorBlock::new);
        emptyBottleStack = XKRegistryHandler.Blocks.register("empty_bottle_stack", BottleStackBlock::new);
        bottleStack = XKRegistryHandler.Blocks.register("bottle_stack", BottleStackBlock::new);
        woodGlobe = XKRegistryHandler.Blocks.register("wood_globe", GlobeBlock::new);
        globe = XKRegistryHandler.Blocks.register("globe", GlobeBlock::new);
        solarSystemModel = XKRegistryHandler.Blocks.register("solar_system_model", SmallSolarSystemModelBlock::new);
        solarSystemModelBig = XKRegistryHandler.Blocks.register("solar_system_model_big", SolarSystemModelBlock::new);
        telescope = XKRegistryHandler.Blocks.register("telescope", TelescopeBlock::new);
        simpleWoodenTable = XKRegistryHandler.Blocks.register("simple_wooden_table", SimpleWoodenTableBlock::new);
        simpleWoodenStool = XKRegistryHandler.Blocks.register("simple_wooden_stool", SimpleWoodenStoolBlock::new);
        itemFrameCover = XKRegistryHandler.Blocks.register("item_frame_cover", () -> new ItemFrameCover(0));
        glowItemFrameCover = XKRegistryHandler.Blocks.register("glow_item_frame_cover", () -> new ItemFrameCover(12));
        signEntrance = XKRegistryHandler.Blocks.register("sign_entrance", WallSignBlock::new);
        signExit = XKRegistryHandler.Blocks.register("sign_exit", WallSignBlock::new);
        signLeft = XKRegistryHandler.Blocks.register("sign_left", WallSignBlock::new);
        signRight = XKRegistryHandler.Blocks.register("sign_right", WallSignBlock::new);
        smallSignLeft = XKRegistryHandler.Blocks.register("small_sign_left", WallSignBlock::new);
        smallSignRight = XKRegistryHandler.Blocks.register("small_sign_right", WallSignBlock::new);
        smallSignGround = XKRegistryHandler.Blocks.register("small_sign_ground", GroundSignBlock::new);
        emergencyExitLeft = XKRegistryHandler.Blocks.register("emergency_exit_left", WallSignBlock::new);
        emergencyExitRight = XKRegistryHandler.Blocks.register("emergency_exit_right", WallSignBlock::new);
        emergencyExit = XKRegistryHandler.Blocks.register("emergency_exit", WallSignBlock::new);
        emergencyExitGround = XKRegistryHandler.Blocks.register("emergency_exit_ground", GroundSignBlock::new);
    }
}
