package net.joe.bcgmusic;

import net.fabricmc.api.ModInitializer;

import net.joe.bcgmusic.item.ModItems;
import net.joe.bcgmusic.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BCGMusic implements ModInitializer {
	public static final String MOD_ID = "bcgmusic";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModSounds.registerModSounds();
	}
}