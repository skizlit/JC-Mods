package skizlit.jcmods.common.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import skizlit.jcmods.common.JCMods;
import skizlit.jcmods.common.JCModsBlocks;
import skizlit.jcmods.common.JCModsItems;

public class BlockBaseJCMods extends Block {

	public BlockBaseJCMods(String name, Material material) {
		super(material);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(JCMods.tabJCMods);
        
        JCModsBlocks.BLOCKS.add(this);
        JCModsItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(this);
    }
}
