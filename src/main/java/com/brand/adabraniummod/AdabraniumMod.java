package com.brand.adabraniummod;

import com.brand.adabraniummod.content.ModBlocks;
import com.brand.adabraniummod.items.*;
import com.brand.adabraniummod.items.potions.PotionsRecipes;
import com.brand.adabraniummod.stuff.armors.*;
import com.brand.adabraniummod.stuff.tools.*;

import me.shedaniel.cloth.api.dynamic.registry.v1.EarlyInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("deprecation")
public class AdabraniumMod implements ModInitializer, EarlyInitializer {
	
	public static final String MOD_ID = "adabraniummod";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final ItemGroup ADABRANIUM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "adabranium_group"), () -> new ItemStack(ModItems.VIBRANIUM_INGOT));
	
	@Override
	public void onInitialize() {
		
		new ModBlocks();		
		new ModItems();
		new ModPotions();
		new AdabraniumPickaxes();
		new AdabraniumAxes();
		new AdabraniumHoes();
		new AdabraniumShovels();
		new AdabraniumSwords();
	  	RegisterArmors.register();
		PotionsRecipes.registerRecipes();
		
	}
	
	@Override
	public void onEarlyInitialization() {
	}

	public static Identifier id(String name) {
		return new Identifier(MOD_ID, name);
	}
}
