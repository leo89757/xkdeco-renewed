package com.teamfractal.xkdeco.client.render;

import com.teamfractal.xkdeco.common.block.init.XKBlocks;
import com.teamfractal.xkdeco.common.item.init.XKItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RenderTypeRegistry {
    @SubscribeEvent
    public static void onRenderTypeSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.blackEaveBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.blackEaveSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.blackRoofBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.blackRoofFlatBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.blackRoofGentleBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.blackRoofGentleSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.blackRoofRidgeBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.blackRoofSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.blackRoofSteepBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.blackRoofSteepSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.blackTilesBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.blackTileSlabBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.blackTileStairBlock.get(), RenderType.cutout());

            ItemBlockRenderTypes.setRenderLayer(XKBlocks.cyanEaveBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.cyanEaveSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.cyanRoofBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.cyanRoofFlatBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.cyanRoofGentleBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.cyanRoofGentleSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.cyanRoofRidgeBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.cyanRoofSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.cyanRoofSteepBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.cyanRoofSteepSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.cyanTilesBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.cyanTileSlabBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.cyanTileStairBlock.get(), RenderType.cutout());

            ItemBlockRenderTypes.setRenderLayer(XKBlocks.yellowEaveBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.yellowEaveSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.yellowRoofBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.yellowRoofFlatBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.yellowRoofGentleBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.yellowRoofGentleSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.yellowRoofRidgeBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.yellowRoofSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.yellowRoofSteepBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.yellowRoofSteepSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.yellowTilesBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.yellowTileSlabBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.yellowTileStairBlock.get(), RenderType.cutout());

            ItemBlockRenderTypes.setRenderLayer(XKBlocks.greenEaveBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.greenEaveSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.greenRoofBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.greenRoofGentleBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.greenRoofGentleSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.greenRoofRidgeBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.greenRoofSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.greenRoofSteepBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.greenRoofSteepSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.greenTilesBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.greenTileSlabBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.greenTileStairBlock.get(), RenderType.cutout());

            ItemBlockRenderTypes.setRenderLayer(XKBlocks.redEaveBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.redEaveSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.redRoofBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.redRoofGentleBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.redRoofGentleSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.redRoofRidgeBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.redRoofSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.redRoofSteepBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.redRoofSteepSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.redTilesBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.redTileSlabBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.redTileStairBlock.get(), RenderType.cutout());

            ItemBlockRenderTypes.setRenderLayer(XKBlocks.blueEaveBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.blueEaveSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.blueRoofBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.blueRoofGentleBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.blueRoofGentleSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.blueRoofRidgeBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.blueRoofSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.blueRoofSteepBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.blueRoofSteepSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.blueTilesBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.blueTileSlabBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBlocks.blueTileStairBlock.get(), RenderType.cutout());
        });
    }
}
