package skizlit.jcmods.common.item.tool;

import net.minecraft.item.ItemAxe;
import skizlit.jcmods.common.JCMods;
import skizlit.jcmods.common.JCModsItems;
import skizlit.jcmods.common.util.IModelled;

public class ToolAxe extends ItemAxe implements IModelled{

	public ToolAxe(String name, ToolMaterial material, float damage) {
		super(material, damage, -3.2f);
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
	