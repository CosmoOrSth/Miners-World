package net.arcteam.arcmods.items;


import net.arcteam.arcmods.MinersWorld;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NuclearPastaItems {

    public static final Item ITALY = new Item(new FabricItemSettings().group(MinersWorld.MINERS_WORLD));

    public static void register() {

        Registry.register(Registry.ITEM, new Identifier("minersworld", "italy"), ITALY);

    }
    
}
