package io.github.unix_supremacist.alabli;

import io.github.unix_supremacist.Alchemist;
import io.github.unix_supremacist.content.AlchemistItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Alabli implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger(Alchemist.MODID);
	public static ArrayList<Item> items = new ArrayList<>();
	public static BlockBehaviour.Properties properties = FabricBlockSettings.create();
	public static final CreativeModeTab tab = FabricItemGroup.builder()
			.icon(() -> new ItemStack(AlchemistItems.philosophers_stone.getItem()))
			.title(Component.translatable("itemGroup."+Alchemist.MODID))
			.build();

	@Override
	public void onInitialize() {
		Alabli.LOGGER.info("Welcome to the World of Alchemy!");
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(Alchemist.MODID, "tab"), tab);
	}

	public static void initializeCreativeTab(){
		for (Item item : items){
			ItemGroupEvents.modifyEntriesEvent(ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), new ResourceLocation(Alchemist.MODID, "tab"))).register(content -> {
				content.accept(item);
			});
		}
	}
}