package skizlit.jcmods.common.item.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import skizlit.jcmods.common.JCMods;
import skizlit.jcmods.common.JCModsItems;

public class ArmorBaseJCMods extends ItemArmor {

	public ArmorBaseJCMods(String name, ArmorMaterial material, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(material, renderIndexIn, equipmentSlotIn);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(JCMods.tabJCMods);
        
        JCModsItems.ITEMS.add(this);
	}
}
