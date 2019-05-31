package skizlit.jcmods.common.item;

import javax.annotation.Nonnull;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import skizlit.jcmods.common.JCModsItems;
import skizlit.jcmods.common.util.interfaces.IMetaItem;

public class ItemShard extends ItemBaseJCMods implements IMetaItem {

    public ItemShard(String name) {
        super(name);
        setHasSubtypes(true);
    }

    @Override
    public String getTexture(int meta) {
        return "shard" + JCModsItems.coreTypes[meta];
    }

    @Override
    public int getVariants() {
        return JCModsItems.coreTypes.length;
    }

    @Override
    public void getSubItems(@Nonnull CreativeTabs tabs, @Nonnull NonNullList<ItemStack> itemList) {
        if (isInCreativeTab(tabs)) {
            for (int counter = 0; counter < JCModsItems.coreTypes.length; counter++) {
                itemList.add(new ItemStack(this, 1, counter));
            }
        }
    }
    
    @Nonnull
    @Override
    public String getTranslationKey(ItemStack item) {
        return "item." + "shard" + JCModsItems.coreTypes[item.getItemDamage()];
    }
}