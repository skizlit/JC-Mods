package skizlit.jcmods.common;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import skizlit.jcmods.blocks.BlockBasic;
import skizlit.jcmods.blocks.BlockGemOre;
import skizlit.jcmods.blocks.BlockOre;

public class JCModsBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	// Ore
	public static final Block ORE_NICKEL = new BlockOre("oreNickel", Material.ROCK);
	public static final Block ORE_RHODIUM = new BlockOre("oreRhodium", Material.ROCK);
	public static final Block ORE_TANZANITE = new BlockGemOre("oreTanzanite", Material.ROCK);
	
	// Block
	public static final Block BLOCK_NICKEL = new BlockBasic("blockNickel", Material.IRON);
	public static final Block BLOCK_RHODIUM = new BlockBasic("blockRhodium", Material.IRON);
	public static final Block BLOCK_TANZANITE = new BlockBasic("blockTanzanite", Material.IRON);
}
