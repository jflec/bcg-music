package net.joe.bcgmusic.sound;

import net.joe.bcgmusic.BCGMusic;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent WALTZ_FOR_THE_LILIES = registerSoundEvent("waltz_for_the_lilies");
    public static final SoundEvent BLESSINGS = registerSoundEvent("blessings");
    public static final SoundEvent BEGINNING_OF_INFINITY = registerSoundEvent("beginning_of_infinity");
    public static final SoundEvent PLANES_IN_SPACE = registerSoundEvent("planes_in_space");
    public static final SoundEvent JOE_THEME = registerSoundEvent("joe_theme");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier identifier = new Identifier(BCGMusic.MOD_ID, name);

        return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }

    public static void registerModSounds() {BCGMusic.LOGGER.info("Registering sounds for " + BCGMusic.MOD_ID); }
}
