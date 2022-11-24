package com.brittank88;

import com.brittank88.config.SerVeinConfig;
import eu.midnightdust.lib.config.MidnightConfig;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.Duration;
import java.time.Instant;

public class SerVeinMod {
    public static final String MOD_ID = "servein";
    public static final String MOD_NAME = "SerVein";

    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);
    
    public static void init() {
        Instant instant = Instant.now();
        LOGGER.info("Loading " + MOD_NAME + "...");

        SerVeinExpectPlatform.initConfig(MOD_ID, SerVeinConfig.class);

        LOGGER.info(
                "Loaded " + MOD_NAME + " in " + DurationFormatUtils.formatDurationWords(
                        Duration.between(instant, Instant.now()).toMillis(),
                        true, true
                ) + "ms."
        );
    }
}
