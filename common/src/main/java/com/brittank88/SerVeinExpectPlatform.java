package com.brittank88;

import dev.architectury.injectables.annotations.ExpectPlatform;
import dev.architectury.platform.Platform;
import eu.midnightdust.lib.config.MidnightConfig;

import java.nio.file.Path;

public class SerVeinExpectPlatform {
    @ExpectPlatform public static void initConfig(String modId, Class<? extends MidnightConfig> configClass) { throw new AssertionError(); }
}
