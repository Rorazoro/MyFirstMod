package com.github.rorazoro.myfirstmod.client.entity.render;

import com.github.rorazoro.myfirstmod.Main;
import com.github.rorazoro.myfirstmod.client.entity.model.EmeraldSheepEntityModel;
import com.github.rorazoro.myfirstmod.entities.EmeraldSheepEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class EmeraldSheepEntityRender extends MobRenderer<EmeraldSheepEntity, EmeraldSheepEntityModel<EmeraldSheepEntity>>{
    protected static final ResourceLocation TEXTURE = new ResourceLocation(Main.MODID,
			"textures/entity/emerald_sheep_entity.png");
	
	public EmeraldSheepEntityRender(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new EmeraldSheepEntityModel<EmeraldSheepEntity>(), 0.5f);
	}
	
	@Override
	public ResourceLocation getEntityTexture(EmeraldSheepEntity entity) {
		return TEXTURE;
	}
}