
package net.mcreator.creativeintentionssupportmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.creativeintentionssupportmod.entity.AssassinPlaceholderEntity;

public class AssassinPlaceholderRenderer extends HumanoidMobRenderer<AssassinPlaceholderEntity, HumanoidModel<AssassinPlaceholderEntity>> {
	public AssassinPlaceholderRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(AssassinPlaceholderEntity entity) {
		return new ResourceLocation("creative_intentions_support_mod:textures/entities/assassin_1.png");
	}
}
