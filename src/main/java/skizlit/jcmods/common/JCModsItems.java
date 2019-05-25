package skizlit.jcmods.common;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import skizlit.jcmods.item.ItemBaseJCMods;

public class JCModsItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();

	// Dirty Dust
	public static final Item DIRTY_DUST_NICKEL = new ItemBaseJCMods("DirtyDustNickel");
	public static final Item DIRTY_DUST_RHODIUM = new ItemBaseJCMods("DirtyDustRhodium");
	
	// Dust
	public static final Item DUST_NICKEL = new ItemBaseJCMods("DustNickel");
	public static final Item DUST_RHODIUM = new ItemBaseJCMods("DustRhodium");
	public static final Item DUST_TANZANITE = new ItemBaseJCMods("DustTanzanite");
			
	// Gem
	public static final Item GEM_TANZANITE = new ItemBaseJCMods("GemTanzanite");
	
	// Ingots
	public static final Item INGOT_NICKEL = new ItemBaseJCMods("IngotNickel");
	public static final Item INGOT_RHODIUM = new ItemBaseJCMods("IngotRhodium");
	
	//Nugget
	public static final Item NUGGET_NICKEL = new ItemBaseJCMods("NuggetNickel");
	public static final Item NUGGET_RHODIUM = new ItemBaseJCMods("NuggetRhodium");
}
