
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stfabric.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class StreModSounds {
	public static SoundEvent STOGG = SoundEvent.createVariableRangeEvent(new ResourceLocation("stre", "stogg"));

	public static void load() {
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("stre", "stogg"), STOGG);
	}
}
