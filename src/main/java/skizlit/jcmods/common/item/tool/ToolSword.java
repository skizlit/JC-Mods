package skizlit.jcmods.common.item.tool;

import net.minecraft.item.ItemSword;
import skizlit.jcmods.common.JCMods;
import skizlit.jcmods.common.JCModsItems;

public class ToolSword extends ItemSword {

	public ToolSword(String name, ToolMaterial material) {
		super(material);
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(JCMods.tabJCMods);
    
		JCModsItems.ITEMS.add(this);
	}
}
	