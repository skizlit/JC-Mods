package skizlit.jcmods.common;

import javax.annotation.Nonnull;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import skizlit.jcmods.common.util.Refrences;

public class CreativeTabJCMods extends CreativeTabs {

    public CreativeTabJCMods() {
        super("tabJCMods");
    }

    @Nonnull
    @Override
    public ItemStack createIcon() {
        return new ItemStack(Refrences.GEM_TANZANITE);
    }
}