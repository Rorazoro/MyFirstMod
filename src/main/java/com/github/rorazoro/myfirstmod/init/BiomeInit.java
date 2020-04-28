package com.github.rorazoro.myfirstmod.init;

import com.github.rorazoro.myfirstmod.Main;
import com.github.rorazoro.myfirstmod.world.biomes.EmeraldHighlands;

import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.Biome.RainType;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeInit {
        public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, Main.MODID);

        public static final RegistryObject<Biome> EMERALD_HIGHLANDS_BIOME = BIOMES.register("emerald_highlands_biome",
                        () -> new EmeraldHighlands(new Biome.Builder().depth(0.2f).precipitation(RainType.SNOW)
                                        .scale(1.5f).temperature(0f).waterColor(11520).waterFogColor(65280)
                                        .surfaceBuilder(SurfaceBuilder.DEFAULT,
                                                        new SurfaceBuilderConfig(Blocks.GRASS_BLOCK.getDefaultState(),
                                                                        Blocks.EMERALD_BLOCK.getDefaultState(),
                                                                        BlockInit.SPOTTEDSTONE_BLOCK.get()
                                                                                        .getDefaultState()))
                                        .category(Category.EXTREME_HILLS).downfall(0.2f).parent(null)));

        public static void registerBiomes() {
                registerBiome(EMERALD_HIGHLANDS_BIOME.get(), Type.HILLS, Type.OVERWORLD);
        }

        private static void registerBiome(Biome biome, Type... types) {
                BiomeDictionary.addTypes(biome, types);
                BiomeManager.addSpawnBiome(biome);
        }
}