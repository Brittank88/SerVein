package com.brittank88.quilt;

import com.brittank88.fabriclike.SerVeinModFabricLike;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class SerVeinModQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        SerVeinModFabricLike.init();
    }
}
