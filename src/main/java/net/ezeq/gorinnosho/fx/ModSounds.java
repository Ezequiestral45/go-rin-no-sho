package net.ezeq.gorinnosho.fx;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final String MOD_ID = "go-rin-no-sho";

    public static final SoundEvent FULL_CHARGE = registerSound("full_charge");
    public static final SoundEvent SMOKE_BOMB = registerSound("smoke_bomb");
    public static final SoundEvent SAGE_BLESSING = registerSound("sage_blessing");
    public static final SoundEvent CHAIN_BREAKING = registerSound("chain_breaking");
    public static final SoundEvent CALTROP_DROP = registerSound("caltrop_drop");
    public static final SoundEvent BREATHE_IN = registerSound("breathe_in");
    public static final SoundEvent BREATHE_OUT = registerSound("breathe_out");
    public static final SoundEvent BATTLE_CRY = registerSound("battle_cry");

    private static SoundEvent registerSound(String name) {
        Identifier id = Identifier.of(MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerModSounds() {}
}