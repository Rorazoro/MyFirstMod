package com.github.rorazoro.myfirstmod.init;

import java.util.function.Supplier;

import com.github.rorazoro.myfirstmod.Main;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroups {
    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(
        Main.MODID, 
        () -> new ItemStack(Items.EASTEREGG_ITEM.get())
    );

    public static class ModItemGroup extends ItemGroup {

        private final Supplier<ItemStack> iconSupplier;

        public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        public ItemStack createIcon() {
            return iconSupplier.get();
        }
    }
}