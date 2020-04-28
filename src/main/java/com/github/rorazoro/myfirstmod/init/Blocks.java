package com.github.rorazoro.myfirstmod.init;

import com.github.rorazoro.myfirstmod.Main;
import com.github.rorazoro.myfirstmod.blocks.ModJavaCupBlock;
import com.github.rorazoro.myfirstmod.blocks.ModPressurePlateBlock;
import com.github.rorazoro.myfirstmod.blocks.ModStoneButtonBlock;
import com.github.rorazoro.myfirstmod.blocks.ModTestBlock;

import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.PressurePlateBlock.Sensitivity;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Blocks {
        public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MODID);

        public static final RegistryObject<Block> EGG_ORE = BLOCKS.register("egg_ore",
                        () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));
        public static final RegistryObject<Block> SPOTTEDSTONE_BLOCK = BLOCKS.register("spottedstone_block",
                        () -> new Block(Block.Properties.create(Material.WOOD)));
        public static final RegistryObject<Block> SPOTTEDSTONE_SLAB_BLOCK = BLOCKS.register("spottedstone_slab_block",
                        () -> new SlabBlock(Block.Properties.create(Material.WOOD)));
        public static final RegistryObject<Block> SPOTTEDSTONE_STAIRS_BLOCK = BLOCKS.register(
                        "spottedstone_stairs_block",
                        () -> new StairsBlock(() -> SPOTTEDSTONE_BLOCK.get().getDefaultState(),
                                        Block.Properties.create(Material.ROCK)));
        public static final RegistryObject<Block> SPOTTEDSTONE_FENCE_BLOCK = BLOCKS.register("spottedstone_fence_block",
                        () -> new FenceBlock(Block.Properties.create(Material.WOOD)));
        public static final RegistryObject<Block> SPOTTEDSTONE_WALL_BLOCK = BLOCKS.register("spottedstone_wall_block",
                        () -> new WallBlock(Block.Properties.create(Material.ROCK)));
        public static final RegistryObject<Block> SPOTTEDSTONE_PRESSURE_PLATE_BLOCK = BLOCKS.register(
                        "spottedstone_pressure_plate_block", () -> new ModPressurePlateBlock(Sensitivity.EVERYTHING,
                                        Block.Properties.create(Material.ROCK)));
        public static final RegistryObject<Block> SPOTTEDSTONE_BUTTON_BLOCK = BLOCKS.register(
                        "spottedstone_button_block",
                        () -> new ModStoneButtonBlock(Block.Properties.create(Material.ROCK)));
        public static final RegistryObject<ModTestBlock> TEST_BLOCK = BLOCKS.register("test_block",
                        () -> new ModTestBlock(Block.Properties.create(Material.ROCK)));
        public static final RegistryObject<ModJavaCupBlock> JAVACUP_BLOCK = BLOCKS.register("javacup_block",
                        () -> new ModJavaCupBlock(Block.Properties.create(Material.ROCK)));
}