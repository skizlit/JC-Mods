package skizlit.jcmods.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RhodiumBlock extends BlockBaseJCMods{

	public RhodiumBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
	}

}
