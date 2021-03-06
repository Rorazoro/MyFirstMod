package com.github.rorazoro.myfirstmod.init;

import com.github.rorazoro.myfirstmod.Main;
import com.github.rorazoro.myfirstmod.tileentities.ModTestTileEntity;
import com.github.rorazoro.myfirstmod.tileentities.SpottedStoneChestTileEntity;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypeInit {
        public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>(
                        ForgeRegistries.TILE_ENTITIES, Main.MODID);

        public static final RegistryObject<TileEntityType<ModTestTileEntity>> TEST_TILE_ENTITY = TILE_ENTITY_TYPES
                        .register("test_tile_entity", () -> TileEntityType.Builder
                                        .create(ModTestTileEntity::new, BlockInit.TEST_BLOCK.get()).build(null));

        public static final RegistryObject<TileEntityType<SpottedStoneChestTileEntity>> SPOTTEDSTONE_CHEST_TILE_ENTITY = TILE_ENTITY_TYPES
                        .register("spottedstone_chest_tile_entity",
                                        () -> TileEntityType.Builder
                                                        .create(SpottedStoneChestTileEntity::new,
                                                                        BlockInit.SPOTTEDSTONE_CHEST.get())
                                                        .build(null));
}