package com.github.rorazoro.myfirstmod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModFuelItem extends Item {

    public ModFuelItem(Properties properties) {
        super(properties);
    }

    @Override
    public int getBurnTime(ItemStack itemStack) {
        return 1000;
    }
}