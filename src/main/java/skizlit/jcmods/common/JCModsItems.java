package skizlit.jcmods.common;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import skizlit.jcmods.item.ItemBaseJCMods;

public class JCModsItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();

	// Dirty Dust
	public static final Item DIRTY_DUST_NICKEL = new ItemBaseJCMods("dirty_dust_nickel");
	public static final Item DIRTY_DUST_RHODIUM = new ItemBaseJCMods("dirty_dust_rhodium");
	
	// Dust
	public static final Item DUST_NICKEL = new ItemBaseJCMods("dust_nickel");
	public static final Item DUST_RHODIUM = new ItemBaseJCMods("dust_rhodium");
	public static final Item DUST_TANZANITE = new ItemBaseJCMods("dust_tanzanite");
			
	// Gem
	public static final Item GEM_TANZANITE = new ItemBaseJCMods("gem_tanzanite");
	
	// Ingots
	public static final Item INGOT_NICKEL = new ItemBaseJCMods("ingot_nickel");
	public static final Item INGOT_RHODIUM = new ItemBaseJCMods("ingot_rhodium");
	
	//Nugget
	public static final Item NUGGET_NICKEL = new ItemBaseJCMods("nugget_nickel");
	public static final Item NUGGET_RHODIUM = new ItemBaseJCMods("nugget_rhodium");
}
