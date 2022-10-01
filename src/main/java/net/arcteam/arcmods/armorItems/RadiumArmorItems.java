package net.arcteam.arcmods.armorItems;

import net.arcteam.arcmods.MinersWorld;
import net.arcteam.arcmods.armorMaterials.RadiumArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RadiumArmorItems {

    public static final ArmorMaterial RADIUM_ARMOR_MATERIAL = new RadiumArmorMaterial();

    public static final Item RADIUM_HELMET = new ArmorItem(RADIUM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(MinersWorld.MINERS_WORLD));
    public static final Item RADIUM_CHESTPLATE = new ArmorItem(RADIUM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(MinersWorld.MINERS_WORLD));
    public static final Item RADIUM_LEGGINGS = new ArmorItem(RADIUM_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(MinersWorld.MINERS_WORLD));
    public static final Item RADIUM_BOOTS = new ArmorItem(RADIUM_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(MinersWorld.MINERS_WORLD));

    public static void register() {

        Registry.register(Registry.ITEM, new Identifier("minersworld", "radium_helmet"), RADIUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier("minersworld", "radium_chestplate"), RADIUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("minersworld", "radium_leggings"), RADIUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("minersworld", "radium_boots"), RADIUM_BOOTS);

    }
    
}
