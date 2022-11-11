package com.brittank88;

import com.google.common.base.Suppliers;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registries;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class SerVeinMod {
    public static final String MOD_ID = "servein";
    
    public static void init() {
        System.out.println(SerVeinExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
