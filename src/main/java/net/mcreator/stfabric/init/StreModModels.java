
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stfabric.init;

import net.mcreator.stfabric.client.model.ModelSTPLUS;
import net.mcreator.stfabric.client.model.ModelST;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class StreModModels {
	public static void load() {
		EntityModelLayerRegistry.registerModelLayer(ModelSTPLUS.LAYER_LOCATION, ModelSTPLUS::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(ModelST.LAYER_LOCATION, ModelST::createBodyLayer);
	}
}
