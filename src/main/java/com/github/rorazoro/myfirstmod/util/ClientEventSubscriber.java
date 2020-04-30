package com.github.rorazoro.myfirstmod.util;

import com.github.rorazoro.myfirstmod.Main;
import com.github.rorazoro.myfirstmod.client.gui.SpottedStoneChestScreen;
import com.github.rorazoro.myfirstmod.init.ContainerInit;

import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        ScreenManager.registerFactory(ContainerInit.SPOTTEDSTONE_CHEST.get(), SpottedStoneChestScreen::new);
    }
}