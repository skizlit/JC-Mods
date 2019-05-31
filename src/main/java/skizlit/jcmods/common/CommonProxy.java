package skizlit.jcmods.common;

import net.minecraft.item.Item;

public class CommonProxy {
		
	public void registerItem(Item item, int meta, String id) {}
	public void registerItemModels() {}
	public void registerItemBlocksModels() {}
	
	public void updateBlockStats() {
		//Set Harvest Levels
		JCModsBlocks.BLOCK_CERIUM.setHarvestLevel("pickaxe", 1);
		JCModsBlocks.ORE_CERIUM.setHarvestLevel("pickaxe", 1);
	}	
}
