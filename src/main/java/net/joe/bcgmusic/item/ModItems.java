package net.joe.bcgmusic.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.joe.bcgmusic.BCGMusic;
import net.joe.bcgmusic.sound.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item WALTZ_FOR_THE_LILIES = registerItem("waltz_for_the_lilies",
            new MusicDiscItem(9, ModSounds.WALTZ_FOR_THE_LILIES, new FabricItemSettings().maxCount(1), 165));
    public static final Item BLESSINGS = registerItem("blessings",
            new MusicDiscItem(9, ModSounds.BLESSINGS, new FabricItemSettings().maxCount(1), 245));
    public static final Item BEGINNING_OF_INFINITY = registerItem("beginning_of_infinity",
            new MusicDiscItem(9, ModSounds.BEGINNING_OF_INFINITY, new FabricItemSettings().maxCount(1), 315));
    public static final Item PLANES_IN_SPACE = registerItem("planes_in_space",
            new MusicDiscItem(9, ModSounds.PLANES_IN_SPACE, new FabricItemSettings().maxCount(1), 176));
    public static final Item JOE_THEME = registerItem("joe_theme",
            new MusicDiscItem(9, ModSounds.JOE_THEME, new FabricItemSettings().maxCount(1), 76));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BCGMusic.MOD_ID, name), item);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(WALTZ_FOR_THE_LILIES);
        entries.add(BLESSINGS);
        entries.add(BEGINNING_OF_INFINITY);
        entries.add(PLANES_IN_SPACE);
        entries.add(JOE_THEME);
    }

    public static void registerModItems() {
        BCGMusic.LOGGER.info("Registering items for " + BCGMusic.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::itemGroupIngredients);
    }
}
