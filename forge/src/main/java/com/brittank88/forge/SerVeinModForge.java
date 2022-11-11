package com.brittank88.forge;

import com.brittank88.SerVeinMod;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SerVeinMod.MOD_ID)
public class SerVeinModForge {
    public SerVeinModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(SerVeinMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        SerVeinMod.init();
    }
}
