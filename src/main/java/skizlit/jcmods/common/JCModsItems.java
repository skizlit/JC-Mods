package skizlit.jcmods.common;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import skizlit.jcmods.common.item.ItemBaseJCMods;
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

public class JCModsItems {
	
	// Items Array
	public static final List<Item> ITEMS = new ArrayList<Item>();

	// Tool Materials
	public static final ToolMaterial TOOL_MATERIAL_NICKEL = EnumHelper.addToolMaterial("toolMaterialNickel", 2, 250, 6.0F, 2.0F, 14);
	public static final ToolMaterial TOOL_MATERIAL_RHODIUM = EnumHelper.addToolMaterial("toolMaterialRhodium", 3, 2000, 8.0F, 4.0F, 18);
	public static final ToolMaterial TOOL_MATERIAL_TANZANITE = EnumHelper.addToolMaterial("toolMaterialTanzanite", 3, 1200, 8.0F, 7.0F, 25);
	
	static int[] nickel_Amounts = new int[] {2, 5, 6, 2};
	static int[] rhodium_Amounts = new int[] {4, 7, 9, 4};
	static int[] tanzanite_Amounts = new int[] {3, 6, 8, 3};
	
	// Armor Materials
	public static final ArmorMaterial ARMOR_MATERIAL_NICKEL = EnumHelper.addArmorMaterial("armorMaterialNickel", JCMods.MOD_ID + ":nickel", 15, nickel_Amounts, 14, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_RHODIUM = EnumHelper.addArmorMaterial("armorMaterialRhodium", JCMods.MOD_ID + ":rhodium", 40, rhodium_Amounts, 18, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_TANZANITE = EnumHelper.addArmorMaterial("armorMaterialTanzanite", JCMods.MOD_ID + ":tanzanite", 33, rhodium_Amounts, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);	
	
	// Armors
	public static final Item NICKEL_HELMET = new ArmorBaseJCMods("nickelHelmet", ARMOR_MATERIAL_NICKEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item NICKEL_LEGGINGS = new ArmorBaseJCMods("nickelLeggings", ARMOR_MATERIAL_NICKEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item NICKEL_CHESTPLATE = new ArmorBaseJCMods("nickelChestplate", ARMOR_MATERIAL_NICKEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item NICKEL_BOOTS = new ArmorBaseJCMods("nickelBoots", ARMOR_MATERIAL_NICKEL, 1, EntityEquipmentSlot.FEET);
	public static final Item RHODIUM_HELMET = new ArmorBaseJCMods("rhodiumHelmet", ARMOR_MATERIAL_RHODIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item RHODIUM_LEGGINGS = new ArmorBaseJCMods("rhodiumLeggings", ARMOR_MATERIAL_RHODIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item RHODIUM_CHESTPLATE = new ArmorBaseJCMods("rhodiumChestplate", ARMOR_MATERIAL_RHODIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item RHODIUM_BOOTS = new ArmorBaseJCMods("rhodiumBoots", ARMOR_MATERIAL_RHODIUM, 1, EntityEquipmentSlot.FEET);
	public static final Item TANZANITE_HELMET = new ArmorBaseJCMods("tanzaniteHelmet", ARMOR_MATERIAL_TANZANITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item TANZANITE_LEGGINGS = new ArmorBaseJCMods("tanzaniteLeggings", ARMOR_MATERIAL_TANZANITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item TANZANITE_CHESTPLATE = new ArmorBaseJCMods("tanzaniteChestplate", ARMOR_MATERIAL_TANZANITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item TANZANITE_BOOTS = new ArmorBaseJCMods("tanzaniteBoots", ARMOR_MATERIAL_TANZANITE, 1, EntityEquipmentSlot.FEET);
	
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
	public static final ItemAxe NICKEL_AXE = new ToolAxe("nickelAxe", TOOL_MATERIAL_NICKEL, 2.0F);
	public static final ItemHoe NICKEL_HOE = new ToolHoe("nickelHoe", TOOL_MATERIAL_NICKEL);
	public static final ItemPickaxe NICKEL_PICKAXE = new ToolPickaxe("nickelPickaxe", TOOL_MATERIAL_NICKEL);
	public static final ItemSpade NICKEL_SHOVEL = new ToolSpade("nickelShovel", TOOL_MATERIAL_NICKEL);
	public static final ItemSword NICKEL_SWORD = new ToolSword("nickelSword", TOOL_MATERIAL_NICKEL);	
	public static final ItemAxe RHODIUM_AXE = new ToolAxe("rhodiumAxe", TOOL_MATERIAL_RHODIUM, 4.0F);
	public static final ItemHoe RHODIUM_HOE = new ToolHoe("rhodiumHoe", TOOL_MATERIAL_RHODIUM);
	public static final ItemPickaxe RHODIUM_PICKAXE = new ToolPickaxe("rhodiumPickaxe", TOOL_MATERIAL_RHODIUM);
	public static final ItemSpade RHODIUM_SHOVEL = new ToolSpade("rhodiumShovel", TOOL_MATERIAL_RHODIUM);
	public static final ItemSword RHODIUM_SWORD = new ToolSword("rhodiumSword", TOOL_MATERIAL_RHODIUM);
	public static final ItemAxe TANZANITE_AXE = new ToolAxe("tanzaniteAxe", TOOL_MATERIAL_TANZANITE, 7.0F);
	public static final ItemHoe TANZANITE_HOE = new ToolHoe("tanzaniteHoe", TOOL_MATERIAL_TANZANITE);
	public static final ItemPickaxe TANZANITE_PICKAXE = new ToolPickaxe("tanzanitePickaxe", TOOL_MATERIAL_TANZANITE);
	public static final ItemSpade TANZANITE_SHOVEL = new ToolSpade("tanzaniteShovel", TOOL_MATERIAL_TANZANITE);
	public static final ItemSword TANZANITE_SWORD = new ToolSword("tanzaniteSword", TOOL_MATERIAL_TANZANITE);
}
