package com.teamfractal.xkdeco.client.render;

import com.teamfractal.xkdeco.common.block.init.basic.XKBasicBlocks;
import com.teamfractal.xkdeco.common.block.init.eastern.XKEasternRoofRelevantBlocks;
import com.teamfractal.xkdeco.common.block.init.eastern.XKOtherEasternBlocks;
import com.teamfractal.xkdeco.common.block.init.western.XKWesternRoofRelevantBlocks;
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
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.blackEaveBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.blackEaveSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.blackRoofBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.blackRoofFlatBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.blackRoofGentleBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.blackRoofGentleSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.blackRoofRidgeBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.blackRoofSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.blackRoofSteepBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.blackRoofSteepSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.blackTilesBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.blackTileSlabBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.blackTileStairBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.smallBlackEaveBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.smallBlackEaveSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.smallBlackRoofGentleSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.smallBlackRoofSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.smallBlackRoofSteepSideBlock.get(), RenderType.cutout());

            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.cyanEaveBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.cyanEaveSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.cyanRoofBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.cyanRoofFlatBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.cyanRoofGentleBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.cyanRoofGentleSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.cyanRoofRidgeBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.cyanRoofSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.cyanRoofSteepBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.cyanRoofSteepSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.cyanTilesBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.cyanTileSlabBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.cyanTileStairBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.smallCyanEaveBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.smallCyanEaveSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.smallCyanRoofGentleSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.smallCyanRoofSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.smallCyanRoofSteepSideBlock.get(), RenderType.cutout());


            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.yellowEaveBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.yellowEaveSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.yellowRoofBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.yellowRoofFlatBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.yellowRoofGentleBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.yellowRoofGentleSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.yellowRoofRidgeBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.yellowRoofSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.yellowRoofSteepBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.yellowRoofSteepSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.yellowTilesBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.yellowTileSlabBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.yellowTileStairBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.smallYellowEaveBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.smallYellowEaveSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.smallYellowRoofGentleSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.smallYellowRoofSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKEasternRoofRelevantBlocks.smallYellowRoofSteepSideBlock.get(), RenderType.cutout());

            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.greenEaveBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.greenEaveSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.greenRoofBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.greenRoofGentleBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.greenRoofGentleSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.greenRoofRidgeBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.greenRoofSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.greenRoofSteepBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.greenRoofSteepSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.greenTilesBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.greenTileSlabBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.greenTileStairBlock.get(), RenderType.cutout());

            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.redEaveBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.redEaveSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.redRoofBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.redRoofGentleBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.redRoofGentleSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.redRoofRidgeBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.redRoofSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.redRoofSteepBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.redRoofSteepSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.redTilesBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.redTileSlabBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.redTileStairBlock.get(), RenderType.cutout());

            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.blueEaveBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.blueEaveSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.blueRoofBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.blueRoofGentleBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.blueRoofGentleSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.blueRoofRidgeBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.blueRoofSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.blueRoofSteepBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.blueRoofSteepSideBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.blueTilesBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.blueTileSlabBlock.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKWesternRoofRelevantBlocks.blueTileStairBlock.get(), RenderType.cutout());

            ItemBlockRenderTypes.setRenderLayer(XKOtherEasternBlocks.fishBowl.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKOtherEasternBlocks.darkFishBowl.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKOtherEasternBlocks.bonsai.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKOtherEasternBlocks.coralBonsai.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKOtherEasternBlocks.teaWare.get(), RenderType.cutout());

            ItemBlockRenderTypes.setRenderLayer(XKBasicBlocks.smallBookStack.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBasicBlocks.bigBookStack.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBasicBlocks.emptyFishTank.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBasicBlocks.fishTank.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBasicBlocks.glassTiles.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBasicBlocks.glassTileSlab.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBasicBlocks.glassTileStair.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBasicBlocks.glassDoor.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBasicBlocks.glassTrapdoor.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBasicBlocks.emptyBottleStack.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBasicBlocks.bottleStack.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBasicBlocks.woodGlobe.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBasicBlocks.globe.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBasicBlocks.solarSystemModel.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBasicBlocks.solarSystemModelBig.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBasicBlocks.telescope.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBasicBlocks.itemFrameCover.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBasicBlocks.glowItemFrameCover.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(XKBasicBlocks.smallSignGround.get(), RenderType.cutout());

        });
    }
}
