package com.brittank88.forge;

import com.brittank88.SerVeinMod;
import com.brittank88.config.SerVeinConfig;
import eu.midnightdust.lib.config.MidnightConfig;
import net.minecraftforge.client.ConfigScreenHandler;
import net.minecraftforge.fml.ModLoadingContext;

public class SerVeinExpectPlatformImpl {
    public static void initConfig(String modId, Class<? extends MidnightConfig> configClass) {
        MidnightConfig.init(modId, configClass);

        // Register our config screen with forge.
        ModLoadingContext.get().registerExtensionPoint(
                ConfigScreenHandler.ConfigScreenFactory.class,
                () -> new ConfigScreenHandler.ConfigScreenFactory((mc, parent) -> SerVeinConfig.getScreen(parent, SerVeinMod.MOD_ID))
        );
    }
}
