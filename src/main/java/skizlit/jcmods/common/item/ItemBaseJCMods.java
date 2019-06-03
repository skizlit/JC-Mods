package skizlit.jcmods.common.item;

import net.minecraft.item.Item;
import skizlit.jcmods.common.JCMods;
import skizlit.jcmods.common.JCModsItems;

public class ItemBaseJCMods extends Item {
	
	public ItemBaseJCMods(String name){
        super();
        setTranslationKey(name);
        setRegistryName(JCMods.MOD_ID, name);
        setCreativeTab(JCMods.tabJCMods);
        
        JCModsItems.ITEMS.add(this);
	}
}
