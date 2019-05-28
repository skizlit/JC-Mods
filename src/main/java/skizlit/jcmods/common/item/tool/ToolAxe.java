package skizlit.jcmods.common.item.tool;

import net.minecraft.item.ItemAxe;
import skizlit.jcmods.common.JCMods;
import skizlit.jcmods.common.JCModsItems;

public class ToolAxe extends ItemAxe {

	public ToolAxe(String name, ToolMaterial material, float damage) {
		super(material, damage, -3.2f);
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(JCMods.tabJCMods);
    
		JCModsItems.ITEMS.add(this);
	}
}
	