package com.github.rorazoro.myfirstmod;

import com.github.rorazoro.myfirstmod.init.BiomeInit;
import com.github.rorazoro.myfirstmod.init.BlockInit;
import com.github.rorazoro.myfirstmod.init.ItemInit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MODID)
public class Main {
    public static final String MODID = "myfirstmod";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public Main() {

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //Register deferred registries
        BlockInit.BLOCKS.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);
        BiomeInit.BIOMES.register(modEventBus);
    }
}