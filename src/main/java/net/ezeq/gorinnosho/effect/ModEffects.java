package net.ezeq.gorinnosho.effect;

import net.ezeq.gorinnosho.GoRinNoSho;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

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
    public static final RegistryEntry<StatusEffect> CLEANSING_BUFF = Registry.registerReference(
            Registries.STATUS_EFFECT,
            Identifier.of(GoRinNoSho.MOD_ID, "cleansing"),
            new CleansingStatusEffect(StatusEffectCategory.BENEFICIAL, 0xffd966)
    );
    public static final RegistryEntry<StatusEffect> KAI_BUFF = Registry.registerReference(
            Registries.STATUS_EFFECT,
            Identifier.of(GoRinNoSho.MOD_ID, "kai"),
            new KaiStatusEffect(StatusEffectCategory.BENEFICIAL, 0xcc0000)
    );

    public static void registerEffects() {
        GoRinNoSho.LOGGER.info("Giving a read to " + GoRinNoSho.MOD_ID);
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
    private static class CleansingStatusEffect extends StatusEffect {
        protected CleansingStatusEffect(StatusEffectCategory category, int color) { super(category, color); }
    }
    private static class KaiStatusEffect extends StatusEffect {
        protected KaiStatusEffect(StatusEffectCategory category, int color) { super(category, color); }
    }
}