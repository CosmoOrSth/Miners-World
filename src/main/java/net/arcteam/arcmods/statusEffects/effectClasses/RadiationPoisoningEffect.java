package net.arcteam.arcmods.statusEffects.effectClasses;

import net.arcteam.arcmods.damageSources.RadiationDamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class RadiationPoisoningEffect extends StatusEffect {
    public RadiationPoisoningEffect() {
        super(
          StatusEffectCategory.HARMFUL, 
          0x3be012
          ); 
      }
     
      @Override
      public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
      }
     
      @Override
      public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        
            entity.damage(RadiationDamageSource.RADIATION, 2+amplifier);
        
      }
    
}
