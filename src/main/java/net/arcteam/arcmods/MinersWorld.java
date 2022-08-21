package net.arcteam.arcmods;

import net.arcteam.arcmods.blocks.OreBlocks;
import net.arcteam.arcmods.items.AmongusItems;
import net.arcteam.arcmods.items.NuclearPastaItems;
import net.arcteam.arcmods.worldGeneration.AmongusOre;
import net.arcteam.arcmods.worldGeneration.DeepslateAmongusOre;
import net.arcteam.arcmods.worldGeneration.DeepslateItalyOre;
import net.arcteam.arcmods.worldGeneration.ItalyOre;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinersWorld implements ModInitializer {

	public static final ItemGroup MINERS_WORLD = FabricItemGroupBuilder.build(
        new Identifier("minersworld", "miners_world"),
        () -> new ItemStack(AmongusItems.AMONGUS));

	public static final Logger LOGGER = LoggerFactory.getLogger("minersworld");

	@Override
	public void onInitialize() {

		LOGGER.info("Am Alive, WOOOOOOOOOOOOOOOOOO!!!!1!!1!");

		AmongusItems.register();
		NuclearPastaItems.register();
		OreBlocks.register();
		AmongusOre.register();
		DeepslateAmongusOre.register();
		ItalyOre.register();
		DeepslateItalyOre.register();

	}
}
