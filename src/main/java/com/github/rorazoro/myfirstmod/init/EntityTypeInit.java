package com.github.rorazoro.myfirstmod.init;

import com.github.rorazoro.myfirstmod.Main;
import com.github.rorazoro.myfirstmod.entities.EmeraldSheepEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypeInit {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES,
            Main.MODID);

    public static final RegistryObject<EntityType<EmeraldSheepEntity>> EMERALD_SHEEP = ENTITY_TYPES.register(
            "emerald_sheep_entity",
            () -> EntityType.Builder.<EmeraldSheepEntity>create(EmeraldSheepEntity::new, EntityClassification.CREATURE)
                    .size(0.9f, 1.3f).build(new ResourceLocation(Main.MODID, "emerald_sheep_entity").toString()));
}