
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stfabric.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.stfabric.entity.StdswEntity;
import net.mcreator.stfabric.entity.STPLEntity;
import net.mcreator.stfabric.StreMod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;

public class StreModEntities {
	public static EntityType<STPLEntity> STPL;
	public static EntityType<StdswEntity> STDSW;

	public static void load() {
		STPL = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(StreMod.MODID, "stpl"), createArrowEntityType(STPLEntity::new));
		STDSW = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(StreMod.MODID, "stdsw"), createArrowEntityType(StdswEntity::new));
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1).trackedUpdateRate(64).build();
	}
}
