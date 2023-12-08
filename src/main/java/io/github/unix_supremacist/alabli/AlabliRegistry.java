package io.github.unix_supremacist.alabli;

import io.github.unix_supremacist.Alchemist;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.ArrayList;

public class AlabliRegistry {
    public static void registerItem(Item item, String name){
        Registry.register(Registry.ITEM, new ResourceLocation(Alchemist.MODID, name), item);
    }

    public static void registerBlock(Block block, String name){
        Registry.register(Registry.BLOCK, new ResourceLocation(Alchemist.MODID, name), block);
    }

    public static void registerBlockTag(TagKey<Block> tag, ArrayList<Block> arrayList){
        BuiltInRegistries.BLOCK.getTagOrEmpty(tag).iterator().forEachRemaining(t ->arrayList.add(t.value()));
    }

    public static TagKey<Block> createBlockTag(String name){
        return TagKey.create(BuiltInRegistries.BLOCK.key(), new ResourceLocation(Alchemist.MODID, name));
    }
}
