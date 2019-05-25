package skizlit.jcmods.client;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import skizlit.jcmods.common.CommonProxy;
import skizlit.jcmods.common.JCModsBlocks;
import skizlit.jcmods.common.JCModsItems;
import skizlit.jcmods.common.util.IModelled;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerItem(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
		
	@Override
	public void registerItemModels() {
		for(Item item : JCModsItems.ITEMS) {
			if (item instanceof IModelled) {
				((IModelled)item).registerModels();
			}
		}
	}
	
	@Override
	public void registerItemBlocksModels() {
		for(Block block : JCModsBlocks.BLOCKS) {
			if (block instanceof IModelled) {
				((IModelled)block).registerModels();
			}
		}
	}
}
