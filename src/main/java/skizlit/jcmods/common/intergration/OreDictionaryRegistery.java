package skizlit.jcmods.common.intergration;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import skizlit.jcmods.common.JCModsBlocks;
import skizlit.jcmods.common.JCModsItems;

public class OreDictionaryRegistery {

	public static void registerOres() {
		
		/*
		 * Don't register Final Items eg: Armors or Tools
		 */
		
		// Blocks
		OreDictionary.registerOre("blockCerium", new ItemStack(JCModsBlocks.BLOCK_CERIUM));
		OreDictionary.registerOre("blockRhodium", new ItemStack(JCModsBlocks.BLOCK_RHODIUM));
		OreDictionary.registerOre("blockTanzanite", new ItemStack(JCModsBlocks.BLOCK_TANZANITE));
		
		// Dirty Dust
		OreDictionary.registerOre("dustDirtyCerium", new ItemStack(JCModsItems.DUST_DIRTY, 1, 0));
		OreDictionary.registerOre("dustDirtyRhodium", new ItemStack(JCModsItems.DUST_DIRTY, 1, 1));
		
		// Dust
		OreDictionary.registerOre("dustCerium", new ItemStack(JCModsItems.DUST, 1, 0));
		OreDictionary.registerOre("dustRhodium", new ItemStack(JCModsItems.DUST, 1, 1));
		OreDictionary.registerOre("dustTanzanite", new ItemStack(JCModsItems.DUST, 1, 2));
		
		// Gem
		OreDictionary.registerOre("gemTanzanite", new ItemStack(JCModsItems.GEM, 1, 0));
		
		// Ingot
		OreDictionary.registerOre("ingotCerium", new ItemStack(JCModsItems.INGOT, 1, 0));
		OreDictionary.registerOre("ingotRhodium", new ItemStack(JCModsItems.INGOT, 1, 1));
		
		// Nugget
		OreDictionary.registerOre("nuggetCerium", new ItemStack(JCModsItems.NUGGET, 1, 0));
		OreDictionary.registerOre("nuggetRhodium", new ItemStack(JCModsItems.NUGGET, 1, 1));
		
		// Ores
		OreDictionary.registerOre("oreCerium", new ItemStack(JCModsBlocks.ORE_CERIUM));
		OreDictionary.registerOre("oreCerium", new ItemStack(JCModsBlocks.ORE_END_CERIUM));
		OreDictionary.registerOre("oreCerium", new ItemStack(JCModsBlocks.ORE_NETHER_CERIUM));
		
		OreDictionary.registerOre("oreRhodium", new ItemStack(JCModsBlocks.ORE_RHODIUM));
		OreDictionary.registerOre("oreRhodium", new ItemStack(JCModsBlocks.ORE_END_RHODIUM));
		OreDictionary.registerOre("oreRhodium", new ItemStack(JCModsBlocks.ORE_NETHER_RHODIUM));
		
		OreDictionary.registerOre("oreTanzanite", new ItemStack(JCModsBlocks.ORE_TANZANITE));
		OreDictionary.registerOre("oreTanzanite", new ItemStack(JCModsBlocks.ORE_END_TANZANITE));
		OreDictionary.registerOre("oreTanzanite", new ItemStack(JCModsBlocks.ORE_NETHER_TANZANITE));
	}
}
