package net.ezeq.gorinnosho.item;

import net.ezeq.gorinnosho.GoRinNoSho;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.component.ComponentType;

public class ModItems {

    private static Item registeritem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GoRinNoSho.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GoRinNoSho.LOGGER.info("Reading the five teachings on " + GoRinNoSho.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {

        });
    }
}