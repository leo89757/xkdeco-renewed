package com.teamfractal.xkdeco.client.render;

import com.teamfractal.xkdeco.common.block.init.eastern.XKOtherEasternBlocks;
import com.teamfractal.xkdeco.common.block.init.eastern.XKRoofRelevantBlocks;
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
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.blackEaveBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.blackEaveSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.blackRoofBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.blackRoofFlatBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.blackRoofGentleBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.blackRoofGentleSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.blackRoofRidgeBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.blackRoofSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.blackRoofSteepBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.blackRoofSteepSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.blackTilesBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.blackTileSlabBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.blackTileStairBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.smallBlackEaveBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.smallBlackEaveSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.smallBlackRoofGentleSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.smallBlackRoofSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.smallBlackRoofSteepSideBlock.get(), RenderType.cutout());

            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.cyanEaveBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.cyanEaveSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.cyanRoofBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.cyanRoofFlatBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.cyanRoofGentleBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.cyanRoofGentleSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.cyanRoofRidgeBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.cyanRoofSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.cyanRoofSteepBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.cyanRoofSteepSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.cyanTilesBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.cyanTileSlabBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.cyanTileStairBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.smallCyanEaveBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.smallCyanEaveSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.smallCyanRoofGentleSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.smallCyanRoofSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.smallCyanRoofSteepSideBlock.get(), RenderType.cutout());


            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.yellowEaveBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.yellowEaveSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.yellowRoofBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.yellowRoofFlatBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.yellowRoofGentleBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.yellowRoofGentleSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.yellowRoofRidgeBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.yellowRoofSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.yellowRoofSteepBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.yellowRoofSteepSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.yellowTilesBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.yellowTileSlabBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.yellowTileStairBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.smallYellowEaveBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.smallYellowEaveSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.smallYellowRoofGentleSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.smallYellowRoofSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.smallYellowRoofSteepSideBlock.get(), RenderType.cutout());

            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.greenEaveBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.greenEaveSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.greenRoofBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.greenRoofGentleBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.greenRoofGentleSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.greenRoofRidgeBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.greenRoofSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.greenRoofSteepBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.greenRoofSteepSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.greenTilesBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.greenTileSlabBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.greenTileStairBlock.get(), RenderType.cutout());

            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.redEaveBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.redEaveSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.redRoofBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.redRoofGentleBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.redRoofGentleSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.redRoofRidgeBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.redRoofSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.redRoofSteepBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.redRoofSteepSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.redTilesBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.redTileSlabBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.redTileStairBlock.get(), RenderType.cutout());

            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.blueEaveBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.blueEaveSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.blueRoofBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.blueRoofGentleBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.blueRoofGentleSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.blueRoofRidgeBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.blueRoofSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.blueRoofSteepBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.blueRoofSteepSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.blueTilesBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.blueTileSlabBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKRoofRelevantBlocks.blueTileStairBlock.get(), RenderType.cutout());

            ItemBlockRenderTypes.setRenderLayer(XKOtherEasternBlocks.fishBowl.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKOtherEasternBlocks.darkFishBowl.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKOtherEasternBlocks.bonsai.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKOtherEasternBlocks.coralBonsai.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKOtherEasternBlocks.teaWare.get(), RenderType.cutout());

        });
    }
}
