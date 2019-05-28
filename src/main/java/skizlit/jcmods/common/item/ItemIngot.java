package skizlit.jcmods.common.item;

import javax.annotation.Nonnull;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import skizlit.jcmods.common.util.IMetaItem;

public class ItemIngot extends ItemBaseJCMods implements IMetaItem {

    public static String[] en_USNames = {"Nickel", "Rhodium"};

    public ItemIngot(String name) {
        super(name);
        setHasSubtypes(true);
    }

    @Override
    public String getTexture(int meta) {
        return "ingot" + en_USNames[meta];
    }

    @Override
    public int getVariants() {
        return en_USNames.length;
    }

    @Override
    public void getSubItems(@Nonnull CreativeTabs tabs, @Nonnull NonNullList<ItemStack> itemList) {
        if (isInCreativeTab(tabs)) {
            for (int counter = 0; counter < en_USNames.length; counter++) {
                itemList.add(new ItemStack(this, 1, counter));
            }
        }
    }
    
    @Nonnull
    @Override
    public String getTranslationKey(ItemStack item) {
        return "item." + "ingot" + en_USNames[item.getItemDamage()];
    }
}