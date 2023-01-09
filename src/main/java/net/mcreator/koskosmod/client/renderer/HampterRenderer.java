
package net.mcreator.koskosmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.koskosmod.entity.HampterEntity;
import net.mcreator.koskosmod.client.model.Modelcustom_model;

public class HampterRenderer extends MobRenderer<HampterEntity, Modelcustom_model<HampterEntity>> {
	public HampterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HampterEntity entity) {
		return new ResourceLocation("koskos_mod:textures/entities/hampter_texture.png");
	}
}
