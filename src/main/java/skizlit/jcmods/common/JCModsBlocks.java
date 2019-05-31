package skizlit.jcmods.common;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import skizlit.jcmods.common.blocks.BlockBasic;
import skizlit.jcmods.common.blocks.BlockOre;
import skizlit.jcmods.common.blocks.BlockTanzaniteOre;

public class JCModsBlocks {
	
	// Blocks Array
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	// Block
	public static final Block BLOCK_CERIUM = new BlockBasic("blockCerium", Material.IRON);
	public static final Block BLOCK_RHODIUM = new BlockBasic("blockRhodium", Material.IRON);
	public static final Block BLOCK_TANZANITE = new BlockBasic("blockTanzanite", Material.IRON);
	
	// Ore
	public static final Block ORE_CERIUM = new BlockOre("oreCerium", Material.ROCK);
	public static final Block ORE_END_CERIUM = new BlockOre("oreEndCerium", Material.ROCK);
	public static final Block ORE_NETHER_CERIUM = new BlockOre("oreNetherCerium", Material.ROCK);
	public static final Block ORE_RHODIUM = new BlockOre("oreRhodium", Material.ROCK);
	public static final Block ORE_END_RHODIUM = new BlockOre("oreEndRhodium", Material.ROCK);
	public static final Block ORE_NETHER_RHODIUM = new BlockOre("oreNetherRhodium", Material.ROCK);
	public static final Block ORE_TANZANITE = new BlockTanzaniteOre("oreTanzanite", Material.ROCK);
	public static final Block ORE_END_TANZANITE = new BlockTanzaniteOre("oreEndTanzanite", Material.ROCK);
	public static final Block ORE_NETHER_TANZANITE = new BlockTanzaniteOre("oreNetherTanzanite", Material.ROCK);
}
