package net.arcteam.arcmods.armorMaterials;

import net.arcteam.arcmods.items.RadiumItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class RadiumArmorMaterial implements ArmorMaterial {

    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
	private static final int[] PROTECTION_VALUES = new int[] {4, 7, 9, 4}; 

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 10;
    }

    @Override
    public int getEnchantability() {
        return 24;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }

    @Override
    public String getName() {
        return "Radium";
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(RadiumItems.RADIUM_INGOT);
    }

    @Override
    public float getToughness() {
        return 3.0f;
    }
    
}
