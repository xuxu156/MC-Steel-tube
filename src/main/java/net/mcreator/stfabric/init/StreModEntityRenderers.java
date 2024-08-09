
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stfabric.init;

import net.mcreator.stfabric.client.renderer.StdswRenderer;
import net.mcreator.stfabric.client.renderer.STPLRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class StreModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(StreModEntities.STPL, STPLRenderer::new);
		EntityRendererRegistry.register(StreModEntities.STDSW, StdswRenderer::new);
	}
}
