package com.brittank88.fabric;

import com.brittank88.SerVeinExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class SerVeinExpectPlatformImpl {
    /**
     * This is our actual method to {@link SerVeinExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
