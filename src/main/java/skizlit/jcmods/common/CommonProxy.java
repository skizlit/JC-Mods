package skizlit.jcmods.common;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import skizlit.jcmods.common.blocks.machines.tileentity.TileEntityCobbleGenerator;

public class CommonProxy {
		
	public void registerItem(Item item, int meta, String id) {}
	public void registerItemModels() {}
	public void registerItemBlocksModels() {}
	
	public void updateBlockStats() {
		//Set Harvest Levels
		JCModsBlocks.BLOCK_CERIUM.setHarvestLevel("pickaxe", 1);
		JCModsBlocks.ORE_CERIUM.setHarvestLevel("pickaxe", 1);
	}	
	
	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityCobbleGenerator.class, new ResourceLocation(JCMods.MOD_ID, "cobblestone_generator"));
	}
}
