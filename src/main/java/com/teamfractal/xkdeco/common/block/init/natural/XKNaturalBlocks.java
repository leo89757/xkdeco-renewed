package com.teamfractal.xkdeco.common.block.init.natural;

import com.teamfractal.xkdeco.common.block.base.natural.MultiSoundBlock;
import com.teamfractal.xkdeco.common.block.base.natural.MultiSoundSlabBlock;
import com.teamfractal.xkdeco.common.block.base.natural.MultiSoundStairBlock;
import com.teamfractal.xkdeco.common.block.base.natural.XKLeavesBlock;
import com.teamfractal.xkdeco.common.util.XKRegistryHandler;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fmllegacy.RegistryObject;

public class XKNaturalBlocks {
    public static RegistryObject<Block> dirtslab;
    public static RegistryObject<Block> dirtPathSlab;
    //public static RegistryObject<Block> grassBlockSlab;
    public static RegistryObject<Block> myceliumSlab;
    public static RegistryObject<Block> podzolSlab;
    public static RegistryObject<Block> netherrackSlab;
    public static RegistryObject<Block> crimsonNyliumSlab;
    public static RegistryObject<Block> warpedNyliumSlab;
    public static RegistryObject<Block> endStoneSlab;
    public static RegistryObject<Block> dirtCobblestone;
    public static RegistryObject<Block> grassCobblestone;
    public static RegistryObject<Block> sandyCobblestone;
    public static RegistryObject<Block> snowyCobblestone;
    public static RegistryObject<Block> cobblestonePath;
    public static RegistryObject<Block> dirtCobblestonePath;
    public static RegistryObject<Block> grassCobblestonePath;
    public static RegistryObject<Block> sandyCobblestonePath;
    public static RegistryObject<Block> snowyCobblestonePath;
    public static RegistryObject<Block> dirtCobblestoneSlab;
    public static RegistryObject<Block> grassCobblestoneSlab;
    public static RegistryObject<Block> sandyCobblestoneSlab;
    public static RegistryObject<Block> snowyCobblestoneSlab;
    public static RegistryObject<Block> cobblestonePathSlab;
    public static RegistryObject<Block> dirtCobblestonePathSlab;
    public static RegistryObject<Block> grassCobblestonePathSlab;
    public static RegistryObject<Block> sandyCobblestonePathSlab;
    public static RegistryObject<Block> snowyCobblestonePathSlab;
    public static RegistryObject<Block> dirtCobblestoneStair;
    public static RegistryObject<Block> grassCobblestoneStair;
    public static RegistryObject<Block> sandyCobblestoneStair;
    public static RegistryObject<Block> snowyCobblestoneStair;
    public static RegistryObject<Block> cobblestonePathStair;
    public static RegistryObject<Block> dirtCobblestonePathStair;
    public static RegistryObject<Block> grassCobblestonePathStair;
    public static RegistryObject<Block> sandyCobblestonePathStair;
    public static RegistryObject<Block> snowyCobblestonePathStair;
    public static RegistryObject<Block> ginkgoLeaves;
    public static RegistryObject<Block> orangeMapleLeaves;
    public static RegistryObject<Block> redMapleLeaves;
    public static RegistryObject<Block> peachBlossom;
    public static RegistryObject<Block> peachBlossomLeaves;
    public static RegistryObject<Block> cherryBlossom;
    public static RegistryObject<Block> cherryBlossomLeaves;
    public static RegistryObject<Block> whiteCherryBlossom;
    public static RegistryObject<Block> whiteCherryBlossomLeaves;
    public static RegistryObject<Block> grassableLeaves;
    public static RegistryObject<Block> willowLeaves;
    public static RegistryObject<Block> willowLeavesEnd;

    public static void register(){
        dirtslab = XKRegistryHandler.Blocks.register("dirtslab", () -> new MultiSoundSlabBlock(Material.DIRT, SoundType.GRAVEL));
        dirtPathSlab = XKRegistryHandler.Blocks.register("dirt_path_slab", () -> new MultiSoundSlabBlock(Material.DIRT, SoundType.GRAVEL));
        //grassBlockSlab = XKRegistryHandler.Blocks.register("grass_block_slab", () -> new MultiSoundSlabBlock(Material.DIRT, SoundType.GRAVEL));
        myceliumSlab = XKRegistryHandler.Blocks.register("mycelium_slab", () -> new MultiSoundSlabBlock(Material.DIRT, SoundType.GRAVEL));
        podzolSlab = XKRegistryHandler.Blocks.register("podzol_slab", () -> new MultiSoundSlabBlock(Material.DIRT, SoundType.GRAVEL));
        netherrackSlab = XKRegistryHandler.Blocks.register("netherrack_slab", () -> new MultiSoundSlabBlock(Material.DIRT, SoundType.NETHERRACK));
        crimsonNyliumSlab = XKRegistryHandler.Blocks.register("crimson_nylium_slab", () -> new MultiSoundSlabBlock(Material.DIRT, SoundType.NYLIUM));
        warpedNyliumSlab = XKRegistryHandler.Blocks.register("warped_nylium_slab", () -> new MultiSoundSlabBlock(Material.DIRT, SoundType.NYLIUM));
        endStoneSlab = XKRegistryHandler.Blocks.register("end_stone_slab", () -> new MultiSoundSlabBlock(Material.STONE, SoundType.STONE));
        dirtCobblestone = XKRegistryHandler.Blocks.register("dirt_cobblestone", () -> new MultiSoundBlock(Material.STONE, SoundType.STONE));
        grassCobblestone = XKRegistryHandler.Blocks.register("grass_cobblestone", () -> new MultiSoundBlock(Material.STONE, SoundType.STONE));
        sandyCobblestone = XKRegistryHandler.Blocks.register("sandy_cobblestone", () -> new MultiSoundBlock(Material.STONE, SoundType.STONE));
        snowyCobblestone = XKRegistryHandler.Blocks.register("snowy_cobblestone", () -> new MultiSoundBlock(Material.STONE, SoundType.STONE));
        cobblestonePath = XKRegistryHandler.Blocks.register("cobblestone_path", () -> new MultiSoundBlock(Material.STONE, SoundType.STONE));
        dirtCobblestonePath = XKRegistryHandler.Blocks.register("dirt_cobblestone_path", () -> new MultiSoundBlock(Material.STONE, SoundType.STONE));
        grassCobblestonePath = XKRegistryHandler.Blocks.register("grass_cobblestone_path", () -> new MultiSoundBlock(Material.STONE, SoundType.STONE));
        sandyCobblestonePath = XKRegistryHandler.Blocks.register("sandy_cobblestone_path", () -> new MultiSoundBlock(Material.STONE, SoundType.STONE));
        snowyCobblestonePath = XKRegistryHandler.Blocks.register("snowy_cobblestone_path", () -> new MultiSoundBlock(Material.STONE, SoundType.STONE));
        dirtCobblestoneSlab = XKRegistryHandler.Blocks.register("dirt_cobblestone_slab", () -> new MultiSoundSlabBlock(Material.STONE, SoundType.STONE));
        grassCobblestoneSlab = XKRegistryHandler.Blocks.register("grass_cobblestone_slab", () -> new MultiSoundSlabBlock(Material.STONE, SoundType.STONE));
        sandyCobblestoneSlab = XKRegistryHandler.Blocks.register("sandy_cobblestone_slab", () -> new MultiSoundSlabBlock(Material.STONE, SoundType.STONE));
        snowyCobblestoneSlab = XKRegistryHandler.Blocks.register("snowy_cobblestone_slab", () -> new MultiSoundSlabBlock(Material.STONE, SoundType.STONE));
        cobblestonePathSlab = XKRegistryHandler.Blocks.register("cobblestone_path_slab", () -> new MultiSoundSlabBlock(Material.STONE, SoundType.STONE));
        dirtCobblestonePathSlab = XKRegistryHandler.Blocks.register("dirt_cobblestone_path_slab", () -> new MultiSoundSlabBlock(Material.STONE, SoundType.STONE));
        grassCobblestonePathSlab = XKRegistryHandler.Blocks.register("grass_cobblestone_path_slab", () -> new MultiSoundSlabBlock(Material.STONE, SoundType.STONE));
        sandyCobblestonePathSlab = XKRegistryHandler.Blocks.register("sandy_cobblestone_path_slab", () -> new MultiSoundSlabBlock(Material.STONE, SoundType.STONE));
        snowyCobblestonePathSlab = XKRegistryHandler.Blocks.register("snowy_cobblestone_path_slab", () -> new MultiSoundSlabBlock(Material.STONE, SoundType.STONE));
        dirtCobblestoneStair = XKRegistryHandler.Blocks.register("dirt_cobblestone_stair", () -> new MultiSoundStairBlock(Material.STONE, SoundType.STONE));
        grassCobblestoneStair = XKRegistryHandler.Blocks.register("grass_cobblestone_stair", () -> new MultiSoundStairBlock(Material.STONE, SoundType.STONE));
        sandyCobblestoneStair = XKRegistryHandler.Blocks.register("sandy_cobblestone_stair", () -> new MultiSoundStairBlock(Material.STONE, SoundType.STONE));
        snowyCobblestoneStair = XKRegistryHandler.Blocks.register("snowy_cobblestone_stair", () -> new MultiSoundStairBlock(Material.STONE, SoundType.STONE));
        cobblestonePathStair = XKRegistryHandler.Blocks.register("cobblestone_path_stair", () -> new MultiSoundStairBlock(Material.STONE, SoundType.STONE));
        dirtCobblestonePathStair = XKRegistryHandler.Blocks.register("dirt_cobblestone_path_stair", () -> new MultiSoundStairBlock(Material.STONE, SoundType.STONE));
        grassCobblestonePathStair = XKRegistryHandler.Blocks.register("grass_cobblestone_path_stair", () -> new MultiSoundStairBlock(Material.STONE, SoundType.STONE));
        sandyCobblestonePathStair = XKRegistryHandler.Blocks.register("sandy_cobblestone_path_stair", () -> new MultiSoundStairBlock(Material.STONE, SoundType.STONE));
        snowyCobblestonePathStair = XKRegistryHandler.Blocks.register("snowy_cobblestone_path_stair", () -> new MultiSoundStairBlock(Material.STONE, SoundType.STONE));
        ginkgoLeaves = XKRegistryHandler.Blocks.register("ginkgo_leaves", XKLeavesBlock::new);
        orangeMapleLeaves = XKRegistryHandler.Blocks.register("orange_maple_leaves", XKLeavesBlock::new);
        redMapleLeaves = XKRegistryHandler.Blocks.register("red_maple_leaves", XKLeavesBlock::new);
        peachBlossom = XKRegistryHandler.Blocks.register("peach_blossom", XKLeavesBlock::new);
        peachBlossomLeaves = XKRegistryHandler.Blocks.register("peach_blossom_leaves", XKLeavesBlock::new);
        cherryBlossom = XKRegistryHandler.Blocks.register("cherry_blossom", XKLeavesBlock::new);
        cherryBlossomLeaves = XKRegistryHandler.Blocks.register("cherry_blossom_leaves", XKLeavesBlock::new);
        whiteCherryBlossom = XKRegistryHandler.Blocks.register("white_cherry_blossom", XKLeavesBlock::new);
        whiteCherryBlossomLeaves = XKRegistryHandler.Blocks.register("white_cherry_blossom_leaves", XKLeavesBlock::new);
        grassableLeaves = XKRegistryHandler.Blocks.register("grassable_leaves", XKLeavesBlock::new);
        willowLeaves = XKRegistryHandler.Blocks.register("willow_leaves", XKLeavesBlock::new);
        willowLeavesEnd = XKRegistryHandler.Blocks.register("willow_leaves_end", XKLeavesBlock::new);
    }
}
