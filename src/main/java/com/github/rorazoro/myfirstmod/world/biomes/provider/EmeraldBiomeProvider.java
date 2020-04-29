package com.github.rorazoro.myfirstmod.world.biomes.provider;

import java.util.Set;

import com.github.rorazoro.myfirstmod.init.BiomeInit;
import com.google.common.collect.ImmutableSet;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;

public class EmeraldBiomeProvider extends BiomeProvider {
    private static final Set<Biome> biomes = ImmutableSet.of(BiomeInit.EMERALD_HIGHLANDS_BIOME.get());

   public EmeraldBiomeProvider() {
      super(biomes);
   }

    public Biome getNoiseBiome(int x, int y, int z) {
        return BiomeInit.EMERALD_HIGHLANDS_BIOME.get();
    }
}