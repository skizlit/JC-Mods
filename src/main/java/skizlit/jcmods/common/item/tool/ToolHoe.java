package skizlit.jcmods.common.item.tool;

import net.minecraft.item.ItemHoe;
import skizlit.jcmods.common.JCMods;
import skizlit.jcmods.common.JCModsItems;

public class ToolHoe extends ItemHoe {

	public ToolHoe(String name, ToolMaterial material) {
		super(material);
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(JCMods.tabJCMods);
    
		JCModsItems.ITEMS.add(this);
	}
}
	