package com.ewyboy.datadriven.content.tools;

import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

public class DataPickaxe extends PickaxeItem {

    public DataPickaxe(Tier tier, int damage, float speed, Properties properties) {
        super(tier, damage, speed, properties);
    }
}
