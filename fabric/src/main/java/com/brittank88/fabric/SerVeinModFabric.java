package com.brittank88.fabric;

import com.brittank88.fabriclike.SerVeinModFabricLike;
import net.fabricmc.api.ModInitializer;

public class SerVeinModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        SerVeinModFabricLike.init();
    }
}
