package skizlit.jcmods.common.blocks;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import skizlit.jcmods.common.JCModsItems;
import skizlit.jcmods.common.util.interfaces.IMetaBlock;

public class BlockTanzaniteOre extends BlockBaseJCMods implements IMetaBlock {
	
	protected Item bDroppedItem;
	
	public BlockTanzaniteOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(this.getBlockResistance());
		setResistance(this.getBlockHardness());
		setHarvestLevel("pickaxe", this.getBlockHarvestLevel());
	}
	
	@Override
	public String getTexture() {
		return this.getTranslationKey();
	}
	
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {	
		return new ItemStack(JCModsItems.GEM, 1, 0).getItem();
    }
	
	@Override
	public float getBlockResistance() {
		return 15;
	}
	
	@Override
	public float getBlockHardness() {
		return 1.5f;
	}
	
	@Override
	public int getBlockHarvestLevel() {
		return 2;
	}
}
