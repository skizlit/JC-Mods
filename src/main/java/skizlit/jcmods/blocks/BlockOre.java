package skizlit.jcmods.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockOre extends BlockBaseJCMods{
	
	public BlockOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(this.getOreBlockHardness());
		setResistance(this.getOreBlockResistance());
		setHarvestLevel("pickaxe", this.getOreBlockHarvestLevel());
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
