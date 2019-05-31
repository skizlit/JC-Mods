package skizlit.jcmods.common.item;

import javax.annotation.Nonnull;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import skizlit.jcmods.common.util.Refrences;
import skizlit.jcmods.common.util.interfaces.IMetaItem;

public class ItemCrystal extends ItemBaseJCMods implements IMetaItem {

    public ItemCrystal(String name) {
        super(name);
        setHasSubtypes(true);
    }

    @Override
    public String getTexture(int meta) {
        return "crystal" + Refrences.coreTypes[meta];
    }

    @Override
    public int getVariants() {
        return Refrences.coreTypes.length;
    }

    @Override
    public void getSubItems(@Nonnull CreativeTabs tabs, @Nonnull NonNullList<ItemStack> itemList) {
        if (isInCreativeTab(tabs)) {
            for (int counter = 0; counter < Refrences.coreTypes.length; counter++) {
                itemList.add(new ItemStack(this, 1, counter));
            }
        }
    }
    
    @Nonnull
    @Override
    public String getTranslationKey(ItemStack item) {
        return "item." + "crystal" + Refrences.coreTypes[item.getItemDamage()];
    }
}