package com.brittank88.config;

import eu.midnightdust.lib.config.MidnightConfig;

public class SerVeinConfig extends MidnightConfig {

    public enum CollectionMethod {
        EACH,       // Drops each broken block's item/xp at that block's location.
        SOURCE,     // Drops each broken block's item/xp at the directly mined block's location.
        INVENTORY   // Attempts to directly insert each broken block's item/xp into the player (I.e., items directly into their inventory).
    }

    @Comment(centered = true) public static Comment veinOptionsSubcategoryTitle;
    @Entry(name = "Maximum Vein Size", min = 1, max = 128) public static int maxVeinSize = 32;
    @Entry(name = "Additional Durability Loss Per Block (%)", min = 0, max = 100, isSlider = true) public static int additionalDurabilityLossPerBlock = 100;

    @Comment(centered = true) public static Comment collectionMethodsSubcategoryTitle;
    @Entry(name = "Item Collection Method") public static CollectionMethod itemCollectionMethod = CollectionMethod.SOURCE;
    @Entry(name = "XP Collection Method") public static CollectionMethod xpCollectionMethod = CollectionMethod.SOURCE;
    @Entry(name = "Attempt XP Clumping") public static boolean attemptXPClumping = true;
}
