package net.ezeq.gorinnosho.client;

import net.ezeq.gorinnosho.entity.MakibishiEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class MakibishiModel extends EntityModel<MakibishiEntity> {
	private final ModelPart bone;
	private final ModelPart bone21;
	private final ModelPart bone43;
	private final ModelPart bone6;
	private final ModelPart bone22;
	private final ModelPart bone11;
	private final ModelPart bone23;
	private final ModelPart bone16;
	private final ModelPart bone24;
	private final ModelPart bone2;
	private final ModelPart bone25;
	private final ModelPart bone42;
	private final ModelPart bone7;
	private final ModelPart bone26;
	private final ModelPart bone12;
	private final ModelPart bone27;
	private final ModelPart bone17;
	private final ModelPart bone28;
	private final ModelPart bone3;
	private final ModelPart bone29;
	private final ModelPart bone45;
	private final ModelPart bone8;
	private final ModelPart bone30;
	private final ModelPart bone13;
	private final ModelPart bone31;
	private final ModelPart bone18;
	private final ModelPart bone32;
	private final ModelPart bone4;
	private final ModelPart bone33;
	private final ModelPart bone41;
	private final ModelPart bone9;
	private final ModelPart bone34;
	private final ModelPart bone14;
	private final ModelPart bone35;
	private final ModelPart bone19;
	private final ModelPart bone36;
	private final ModelPart bone5;
	private final ModelPart bone37;
	private final ModelPart bone44;
	private final ModelPart bone10;
	private final ModelPart bone38;
	private final ModelPart bone15;
	private final ModelPart bone39;
	private final ModelPart bone20;
	private final ModelPart bone46;
	private final ModelPart bone40;
	public MakibishiModel(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone21 = root.getChild("bone21");
		this.bone43 = root.getChild("bone43");
		this.bone6 = root.getChild("bone6");
		this.bone22 = root.getChild("bone22");
		this.bone11 = root.getChild("bone11");
		this.bone23 = root.getChild("bone23");
		this.bone16 = root.getChild("bone16");
		this.bone24 = root.getChild("bone24");
		this.bone2 = root.getChild("bone2");
		this.bone25 = root.getChild("bone25");
		this.bone42 = root.getChild("bone42");
		this.bone7 = root.getChild("bone7");
		this.bone26 = root.getChild("bone26");
		this.bone12 = root.getChild("bone12");
		this.bone27 = root.getChild("bone27");
		this.bone17 = root.getChild("bone17");
		this.bone28 = root.getChild("bone28");
		this.bone3 = root.getChild("bone3");
		this.bone29 = root.getChild("bone29");
		this.bone45 = root.getChild("bone45");
		this.bone8 = root.getChild("bone8");
		this.bone30 = root.getChild("bone30");
		this.bone13 = root.getChild("bone13");
		this.bone31 = root.getChild("bone31");
		this.bone18 = root.getChild("bone18");
		this.bone32 = root.getChild("bone32");
		this.bone4 = root.getChild("bone4");
		this.bone33 = root.getChild("bone33");
		this.bone41 = root.getChild("bone41");
		this.bone9 = root.getChild("bone9");
		this.bone34 = root.getChild("bone34");
		this.bone14 = root.getChild("bone14");
		this.bone35 = root.getChild("bone35");
		this.bone19 = root.getChild("bone19");
		this.bone36 = root.getChild("bone36");
		this.bone5 = root.getChild("bone5");
		this.bone37 = root.getChild("bone37");
		this.bone44 = root.getChild("bone44");
		this.bone10 = root.getChild("bone10");
		this.bone38 = root.getChild("bone38");
		this.bone15 = root.getChild("bone15");
		this.bone39 = root.getChild("bone39");
		this.bone20 = root.getChild("bone20");
		this.bone46 = root.getChild("bone46");
		this.bone40 = root.getChild("bone40");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create().uv(0, 3).cuboid(0.5F, 0.5F, -2.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.0F, 0.5F, -0.5F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.5F, 0.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData bone21 = modelPartData.addChild("bone21", ModelPartBuilder.create().uv(0, 3).cuboid(0.5F, 0.5F, -2.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.0F, 0.5F, -0.5F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-17.0F, -0.5F, 1.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData bone43 = modelPartData.addChild("bone43", ModelPartBuilder.create().uv(0, 3).cuboid(0.5F, 0.5F, -2.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.0F, 0.5F, -0.5F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(18.0F, -0.5F, 1.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData bone6 = modelPartData.addChild("bone6", ModelPartBuilder.create().uv(0, 3).cuboid(0.5F, 0.5F, -2.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.0F, 0.5F, -0.5F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(13.0F, -0.5F, -16.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData bone22 = modelPartData.addChild("bone22", ModelPartBuilder.create().uv(0, 3).cuboid(0.5F, 0.5F, -2.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.0F, 0.5F, -0.5F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(15.0F, -0.5F, 15.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData bone11 = modelPartData.addChild("bone11", ModelPartBuilder.create().uv(0, 3).cuboid(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-11.5F, 1.5F, -17.5F, -0.7854F, 0.0F, 0.0F));

		ModelPartData bone23 = modelPartData.addChild("bone23", ModelPartBuilder.create().uv(0, 3).cuboid(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-14.5F, 1.5F, 11.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData bone16 = modelPartData.addChild("bone16", ModelPartBuilder.create().uv(0, 3).cuboid(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 1.5F, -15.5F, -0.7854F, 0.0F, 0.0F));

		ModelPartData bone24 = modelPartData.addChild("bone24", ModelPartBuilder.create().uv(0, 3).cuboid(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, 1.5F, 11.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData bone2 = modelPartData.addChild("bone2", ModelPartBuilder.create().uv(0, 3).cuboid(0.5F, 0.5F, -2.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.0F, 0.5F, -0.5F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-6.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData bone25 = modelPartData.addChild("bone25", ModelPartBuilder.create().uv(0, 3).cuboid(0.5F, 0.5F, -2.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.0F, 0.5F, -0.5F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-22.0F, -0.5F, 1.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData bone42 = modelPartData.addChild("bone42", ModelPartBuilder.create().uv(0, 3).cuboid(0.5F, 0.5F, -2.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.0F, 0.5F, -0.5F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(10.0F, -0.5F, 1.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData bone7 = modelPartData.addChild("bone7", ModelPartBuilder.create().uv(0, 3).cuboid(0.5F, 0.5F, -2.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.0F, 0.5F, -0.5F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, -0.5F, -16.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData bone26 = modelPartData.addChild("bone26", ModelPartBuilder.create().uv(0, 3).cuboid(0.5F, 0.5F, -2.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.0F, 0.5F, -0.5F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(11.0F, -0.5F, 15.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData bone12 = modelPartData.addChild("bone12", ModelPartBuilder.create().uv(0, 3).cuboid(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-17.5F, 1.5F, -15.5F, -0.7854F, 0.0F, 0.0F));

		ModelPartData bone27 = modelPartData.addChild("bone27", ModelPartBuilder.create().uv(0, 3).cuboid(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-11.5F, 1.5F, -4.5F, -0.7854F, 0.0F, 0.0F));

		ModelPartData bone17 = modelPartData.addChild("bone17", ModelPartBuilder.create().uv(0, 3).cuboid(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-6.5F, 1.5F, -15.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData bone28 = modelPartData.addChild("bone28", ModelPartBuilder.create().uv(0, 3).cuboid(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-6.5F, 1.5F, 14.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData bone3 = modelPartData.addChild("bone3", ModelPartBuilder.create().uv(0, 3).cuboid(0.5F, 0.5F, -2.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.0F, 0.5F, -0.5F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, -0.5F, 5.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData bone29 = modelPartData.addChild("bone29", ModelPartBuilder.create().uv(0, 3).cuboid(0.5F, 0.5F, -2.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.0F, 0.5F, -0.5F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-11.0F, -0.5F, 6.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData bone45 = modelPartData.addChild("bone45", ModelPartBuilder.create().uv(0, 3).cuboid(0.5F, 0.5F, -2.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.0F, 0.5F, -0.5F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(20.0F, -0.5F, 6.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData bone8 = modelPartData.addChild("bone8", ModelPartBuilder.create().uv(0, 3).cuboid(0.5F, 0.5F, -2.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.0F, 0.5F, -0.5F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(17.0F, -0.5F, -10.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData bone30 = modelPartData.addChild("bone30", ModelPartBuilder.create().uv(0, 3).cuboid(0.5F, 0.5F, -2.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.0F, 0.5F, -0.5F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(20.0F, -0.5F, 11.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData bone13 = modelPartData.addChild("bone13", ModelPartBuilder.create().uv(0, 3).cuboid(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-11.5F, 1.5F, -10.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData bone31 = modelPartData.addChild("bone31", ModelPartBuilder.create().uv(0, 3).cuboid(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-10.5F, 1.5F, 19.5F, -0.7854F, 0.0F, 0.0F));

		ModelPartData bone18 = modelPartData.addChild("bone18", ModelPartBuilder.create().uv(0, 3).cuboid(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(4.5F, 1.5F, -10.5F, -0.7854F, 0.0F, 0.0F));

		ModelPartData bone32 = modelPartData.addChild("bone32", ModelPartBuilder.create().uv(0, 3).cuboid(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, 1.5F, 17.5F, -0.7854F, 0.0F, 0.0F));

		ModelPartData bone4 = modelPartData.addChild("bone4", ModelPartBuilder.create().uv(0, 3).cuboid(0.5F, 0.5F, -2.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.0F, 0.5F, -0.5F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-6.0F, -0.5F, -5.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData bone33 = modelPartData.addChild("bone33", ModelPartBuilder.create().uv(0, 3).cuboid(0.5F, 0.5F, -2.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.0F, 0.5F, -0.5F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-19.0F, -0.5F, -4.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData bone41 = modelPartData.addChild("bone41", ModelPartBuilder.create().uv(0, 3).cuboid(0.5F, 0.5F, -2.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.0F, 0.5F, -0.5F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(14.0F, -0.5F, -4.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData bone9 = modelPartData.addChild("bone9", ModelPartBuilder.create().uv(0, 3).cuboid(0.5F, 0.5F, -2.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.0F, 0.5F, -0.5F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(9.0F, -0.5F, -20.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData bone34 = modelPartData.addChild("bone34", ModelPartBuilder.create().uv(0, 3).cuboid(0.5F, 0.5F, -2.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.0F, 0.5F, -0.5F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(10.0F, -0.5F, 10.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData bone14 = modelPartData.addChild("bone14", ModelPartBuilder.create().uv(0, 3).cuboid(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-3.5F, 1.5F, -20.5F, -0.7854F, 0.0F, 0.0F));

		ModelPartData bone35 = modelPartData.addChild("bone35", ModelPartBuilder.create().uv(0, 3).cuboid(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-20.5F, 1.5F, 9.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData bone19 = modelPartData.addChild("bone19", ModelPartBuilder.create().uv(0, 3).cuboid(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, 1.5F, -20.5F, -0.7854F, 0.0F, 0.0F));

		ModelPartData bone36 = modelPartData.addChild("bone36", ModelPartBuilder.create().uv(0, 3).cuboid(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-6.5F, 1.5F, 9.5F, -0.7854F, 0.0F, 0.0F));

		ModelPartData bone5 = modelPartData.addChild("bone5", ModelPartBuilder.create().uv(0, 3).cuboid(0.5F, 0.5F, -2.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.0F, 0.5F, -0.5F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -0.5F, 5.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData bone37 = modelPartData.addChild("bone37", ModelPartBuilder.create().uv(0, 3).cuboid(0.5F, 0.5F, -2.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.0F, 0.5F, -0.5F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-18.0F, -0.5F, 6.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData bone44 = modelPartData.addChild("bone44", ModelPartBuilder.create().uv(0, 3).cuboid(0.5F, 0.5F, -2.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.0F, 0.5F, -0.5F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(14.0F, -0.5F, 6.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData bone10 = modelPartData.addChild("bone10", ModelPartBuilder.create().uv(0, 3).cuboid(0.5F, 0.5F, -2.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.0F, 0.5F, -0.5F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(9.0F, -0.5F, -10.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData bone38 = modelPartData.addChild("bone38", ModelPartBuilder.create().uv(0, 3).cuboid(0.5F, 0.5F, -2.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.0F, 0.5F, -0.5F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.0F, 2.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(10.0F, -0.5F, 20.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData bone15 = modelPartData.addChild("bone15", ModelPartBuilder.create().uv(0, 3).cuboid(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-18.5F, 1.5F, -10.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData bone39 = modelPartData.addChild("bone39", ModelPartBuilder.create().uv(0, 3).cuboid(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-16.5F, 1.5F, 16.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData bone20 = modelPartData.addChild("bone20", ModelPartBuilder.create().uv(0, 3).cuboid(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-3.5F, 1.5F, -10.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData bone46 = modelPartData.addChild("bone46", ModelPartBuilder.create().uv(0, 3).cuboid(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(4.5F, 1.5F, -3.5F, -0.7854F, 0.0F, 0.0F));

		ModelPartData bone40 = modelPartData.addChild("bone40", ModelPartBuilder.create().uv(0, 3).cuboid(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(6, 3).cuboid(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-4.5F, 1.5F, 20.5F, 0.0F, 0.0F, 0.7854F));
		return TexturedModelData.of(modelData, 16, 16);
	}
	@Override
	public void setAngles(MakibishiEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
		bone.render(matrices, vertexConsumer, light, overlay, color);
		bone21.render(matrices, vertexConsumer, light, overlay, color);
		bone43.render(matrices, vertexConsumer, light, overlay, color);
		bone6.render(matrices, vertexConsumer, light, overlay, color);
		bone22.render(matrices, vertexConsumer, light, overlay, color);
		bone11.render(matrices, vertexConsumer, light, overlay, color);
		bone23.render(matrices, vertexConsumer, light, overlay, color);
		bone16.render(matrices, vertexConsumer, light, overlay, color);
		bone24.render(matrices, vertexConsumer, light, overlay, color);
		bone2.render(matrices, vertexConsumer, light, overlay, color);
		bone25.render(matrices, vertexConsumer, light, overlay, color);
		bone42.render(matrices, vertexConsumer, light, overlay, color);
		bone7.render(matrices, vertexConsumer, light, overlay, color);
		bone26.render(matrices, vertexConsumer, light, overlay, color);
		bone12.render(matrices, vertexConsumer, light, overlay, color);
		bone27.render(matrices, vertexConsumer, light, overlay, color);
		bone17.render(matrices, vertexConsumer, light, overlay, color);
		bone28.render(matrices, vertexConsumer, light, overlay, color);
		bone3.render(matrices, vertexConsumer, light, overlay, color);
		bone29.render(matrices, vertexConsumer, light, overlay, color);
		bone45.render(matrices, vertexConsumer, light, overlay, color);
		bone8.render(matrices, vertexConsumer, light, overlay, color);
		bone30.render(matrices, vertexConsumer, light, overlay, color);
		bone13.render(matrices, vertexConsumer, light, overlay, color);
		bone31.render(matrices, vertexConsumer, light, overlay, color);
		bone18.render(matrices, vertexConsumer, light, overlay, color);
		bone32.render(matrices, vertexConsumer, light, overlay, color);
		bone4.render(matrices, vertexConsumer, light, overlay, color);
		bone33.render(matrices, vertexConsumer, light, overlay, color);
		bone41.render(matrices, vertexConsumer, light, overlay, color);
		bone9.render(matrices, vertexConsumer, light, overlay, color);
		bone34.render(matrices, vertexConsumer, light, overlay, color);
		bone14.render(matrices, vertexConsumer, light, overlay, color);
		bone35.render(matrices, vertexConsumer, light, overlay, color);
		bone19.render(matrices, vertexConsumer, light, overlay, color);
		bone36.render(matrices, vertexConsumer, light, overlay, color);
		bone5.render(matrices, vertexConsumer, light, overlay, color);
		bone37.render(matrices, vertexConsumer, light, overlay, color);
		bone44.render(matrices, vertexConsumer, light, overlay, color);
		bone10.render(matrices, vertexConsumer, light, overlay, color);
		bone38.render(matrices, vertexConsumer, light, overlay, color);
		bone15.render(matrices, vertexConsumer, light, overlay, color);
		bone39.render(matrices, vertexConsumer, light, overlay, color);
		bone20.render(matrices, vertexConsumer, light, overlay, color);
		bone46.render(matrices, vertexConsumer, light, overlay, color);
		bone40.render(matrices, vertexConsumer, light, overlay, color);
	}
}
