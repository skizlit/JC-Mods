package skizlit.jcmods.common.item.tool;

import net.minecraft.item.ItemSword;
import skizlit.jcmods.common.JCMods;
import skizlit.jcmods.common.JCModsItems;
import skizlit.jcmods.common.util.IModelled;

public class ToolSword extends ItemSword implements IModelled{

	public ToolSword(String name, ToolMaterial material) {
		super(material);
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(JCMods.tabJCMods);
    
		JCModsItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		JCMods.proxy.registerItem(this, 0, "Inventory");
	}
}
	