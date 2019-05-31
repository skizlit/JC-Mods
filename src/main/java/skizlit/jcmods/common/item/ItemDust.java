package skizlit.jcmods.common.item;

import javax.annotation.Nonnull;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import skizlit.jcmods.common.util.Refrences;
import skizlit.jcmods.common.util.interfaces.IMetaItem;

public class ItemDust extends ItemBaseJCMods implements IMetaItem {

    public ItemDust(String name) {
        super(name);
        setHasSubtypes(true);
    }

    @Override
    public String getTexture(int meta) {
        return "dust" + Refrences.dustTypes[meta];
    }

    @Override
    public int getVariants() {
        return Refrences.dustTypes.length;
    }

    @Override
    public void getSubItems(@Nonnull CreativeTabs tabs, @Nonnull NonNullList<ItemStack> itemList) {
        if (isInCreativeTab(tabs)) {
            for (int counter = 0; counter < Refrences.dustTypes.length; counter++) {
                itemList.add(new ItemStack(this, 1, counter));
            }
        }
    }
    
    @Nonnull
    @Override
    public String getTranslationKey(ItemStack item) {
        return "item." + "dust" + Refrences.dustTypes[item.getItemDamage()];
    }
}