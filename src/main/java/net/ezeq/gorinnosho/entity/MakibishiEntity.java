package net.ezeq.gorinnosho.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.world.World;
import net.spell_engine.entity.SpellCloud;

public class MakibishiEntity extends SpellCloud {

    public MakibishiEntity(EntityType<? extends SpellCloud> type, World world) {
        super(type, world);
        this.intersectionChecked = true;
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        super.initDataTracker(builder);
    }

    @Override
    public void onImpactPerformed(net.minecraft.entity.LivingEntity owner, net.minecraft.world.World world, net.spell_engine.api.spell.Spell.Delivery.Cloud cloudData, net.spell_engine.internals.SpellHelper.ImpactContext context) {
        super.onImpactPerformed(owner, world, cloudData, context);
    }

    @Override
    public boolean canHit() {
        return false;
    }
}
