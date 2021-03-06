package com.github.rorazoro.myfirstmod.util;

import com.github.rorazoro.myfirstmod.Main;
import com.github.rorazoro.myfirstmod.client.entity.render.EmeraldSheepEntityRender;
import com.github.rorazoro.myfirstmod.client.gui.SpottedStoneChestScreen;
import com.github.rorazoro.myfirstmod.init.BlockInit;
import com.github.rorazoro.myfirstmod.init.ContainerInit;
import com.github.rorazoro.myfirstmod.init.EntityTypeInit;

import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        ScreenManager.registerFactory(ContainerInit.SPOTTEDSTONE_CHEST.get(), SpottedStoneChestScreen::new);
        RenderTypeLookup.setRenderLayer(BlockInit.JAVA_SAPLING.get(), RenderType.getCutout());
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.EMERALD_SHEEP.get(), EmeraldSheepEntityRender::new);
    }
}