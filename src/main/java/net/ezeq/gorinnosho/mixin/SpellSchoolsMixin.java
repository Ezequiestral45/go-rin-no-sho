package net.ezeq.gorinnosho.mixin;

import net.spell_power.api.SpellSchools;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = SpellSchools.class, remap = false)
public class SpellSchoolsMixin {

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void injectGoRinNoShoSchools(CallbackInfo ci) {
        SpellSchools.register(SpellSchools.createMagic("shinobi", 0x3a3a3a));
        SpellSchools.register(SpellSchools.createMagic("bushi",   0x992222));
        SpellSchools.register(SpellSchools.createMagic("sohei",   0x229991));
    }
}