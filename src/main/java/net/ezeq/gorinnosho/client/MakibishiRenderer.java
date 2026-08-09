package net.ezeq.gorinnosho.client;

import net.ezeq.gorinnosho.entity.MakibishiEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.client.render.OverlayTexture;

public class MakibishiRenderer extends EntityRenderer<MakibishiEntity> {
    private final MakibishiModel model;

    public MakibishiRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.model = new MakibishiModel(context.getPart(ModModelLayers.MAKIBISHI_LAYER));
    }

    @Override
    public void render(MakibishiEntity entity, float yaw, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
        matrices.push();
        matrices.translate(0.0D, 0.0D, 0.0D);

        var vertexConsumer = vertexConsumers.getBuffer(this.model.getLayer(this.getTexture(entity)));
        this.model.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV, 0xFFFFFFFF);

        matrices.pop();
        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
    }

    @Override
    public Identifier getTexture(MakibishiEntity entity) {
        // src/main/resources/assets/go-rin-no-sho/textures/entity/makibishitextures.png
        return Identifier.of("go-rin-no-sho", "textures/entity/makibishitextures.png");
    }
}
