package com.github.rorazoro.myfirstmod.util;

import com.github.rorazoro.myfirstmod.init.BiomeInit;
import com.github.rorazoro.myfirstmod.init.BlockInit;
import com.github.rorazoro.myfirstmod.items.ItemGroups;
import com.github.rorazoro.myfirstmod.world.gen.OreGen;
import com.github.rorazoro.myfirstmod.Main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Bus.MOD)
public class ModEventSubscriber {
    private static final Logger LOGGER = LogManager.getLogger(Main.MODID + " Mod Event Subscriber");

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(ItemGroups.MOD_ITEM_GROUP);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });

        LOGGER.debug("Registered BlockItems!");
    }

    @SubscribeEvent
    public static void onRegisterBiomes(final RegistryEvent.Register<Biome> event) {
        BiomeInit.registerBiomes();
    }

    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
        OreGen.generateOre();
    }
}