package io.github.unix_supremacist.alabli;

import io.github.unix_supremacist.Alchemist;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class AlabliRegistry {
    public static void registerItem(Item item, String name){
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Alchemist.MODID, name), item);
        Alabli.items.add(item);
    }

    public static void registerBlock(Block block, String name){
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Alchemist.MODID, name), block);
    }
}
