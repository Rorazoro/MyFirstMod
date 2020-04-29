package com.github.rorazoro.myfirstmod.world.gen;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.GenerationSettings;

public class EmeraldGenerationSettings extends GenerationSettings{
    private BlockPos spawnPos;

   public EmeraldGenerationSettings setSpawnPos(BlockPos pos) {
      this.spawnPos = pos;
      return this;
   }

   public BlockPos getSpawnPos() {
      return this.spawnPos;
   }
}