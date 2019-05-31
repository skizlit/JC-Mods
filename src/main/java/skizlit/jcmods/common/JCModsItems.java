package skizlit.jcmods.common;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import skizlit.jcmods.common.item.ItemClump;
import skizlit.jcmods.common.item.ItemCrystal;
import skizlit.jcmods.common.item.ItemDust;
import skizlit.jcmods.common.item.ItemDustDirty;
import skizlit.jcmods.common.item.ItemGem;
import skizlit.jcmods.common.item.ItemIngot;
import skizlit.jcmods.common.item.ItemNugget;
import skizlit.jcmods.common.item.ItemShard;
import skizlit.jcmods.common.item.armor.ArmorBaseJCMods;
import skizlit.jcmods.common.item.tool.ToolAxe;
import skizlit.jcmods.common.item.tool.ToolHoe;
import skizlit.jcmods.common.item.tool.ToolPickaxe;
import skizlit.jcmods.common.item.tool.ToolSpade;
import skizlit.jcmods.common.item.tool.ToolSword;
import skizlit.jcmods.common.util.Refrences;

public class JCModsItems {
	
	// Items Array
	public static final List<Item> ITEMS = new ArrayList<Item>();

	// Armors
	public static final Item CERIUM_HELMET = new ArmorBaseJCMods("ceriumHelmet", Refrences.ARMOR_CERIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item CERIUM_LEGGINGS = new ArmorBaseJCMods("ceriumLeggings", Refrences.ARMOR_CERIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item CERIUM_CHESTPLATE = new ArmorBaseJCMods("ceriumChestplate", Refrences.ARMOR_CERIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item CERIUM_BOOTS = new ArmorBaseJCMods("ceriumBoots", Refrences.ARMOR_CERIUM, 1, EntityEquipmentSlot.FEET);
	public static final Item RHODIUM_HELMET = new ArmorBaseJCMods("rhodiumHelmet", Refrences.ARMOR_RHODIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item RHODIUM_LEGGINGS = new ArmorBaseJCMods("rhodiumLeggings", Refrences.ARMOR_RHODIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item RHODIUM_CHESTPLATE = new ArmorBaseJCMods("rhodiumChestplate", Refrences.ARMOR_RHODIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item RHODIUM_BOOTS = new ArmorBaseJCMods("rhodiumBoots", Refrences.ARMOR_RHODIUM, 1, EntityEquipmentSlot.FEET);
	public static final Item TANZANITE_HELMET = new ArmorBaseJCMods("tanzaniteHelmet", Refrences.ARMOR_TANZANITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item TANZANITE_LEGGINGS = new ArmorBaseJCMods("tanzaniteLeggings", Refrences.ARMOR_TANZANITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item TANZANITE_CHESTPLATE = new ArmorBaseJCMods("tanzaniteChestplate", Refrences.ARMOR_TANZANITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item TANZANITE_BOOTS = new ArmorBaseJCMods("tanzaniteBoots", Refrences.ARMOR_TANZANITE, 1, EntityEquipmentSlot.FEET);
	
	/*
	 * Multi Items
	 */
	public static final Item CLUMP = new ItemClump("Clump");
	public static final Item CRYSTAL = new ItemCrystal("Crystal");
	public static final Item DUST = new ItemDust("Dust");
	public static final Item DUST_DIRTY = new ItemDustDirty("DustDirty");
	public static final Item GEM = new ItemGem("Gem");
	public static final Item INGOT = new ItemIngot("Ingot");
	public static final Item NUGGET = new ItemNugget("Nugget");
	public static final Item SHARD = new ItemShard("Shard");
	
	// Tools
	public static final ItemAxe CERIUM_AXE = new ToolAxe("ceriumAxe", Refrences.TOOL_CERIUM, 2.0F);
	public static final ItemHoe CERIUM_HOE = new ToolHoe("ceriumHoe", Refrences.TOOL_CERIUM);
	public static final ItemPickaxe CERIUM_PICKAXE = new ToolPickaxe("ceriumPickaxe", Refrences.TOOL_CERIUM);
	public static final ItemSpade CERIUM_SHOVEL = new ToolSpade("ceriumShovel", Refrences.TOOL_CERIUM);
	public static final ItemSword CERIUM_SWORD = new ToolSword("ceriumSword", Refrences.TOOL_CERIUM);	
	public static final ItemAxe RHODIUM_AXE = new ToolAxe("rhodiumAxe", Refrences.TOOL_RHODIUM, 4.0F);
	public static final ItemHoe RHODIUM_HOE = new ToolHoe("rhodiumHoe", Refrences.TOOL_RHODIUM);
	public static final ItemPickaxe RHODIUM_PICKAXE = new ToolPickaxe("rhodiumPickaxe", Refrences.TOOL_RHODIUM);
	public static final ItemSpade RHODIUM_SHOVEL = new ToolSpade("rhodiumShovel", Refrences.TOOL_RHODIUM);
	public static final ItemSword RHODIUM_SWORD = new ToolSword("rhodiumSword", Refrences.TOOL_RHODIUM);
	public static final ItemAxe TANZANITE_AXE = new ToolAxe("tanzaniteAxe", Refrences.TOOL_TANZANITE, 7.0F);
	public static final ItemHoe TANZANITE_HOE = new ToolHoe("tanzaniteHoe", Refrences.TOOL_TANZANITE);
	public static final ItemPickaxe TANZANITE_PICKAXE = new ToolPickaxe("tanzanitePickaxe", Refrences.TOOL_TANZANITE);
	public static final ItemSpade TANZANITE_SHOVEL = new ToolSpade("tanzaniteShovel", Refrences.TOOL_TANZANITE);
	public static final ItemSword TANZANITE_SWORD = new ToolSword("tanzaniteSword", Refrences.TOOL_TANZANITE);
}
