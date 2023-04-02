
package net.mcreator.creativeintentionssupportmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.creativeintentionssupportmod.entity.AssassinVariant2Entity;

public class AssassinVariant2Renderer extends HumanoidMobRenderer<AssassinVariant2Entity, HumanoidModel<AssassinVariant2Entity>> {
	public AssassinVariant2Renderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(AssassinVariant2Entity entity) {
		return new ResourceLocation("creative_intentions_support_mod:textures/entities/assassin_2.png");
	}
}
