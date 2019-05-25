package skizlit.jcmods.blocks;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import skizlit.jcmods.common.JCModsItems;

public class BlockGemOre extends BlockBaseJCMods{
	
	protected Item bDroppedItem;
	
	public BlockGemOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(this.getOreBlockHardness());
		setResistance(this.getOreBlockResistance());
		setHarvestLevel("pickaxe", this.getOreBlockHarvestLevel());
		
		setOreItemDropped(name);
	}
	
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {		
		return JCModsItems.GEM_TANZANITE;
    }
	
	public void setOreItemDropped(String name) {		
		bDroppedItem = Item.getItemFromBlock(this);
		
		if (name.equals("blockTanzanite")) {
			bDroppedItem = JCModsItems.GEM_TANZANITE;
		}
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
