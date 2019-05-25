package skizlit.jcmods.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BasicBlock extends BlockBaseJCMods{
	
	public BasicBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(this.getBasicBlockHardness());
		setResistance(this.getBasicBlockResistance());
		setHarvestLevel("pickaxe", this.getBasicBlockHarvestLevel());
	}
	
	public float getBasicBlockResistance() {
		return 30;
	}
	
	public float getBasicBlockHardness() {
		return 5;
	}
	
	public int getBasicBlockHarvestLevel() {
		return 2;
	}
}