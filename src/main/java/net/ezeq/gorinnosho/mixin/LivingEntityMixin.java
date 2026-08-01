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
    private void onEffectApplied(StatusEffectInstance effect, Entity source, CallbackInfo ci) {
        LivingEntity entity = (LivingEntity) (Object) this;
        World world = entity.getWorld();

        // Now this runs on serverside instead of clientside
        if (!world.isClient() && world instanceof ServerWorld serverWorld) {
            RegistryEntry<StatusEffect> effectA = ModEffects.VOLATILE_DEBUFF;
            StatusEffectInstance volatileInstance = entity.getStatusEffect(effectA);
            int amplifier = volatileInstance != null ? volatileInstance.getAmplifier() : 0;
            RegistryEntry<StatusEffect> effectB = net.minecraft.entity.effect.StatusEffects.POISON;

            if (this.hasStatusEffect(effectA) && this.hasStatusEffect(effectB)) {
                // explosion power scales 1.0f small 2.0f medium 3.0f creeper 4.0f tnt
                serverWorld.createExplosion(
                        entity,
                        entity.getX(),
                        entity.getY(),
                        entity.getZ(),
                        3.0f,
                        false,
                        World.ExplosionSourceType.NONE
                );

                float TotalDamage = 10.0f + (amplifier * 10.0f);
                entity.damage(serverWorld.getDamageSources().magic(), TotalDamage);

                // take away volatile so it doesn't loop
                entity.removeStatusEffect(effectA);
            }
        }
    }
}