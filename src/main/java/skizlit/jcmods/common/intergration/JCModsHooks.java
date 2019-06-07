package skizlit.jcmods.common.intergration;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Optional;
import skizlit.jcmods.common.JCMods;
import skizlit.jcmods.common.intergration.mekanism.MekanismIntergration;

/**
 * Hooks for JCMods. 
 * Used to test if Mods are loaded and available for use.
 *
 * @author Skizlit 
 */
public class JCModsHooks {

    public static final String MEKANISM_MOD_ID = "mekanism";
    
    public boolean MekanismLoaded = false;
    
    public void hookPreInit() {
        if (Loader.isModLoaded(MEKANISM_MOD_ID)) {
        	MekanismLoaded = true;
        }
    }
    
    public void hookInit() {
    	if (MekanismLoaded) {
        	mekanismHooks();
        }
    }
    
    public void hookPostInit() {

    }
    
    @Optional.Method(modid = MEKANISM_MOD_ID)
    private static void mekanismHooks() {
    	MekanismIntergration mekanismHook = new MekanismIntergration();
    	try {
    		mekanismHook.crusherRecipes();

    		JCMods.logger.info("JCMods: Mekanism successfully Hooked");
    	}    
    	catch(Exception e) {
			JCMods.logger.info("JCMods: Mekanism failed to Hook");
		}
    	
    	
    	
    	//mekanismHook.chemicalInjectionChamberRecipes();
    	//mekanismHook.crusherRecipes();
    	//mekanismHook.enrichmentChamberRecipes();
    	//mekanismHook.purificationChamberRecipes();
    }
}
