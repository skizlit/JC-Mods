package skizlit.jcmods.common;

import net.minecraft.item.Item;

public class CommonProxy {
		
	public void registerItem(Item item, int meta, String id) {}
	public void registerItemModels() {}
	public void registerItemBlocksModels() {}
	
	public void updateBlockStats() {
		JCModsBlocks.BLOCK_NICKEL.setHarvestLevel("pickaxe", 1);
	}	
}
