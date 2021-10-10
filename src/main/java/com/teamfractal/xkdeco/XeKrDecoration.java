package com.teamfractal.xkdeco;

import com.teamfractal.xkdeco.client.render.XKColorHandler;
import com.teamfractal.xkdeco.common.util.XKRegistryHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod;

@Mod(XeKrDecoration.MODID)
public class XeKrDecoration
{
    public static final String MODID = "xkdeco";
    public static final String MODNAME = "XKDeco";

    public XeKrDecoration()
    {
        XKRegistryHandler.register();
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, XKColorHandler::registerBlockColors);
        MinecraftForge.EVENT_BUS.register(this);

    }
}
