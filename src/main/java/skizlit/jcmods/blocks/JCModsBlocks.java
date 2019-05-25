package skizlit.jcmods.blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import skizlit.jcmods.item.BlockBaseJCMods;

public class JCModsBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	// Ore
	public static final Block ORE_NICKEL = new BlockBaseJCMods("oreNickel", Material.IRON);
	public static final Block ORE_RHODIUM = new BlockBaseJCMods("oreRhodium", Material.IRON);
	public static final Block ORE_TANZANITE = new BlockBaseJCMods("oreTanzanite", Material.IRON);
	
	// Block
	public static final Block BLOCK_NICKEL = new BlockBaseJCMods("blockNickel", Material.IRON);
	public static final Block BLOCK_RHODIUM = new BlockBaseJCMods("blockRhodium", Material.IRON);
	public static final Block BLOCK_TANZANITE = new BlockBaseJCMods("blockTanzanite", Material.IRON);
}
