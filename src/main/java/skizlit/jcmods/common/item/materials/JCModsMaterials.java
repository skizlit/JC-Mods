package skizlit.jcmods.common.item.materials;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import skizlit.jcmods.common.JCMods;

public class JCModsMaterials {
	
	// Tool Materials
	public static final ToolMaterial TOOL_MATERIAL_CERIUM = EnumHelper.addToolMaterial("toolMaterialCerium", 2, 250, 6.0F, 2.0F, 14);
	public static final ToolMaterial TOOL_MATERIAL_RHODIUM = EnumHelper.addToolMaterial("toolMaterialRhodium", 3, 2000, 8.0F, 4.0F, 18);
	public static final ToolMaterial TOOL_MATERIAL_TANZANITE = EnumHelper.addToolMaterial("toolMaterialTanzanite", 3, 1200, 8.0F, 7.0F, 25);
	
	// Armor Values (boots, legs, chest, head)
	static int[] cerium_Amounts = new int[] {2, 5, 6, 2};
	static int[] rhodium_Amounts = new int[] {4, 7, 9, 4};
	static int[] tanzanite_Amounts = new int[] {3, 6, 8, 3};
	
	// Armor Materials
	public static final ArmorMaterial ARMOR_MATERIAL_CERIUM = EnumHelper.addArmorMaterial("armorMaterialCerium", JCMods.MOD_ID + ":cerium", 15, cerium_Amounts, 14, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_RHODIUM = EnumHelper.addArmorMaterial("armorMaterialRhodium", JCMods.MOD_ID + ":rhodium", 40, rhodium_Amounts, 18, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_TANZANITE = EnumHelper.addArmorMaterial("armorMaterialTanzanite", JCMods.MOD_ID + ":tanzanite", 33, rhodium_Amounts, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);		
}
