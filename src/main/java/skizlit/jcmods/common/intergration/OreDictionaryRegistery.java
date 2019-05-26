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
		OreDictionary.registerOre("blockNickel", new ItemStack(JCModsBlocks.BLOCK_NICKEL));
		OreDictionary.registerOre("blockRhodium", new ItemStack(JCModsBlocks.BLOCK_RHODIUM));
		OreDictionary.registerOre("blockTanzanite", new ItemStack(JCModsBlocks.BLOCK_TANZANITE));
		
		// Dirty Dust
		OreDictionary.registerOre("dustDirtyNickel", new ItemStack(JCModsItems.DIRTY_DUST_NICKEL));
		OreDictionary.registerOre("dustDirtyRhodium", new ItemStack(JCModsItems.DIRTY_DUST_RHODIUM));
		
		// Dust
		OreDictionary.registerOre("dustNickel", new ItemStack(JCModsItems.DUST_NICKEL));
		OreDictionary.registerOre("dustRhodium", new ItemStack(JCModsItems.DUST_RHODIUM));
		OreDictionary.registerOre("dustTanzanite", new ItemStack(JCModsItems.DUST_TANZANITE));
		
		// Gem
		OreDictionary.registerOre("gemTanzanite", new ItemStack(JCModsItems.GEM_TANZANITE));
		
		// Ingot
		OreDictionary.registerOre("ingotNickel", new ItemStack(JCModsItems.INGOT_NICKEL));
		OreDictionary.registerOre("ingotRhodium", new ItemStack(JCModsItems.INGOT_RHODIUM));
		
		// Nugget
		OreDictionary.registerOre("nuggetNickel", new ItemStack(JCModsItems.NUGGET_NICKEL));
		OreDictionary.registerOre("nuggetRhodium", new ItemStack(JCModsItems.NUGGET_RHODIUM));
		
		// Ores
		OreDictionary.registerOre("oreNickel", new ItemStack(JCModsBlocks.ORE_NICKEL));
		OreDictionary.registerOre("oreRhodium", new ItemStack(JCModsBlocks.ORE_RHODIUM));
		OreDictionary.registerOre("oreTanzanite", new ItemStack(JCModsBlocks.BLOCK_TANZANITE));
	}
}
