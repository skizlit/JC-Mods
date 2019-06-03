package skizlit.jcmods.common.item;

import javax.annotation.Nonnull;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import skizlit.jcmods.common.JCModsItems;
import skizlit.jcmods.common.util.interfaces.IMetaItem;

public class ItemGem extends ItemBaseJCMods implements IMetaItem {

    public ItemGem(String name) {
        super(name);
        setHasSubtypes(true);
    }

    @Override
    public String getTexture(int meta) {
        return "gem" + JCModsItems.gemTypes[meta];
    }

    @Override
    public int getVariants() {
        return JCModsItems.gemTypes.length;
    }

    @Override
    public void getSubItems(@Nonnull CreativeTabs tabs, @Nonnull NonNullList<ItemStack> itemList) {
        if (isInCreativeTab(tabs)) {
            for (int counter = 0; counter < JCModsItems.gemTypes.length; counter++) {
                itemList.add(new ItemStack(this, 1, counter));
            }
        }
    }
    
    @Nonnull
    @Override
    public String getTranslationKey(ItemStack item) {
        return "item." + "gem" + JCModsItems.gemTypes[item.getItemDamage()];
    }
}