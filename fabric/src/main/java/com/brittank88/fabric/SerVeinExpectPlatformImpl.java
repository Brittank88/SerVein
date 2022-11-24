package com.brittank88.fabric;

import com.brittank88.SerVeinExpectPlatform;
import eu.midnightdust.lib.config.MidnightConfig;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class SerVeinExpectPlatformImpl {
    public static void initConfig(String modId, Class<? extends MidnightConfig> configClass) { MidnightConfig.init(modId, configClass); }
}
