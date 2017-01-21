package com.github.alexthe666.undergrowth.server.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class UndergrowthBlocks {
    public static Block small_dirt;

    public static void init(){
        small_dirt = new BlockSmall("small_dirt", 0.5F, 0F, "shovel", 0, SoundType.GROUND, Material.GROUND);
    }
}
