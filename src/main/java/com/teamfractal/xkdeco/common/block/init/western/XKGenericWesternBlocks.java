package com.teamfractal.xkdeco.common.block.init.western;

import com.teamfractal.xkdeco.common.block.base.*;
import com.teamfractal.xkdeco.common.block.base.western.ObeliskHeadBlock;
import com.teamfractal.xkdeco.common.block.base.western.colrelevant.ColumnBaseBlock;
import com.teamfractal.xkdeco.common.block.base.western.colrelevant.ColumnBlock;
import com.teamfractal.xkdeco.common.block.base.western.colrelevant.ColumnHeadBlock;
import com.teamfractal.xkdeco.common.block.base.western.colrelevant.DirectionalColumnHeadBlock;
import com.teamfractal.xkdeco.common.util.XKRegistryHandler;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;

public class XKGenericWesternBlocks {
    public static RegistryObject<Block> sandstonePillar;
    public static RegistryObject<Block> polishedSandstone;
    public static RegistryObject<Block> polishedSandstoneSlab;
    public static RegistryObject<Block> sandstoneBricks;
    public static RegistryObject<Block> sandstoneBrickSlab;
    public static RegistryObject<Block> sandstoneBrickStair;
    public static RegistryObject<Block> sandstoneSmallBricks;
    public static RegistryObject<Block> sandstoneSmallBrickSlab;
    public static RegistryObject<Block> sandstoneSmallBrickStair;
    public static RegistryObject<Block> egyptianColumnBase;
    public static RegistryObject<Block> egyptianColumn;
    public static RegistryObject<Block> egyptianColumnHead;
    public static RegistryObject<Block> egyptianBrickColumnBase;
    public static RegistryObject<Block> egyptianBrickColumn;
    public static RegistryObject<Block> egyptianBrickColumnHead;
    public static RegistryObject<Block> egyptianBumpColumnBase;
    public static RegistryObject<Block> egyptianBumpColumn;
    public static RegistryObject<Block> egyptianBumpColumnHead;
    public static RegistryObject<Block> egyptianStripeColumnBase;
    public static RegistryObject<Block> egyptianStripeColumn;
    public static RegistryObject<Block> egyptianStripeColumnHead;
    public static RegistryObject<Block> egyptianCarvedColumnBase;
    public static RegistryObject<Block> egyptianCarvedColumn;
    public static RegistryObject<Block> egyptianSmoothColumnBase;
    public static RegistryObject<Block> egyptianSmoothColumn;
    public static RegistryObject<Block> obeliskHead;
    public static RegistryObject<Block> egyptianMoulding;
    public static RegistryObject<Block> quartzWall;
    public static RegistryObject<Block> greekColumn;
    public static RegistryObject<Block> greekDoricColumnHead;
    public static RegistryObject<Block> greekIonicColumnBase;
    public static RegistryObject<Block> greekIonicColumnHead;
    public static RegistryObject<Block> greekIonicColumnHeadCorner;
    public static RegistryObject<Block> greekCorinthianColumnBase;
    public static RegistryObject<Block> greekCorinthianColumnHead;
    public static RegistryObject<Block> greekMoulding;
    public static RegistryObject<Block> stoneBrickPillar;
    public static RegistryObject<Block> stoneBrickPavement;
    public static RegistryObject<Block> romanColumnBase;
    public static RegistryObject<Block> romanToscanColumnBase;
    public static RegistryObject<Block> romanToscanColumn;
    public static RegistryObject<Block> romanToscanColumnHead;
    public static RegistryObject<Block> romanDoricColumnBase;
    public static RegistryObject<Block> romanDoricColumn;
    public static RegistryObject<Block> romanDoricColumnHead;
    public static RegistryObject<Block> romanIonicColumnBase;
    public static RegistryObject<Block> romanColumn;
    public static RegistryObject<Block> romanIonicColumnHead;
    public static RegistryObject<Block> romanIonicColumnHeadCorner;
    public static RegistryObject<Block> romanCorinthianColumnBase;
    public static RegistryObject<Block> romanCorinthianColumnHead;
    public static RegistryObject<Block> romanCompositeColumnBase;
    public static RegistryObject<Block> romanCompositeColumnHead;
    public static RegistryObject<Block> romanMoulding;

    public static void register(){
        sandstonePillar = XKRegistryHandler.Blocks.register("sandstone_pillar", GenericHexDirectionalBlock::new);
        polishedSandstone = XKRegistryHandler.Blocks.register("polished_sandstone", GenericStoneBlock::new);
        polishedSandstoneSlab = XKRegistryHandler.Blocks.register("polished_sandstone_slab", GenericSlabBlock::new);
        sandstoneBricks = XKRegistryHandler.Blocks.register("sandstone_bricks", GenericStoneBlock::new);
        sandstoneBrickSlab = XKRegistryHandler.Blocks.register("sandstone_brick_slab", GenericSlabBlock::new);
        sandstoneBrickStair = XKRegistryHandler.Blocks.register("sandstone_brick_stair", GenericStairBlock::new);
        sandstoneSmallBricks = XKRegistryHandler.Blocks.register("sandstone_small_bricks", GenericStoneBlock::new);
        sandstoneSmallBrickSlab = XKRegistryHandler.Blocks.register("sandstone_small_brick_slab", GenericSlabBlock::new);
        sandstoneSmallBrickStair = XKRegistryHandler.Blocks.register("sandstone_small_brick_stair", GenericStairBlock::new);
        egyptianColumnBase = XKRegistryHandler.Blocks.register("egyptian_column_base", ColumnBaseBlock::new);
        egyptianColumn = XKRegistryHandler.Blocks.register("egyptian_column", ColumnBlock::new);
        egyptianColumnHead = XKRegistryHandler.Blocks.register("egyptian_column_head", ColumnBaseBlock::new);
        egyptianBrickColumnBase = XKRegistryHandler.Blocks.register("egyptian_brick_column_base", ColumnBaseBlock::new);
        egyptianBrickColumn = XKRegistryHandler.Blocks.register("egyptian_brick_column", ColumnBlock::new);
        egyptianBrickColumnHead = XKRegistryHandler.Blocks.register("egyptian_brick_column_head", ColumnHeadBlock::new);
        egyptianBumpColumnBase = XKRegistryHandler.Blocks.register("egyptian_bump_column_base", ColumnBaseBlock::new);
        egyptianBumpColumn = XKRegistryHandler.Blocks.register("egyptian_bump_column", ColumnBlock::new);
        egyptianBumpColumnHead = XKRegistryHandler.Blocks.register("egyptian_bump_column_head", ColumnHeadBlock::new);
        egyptianStripeColumnBase = XKRegistryHandler.Blocks.register("egyptian_stripe_column_base", ColumnBaseBlock::new);
        egyptianStripeColumn = XKRegistryHandler.Blocks.register("egyptian_stripe_column", ColumnBlock::new);
        egyptianStripeColumnHead = XKRegistryHandler.Blocks.register("egyptian_stripe_column_head", ColumnHeadBlock::new);
        egyptianCarvedColumnBase = XKRegistryHandler.Blocks.register("egyptian_carved_column_base", ColumnBaseBlock::new);
        egyptianCarvedColumn = XKRegistryHandler.Blocks.register("egyptian_carved_column", ColumnBlock::new);
        egyptianSmoothColumnBase = XKRegistryHandler.Blocks.register("egyptian_smooth_column_base", ColumnBaseBlock::new);
        egyptianSmoothColumn = XKRegistryHandler.Blocks.register("egyptian_smooth_column", ColumnBlock::new);
        obeliskHead = XKRegistryHandler.Blocks.register("obelisk_head", ObeliskHeadBlock::new);
        egyptianMoulding = XKRegistryHandler.Blocks.register("egyptian_moulding", GenericStairBlock::new);
        quartzWall = XKRegistryHandler.Blocks.register("quartz_wall", GenericWallBlock::new);
        greekColumn = XKRegistryHandler.Blocks.register("greek_column", ColumnBlock::new);
        greekDoricColumnHead = XKRegistryHandler.Blocks.register("greek_doric_column_head", ColumnHeadBlock::new);
        greekIonicColumnBase = XKRegistryHandler.Blocks.register("greek_ionic_column_base", ColumnBaseBlock::new);
        greekIonicColumnHead = XKRegistryHandler.Blocks.register("greek_ionic_column_head", DirectionalColumnHeadBlock::new);
        greekIonicColumnHeadCorner = XKRegistryHandler.Blocks.register("greek_ionic_column_head_corner", DirectionalColumnHeadBlock::new);
        greekCorinthianColumnBase = XKRegistryHandler.Blocks.register("greek_corinthian_column_base", ColumnBaseBlock::new);
        greekCorinthianColumnHead = XKRegistryHandler.Blocks.register("greek_corinthian_column_head", ColumnHeadBlock::new);
        greekMoulding = XKRegistryHandler.Blocks.register("greek_moulding", GenericStairBlock::new);
        stoneBrickPillar = XKRegistryHandler.Blocks.register("stone_brick_pillar", GenericHexDirectionalBlock::new);
        stoneBrickPavement = XKRegistryHandler.Blocks.register("stone_brick_pavement", GenericStoneBlock::new);
        romanColumnBase = XKRegistryHandler.Blocks.register("roman_column_base",ColumnBaseBlock::new);
        romanToscanColumnBase = XKRegistryHandler.Blocks.register("roman_toscan_column_base",ColumnBaseBlock::new);
        romanToscanColumn = XKRegistryHandler.Blocks.register("roman_toscan_column",ColumnBlock::new);
        romanToscanColumnHead = XKRegistryHandler.Blocks.register("roman_toscan_column_head",ColumnHeadBlock::new);
        romanDoricColumnBase = XKRegistryHandler.Blocks.register("roman_doric_column_base",ColumnBaseBlock::new);
        romanDoricColumn = XKRegistryHandler.Blocks.register("roman_doric_column",ColumnBlock::new);
        romanDoricColumnHead = XKRegistryHandler.Blocks.register("roman_doric_column_head",ColumnHeadBlock::new);
        romanIonicColumnBase = XKRegistryHandler.Blocks.register("roman_ionic_column_base",ColumnBaseBlock::new);
        romanColumn = XKRegistryHandler.Blocks.register("roman_column",ColumnBlock::new);
        romanIonicColumnHead = XKRegistryHandler.Blocks.register("roman_ionic_column_head",DirectionalColumnHeadBlock::new);
        romanIonicColumnHeadCorner = XKRegistryHandler.Blocks.register("roman_ionic_column_head_corner",DirectionalColumnHeadBlock::new);
        romanCorinthianColumnBase = XKRegistryHandler.Blocks.register("roman_corinthian_column_base",ColumnBaseBlock::new);
        romanCorinthianColumnHead = XKRegistryHandler.Blocks.register("roman_corinthian_column_head",ColumnHeadBlock::new);
        romanCompositeColumnBase = XKRegistryHandler.Blocks.register("roman_composite_column_base",ColumnBaseBlock::new);
        romanCompositeColumnHead = XKRegistryHandler.Blocks.register("roman_composite_column_head",ColumnHeadBlock::new);
        romanMoulding = XKRegistryHandler.Blocks.register("roman_moulding", GenericStairBlock::new);
    }
}