package com.ewyboy.datadriven.content;

import com.ewyboy.datadriven.Constants;
import com.ewyboy.datadriven.content.tools.DataPickaxe;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;

public class Register {

    public static void registerDataContent() {
        Registry.register(Registry.ITEM, new ResourceLocation(Constants.MOD_ID, "data_pickaxe"), (Item) new DataPickaxe(Tiers.NETHERITE, 12, 5.0f, new Item.Properties()));
    }

}
