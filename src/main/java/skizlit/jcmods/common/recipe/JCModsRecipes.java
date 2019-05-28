package skizlit.jcmods.common.recipe;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import skizlit.jcmods.common.JCModsBlocks;
import skizlit.jcmods.common.JCModsItems;

public class JCModsRecipes {
	
	public static void init() {
		// Ore		
		GameRegistry.addSmelting(JCModsBlocks.ORE_NICKEL, new ItemStack(JCModsItems.INGOT, 1, 0), 0.7f);
		GameRegistry.addSmelting(JCModsBlocks.ORE_RHODIUM, new ItemStack(JCModsItems.INGOT, 1, 1), 1.0f);
		
		// Dust
		GameRegistry.addSmelting(JCModsItems.DUST_NICKEL, new ItemStack(JCModsItems.INGOT, 1, 0), 0.7f);
		GameRegistry.addSmelting(JCModsItems.DUST_RHODIUM, new ItemStack(JCModsItems.INGOT, 1, 1), 1.0f);
	}
}
