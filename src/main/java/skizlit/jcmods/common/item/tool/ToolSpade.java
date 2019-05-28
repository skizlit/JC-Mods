package skizlit.jcmods.common.item.tool;

import net.minecraft.item.ItemSpade;
import skizlit.jcmods.common.JCMods;
import skizlit.jcmods.common.JCModsItems;

public class ToolSpade extends ItemSpade {

	public ToolSpade(String name, ToolMaterial material) {
		super(material);
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(JCMods.tabJCMods);
    
		JCModsItems.ITEMS.add(this);
	}
}
	