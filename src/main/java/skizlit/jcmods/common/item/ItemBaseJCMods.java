package skizlit.jcmods.common.item;

import net.minecraft.item.Item;
import skizlit.jcmods.common.JCMods;
import skizlit.jcmods.common.JCModsItems;
import skizlit.jcmods.common.util.IModelled;

public class ItemBaseJCMods extends Item implements IModelled{
	
	public ItemBaseJCMods(String name){
        super();
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
