package net.arcteam.arcmods.customToolItemClasses.radium;

import net.arcteam.arcmods.statusEffects.StatusEffectsRegistration;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;

public class RadiumAxeItem extends AxeItem {
    
    public RadiumAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffectsRegistration.RADIATION_POISONING, 60, 3));
        return super.postHit(stack, target, attacker);
    }

}
