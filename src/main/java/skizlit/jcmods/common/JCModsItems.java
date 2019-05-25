package skizlit.jcmods.common;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import skizlit.jcmods.item.ItemBaseJCMods;

public class JCModsItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();

	// Dirty Dust
	public static final Item DIRTY_DUST_NICKEL = new ItemBaseJCMods("dirtydustNickel");
	public static final Item DIRTY_DUST_RHODIUM = new ItemBaseJCMods("dirtydustRhodium");
	
	// Dust
	public static final Item DUST_NICKEL = new ItemBaseJCMods("dustNickel");
	public static final Item DUST_RHODIUM = new ItemBaseJCMods("dustRhodium");
	public static final Item DUST_TANZANITE = new ItemBaseJCMods("dustTanzanite");
			
	// Gem
	public static final Item GEM_TANZANITE = new ItemBaseJCMods("gemTanzanite");
	
	// Ingots
	public static final Item INGOT_NICKEL = new ItemBaseJCMods("ingotNickel");
	public static final Item INGOT_RHODIUM = new ItemBaseJCMods("ingotRhodium");
	
	//Nugget
	public static final Item NUGGET_NICKEL = new ItemBaseJCMods("nuggetNickel");
	public static final Item NUGGET_RHODIUM = new ItemBaseJCMods("nuggetRhodium");
}
