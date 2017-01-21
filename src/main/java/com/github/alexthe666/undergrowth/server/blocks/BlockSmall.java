package com.github.alexthe666.undergrowth.server.blocks;

import com.github.alexthe666.undergrowth.Undergrowth;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockSmall extends Block {
    public BlockSmall(String name, float hardness, float resistance, String tool, int toollevel, SoundType sound, Material materialIn) {
        super(materialIn);
        GameRegistry.registerBlock(this, name);
        this.setCreativeTab(Undergrowth.tab);
        this.setUnlocalizedName("undergrowth." + name);
        this.setSoundType(sound);
        this.setHardness(hardness);
        this.setHarvestLevel(tool, toollevel);
        this.setResistance(resistance);
        Undergrowth.PROXY.renderItem(Item.getItemFromBlock(this), 0, name);
    }
}
