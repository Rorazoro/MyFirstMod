package com.github.rorazoro.myfirstmod.init;

import com.github.rorazoro.myfirstmod.Main;
import com.github.rorazoro.myfirstmod.world.dimensions.EmeraldModDimension;

import net.minecraftforge.common.ModDimension;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DimensionInit {
    public static final DeferredRegister<ModDimension> MOD_DIMENSIONS = new DeferredRegister<>(
            ForgeRegistries.MOD_DIMENSIONS, Main.MODID);

    public static final RegistryObject<ModDimension> EMERALD_DIMENSION = MOD_DIMENSIONS.register("emerald_dim", () -> new EmeraldModDimension());
}