package net.pulchrate;

import net.fabricmc.api.ModInitializer;

import net.pulchrate.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Asc_firstmod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("asc_firstmod");
	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}