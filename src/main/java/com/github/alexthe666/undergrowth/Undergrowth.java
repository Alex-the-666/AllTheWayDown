package com.github.alexthe666.undergrowth;

import com.github.alexthe666.undergrowth.proxy.CommonProxy;
import com.github.alexthe666.undergrowth.server.blocks.UndergrowthBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Undergrowth.MODID, version = Undergrowth.VERSION)
public class Undergrowth
{
    public static final String MODID = "undergrowth";
    public static final String VERSION = "DEV";
    @SidedProxy(clientSide = "com.github.alexthe666.undergrowth.proxy.ClientProxy", serverSide = "com.github.alexthe666.undergrowth.proxy.CommonProxy")
    public static CommonProxy PROXY;
    public static CreativeTabs tab;
    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        PROXY.preinit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        tab = new CreativeTabs(MODID) {
            @Override
            public Item getTabIconItem() {
                return Items.WHEAT_SEEDS;
            }
        };
        UndergrowthBlocks.init();
        PROXY.init();
    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        PROXY.postinit();
    }
}
