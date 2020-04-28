package com.github.rorazoro.myfirstmod.init;

import com.github.rorazoro.myfirstmod.Main;
import com.github.rorazoro.myfirstmod.enums.ModArmorMaterial;
import com.github.rorazoro.myfirstmod.items.ItemGroups;
import com.github.rorazoro.myfirstmod.items.ModFuelItem;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
        // The ITEMS deferred register in which you can register items.
        public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MODID);

        // Normal Items
        public static final RegistryObject<Item> EASTEREGG_ITEM = ITEMS.register("easteregg_item",
                        () -> new Item(new Item.Properties().group(ItemGroups.MOD_ITEM_GROUP)
                                        .food(new Food.Builder().hunger(6).saturation(2f).build())));

        // Fuel Items
        public static final RegistryObject<Item> EMERALD_COAL_ITEM = ITEMS.register("emerald_coal_item",
                        () -> new ModFuelItem(new Item.Properties().group(ItemGroups.MOD_ITEM_GROUP)));

        // Tool Items
        public static final RegistryObject<SwordItem> EASTERSWORD_ITEM = ITEMS.register("eastersword_item",
                        () -> new SwordItem(ItemTier.WOOD, 2, 2.5f,
                                        new Item.Properties().group(ItemGroups.MOD_ITEM_GROUP)));
        public static final RegistryObject<PickaxeItem> EMERALD_PICKAXE_ITEM = ITEMS.register("emerald_pickaxe_item",
                        () -> new PickaxeItem(ItemTier.GOLD, 2, 4.0f,
                                        new Item.Properties().group(ItemGroups.MOD_ITEM_GROUP)));
        public static final RegistryObject<AxeItem> EMERALD_AXE_ITEM = ITEMS.register("emerald_axe_item",
                        () -> new AxeItem(ItemTier.GOLD, 2, 4.0f,
                                        new Item.Properties().group(ItemGroups.MOD_ITEM_GROUP)));

        // Armor Items
        public static final RegistryObject<ArmorItem> EMERALD_HELMET_ITEM = ITEMS.register("emerald_helmet_item",
                        () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.HEAD,
                                        new Item.Properties().group(ItemGroups.MOD_ITEM_GROUP)));
        public static final RegistryObject<ArmorItem> EMERALD_CHESTPLATE_ITEM = ITEMS.register(
                        "emerald_chestplate_item",
                        () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.CHEST,
                                        new Item.Properties().group(ItemGroups.MOD_ITEM_GROUP)));
        public static final RegistryObject<ArmorItem> EMERALD_LEGGINGS_ITEM = ITEMS.register("emerald_leggings_item",
                        () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.LEGS,
                                        new Item.Properties().group(ItemGroups.MOD_ITEM_GROUP)));
        public static final RegistryObject<ArmorItem> EMERALD_BOOTS_ITEM = ITEMS.register("emerald_boots_item",
                        () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.FEET,
                                        new Item.Properties().group(ItemGroups.MOD_ITEM_GROUP)));
}