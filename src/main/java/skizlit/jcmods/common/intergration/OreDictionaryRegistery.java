package skizlit.jcmods.common.intergration;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import skizlit.jcmods.common.util.Refrences;

public class OreDictionaryRegistery {

	public static void registerOres() {
		
		/*
		 * Don't register Final Items eg: Armors or Tools
		 */
		
		// Blocks
		OreDictionary.registerOre("blockCerium", new ItemStack(Refrences.BLOCK_CERIUM));
		OreDictionary.registerOre("blockRhodium", new ItemStack(Refrences.BLOCK_RHODIUM));
		OreDictionary.registerOre("blockTanzanite", new ItemStack(Refrences.BLOCK_TANZANITE));
		
		// Dirty Dust
		OreDictionary.registerOre("dustDirtyCerium", new ItemStack(Refrences.DUST_DIRTY_CERIUM));
		OreDictionary.registerOre("dustDirtyRhodium", new ItemStack(Refrences.DUST_DIRTY_RHODIUM));
		
		// Dust
		OreDictionary.registerOre("dustCerium", new ItemStack(Refrences.DUST_CERIUM));
		OreDictionary.registerOre("dustRhodium", new ItemStack(Refrences.DUST_RHODIUM));
		OreDictionary.registerOre("dustTanzanite", new ItemStack(Refrences.DUST_TANZANITE));
		
		// Gem
		OreDictionary.registerOre("gemTanzanite", new ItemStack(Refrences.GEM_TANZANITE));
		
		// Ingot
		OreDictionary.registerOre("ingotCerium", new ItemStack(Refrences.INGOT_CERIUM));
		OreDictionary.registerOre("ingotRhodium", new ItemStack(Refrences.INGOT_RHODIUM));
		
		// Nugget
		OreDictionary.registerOre("nuggetCerium", new ItemStack(Refrences.NUGGET_CERIUM));
		OreDictionary.registerOre("nuggetRhodium", new ItemStack(Refrences.NUGGET_RHODIUM));
		
		// Ores
		OreDictionary.registerOre("oreCerium", new ItemStack(Refrences.ORE_CERIUM));
		OreDictionary.registerOre("oreCerium", new ItemStack(Refrences.ORE_END_CERIUM));
		OreDictionary.registerOre("oreCerium", new ItemStack(Refrences.ORE_NETHER_CERIUM));
		
		OreDictionary.registerOre("oreRhodium", new ItemStack(Refrences.ORE_RHODIUM));
		OreDictionary.registerOre("oreRhodium", new ItemStack(Refrences.ORE_END_RHODIUM));
		OreDictionary.registerOre("oreRhodium", new ItemStack(Refrences.ORE_NETHER_RHODIUM));
		
		OreDictionary.registerOre("oreTanzanite", new ItemStack(Refrences.ORE_TANZANITE));
		OreDictionary.registerOre("oreTanzanite", new ItemStack(Refrences.ORE_END_TANZANITE));
		OreDictionary.registerOre("oreTanzanite", new ItemStack(Refrences.ORE_NETHER_TANZANITE));
	}
}
