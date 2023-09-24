package com.killerqu.retweaks.mixin;

import com.killerqu.retweaks.main.ReTweaksConfig;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(FoodData.class)
public class FoodDataMixin {
    @Inject(method = "tick", at = @At("TAIL"))
    public void disableHunger(Player p_38711_, CallbackInfo ci) {
        if (!ReTweaksConfig.ENABLE_HUNGER.get()) {
            ((FoodData) (Object) this).setSaturation(20f);
            ((FoodData) (Object) this).setFoodLevel(20);
        }
    }
}
