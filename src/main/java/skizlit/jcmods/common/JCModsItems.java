package skizlit.jcmods.common;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import skizlit.jcmods.common.item.ItemBaseJCMods;
import skizlit.jcmods.common.item.tool.ToolAxe;
import skizlit.jcmods.common.item.tool.ToolHoe;
import skizlit.jcmods.common.item.tool.ToolPickaxe;
import skizlit.jcmods.common.item.tool.ToolSpade;
import skizlit.jcmods.common.item.tool.ToolSword;

public class JCModsItems {
	
	// Items Array
	public static final List<Item> ITEMS = new ArrayList<Item>();

	// Materials
	public static final ToolMaterial MATERIAL_NICKEL = EnumHelper.addToolMaterial("materialNickel", 2, 250, 6.0F, 2.0F, 14);
	public static final ToolMaterial MATERIAL_RHODIUM = EnumHelper.addToolMaterial("materialRhodium", 3, 2000, 8.0F, 4.0F, 15);
	public static final ToolMaterial MATERIAL_TANZANITE = EnumHelper.addToolMaterial("materialTanzanite", 3, 1200, 8.0F, 7.0F, 25);
	
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
	
	// Nugget
	public static final Item NUGGET_NICKEL = new ItemBaseJCMods("nuggetNickel");
	public static final Item NUGGET_RHODIUM = new ItemBaseJCMods("nuggetRhodium");
	
	// Tools
	public static final ItemAxe NICKEL_AXE = new ToolAxe("nickelAxe", MATERIAL_NICKEL, 2.0F);
	public static final ItemHoe NICKEL_HOE = new ToolHoe("nickelHoe", MATERIAL_NICKEL);
	public static final ItemPickaxe NICKEL_PICKAXE = new ToolPickaxe("nickelPickaxe", MATERIAL_NICKEL);
	public static final ItemSpade NICKEL_SHOVEL = new ToolSpade("nickelShovel", MATERIAL_NICKEL);
	public static final ItemSword NICKEL_SWORD = new ToolSword("nickelSword", MATERIAL_NICKEL);	
	public static final ItemAxe RHODIUM_AXE = new ToolAxe("rhodiumAxe", MATERIAL_RHODIUM, 4.0F);
	public static final ItemHoe RHODIUM_HOE = new ToolHoe("rhodiumHoe", MATERIAL_RHODIUM);
	public static final ItemPickaxe RHODIUM_PICKAXE = new ToolPickaxe("rhodiumPickaxe", MATERIAL_RHODIUM);
	public static final ItemSpade RHODIUM_SHOVEL = new ToolSpade("rhodiumShovel", MATERIAL_RHODIUM);
	public static final ItemSword RHODIUM_SWORD = new ToolSword("rhodiumSword", MATERIAL_RHODIUM);
	public static final ItemAxe TANZANITE_AXE = new ToolAxe("tanzaniteAxe", MATERIAL_TANZANITE, 7.0F);
	public static final ItemHoe TANZANITE_HOE = new ToolHoe("tanzaniteHoe", MATERIAL_TANZANITE);
	public static final ItemPickaxe TANZANITE_PICKAXE = new ToolPickaxe("tanzanitePickaxe", MATERIAL_TANZANITE);
	public static final ItemSpade TANZANITE_SHOVEL = new ToolSpade("tanzaniteShovel", MATERIAL_TANZANITE);
	public static final ItemSword TANZANITE_SWORD = new ToolSword("tanzaniteSword", MATERIAL_TANZANITE);
}
