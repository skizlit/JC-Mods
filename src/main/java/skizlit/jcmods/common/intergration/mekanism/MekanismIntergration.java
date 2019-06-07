package skizlit.jcmods.common.intergration.mekanism;

import mekanism.api.MekanismAPI;
import mekanism.api.MekanismRecipeHelper;
import mekanism.api.gas.GasRegistry;
import net.minecraft.item.ItemStack;
import skizlit.jcmods.common.JCMods;
import skizlit.jcmods.common.JCModsBlocks;
import skizlit.jcmods.common.JCModsItems;

public class MekanismIntergration {

	private static MekanismRecipeHelper helper = null;
	
	public MekanismIntergration() {
		helper = MekanismAPI.recipeHelper();
	}
	
	public void crusherRecipes() throws Exception {

			
//			ItemStack itemInput = new ItemStack(JCModsItems.CLUMP, 1, 0);
//			ItemStack itemOuput = new ItemStack(JCModsItems.DUST_DIRTY, 1, 0);
			
//			NBTTagCompound recipeTag = new NBTTagCompound();
//			recipeTag.setTag("input", itemInput.writeToNBT(new NBTTagCompound()));
//			recipeTag.setTag("output", itemOuput.writeToNBT(new NBTTagCompound()));		
			
//			boolean added = FMLInterModComms.sendMessage("mekanism", "CRUSHER", recipeTag);
//			boolean added = FMLInterModComms.sendMessage("mekanism", "REMOVECRUSHER", recipeTag);
			
//			JCMods.logger.info("JCMods: Crusher passed - " + added);
			/*
		 	* Clumps
		 	*/
			helper.addCrusherRecipe(new ItemStack(JCModsItems.CLUMP, 1, 0), new ItemStack(JCModsItems.DUST_DIRTY, 1, 0));
			helper.addCrusherRecipe(new ItemStack(JCModsItems.CLUMP, 1, 1), new ItemStack(JCModsItems.DUST_DIRTY, 1, 1));
			
			/*
		 	* Gems
		 	*/
			helper.addCrusherRecipe(new ItemStack(JCModsItems.GEM, 1, 0), new ItemStack(JCModsItems.DUST, 1, 2));
			
			/*
		 	* Ingots
		 	*/
			helper.addCrusherRecipe(new ItemStack(JCModsItems.INGOT, 1, 0), new ItemStack(JCModsItems.DUST, 1, 0));
			helper.addCrusherRecipe(new ItemStack(JCModsItems.INGOT, 1, 1), new ItemStack(JCModsItems.DUST, 1, 1));

	}
	
	public void chemicalInjectionChamberRecipes() {
		try {
						
			/*
			 * Ores
			 */
			helper.addChemicalInjectionChamberRecipe(new ItemStack(JCModsBlocks.ORE_CERIUM), GasRegistry.getGas("hydrogenchloride"), new ItemStack(JCModsItems.CLUMP, 4, 0));
			helper.addChemicalInjectionChamberRecipe(new ItemStack(JCModsBlocks.ORE_END_CERIUM), GasRegistry.getGas("hydrogenchloride"), new ItemStack(JCModsItems.CLUMP, 4, 0));
			helper.addChemicalInjectionChamberRecipe(new ItemStack(JCModsBlocks.ORE_NETHER_CERIUM), GasRegistry.getGas("hydrogenchloride"), new ItemStack(JCModsItems.CLUMP, 4, 0));
			
			helper.addChemicalInjectionChamberRecipe(new ItemStack(JCModsBlocks.ORE_RHODIUM), GasRegistry.getGas("hydrogenchloride"), new ItemStack(JCModsItems.CLUMP, 4, 1));
			helper.addChemicalInjectionChamberRecipe(new ItemStack(JCModsBlocks.ORE_END_RHODIUM), GasRegistry.getGas("hydrogenchloride"), new ItemStack(JCModsItems.CLUMP, 4, 1));
			helper.addChemicalInjectionChamberRecipe(new ItemStack(JCModsBlocks.ORE_NETHER_RHODIUM), GasRegistry.getGas("hydrogenchloride"), new ItemStack(JCModsItems.CLUMP, 4, 1));
		}
		catch(Exception e) {
			JCMods.logger.info("Chemical Injection Chamber: Crusher - Failed");
		}
	}
	
	public void enrichmentChamberRecipes() {
		try {
			/*
		 	* Dust Dirty
		 	*/
			helper.addEnrichmentChamberRecipe(new ItemStack(JCModsItems.DUST_DIRTY, 1, 0), new ItemStack(JCModsItems.DUST, 1, 0));
			helper.addEnrichmentChamberRecipe(new ItemStack(JCModsItems.DUST_DIRTY, 1, 1), new ItemStack(JCModsItems.DUST, 1, 1));
						
			/*
			 * Ores
			 */
			helper.addEnrichmentChamberRecipe(new ItemStack(JCModsBlocks.ORE_CERIUM), new ItemStack(JCModsItems.DUST, 2, 0));
			helper.addEnrichmentChamberRecipe(new ItemStack(JCModsBlocks.ORE_END_CERIUM), new ItemStack(JCModsItems.DUST, 2, 0));
			helper.addEnrichmentChamberRecipe(new ItemStack(JCModsBlocks.ORE_NETHER_CERIUM), new ItemStack(JCModsItems.DUST, 2, 0));
			
			helper.addEnrichmentChamberRecipe(new ItemStack(JCModsBlocks.ORE_RHODIUM), new ItemStack(JCModsItems.DUST, 2, 1));
			helper.addEnrichmentChamberRecipe(new ItemStack(JCModsBlocks.ORE_END_RHODIUM), new ItemStack(JCModsItems.DUST, 2, 1));
			helper.addEnrichmentChamberRecipe(new ItemStack(JCModsBlocks.ORE_NETHER_RHODIUM), new ItemStack(JCModsItems.DUST, 2, 1));
			
			helper.addEnrichmentChamberRecipe(new ItemStack(JCModsBlocks.ORE_TANZANITE), new ItemStack(JCModsItems.GEM, 2, 2));
			helper.addEnrichmentChamberRecipe(new ItemStack(JCModsBlocks.ORE_END_TANZANITE), new ItemStack(JCModsItems.GEM, 2, 2));
			helper.addEnrichmentChamberRecipe(new ItemStack(JCModsBlocks.ORE_NETHER_TANZANITE), new ItemStack(JCModsItems.GEM, 2, 2));
		}
		catch(Exception e) {
			JCMods.logger.info("Mekanism: Enrichment Chamber - Failed");
		}
	}
	
	public void purificationChamberRecipes() {
		try {
			/*
		 	* Shards
		 	*/
			helper.addPurificationChamberRecipe(new ItemStack(JCModsItems.SHARD, 1, 0), new ItemStack(JCModsItems.CLUMP, 1, 0));
			helper.addPurificationChamberRecipe(new ItemStack(JCModsItems.SHARD, 1, 1), new ItemStack(JCModsItems.CLUMP, 1, 1));
						
			/*
			 * Ores
			 */
			helper.addPurificationChamberRecipe(new ItemStack(JCModsBlocks.ORE_CERIUM), new ItemStack(JCModsItems.CLUMP, 3, 0));
			helper.addPurificationChamberRecipe(new ItemStack(JCModsBlocks.ORE_END_CERIUM), new ItemStack(JCModsItems.CLUMP, 3, 0));
			helper.addPurificationChamberRecipe(new ItemStack(JCModsBlocks.ORE_NETHER_CERIUM), new ItemStack(JCModsItems.CLUMP, 3, 0));
			
			helper.addPurificationChamberRecipe(new ItemStack(JCModsBlocks.ORE_RHODIUM), new ItemStack(JCModsItems.CLUMP, 3, 1));
			helper.addPurificationChamberRecipe(new ItemStack(JCModsBlocks.ORE_END_RHODIUM), new ItemStack(JCModsItems.CLUMP, 3, 1));
			helper.addPurificationChamberRecipe(new ItemStack(JCModsBlocks.ORE_NETHER_RHODIUM), new ItemStack(JCModsItems.CLUMP, 3, 1));
		}
		catch(Exception e) {
			JCMods.logger.info("Mekanism: Purification Chamber - Failed");
		}
	}
	
}
