package net.ezeq.gorinnosho.mixin;

import net.ezeq.gorinnosho.effect.ModEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.world.World;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {

    @Shadow public abstract boolean hasStatusEffect(RegistryEntry<StatusEffect> effect);

    @Inject(method = "onStatusEffectApplied", at = @At("TAIL"))
    private void onEffectApplied(StatusEffectInstance appliedEffect, Entity source, CallbackInfo ci) {
        LivingEntity entity = (LivingEntity) (Object) this;
        World world = entity.getWorld();

        // Now this runs on serverside instead of clientside
        if (!world.isClient() && world instanceof ServerWorld serverWorld) {
            RegistryEntry<StatusEffect> effectA = ModEffects.VOLATILE_DEBUFF;
            RegistryEntry<StatusEffect> effectB = net.minecraft.entity.effect.StatusEffects.POISON;

            if (this.hasStatusEffect(effectA) && this.hasStatusEffect(effectB)) {

                StatusEffectInstance volatileInstance = entity.getStatusEffect(effectA);
                int amplifier = 0;

                if (volatileInstance != null) {
                    amplifier = volatileInstance.getAmplifier();
                } else if (appliedEffect.getEffectType().equals(effectA)) {
                    amplifier = appliedEffect.getAmplifier();
                }
                // explosion power scales 1.0f small 2.0f medium 3.0f creeper 4.0f tnt
                serverWorld.createExplosion(
                        entity,
                        entity.getX(),
                        entity.getY(),
                        entity.getZ(),
                        2.0f,
                        false,
                        World.ExplosionSourceType.NONE
                );

                float TotalDamage = 5.0f + (amplifier * 8.0f);
                entity.damage(serverWorld.getDamageSources().magic(), TotalDamage);

                // take away volatile so it doesn't explode one million times
                entity.removeStatusEffect(effectA);
            }
        }
    }
}