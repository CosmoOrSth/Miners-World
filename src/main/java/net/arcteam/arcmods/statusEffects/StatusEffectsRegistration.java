package net.arcteam.arcmods.statusEffects;

import net.arcteam.arcmods.statusEffects.effectClasses.RadiationPoisoningEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class StatusEffectsRegistration {

    public static final StatusEffect RADIATION_POISONING = new RadiationPoisoningEffect();

    public static void register() {

        Registry.register(Registry.STATUS_EFFECT, new Identifier("minersworld", "radiation_poisoning"), RADIATION_POISONING);

    }
    
}
