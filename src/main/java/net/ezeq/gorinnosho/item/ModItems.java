package net.ezeq.gorinnosho.item;

import net.ezeq.gorinnosho.GoRinNoSho;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TEACHINGS_KANCHO = registeritem( "teachings_kancho", new Item(new Item.Settings()));
    public static final Item TEACHINGS_KONRAN = registeritem( "teachings_konran", new Item(new Item.Settings()));
    public static final Item TEACHINGS_TEISATSU = registeritem( "teachings_teisatsu", new Item(new Item.Settings()));
    public static final Item TEACHINGS_HOZOIN = registeritem( "teachings_hozoin", new Item(new Item.Settings()));
    public static final Item TEACHINGS_KENSEI = registeritem( "teachings_kensei", new Item(new Item.Settings()));
    public static final Item TEACHINGS_KYUDO = registeritem( "teachings_kyudo", new Item(new Item.Settings()));
    public static final Item TEACHINGS_AKUSO = registeritem( "teachings_akuso", new Item(new Item.Settings()));
    public static final Item TEACHINGS_GAKUSHU = registeritem( "teachings_gakushu", new Item(new Item.Settings()));
    public static final Item TEACHINGS_GAMA = registeritem( "teachings_gama", new Item(new Item.Settings()));

    private static Item registeritem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GoRinNoSho.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GoRinNoSho.LOGGER.info("Registering Mod Items for " + GoRinNoSho.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(TEACHINGS_KANCHO);
            fabricItemGroupEntries.add(TEACHINGS_KONRAN);
            fabricItemGroupEntries.add(TEACHINGS_TEISATSU);
            fabricItemGroupEntries.add(TEACHINGS_HOZOIN);
            fabricItemGroupEntries.add(TEACHINGS_KENSEI);
            fabricItemGroupEntries.add(TEACHINGS_KYUDO);
            fabricItemGroupEntries.add(TEACHINGS_AKUSO);
            fabricItemGroupEntries.add(TEACHINGS_GAKUSHU);
            fabricItemGroupEntries.add(TEACHINGS_GAMA);

        });
    }
}
