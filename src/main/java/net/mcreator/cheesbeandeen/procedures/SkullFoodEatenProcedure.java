package net.mcreator.cheesbeandeen.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.cheesbeandeen.potion.SkullpoisonPotionEffect;
import net.mcreator.cheesbeandeen.CheesbeandeenMod;

import java.util.Map;

public class SkullFoodEatenProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CheesbeandeenMod.LOGGER.warn("Failed to load dependency entity for procedure SkullFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).attackEntityFrom(new DamageSource("custom").setDamageBypassesArmor(), (float) 5);
		}
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(SkullpoisonPotionEffect.potion, (int) 60, (int) 5));
	}
}
