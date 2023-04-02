
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeintentionssupportmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.creativeintentionssupportmod.world.features.plants.VulcanRootsFeature;
import net.mcreator.creativeintentionssupportmod.world.features.plants.VulcanFungusFeature;
import net.mcreator.creativeintentionssupportmod.world.features.ores.ScoriaFeature;
import net.mcreator.creativeintentionssupportmod.world.features.ores.OverworldQuartzOreFeature;
import net.mcreator.creativeintentionssupportmod.world.features.ores.MagnesiumOreFeature;
import net.mcreator.creativeintentionssupportmod.world.features.ores.DolomiteFeature;
import net.mcreator.creativeintentionssupportmod.world.features.ores.DeepslateOverworldQuartzoreFeature;
import net.mcreator.creativeintentionssupportmod.world.features.VulcanFungusTree9Feature;
import net.mcreator.creativeintentionssupportmod.world.features.VulcanFungusTree8Feature;
import net.mcreator.creativeintentionssupportmod.world.features.VulcanFungusTree7Feature;
import net.mcreator.creativeintentionssupportmod.world.features.VulcanFungusTree6Feature;
import net.mcreator.creativeintentionssupportmod.world.features.VulcanFungusTree5Feature;
import net.mcreator.creativeintentionssupportmod.world.features.VulcanFungusTree4Feature;
import net.mcreator.creativeintentionssupportmod.world.features.VulcanFungusTree3Feature;
import net.mcreator.creativeintentionssupportmod.world.features.VulcanFungusTree2Feature;
import net.mcreator.creativeintentionssupportmod.world.features.VulcanFungusTree1Feature;
import net.mcreator.creativeintentionssupportmod.CreativeIntentionsSupportModMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class CreativeIntentionsSupportModModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, CreativeIntentionsSupportModMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> DOLOMITE = register("dolomite", DolomiteFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DolomiteFeature.GENERATE_BIOMES, DolomiteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> OVERWORLD_QUARTZ_ORE = register("overworld_quartz_ore", OverworldQuartzOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, OverworldQuartzOreFeature.GENERATE_BIOMES, OverworldQuartzOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPSLATE_OVERWORLD_QUARTZORE = register("deepslate_overworld_quartzore", DeepslateOverworldQuartzoreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DeepslateOverworldQuartzoreFeature.GENERATE_BIOMES, DeepslateOverworldQuartzoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MAGNESIUM_ORE = register("magnesium_ore", MagnesiumOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, MagnesiumOreFeature.GENERATE_BIOMES, MagnesiumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> VULCAN_FUNGUS = register("vulcan_fungus", VulcanFungusFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, VulcanFungusFeature.GENERATE_BIOMES, VulcanFungusFeature::placedFeature));
	public static final RegistryObject<Feature<?>> VULCAN_ROOTS = register("vulcan_roots", VulcanRootsFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, VulcanRootsFeature.GENERATE_BIOMES, VulcanRootsFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SCORIA = register("scoria", ScoriaFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, ScoriaFeature.GENERATE_BIOMES, ScoriaFeature::placedFeature));
	public static final RegistryObject<Feature<?>> VULCAN_FUNGUS_TREE_1 = register("vulcan_fungus_tree_1", VulcanFungusTree1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, VulcanFungusTree1Feature.GENERATE_BIOMES, VulcanFungusTree1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> VULCAN_FUNGUS_TREE_2 = register("vulcan_fungus_tree_2", VulcanFungusTree2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, VulcanFungusTree2Feature.GENERATE_BIOMES, VulcanFungusTree2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> VULCAN_FUNGUS_TREE_3 = register("vulcan_fungus_tree_3", VulcanFungusTree3Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, VulcanFungusTree3Feature.GENERATE_BIOMES, VulcanFungusTree3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> VULCAN_FUNGUS_TREE_4 = register("vulcan_fungus_tree_4", VulcanFungusTree4Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, VulcanFungusTree4Feature.GENERATE_BIOMES, VulcanFungusTree4Feature::placedFeature));
	public static final RegistryObject<Feature<?>> VULCAN_FUNGUS_TREE_5 = register("vulcan_fungus_tree_5", VulcanFungusTree5Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, VulcanFungusTree5Feature.GENERATE_BIOMES, VulcanFungusTree5Feature::placedFeature));
	public static final RegistryObject<Feature<?>> VULCAN_FUNGUS_TREE_6 = register("vulcan_fungus_tree_6", VulcanFungusTree6Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, VulcanFungusTree6Feature.GENERATE_BIOMES, VulcanFungusTree6Feature::placedFeature));
	public static final RegistryObject<Feature<?>> VULCAN_FUNGUS_TREE_7 = register("vulcan_fungus_tree_7", VulcanFungusTree7Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, VulcanFungusTree7Feature.GENERATE_BIOMES, VulcanFungusTree7Feature::placedFeature));
	public static final RegistryObject<Feature<?>> VULCAN_FUNGUS_TREE_8 = register("vulcan_fungus_tree_8", VulcanFungusTree8Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, VulcanFungusTree8Feature.GENERATE_BIOMES, VulcanFungusTree8Feature::placedFeature));
	public static final RegistryObject<Feature<?>> VULCAN_FUNGUS_TREE_9 = register("vulcan_fungus_tree_9", VulcanFungusTree9Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, VulcanFungusTree9Feature.GENERATE_BIOMES, VulcanFungusTree9Feature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes, Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
