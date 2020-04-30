package com.github.rorazoro.myfirstmod.init;

import com.github.rorazoro.myfirstmod.Main;
import com.github.rorazoro.myfirstmod.containers.SpottedStoneChestContainer;

import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContainerInit {
    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = new DeferredRegister<>(
            ForgeRegistries.CONTAINERS, Main.MODID);

    public static final RegistryObject<ContainerType<SpottedStoneChestContainer>> SPOTTEDSTONE_CHEST = CONTAINER_TYPES
            .register("spottedstone_chest", () -> IForgeContainerType.create(SpottedStoneChestContainer::new));
}