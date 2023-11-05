package com.killerqu.retweaks.mixin;

import com.killerqu.retweaks.main.ReTweaksClientConfig;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraftforge.client.gui.overlay.ForgeGui;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = ForgeGui.class, remap = false)
public class ForgeIngameGuiMixin {
    @Inject(method = "renderFood", at = @At("HEAD"), cancellable = true)
    public void renderHunger(int width, int height, GuiGraphics guiGraphics, CallbackInfo ci) {
        if (!ReTweaksClientConfig.RENDER_HUNGER_BAR.get()) {
            ci.cancel();
        }
    }
}
