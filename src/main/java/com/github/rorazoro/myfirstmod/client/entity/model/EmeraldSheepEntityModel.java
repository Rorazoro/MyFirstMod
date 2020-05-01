package com.github.rorazoro.myfirstmod.client.entity.model;

import com.github.rorazoro.myfirstmod.entities.EmeraldSheepEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class EmeraldSheepEntityModel<T extends EmeraldSheepEntity> extends EntityModel<T> {
	private final ModelRenderer Body;
	private final ModelRenderer Legs;
	private final ModelRenderer Back;
	private final ModelRenderer RightBack;
	private final ModelRenderer LeftBack;
	private final ModelRenderer Front;
	private final ModelRenderer RightFront;
	private final ModelRenderer LeftFront;
	private final ModelRenderer Head;

	public EmeraldSheepEntityModel() {
		textureWidth = 16;
		textureHeight = 16;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 24.0F, 0.0F);
		Body.setTextureOffset(0, 0).addBox(-3.0F, -8.0F, -5.0F, 6.0F, 5.0F, 10.0F, 0.0F, false);

		Legs = new ModelRenderer(this);
		Legs.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(Legs);

		Back = new ModelRenderer(this);
		Back.setRotationPoint(0.0F, 0.0F, 0.0F);
		Legs.addChild(Back);

		RightBack = new ModelRenderer(this);
		RightBack.setRotationPoint(0.0F, 0.0F, 0.0F);
		Back.addChild(RightBack);
		RightBack.setTextureOffset(0, 0).addBox(-3.0F, -3.0F, 3.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		LeftBack = new ModelRenderer(this);
		LeftBack.setRotationPoint(0.0F, 0.0F, 0.0F);
		Back.addChild(LeftBack);
		LeftBack.setTextureOffset(0, 0).addBox(1.0F, -3.0F, 3.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		Front = new ModelRenderer(this);
		Front.setRotationPoint(0.0F, 0.0F, 0.0F);
		Legs.addChild(Front);

		RightFront = new ModelRenderer(this);
		RightFront.setRotationPoint(0.0F, 0.0F, 0.0F);
		Front.addChild(RightFront);
		RightFront.setTextureOffset(0, 0).addBox(-3.0F, -3.0F, -5.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		LeftFront = new ModelRenderer(this);
		LeftFront.setRotationPoint(0.0F, 0.0F, 0.0F);
		Front.addChild(LeftFront);
		LeftFront.setTextureOffset(0, 0).addBox(1.0F, -3.0F, -5.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(Head);
		Head.setTextureOffset(0, 0).addBox(-2.0F, -10.0F, -8.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {

	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void setLivingAnimations(T entityIn, float limbSwing, float limbSwingAmount, float partialTick) {
		super.setLivingAnimations(entityIn, limbSwing, limbSwingAmount, partialTick);
	}

	public ModelRenderer getBack() {
		return Back;
	}

	public ModelRenderer getBody() {
		return Body;
	}

	public ModelRenderer getFront() {
		return Front;
	}

	public ModelRenderer getHead() {
		return Head;
	}

	public ModelRenderer getLeftBack() {
		return LeftBack;
	}

	public ModelRenderer getLeftFront() {
		return LeftFront;
	}

	public ModelRenderer getLegs() {
		return Legs;
	}

	public ModelRenderer getRightBack() {
		return RightBack;
	}

	public ModelRenderer getRightFront() {
		return RightFront;
	}
}