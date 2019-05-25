package skizlit.jcmods.common.recipe;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import skizlit.jcmods.common.JCModsBlocks;
import skizlit.jcmods.common.JCModsItems;

public class JCModsRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(JCModsBlocks.ORE_NICKEL, new ItemStack(JCModsItems.INGOT_NICKEL, 1), 0.7f);
		GameRegistry.addSmelting(JCModsBlocks.ORE_RHODIUM, new ItemStack(JCModsItems.INGOT_RHODIUM, 1), 1.0f);
	}
}
