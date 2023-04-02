
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeintentionssupportmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.Minecraft;

import net.mcreator.creativeintentionssupportmod.client.particle.VulcanSporeParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreativeIntentionsSupportModModParticles {
	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) CreativeIntentionsSupportModModParticleTypes.VULCAN_SPORE.get(), VulcanSporeParticle::provider);
	}
}
