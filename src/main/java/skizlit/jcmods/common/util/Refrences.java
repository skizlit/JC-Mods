package skizlit.jcmods.common.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import skizlit.jcmods.common.JCModsBlocks;
import skizlit.jcmods.common.JCModsItems;
import skizlit.jcmods.common.item.materials.JCModsMaterials;

public class Refrences {
	
	/*
	 * Item Maps for Creation
	 */
	public static String[] coreTypes = {"Cerium", "Rhodium"};
	public static String[] dustTypes = {"Cerium", "Rhodium", "Tanzanite"};
	public static String[] gemTypes = {"Tanzanite"};
	
	/*
	 * Materials
	 */
	public static final ToolMaterial TOOL_CERIUM = JCModsMaterials.TOOL_MATERIAL_CERIUM;
	public static final ToolMaterial TOOL_RHODIUM = JCModsMaterials.TOOL_MATERIAL_RHODIUM;
	public static final ToolMaterial TOOL_TANZANITE = JCModsMaterials.TOOL_MATERIAL_TANZANITE;
	
	public static final ArmorMaterial ARMOR_CERIUM = JCModsMaterials.ARMOR_MATERIAL_CERIUM;
	public static final ArmorMaterial ARMOR_RHODIUM = JCModsMaterials.ARMOR_MATERIAL_RHODIUM;
	public static final ArmorMaterial ARMOR_TANZANITE = JCModsMaterials.ARMOR_MATERIAL_TANZANITE;
	
	// Blocks
	public static final Block BLOCK_CERIUM = JCModsBlocks.BLOCK_CERIUM;
	public static final Block BLOCK_RHODIUM = JCModsBlocks.BLOCK_RHODIUM;
	public static final Block BLOCK_TANZANITE = JCModsBlocks.BLOCK_TANZANITE;
	
	// Dirty Dusts
	public static final Item DUST_DIRTY_CERIUM = new ItemStack(JCModsItems.DUST_DIRTY, 1, 0).getItem();
	public static final Item DUST_DIRTY_RHODIUM = new ItemStack(JCModsItems.DUST_DIRTY, 1, 1).getItem();
	
	// Dusts
	public static final Item DUST_CERIUM = new ItemStack(JCModsItems.DUST, 1, 0).getItem();
	public static final Item DUST_RHODIUM = new ItemStack(JCModsItems.DUST, 1, 1).getItem();
	public static final Item DUST_TANZANITE = new ItemStack(JCModsItems.DUST, 1, 2).getItem();
	
	// Gems
	public static final Item GEM_TANZANITE = new ItemStack(JCModsItems.GEM, 1, 0).getItem();
	
	// Ingots
	public static final Item INGOT_CERIUM = new ItemStack(JCModsItems.INGOT, 1, 0).getItem();
	public static final Item INGOT_RHODIUM = new ItemStack(JCModsItems.INGOT, 1, 1).getItem();
	
	// Nuggets
	public static final Item NUGGET_CERIUM = new ItemStack(JCModsItems.NUGGET, 1, 0).getItem();
	public static final Item NUGGET_RHODIUM = new ItemStack(JCModsItems.NUGGET, 1, 1).getItem();
	
	// Ores
	public static final Block ORE_CERIUM = JCModsBlocks.ORE_CERIUM;
	public static final Block ORE_END_CERIUM = JCModsBlocks.ORE_END_CERIUM;
	public static final Block ORE_NETHER_CERIUM = JCModsBlocks.ORE_NETHER_CERIUM;
	
	public static final Block ORE_RHODIUM = JCModsBlocks.ORE_RHODIUM;
	public static final Block ORE_END_RHODIUM = JCModsBlocks.ORE_END_RHODIUM;
	public static final Block ORE_NETHER_RHODIUM = JCModsBlocks.ORE_NETHER_RHODIUM;
	
	public static final Block ORE_TANZANITE = JCModsBlocks.ORE_TANZANITE;
	public static final Block ORE_END_TANZANITE = JCModsBlocks.ORE_END_TANZANITE;
	public static final Block ORE_NETHER_TANZANITE = JCModsBlocks.ORE_NETHER_TANZANITE;
}
