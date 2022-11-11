package com.brittank88.forge;

import com.brittank88.SerVeinExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class SerVeinExpectPlatformImpl {
    /**
     * This is our actual method to {@link SerVeinExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
