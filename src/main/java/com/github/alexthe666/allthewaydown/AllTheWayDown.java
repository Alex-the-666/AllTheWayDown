package com.github.alexthe666.allthewaydown;

import com.github.alexthe666.allthewaydown.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = AllTheWayDown.MODID, version = AllTheWayDown.VERSION)
public class AllTheWayDown
{
    public static final String MODID = "allthewaydown";
    public static final String VERSION = "DEV";
    @SidedProxy(clientSide = "com.github.alexthe666.allthewaydown.proxy.ClientProxy", serverSide = "com.github.alexthe666.allthewaydown.proxy.CommonProxy")
    public static CommonProxy PROXY;

    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        PROXY.preinit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        PROXY.init();
    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        PROXY.postinit();
    }
}
