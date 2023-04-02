
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeintentionssupportmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.creativeintentionssupportmod.entity.AssassinVariant3Entity;
import net.mcreator.creativeintentionssupportmod.entity.AssassinVariant2Entity;
import net.mcreator.creativeintentionssupportmod.entity.AssassinVariant1Entity;
import net.mcreator.creativeintentionssupportmod.entity.AssassinPlaceholderEntity;
import net.mcreator.creativeintentionssupportmod.CreativeIntentionsSupportModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeIntentionsSupportModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, CreativeIntentionsSupportModMod.MODID);
	public static final RegistryObject<EntityType<AssassinPlaceholderEntity>> ASSASSIN_PLACEHOLDER = register("assassin_placeholder",
			EntityType.Builder.<AssassinPlaceholderEntity>of(AssassinPlaceholderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AssassinPlaceholderEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AssassinVariant1Entity>> ASSASSIN_VARIANT_1 = register("assassin_variant_1",
			EntityType.Builder.<AssassinVariant1Entity>of(AssassinVariant1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AssassinVariant1Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AssassinVariant2Entity>> ASSASSIN_VARIANT_2 = register("assassin_variant_2",
			EntityType.Builder.<AssassinVariant2Entity>of(AssassinVariant2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AssassinVariant2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AssassinVariant3Entity>> ASSASSIN_VARIANT_3 = register("assassin_variant_3",
			EntityType.Builder.<AssassinVariant3Entity>of(AssassinVariant3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AssassinVariant3Entity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			AssassinPlaceholderEntity.init();
			AssassinVariant1Entity.init();
			AssassinVariant2Entity.init();
			AssassinVariant3Entity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ASSASSIN_PLACEHOLDER.get(), AssassinPlaceholderEntity.createAttributes().build());
		event.put(ASSASSIN_VARIANT_1.get(), AssassinVariant1Entity.createAttributes().build());
		event.put(ASSASSIN_VARIANT_2.get(), AssassinVariant2Entity.createAttributes().build());
		event.put(ASSASSIN_VARIANT_3.get(), AssassinVariant3Entity.createAttributes().build());
	}
}
