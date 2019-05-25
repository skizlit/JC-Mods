package skizlit.jcmods.item;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import skizlit.jcmods.blocks.JCModsBlocks;
import skizlit.jcmods.common.JCMods;
import skizlit.jcmods.common.JCModsItems;
import skizlit.jcmods.util.IModelled;

public class BlockBaseJCMods extends Block implements IModelled{

	public BlockBaseJCMods(String name, Material material) {
		super(material);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(JCMods.tabJCMods);
        
        JCModsBlocks.BLOCKS.add(this);
        JCModsItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		JCMods.proxy.registerItem(Item.getItemFromBlock(this), 0, "Inventory");
	}
}
