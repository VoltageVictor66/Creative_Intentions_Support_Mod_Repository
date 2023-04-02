
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeintentionssupportmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.creativeintentionssupportmod.client.renderer.AssassinVariant3Renderer;
import net.mcreator.creativeintentionssupportmod.client.renderer.AssassinVariant2Renderer;
import net.mcreator.creativeintentionssupportmod.client.renderer.AssassinVariant1Renderer;
import net.mcreator.creativeintentionssupportmod.client.renderer.AssassinPlaceholderRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreativeIntentionsSupportModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CreativeIntentionsSupportModModEntities.ASSASSIN_PLACEHOLDER.get(), AssassinPlaceholderRenderer::new);
		event.registerEntityRenderer(CreativeIntentionsSupportModModEntities.ASSASSIN_VARIANT_1.get(), AssassinVariant1Renderer::new);
		event.registerEntityRenderer(CreativeIntentionsSupportModModEntities.ASSASSIN_VARIANT_2.get(), AssassinVariant2Renderer::new);
		event.registerEntityRenderer(CreativeIntentionsSupportModModEntities.ASSASSIN_VARIANT_3.get(), AssassinVariant3Renderer::new);
	}
}
