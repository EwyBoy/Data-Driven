package com.ewyboy.datadriven;

import com.ewyboy.datadriven.content.Register;
import com.ewyboy.datadriven.platform.Services;
import com.ewyboy.datadriven.util.ModLogger;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class CommonClass {

    // This method serves as an initialization hook for the mod. The vanilla
    // game has no mechanism to load tooltip listeners so this must be
    // invoked from a mod loader specific project like Forge or Fabric.
    public static void init() {

        ModLogger.info(
                "Hello from Common init on {}! we are currently in a {} environment!",
                Services.PLATFORM.getPlatformName(),
                Services.PLATFORM.isDevelopmentEnvironment() ? "development" : "production"
        );
        ModLogger.info("Diamond Item >> {}", Registry.ITEM.getKey(Items.DIAMOND));

        Register.registerDataContent();
    }

    // This method serves as a hook to modify item tooltips. The vanilla game
    // has no mechanism to load tooltip listeners so this must be registered
    // by a mod loader like Forge or Fabric.
    public static void onItemTooltip(ItemStack stack, TooltipFlag context, List<Component> tooltip) {

        if (!stack.isEmpty()) {

            final FoodProperties food = stack.getItem().getFoodProperties();

            if (food != null) {

                tooltip.add(new TextComponent("Nutrition: " + food.getNutrition()));
                tooltip.add(new TextComponent("Saturation: " + food.getSaturationModifier()));
            }
        }
    }
}