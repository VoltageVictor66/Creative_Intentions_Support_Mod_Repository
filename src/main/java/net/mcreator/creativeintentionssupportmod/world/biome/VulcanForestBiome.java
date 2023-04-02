
package net.mcreator.creativeintentionssupportmod.world.biome;

import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.AmbientParticleSettings;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.creativeintentionssupportmod.init.CreativeIntentionsSupportModModParticleTypes;

import java.util.List;

public class VulcanForestBiome {
	public static final List<Climate.ParameterPoint> PARAMETER_POINTS = List.of(
			new Climate.ParameterPoint(Climate.Parameter.span(0.88f, 1.12f), Climate.Parameter.span(-1.12f, -0.88f), Climate.Parameter.span(0.39f, 0.63f), Climate.Parameter.span(0.68f, 0.92f), Climate.Parameter.point(0.0f),
					Climate.Parameter.span(0.17871336229042767f, 0.41871336229042766f), 0),
			new Climate.ParameterPoint(Climate.Parameter.span(0.88f, 1.12f), Climate.Parameter.span(-1.12f, -0.88f), Climate.Parameter.span(0.39f, 0.63f), Climate.Parameter.span(0.68f, 0.92f), Climate.Parameter.point(1.0f),
					Climate.Parameter.span(0.17871336229042767f, 0.41871336229042766f), 0));

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-8176640).waterColor(4159204).waterFogColor(329011).skyColor(-8176640).foliageColorOverride(10387789).grassColorOverride(9470285)
				.ambientParticle(new AmbientParticleSettings((SimpleParticleType) (CreativeIntentionsSupportModModParticleTypes.VULCAN_SPORE.get()), 0.003f)).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).biomeCategory(Biome.BiomeCategory.NONE).temperature(2f).downfall(0f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build())
				.generationSettings(biomeGenerationSettings.build()).build();
	}
}
