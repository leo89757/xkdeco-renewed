package com.teamfractal.xkdeco.common.util;

import com.teamfractal.xkdeco.XeKrDecoration;
import com.teamfractal.xkdeco.common.block.init.basic.XKBasicBlocks;
import com.teamfractal.xkdeco.common.block.init.eastern.XKEasternRoofRelevantBlocks;
import com.teamfractal.xkdeco.common.block.init.eastern.XKOtherEasternBlocks;
import com.teamfractal.xkdeco.common.block.init.eastern.XKWoodSuiteBlocks;
import com.teamfractal.xkdeco.common.block.init.natural.XKNaturalBlocks;
import com.teamfractal.xkdeco.common.block.init.otherancientcivilizations.XKOtherAncientCivilizationsBlocks;
import com.teamfractal.xkdeco.common.block.init.western.XKGenericWesternBlocks;
import com.teamfractal.xkdeco.common.block.init.western.XKWesternRoofRelevantBlocks;
import com.teamfractal.xkdeco.common.item.init.basic.XKBasicBlockItems;
import com.teamfractal.xkdeco.common.item.init.eastern.XKEasternRoofRelevantBlockItems;
import com.teamfractal.xkdeco.common.item.init.eastern.XKOtherEasternBlockItems;
import com.teamfractal.xkdeco.common.item.init.eastern.XKWoodSuiteBlockItems;
import com.teamfractal.xkdeco.common.item.init.natural.XKNaturalBlockItems;
import com.teamfractal.xkdeco.common.item.init.otherancientcivilizations.XKOtherAncientCivilizationsBlockItems;
import com.teamfractal.xkdeco.common.item.init.western.XKGenericWesternBlockItems;
import com.teamfractal.xkdeco.common.item.init.western.XKWesternRoofRelevantBlockItems;
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

        XKEasternRoofRelevantBlocks.register();
        XKWoodSuiteBlocks.register();
        XKOtherEasternBlocks.register();
        XKBasicBlocks.register();
        XKGenericWesternBlocks.register();
        XKWesternRoofRelevantBlocks.register();
        XKNaturalBlocks.register();
        XKOtherAncientCivilizationsBlocks.register();

        XKEasternRoofRelevantBlockItems.register();
        XKWoodSuiteBlockItems.register();
        XKOtherEasternBlockItems.register();
        XKBasicBlockItems.register();
        XKGenericWesternBlockItems.register();
        XKWesternRoofRelevantBlockItems.register();
        XKNaturalBlockItems.register();
        XKOtherAncientCivilizationsBlockItems.register();

        Items.register(eventBus);
        Blocks.register(eventBus);
    }
}
