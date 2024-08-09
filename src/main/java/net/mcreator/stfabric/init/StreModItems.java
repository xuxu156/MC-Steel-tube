/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stfabric.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

import net.mcreator.stfabric.item.StPLUSItem;
import net.mcreator.stfabric.item.StItem;
import net.mcreator.stfabric.StreMod;

public class StreModItems {
	public static Item ST_PLUS;
	public static Item ST;

	public static void load() {
		ST_PLUS = register("st_plus", new StPLUSItem());
		ST = register("st", new StItem());
	}

	public static void clientLoad() {
	}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(StreMod.MODID, registryName), item);
	}

	private static void registerBlockingProperty(Item item) {
		ItemProperties.register(item, new ResourceLocation("blocking"), (ClampedItemPropertyFunction) ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
	}
}
