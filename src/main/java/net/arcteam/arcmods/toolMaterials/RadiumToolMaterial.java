package net.arcteam.arcmods.toolMaterials;

import net.arcteam.arcmods.items.RadiumItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class RadiumToolMaterial implements ToolMaterial {

    public static final RadiumToolMaterial INSTANCE = new RadiumToolMaterial();

    @Override
    public int getDurability() {
        return 1561;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 8.0F;
    }
    @Override
    public float getAttackDamage() {
        return 7.0F;
    }
    @Override
    public int getMiningLevel() {
        return 4;
    }
    @Override
    public int getEnchantability() {
        return 24;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(RadiumItems.RADIUM_INGOT);
    }

}