package skizlit.jcmods.common.blocks;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import skizlit.jcmods.common.JCModsItems;

public class BlockTanzaniteOre extends BlockBaseJCMods{
	
	protected Item bDroppedItem;
	
	public BlockTanzaniteOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(this.getOreBlockHardness());
		setResistance(this.getOreBlockResistance());
		setHarvestLevel("pickaxe", this.getOreBlockHarvestLevel());
	}
	
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {		
		return JCModsItems.GEM_TANZANITE;
    }
	
	public float getOreBlockResistance() {
		return 15;
	}
	
	public float getOreBlockHardness() {
		return 3;
	}
	
	public int getOreBlockHarvestLevel() {
		return 2;
	}
}
