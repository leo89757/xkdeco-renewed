package com.teamfractal.xkdeco.client.render;

import com.teamfractal.xkdeco.common.block.init.natural.XKNaturalBlocks;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.GrassColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class XKColorHandler {
    @SubscribeEvent
    public static void registerBlockColors(ColorHandlerEvent.Block event){
        event.getBlockColors().register((state, batg, pos, p_92570_) ->
                batg != null && pos != null ? BiomeColors.getAverageGrassColor(batg,pos) :
                        GrassColor.get(0.5D, 1.0D), XKNaturalBlocks.grassBlockSlab.get());
        event.getBlockColors().register((state, batg, pos, p_92570_) ->
                batg != null && pos != null ? BiomeColors.getAverageFoliageColor(batg,pos) :
                        FoliageColor.get(0.5D, 1.0D), XKNaturalBlocks.willowLeaves.get());
        event.getBlockColors().register((state, batg, pos, p_92570_) ->
                batg != null && pos != null ? BiomeColors.getAverageFoliageColor(batg,pos) :
                        FoliageColor.get(0.5D, 1.0D), XKNaturalBlocks.willowLeavesEnd.get());
        event.getBlockColors().register((state, batg, pos, p_92570_) ->
                batg != null && pos != null ? BiomeColors.getAverageFoliageColor(batg,pos) :
                        FoliageColor.get(0.5D, 1.0D), XKNaturalBlocks.grassableLeaves.get());
    }
    @SubscribeEvent
    public static void registerItemColors(ColorHandlerEvent.Item event){
        event.getItemColors().register((stack, index) -> {
            return GrassColor.get(0.5D, 1.0D);
        }, XKNaturalBlocks.grassBlockSlab.get());
        event.getItemColors().register((stack, index) -> {
            return FoliageColor.get(0.5D, 1.0D);
        }, XKNaturalBlocks.willowLeaves.get());
        event.getItemColors().register((stack, index) -> {
            return FoliageColor.get(0.5D, 1.0D);
        }, XKNaturalBlocks.willowLeavesEnd.get());
        event.getItemColors().register((stack, index) -> {
            return FoliageColor.get(0.5D, 1.0D);
        }, XKNaturalBlocks.grassableLeaves.get());
    }
}
