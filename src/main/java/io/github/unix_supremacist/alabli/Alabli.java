package io.github.unix_supremacist.alabli;

import io.github.unix_supremacist.Alchemist;
import io.github.unix_supremacist.content.AlchemistItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Alabli implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger(Alchemist.MODID);
	public static ArrayList<Item> items = new ArrayList<>();
	public static BlockBehaviour.Properties properties = FabricBlockSettings.of(Material.AIR);
	public static final CreativeModeTab tab = FabricItemGroupBuilder.create(new ResourceLocation(Alchemist.MODID, "tab"))
			.icon(() -> new ItemStack(AlchemistItems.philosophers_stone.getItem()))
			.build();

	@Override
	public void onInitialize() {
		Alabli.LOGGER.info("Welcome to the World of Alchemy!");
	}

	public static void initializeCreativeTab(){
	}
}