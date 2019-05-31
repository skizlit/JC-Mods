package skizlit.jcmods.common.recipe;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import skizlit.jcmods.common.util.Refrences;

public class JCModsRecipes {
	
	public static void init() {
		// Ore 	
		GameRegistry.addSmelting(Refrences.ORE_CERIUM, new ItemStack(Refrences.INGOT_CERIUM), 0.7f);
		GameRegistry.addSmelting(Refrences.ORE_END_CERIUM, new ItemStack(Refrences.INGOT_CERIUM), 0.7f);
		GameRegistry.addSmelting(Refrences.ORE_NETHER_CERIUM, new ItemStack(Refrences.INGOT_CERIUM), 0.7f);
		
		GameRegistry.addSmelting(Refrences.ORE_RHODIUM, new ItemStack(Refrences.INGOT_RHODIUM), 1.0f);
		GameRegistry.addSmelting(Refrences.ORE_END_RHODIUM, new ItemStack(Refrences.INGOT_RHODIUM), 1.0f);
		GameRegistry.addSmelting(Refrences.ORE_NETHER_RHODIUM, new ItemStack(Refrences.INGOT_RHODIUM), 1.0f);
		
		// Dust 
		GameRegistry.addSmelting(new ItemStack(Refrences.DUST_CERIUM), new ItemStack(Refrences.INGOT_CERIUM), 0.7f);
		GameRegistry.addSmelting(new ItemStack(Refrences.DUST_RHODIUM), new ItemStack(Refrences.INGOT_RHODIUM), 1.0f);
	}
}
