package net.ezeq.gorinnosho;

import com.shioh.sengoku.registry.ModEntities;
import net.ezeq.gorinnosho.fx.ModSounds;
import net.ezeq.gorinnosho.item.ModItems;
import net.ezeq.gorinnosho.effect.ModEffects;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.spell_power.api.SpellSchools;
import net.spell_power.api.SpellSchool;


public class GoRinNoSho implements ModInitializer {
	public static final String MOD_ID = "go-rin-no-sho";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static SpellSchool SHINOBI;
	public static SpellSchool BUSHI;
	public static SpellSchool SOHEI;

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		net.ezeq.gorinnosho.effect.ModEffects.registerEffects();

		LOGGER.info("Registering Custom Arts");

		ModEntities.register();

		ModSounds.registerModSounds();



		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			ResourceManagerHelper.registerBuiltinResourcePack(
					Identifier.of(MOD_ID, "learning"),
					modContainer,
					ResourcePackActivationType.ALWAYS_ENABLED
			);
		});

		LOGGER.info("Go-Rin No Sho!");
	}
}
