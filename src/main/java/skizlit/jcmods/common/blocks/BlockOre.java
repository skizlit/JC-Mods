package skizlit.jcmods.common.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import skizlit.jcmods.common.util.interfaces.IMetaBlock;

public class BlockOre extends BlockBaseJCMods implements IMetaBlock{
	
	public BlockOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(getBlockResistance());
		setResistance(this.getBlockHardness());
		setHarvestLevel("pickaxe", this.getBlockHarvestLevel());
	}
	
	@Override
	public String getTexture() {
		return this.getTranslationKey();
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
