// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class custom_model extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer Legs;
	private final ModelRenderer Back;
	private final ModelRenderer RightBack;
	private final ModelRenderer LeftBack;
	private final ModelRenderer Front;
	private final ModelRenderer RightFront;
	private final ModelRenderer LeftFront;
	private final ModelRenderer Head;

	public custom_model() {
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
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}