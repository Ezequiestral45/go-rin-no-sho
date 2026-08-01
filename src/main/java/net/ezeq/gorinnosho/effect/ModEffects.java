package net.ezeq.gorinnosho.effect;

import net.ezeq.gorinnosho.GoRinNoSho;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class ModEffects {

    public static final RegistryEntry<StatusEffect> ENVENOMED_BUFF = Registry.registerReference(
            Registries.STATUS_EFFECT,
            Identifier.of(GoRinNoSho.MOD_ID, "envenomed"),
            new EnvenomedStatusEffect(StatusEffectCategory.BENEFICIAL, 0x32CD32)
    );
    public static final RegistryEntry<StatusEffect> LOADEDSUBSTANCE_BUFF = Registry.registerReference(
            Registries.STATUS_EFFECT,
            Identifier.of(GoRinNoSho.MOD_ID, "loadedsubstance"),
            new LoadedSubstanceStatusEffect(StatusEffectCategory.BENEFICIAL, 0xe49f52)
    );
    public static final RegistryEntry<StatusEffect> VOLATILE_DEBUFF = Registry.registerReference(
            Registries.STATUS_EFFECT,
            Identifier.of(GoRinNoSho.MOD_ID, "volatile"),
            new VolatileStatusEffect(StatusEffectCategory.HARMFUL, 0x946734)
    );

    public static void registerEffects() {
        GoRinNoSho.LOGGER.info("Registering Status Effects for " + GoRinNoSho.MOD_ID);
    }

    private static class EnvenomedStatusEffect extends StatusEffect {
        protected EnvenomedStatusEffect(StatusEffectCategory category, int color) {
            super(category, color);
        }
    }
    private static class LoadedSubstanceStatusEffect extends StatusEffect {
        protected LoadedSubstanceStatusEffect(StatusEffectCategory category, int color) {
            super(category, color);
        }
    }
    private static class VolatileStatusEffect extends StatusEffect {
        protected VolatileStatusEffect(StatusEffectCategory category, int color) {
            super(category, color);
        }
    }
}