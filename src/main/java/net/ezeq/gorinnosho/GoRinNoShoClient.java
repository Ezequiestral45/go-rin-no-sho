package net.ezeq.gorinnosho;

import net.ezeq.gorinnosho.client.MakibishiModel;
import net.ezeq.gorinnosho.client.MakibishiRenderer;
import net.ezeq.gorinnosho.client.ModModelLayers;
import net.ezeq.gorinnosho.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class GoRinNoShoClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.MAKIBISHI_LAYER, MakibishiModel::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.MAKIBISHI, MakibishiRenderer::new);
    }
}
