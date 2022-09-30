package net.arcteam.arcmods.toolItems;

import net.arcteam.arcmods.MinersWorld;
import net.arcteam.arcmods.customToolItemClasses.radium.RadiumAxeItem;
import net.arcteam.arcmods.customToolItemClasses.radium.RadiumHoeItem;
import net.arcteam.arcmods.customToolItemClasses.radium.RadiumPickaxeItem;
import net.arcteam.arcmods.customToolItemClasses.radium.RadiumShovelItem;
import net.arcteam.arcmods.customToolItemClasses.radium.RadiumSwordItem;
import net.arcteam.arcmods.toolMaterials.RadiumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RadiumToolItems {
    
    public static ToolItem RADIUM_SWORD = new RadiumSwordItem(RadiumToolMaterial.INSTANCE, 1, -2.4f, new Item.Settings().group(MinersWorld.MINERS_WORLD));
    public static ToolItem RADIUM_PICKAXE = new RadiumPickaxeItem(RadiumToolMaterial.INSTANCE, -2, 2.8f, new Item.Settings().group(MinersWorld.MINERS_WORLD));
    public static ToolItem RADIUM_AXE = new RadiumAxeItem(RadiumToolMaterial.INSTANCE, 3, -3.1f, new Item.Settings().group(MinersWorld.MINERS_WORLD));
    public static ToolItem RADIUM_SHOVEL = new RadiumShovelItem(RadiumToolMaterial.INSTANCE, -3, -3f, new Item.Settings().group(MinersWorld.MINERS_WORLD));
    public static ToolItem RADIUM_HOE = new RadiumHoeItem(RadiumToolMaterial.INSTANCE, -6, -1f, new Item.Settings().group(MinersWorld.MINERS_WORLD));

    public static void register() {

        Registry.register(Registry.ITEM, new Identifier("minersworld", "radium_sword"), RADIUM_SWORD);
        Registry.register(Registry.ITEM, new Identifier("minersworld", "radium_pickaxe"), RADIUM_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("minersworld", "radium_axe"), RADIUM_AXE);
        Registry.register(Registry.ITEM, new Identifier("minersworld", "radium_shovel"), RADIUM_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("minersworld", "radium_hoe"), RADIUM_HOE);

    }

}
