package com.github.rorazoro.myfirstmod.util;

import com.github.rorazoro.myfirstmod.init.DimensionInit;
import com.github.rorazoro.myfirstmod.Main;

import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Bus.FORGE)
public class ForgeEventSubscriber {

    @SubscribeEvent
    public static void registerDimensions(final RegisterDimensionsEvent event) {
        if (DimensionType.byName(Main.EMERALD_DIM_TYPE) == null) {
            DimensionManager.registerDimension(Main.EMERALD_DIM_TYPE, DimensionInit.EMERALD_DIMENSION.get(), null,
                    true);
        }
        Main.LOGGER.info("Dimensions Registered!!");
    }
}