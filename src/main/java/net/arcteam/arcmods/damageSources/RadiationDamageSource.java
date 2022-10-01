package net.arcteam.arcmods.damageSources;

import net.minecraft.entity.damage.DamageSource;

public class RadiationDamageSource extends DamageSource {

    protected RadiationDamageSource() {
        super("radiation");
    }

    public static final DamageSource RADIATION = (new RadiationDamageSource().setBypassesArmor());
    
}
