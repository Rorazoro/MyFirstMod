package com.github.rorazoro.myfirstmod.world.gen;

import com.github.rorazoro.myfirstmod.init.Blocks;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGen {
    public static void generateOre() {
        for (final Biome biome : ForgeRegistries.BIOMES) {
            ConfiguredPlacement<CountRangeConfig> placementConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 5, 5, 25));
            OreFeatureConfig featureConfig = new OreFeatureConfig(FillerBlockType.NATURAL_STONE, Blocks.EGG_ORE.get().getDefaultState(), 10);

            biome.addFeature(Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(featureConfig).withPlacement(placementConfig));
        }
    }
}