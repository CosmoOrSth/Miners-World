package net.arcteam.arcmods.items;

import net.arcteam.arcmods.MinersWorld;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AmongusItems {

    public static final Item AMONGUS = new Item(new FabricItemSettings().group(MinersWorld.MINERS_WORLD)
    .food(new FoodComponent.Builder().hunger(20).saturationModifier(20.0f).alwaysEdible()
    .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20*300), 1.0f )
    .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20*300, 2), 1.0f )
    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20*300, 4), 1.0f )
    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*300, 3), 1.0f )
    .build()));

    public static final Item AMONGUS_TORSO = new Item(new FabricItemSettings().group(MinersWorld.MINERS_WORLD));
    public static final Item AMONGUS_OXYGEN_TANK = new Item(new FabricItemSettings().group(MinersWorld.MINERS_WORLD));
    public static final Item AMONGUS_VISOR = new Item(new FabricItemSettings().group(MinersWorld.MINERS_WORLD));
    public static final Item AMONGUS_HEAD = new Item(new FabricItemSettings().group(MinersWorld.MINERS_WORLD));
    public static final Item AMONGUS_LEGS = new Item(new FabricItemSettings().group(MinersWorld.MINERS_WORLD));
 
    public static void register() {

        Registry.register(Registry.ITEM, new Identifier("minersworld", "amongus"), AMONGUS);
        Registry.register(Registry.ITEM, new Identifier("minersworld", "amongus_torso"), AMONGUS_TORSO);
        Registry.register(Registry.ITEM, new Identifier("minersworld", "amongus_oxygen_tank"), AMONGUS_OXYGEN_TANK);
        Registry.register(Registry.ITEM, new Identifier("minersworld", "amongus_visor"), AMONGUS_VISOR);
        Registry.register(Registry.ITEM, new Identifier("minersworld", "amongus_head"), AMONGUS_HEAD);
        Registry.register(Registry.ITEM, new Identifier("minersworld", "amongus_legs"), AMONGUS_LEGS);
        
    }
    
}
