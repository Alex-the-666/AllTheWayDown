package com.github.alexthe666.undergrowth.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ClientProxy extends CommonProxy {

        public void preinit(){

        }

        public void init(){

        }

        public void postinit(){

        }

        public void renderItem(Item item, int meta, String name){
                RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
                renderItem.getItemModelMesher().register(item, 0, new ModelResourceLocation("undergrowth:" + name, "inventory"));
        }
}
