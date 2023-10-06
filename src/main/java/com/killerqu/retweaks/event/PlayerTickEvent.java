package com.killerqu.retweaks.event;

import com.killerqu.retweaks.main.ReTweaks;
import com.killerqu.retweaks.main.ReTweaksConfig;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ReTweaks.MODID)
public class PlayerTickEvent {
    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (!ReTweaksConfig.ENABLE_HUNGER.get()) {
            event.player.getFoodData().setFoodLevel(20);
            event.player.getFoodData().setSaturation(20f);
        }
    }
}
