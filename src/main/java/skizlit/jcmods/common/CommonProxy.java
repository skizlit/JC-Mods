package skizlit.jcmods.common;

import net.minecraft.item.Item;
import skizlit.jcmods.common.util.Refrences;

public class CommonProxy {
		
	public void registerItem(Item item, int meta, String id) {}
	public void registerItemModels() {}
	public void registerItemBlocksModels() {}
	
	public void updateBlockStats() {
		//Set Harvest Levels
		Refrences.BLOCK_CERIUM.setHarvestLevel("pickaxe", 1);
		Refrences.ORE_CERIUM.setHarvestLevel("pickaxe", 1);
	}	
}
