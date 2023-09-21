package com.killerqu.retweaks.main;

import net.minecraftforge.common.ForgeConfigSpec;

public class ReTweaksConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_NETHER_PORTALS;
    static {
        BUILDER.push("Re: Tweaks config");

        ENABLE_NETHER_PORTALS = BUILDER.comment("If false, you will not be able to ignite portal frames.")
                        .define("Enable Nether Portals", true);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
