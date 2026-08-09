package net.ezeq.gorinnosho.entity;

import net.ezeq.gorinnosho.GoRinNoSho;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<MakibishiEntity> MAKIBISHI = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of("go-rin-no-sho", "makibishi"),
            EntityType.Builder.<MakibishiEntity>create(MakibishiEntity::new, SpawnGroup.MISC)
                    .dimensions(3.0f, 0.2f)
                    .build()
    );


    public static void registerEntities() {
            net.ezeq.gorinnosho.GoRinNoSho.LOGGER.info("Finding where I left my " + GoRinNoSho.MOD_ID);
    }
 }

