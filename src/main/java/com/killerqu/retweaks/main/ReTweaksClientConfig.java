package com.killerqu.retweaks.main;

import net.minecraftforge.common.ForgeConfigSpec;

public class ReTweaksClientConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> RENDER_HUNGER_BAR;

    static {
        BUILDER.push("Re:Tweaks client config");

        RENDER_HUNGER_BAR = BUILDER.comment("If false, hunger bar will not render. You might want to set it to false if you disabled hunger in common config.")
                        .define("Render Hunger Bar", true);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
