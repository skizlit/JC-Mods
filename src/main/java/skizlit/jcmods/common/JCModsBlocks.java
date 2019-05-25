package skizlit.jcmods.common;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import skizlit.jcmods.blocks.BasicBlock;
import skizlit.jcmods.blocks.BlockBaseJCMods;
import skizlit.jcmods.util.IModelled;

public class JCModsBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	// Ore
	public static final Block ORE_NICKEL = new BlockBaseJCMods("oreNickel", Material.ROCK);
	public static final Block ORE_RHODIUM = new BlockBaseJCMods("oreRhodium", Material.ROCK);
	public static final Block ORE_TANZANITE = new BlockBaseJCMods("oreTanzanite", Material.ROCK);
	
	// Block
	public static final Block BLOCK_NICKEL = new BasicBlock("blockNickel", Material.IRON);
	public static final Block BLOCK_RHODIUM = new BasicBlock("blockRhodium", Material.IRON);
	public static final Block BLOCK_TANZANITE = new BasicBlock("blockTanzanite", Material.IRON);
}
