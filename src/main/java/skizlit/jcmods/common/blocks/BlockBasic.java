package skizlit.jcmods.common.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import skizlit.jcmods.common.util.interfaces.IMetaBlock;

public class BlockBasic extends BlockBaseJCMods implements IMetaBlock {
	
	public BlockBasic(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(this.getBlockResistance());
		setResistance(this.getBlockHardness());
		setHarvestLevel("pickaxe", this.getBlockHarvestLevel());
	}
	
	@Override
	public String getTexture() {
		return this.getTranslationKey();
	}
	
	@Override
	public float getBlockResistance() {
		return 30;
	}
	
	@Override
	public float getBlockHardness() {
		return 3;
	}
	
	@Override
	public int getBlockHarvestLevel() {
		return 2;
	}
}