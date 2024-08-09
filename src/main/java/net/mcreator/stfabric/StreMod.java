/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mcreator.stfabric;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mcreator.stfabric.init.StreModSounds;
import net.mcreator.stfabric.init.StreModProcedures;
import net.mcreator.stfabric.init.StreModItems;
import net.mcreator.stfabric.init.StreModEntities;

import net.fabricmc.api.ModInitializer;

public class StreMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "stre";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing StreMod");

		StreModEntities.load();

		StreModItems.load();

		StreModProcedures.load();

		StreModSounds.load();

	}
}
