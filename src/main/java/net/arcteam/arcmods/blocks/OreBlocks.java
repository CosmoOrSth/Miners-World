package net.arcteam.arcmods.blocks;

import net.arcteam.arcmods.MinersWorld;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class OreBlocks{

    public static final Block AMONGUS_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool());
    public static final Block DEEPSLATE_AMONGUS_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool());

    public static final Block RADIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool());
    public static final Block DEEPSLATE_RADIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool());

    public static void register() {

        //blocks

        Registry.register(Registry.BLOCK, new Identifier("minersworld", "amongus_ore"), AMONGUS_ORE);
        Registry.register(Registry.BLOCK, new Identifier("minersworld", "deepslate_amongus_ore"), DEEPSLATE_AMONGUS_ORE);

        Registry.register(Registry.BLOCK, new Identifier("minersworld", "radium_ore"), RADIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier("minersworld", "deepslate_radium_ore"), DEEPSLATE_RADIUM_ORE);

        //blockitems

        Registry.register(Registry.ITEM, new Identifier("minersworld", "amongus_ore"), new BlockItem(AMONGUS_ORE, new FabricItemSettings().group(MinersWorld.MINERS_WORLD)));
        Registry.register(Registry.ITEM, new Identifier("minersworld", "deepslate_amongus_ore"), new BlockItem(DEEPSLATE_AMONGUS_ORE, new FabricItemSettings().group(MinersWorld.MINERS_WORLD)));

        Registry.register(Registry.ITEM, new Identifier("minersworld", "radium_ore"), new BlockItem(RADIUM_ORE, new FabricItemSettings().group(MinersWorld.MINERS_WORLD)));
        Registry.register(Registry.ITEM, new Identifier("minersworld", "deepslate_radium_ore"), new BlockItem(DEEPSLATE_RADIUM_ORE, new FabricItemSettings().group(MinersWorld.MINERS_WORLD)));

    }
    
}
