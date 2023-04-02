package net.mcreator.creativeintentionssupportmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.creativeintentionssupportmod.init.CreativeIntentionsSupportModModEntities;
import net.mcreator.creativeintentionssupportmod.entity.AssassinVariant3Entity;
import net.mcreator.creativeintentionssupportmod.entity.AssassinVariant2Entity;
import net.mcreator.creativeintentionssupportmod.entity.AssassinVariant1Entity;

public class AssassinPlaceholderOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double spawn = 0;
		spawn = Math.round(Math.random() * 2);
		if (spawn == 0) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new AssassinVariant1Entity(CreativeIntentionsSupportModModEntities.ASSASSIN_VARIANT_1.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		}
		if (spawn == 1) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new AssassinVariant2Entity(CreativeIntentionsSupportModModEntities.ASSASSIN_VARIANT_2.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		}
		if (spawn == 2) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new AssassinVariant3Entity(CreativeIntentionsSupportModModEntities.ASSASSIN_VARIANT_3.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		}
		if (!entity.level.isClientSide())
			entity.discard();
	}
}
