package net.joe.bcgmusic.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.joe.bcgmusic.BCGMusic;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup BCG_MUSIC = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(BCGMusic.MOD_ID, "bcg_music"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.bcg_music"))
                    .icon(() -> new ItemStack(ModItems.WALTZ_FOR_THE_LILIES))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.WALTZ_FOR_THE_LILIES);
                    })
                    .build()
    );

    public static void registerItemGroups() {

    }
}