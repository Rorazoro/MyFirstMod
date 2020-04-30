package com.github.rorazoro.myfirstmod.world.feature;

import java.util.Random;

import com.github.rorazoro.myfirstmod.init.BlockInit;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraftforge.common.IPlantable;

public class JavaTree extends Tree {

    public static final TreeFeatureConfig JAVA_TREE_CONFIG = (new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.JAVA_LOG.get().getDefaultState()),
            new SimpleBlockStateProvider(BlockInit.JAVA_LEAVES.get().getDefaultState()), new BlobFoliagePlacer(1, 0)))
                    .baseHeight(14).heightRandA(5).foliageHeight(4).ignoreVines()
                    .setSapling((IPlantable) BlockInit.JAVA_SAPLING.get()).build();

    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean p_225546_2_) {
        return Feature.NORMAL_TREE.withConfiguration(JAVA_TREE_CONFIG);
    }

}