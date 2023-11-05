package com.killerqu.retweaks.event;

import com.killerqu.retweaks.main.ReTweaks;
import com.killerqu.retweaks.main.ReTweaksConfig;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = ReTweaks.MODID)
public class ServerJoinEvent {
    @SubscribeEvent
    public static void onServerJoin(EntityJoinLevelEvent event) {
        List<? extends String> commands = ReTweaksConfig.WORLD_JOIN_COMMANDS.get();
        MinecraftServer server = event.getEntity().getServer();
        if (server == null) {return;}
        for (String cmd: commands) {
            server.getCommands().performPrefixedCommand(server.createCommandSourceStack(), cmd);
        }
    }
}
