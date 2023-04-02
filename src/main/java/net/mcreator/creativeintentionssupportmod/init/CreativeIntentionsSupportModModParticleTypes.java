
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeintentionssupportmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.creativeintentionssupportmod.CreativeIntentionsSupportModMod;

public class CreativeIntentionsSupportModModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, CreativeIntentionsSupportModMod.MODID);
	public static final RegistryObject<ParticleType<?>> VULCAN_SPORE = REGISTRY.register("vulcan_spore", () -> new SimpleParticleType(false));
}
