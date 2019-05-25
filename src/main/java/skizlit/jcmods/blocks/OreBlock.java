package skizlit.jcmods.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class OreBlock extends BlockBaseJCMods{

	public OreBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(30f);
		setHarvestLevel("pickaxe", 2);
	}
}
