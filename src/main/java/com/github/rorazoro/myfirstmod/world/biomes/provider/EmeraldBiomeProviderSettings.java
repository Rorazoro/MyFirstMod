package com.github.rorazoro.myfirstmod.world.biomes.provider;

import net.minecraft.world.biome.provider.IBiomeProviderSettings;
import net.minecraft.world.storage.WorldInfo;

public class EmeraldBiomeProviderSettings implements IBiomeProviderSettings {
    private final long seed;

   public EmeraldBiomeProviderSettings(WorldInfo worldInfo) {
      this.seed = worldInfo.getSeed();
   }

   public long getSeed() {
      return this.seed;
   }
}