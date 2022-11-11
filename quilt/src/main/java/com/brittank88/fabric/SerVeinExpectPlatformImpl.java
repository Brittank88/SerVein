package com.brittank88.fabric;

import com.brittank88.SerVeinExpectPlatform;
import org.quiltmc.loader.api.QuiltLoader;

import java.nio.file.Path;

public class SerVeinExpectPlatformImpl {
    /**
     * This is our actual method to {@link SerVeinExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return QuiltLoader.getConfigDir();
    }
}
