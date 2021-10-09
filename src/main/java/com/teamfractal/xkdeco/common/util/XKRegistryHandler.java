package com.teamfractal.xkdeco.common.util;

import com.teamfractal.xkdeco.XeKrDecoration;
import com.teamfractal.xkdeco.common.block.init.basic.XKBasicBlocks;
import com.teamfractal.xkdeco.common.block.init.eastern.XKOtherEasternBlocks;
import com.teamfractal.xkdeco.common.block.init.eastern.XKRoofRelevantBlocks;
import com.teamfractal.xkdeco.common.block.init.eastern.XKWoodSuiteBlocks;
import com.teamfractal.xkdeco.common.item.init.basic.XKBasicBlockItems;
import com.teamfractal.xkdeco.common.item.init.eastern.XKOtherEasternBlockItems;
import com.teamfractal.xkdeco.common.item.init.eastern.XKRoofRelevantBlockItems;
import com.teamfractal.xkdeco.common.item.init.eastern.XKWoodSuiteBlockItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class XKRegistryHandler {
    public static final DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS, XeKrDecoration.MODID);
    public static final DeferredRegister<Block> Blocks = DeferredRegister.create(ForgeRegistries.BLOCKS, XeKrDecoration.MODID);

    public static void register()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        XKRoofRelevantBlocks.register();
        XKWoodSuiteBlocks.register();
        XKOtherEasternBlocks.register();
        XKBasicBlocks.register();

        XKRoofRelevantBlockItems.register();
        XKWoodSuiteBlockItems.register();
        XKOtherEasternBlockItems.register();
        XKBasicBlockItems.register();

        Items.register(eventBus);
        Blocks.register(eventBus);
    }
}
