package com.teamfractal.xkdeco.common.block.init.eastern;

import com.teamfractal.xkdeco.common.block.base.*;
import com.teamfractal.xkdeco.common.block.base.eastern.*;
import com.teamfractal.xkdeco.common.block.base.woodensuite.WoodFenceGateBlock;
import com.teamfractal.xkdeco.common.util.XKRegistryHandler;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;

public class XKOtherEasternBlocks {
    public static RegistryObject<Block> columnBase;
    public static RegistryObject<Block> wallBase;
    public static RegistryObject<Block> columnBaseLight;
    public static RegistryObject<Block> wallBaseLight;
    public static RegistryObject<Block> thresholdStone;
    public static RegistryObject<Block> thresholdWood;
    public static RegistryObject<Block> mudWallBlock;
    public static RegistryObject<Block> mudWallFramed;
    public static RegistryObject<Block> mudWallLine;
    public static RegistryObject<Block> cyanBricks;
    public static RegistryObject<Block> cyanBrickSlab;
    public static RegistryObject<Block> cyanBrickStair;
    public static RegistryObject<Block> cyanWall;
    public static RegistryObject<Block> mudWallSlab;
    public static RegistryObject<Block> mudWallStair;
    public static RegistryObject<Block> mudWallWall;
    public static RegistryObject<Block> mudWallLineStair;
    public static RegistryObject<Block> mudWallCrossStair;
    public static RegistryObject<Block> whitePorcelain;
    public static RegistryObject<Block> whitePorcelainTall;
    public static RegistryObject<Block> whitePorcelainSmall;
    public static RegistryObject<Block> bluewhitePorcelain;
    public static RegistryObject<Block> bluewhitePorcelainTall;
    public static RegistryObject<Block> bluewhitePorcelainSmall;
    public static RegistryObject<Block> celadonPorcelain;
    public static RegistryObject<Block> celadonPorcelainTall;
    public static RegistryObject<Block> celadonPorcelainSmall;
    public static RegistryObject<Block> fishBowl;
    public static RegistryObject<Block> darkFishBowl;
    public static RegistryObject<Block> bonsai;
    public static RegistryObject<Block> coralBonsai;
    public static RegistryObject<Block> teaWare;
    public static RegistryObject<Block> goBoard;
    public static RegistryObject<Block> paperLantern;
    public static RegistryObject<Block> redLantern;
    public static RegistryObject<Block> oilLamp;

    public static void register(){
        columnBase = XKRegistryHandler.Blocks.register("column_base", GenericStoneBlock::new);
        wallBase = XKRegistryHandler.Blocks.register("wall_base", GenericStairBlock::new);
        columnBaseLight = XKRegistryHandler.Blocks.register("column_base_light", GenericStoneBlock::new);
        wallBaseLight = XKRegistryHandler.Blocks.register("wall_base_light", GenericStairBlock::new);
        thresholdStone = XKRegistryHandler.Blocks.register("threshold", GenericFenceGateBlock::new);
        thresholdWood = XKRegistryHandler.Blocks.register("threshold_wood", WoodFenceGateBlock::new);
        mudWallBlock = XKRegistryHandler.Blocks.register("mud_wall_block", GenericStoneBlock::new);
        mudWallFramed = XKRegistryHandler.Blocks.register("mud_wall_framed", GenericStoneBlock::new);
        mudWallLine = XKRegistryHandler.Blocks.register("mud_wall_line", GenericStoneBlock::new);
        cyanBricks = XKRegistryHandler.Blocks.register("cyan_bricks", GenericStoneBlock::new);
        cyanBrickSlab = XKRegistryHandler.Blocks.register("cyan_brick_slab", GenericSlabBlock::new);
        cyanBrickStair = XKRegistryHandler.Blocks.register("cyan_brick_stair", GenericStairBlock::new);
        cyanWall = XKRegistryHandler.Blocks.register("cyan_wall", GenericWallBlock::new);
        mudWallSlab = XKRegistryHandler.Blocks.register("mud_wall_slab", GenericSlabBlock::new);
        mudWallStair = XKRegistryHandler.Blocks.register("mud_wall_stair", GenericStairBlock::new);
        mudWallWall = XKRegistryHandler.Blocks.register("mud_wall_wall", GenericWallBlock::new);
        mudWallLineStair = XKRegistryHandler.Blocks.register("mud_wall_line_stair", GenericStairBlock::new);
        mudWallCrossStair = XKRegistryHandler.Blocks.register("mud_wall_cross_stair", GenericStairBlock::new);
        whitePorcelain = XKRegistryHandler.Blocks.register("white_porcelain", PorcelainBlock::new);
        whitePorcelainTall = XKRegistryHandler.Blocks.register("white_porcelain_tall", PorcelainBlock::new);
        whitePorcelainSmall = XKRegistryHandler.Blocks.register("white_porcelain_small", SmallPorcelainBlock::new);
        bluewhitePorcelain = XKRegistryHandler.Blocks.register("bluewhite_porcelain", PorcelainBlock::new);
        bluewhitePorcelainTall = XKRegistryHandler.Blocks.register("bluewhite_porcelain_tall", PorcelainBlock::new);
        bluewhitePorcelainSmall = XKRegistryHandler.Blocks.register("bluewhite_porcelain_small", SmallPorcelainBlock::new);
        celadonPorcelain = XKRegistryHandler.Blocks.register("celadon_porcelain", PorcelainBlock::new);
        celadonPorcelainTall = XKRegistryHandler.Blocks.register("celadon_porcelain_tall", PorcelainBlock::new);
        celadonPorcelainSmall = XKRegistryHandler.Blocks.register("celadon_porcelain_small", SmallPorcelainBlock::new);
        fishBowl = XKRegistryHandler.Blocks.register("fish_bowl", FishBowlBlock::new);
        darkFishBowl = XKRegistryHandler.Blocks.register("dark_fish_bowl", FishBowlBlock::new);
        bonsai = XKRegistryHandler.Blocks.register("bonsai", PenJingBlock::new);
        coralBonsai = XKRegistryHandler.Blocks.register("coral_bonsai", PenJingBlock::new);
        teaWare = XKRegistryHandler.Blocks.register("tea_ware", TeaWareBlock::new);
        goBoard = XKRegistryHandler.Blocks.register("go_board", GoBoardBlock::new);
        paperLantern = XKRegistryHandler.Blocks.register("paper_lantern", ChineseLanternBlock::new);
        redLantern = XKRegistryHandler.Blocks.register("red_lantern", ChineseLanternBlock::new);
        oilLamp = XKRegistryHandler.Blocks.register("oil_lamp", OilLampBlock::new);

    }
}
