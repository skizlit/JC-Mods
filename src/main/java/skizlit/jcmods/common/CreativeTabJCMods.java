package skizlit.jcmods.common;

import javax.annotation.Nonnull;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabJCMods extends CreativeTabs {

    public CreativeTabJCMods() {
        super("tabJCMods");
    }

    @Nonnull
    @Override
    public ItemStack createIcon() {
        return new ItemStack(JCModsItems.GEM, 1, 0);
    }
}