package com.ewyboy.datadriven.mixin;

import com.ewyboy.datadriven.util.ModLogger;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class DataDrivenMixin {
    
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        
        ModLogger.info("This line is printed by an example mod mixin from Fabric!");
        ModLogger.info("MC Version: {}", Minecraft.getInstance().getVersionType());
        ModLogger.info("Classloader: {}", this.getClass().getClassLoader());
    }
}