package skizlit.jcmods.common.item.tool;

import net.minecraft.item.ItemPickaxe;
import skizlit.jcmods.common.JCMods;
import skizlit.jcmods.common.JCModsItems;

public class ToolPickaxe extends ItemPickaxe {

	public ToolPickaxe(String name, ToolMaterial material) {
		super(material);
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(JCMods.tabJCMods);
    
		JCModsItems.ITEMS.add(this);
	}
}
	