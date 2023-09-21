package com.killerqu.retweaks.event;

import com.killerqu.retweaks.main.ReTweaks;
import com.killerqu.retweaks.main.ReTweaksConfig;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ReTweaks.MODID)
public class NetherPortalDisableEvent {
    @SubscribeEvent
    public static void onNetherPortal(BlockEvent.PortalSpawnEvent event) {
        event.setCanceled(!ReTweaksConfig.ENABLE_NETHER_PORTALS.get());
    }
}
