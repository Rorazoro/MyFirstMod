package com.github.rorazoro.myfirstmod.world.biomes;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;

public class EmeraldHighlands extends Biome {

    public EmeraldHighlands(Builder biomeBuilder) {
        super(biomeBuilder);
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.CREEPER, 20, 4, 6));
        DefaultBiomeFeatures.addExtraEmeraldOre(this);
    }

}