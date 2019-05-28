package skizlit.jcmods.client;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import skizlit.jcmods.client.rendering.JCModsRenderer;
import skizlit.jcmods.common.CommonProxy;
import skizlit.jcmods.common.JCMods;
import skizlit.jcmods.common.JCModsBlocks;
import skizlit.jcmods.common.JCModsItems;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
			
	@Override
	public void registerItemModels() {
		for(Item item : JCModsItems.ITEMS) {
			JCModsRenderer.registerItemRender(JCMods.MOD_ID, item);
		}
	}
		
	@Override
	public void registerItemBlocksModels() {
		for(Block block : JCModsBlocks.BLOCKS) {
			JCModsRenderer.registerBlockRender(JCMods.MOD_ID, block);
		}
	}
}
