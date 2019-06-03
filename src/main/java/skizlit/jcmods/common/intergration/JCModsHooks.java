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

    }
    
    public void hookPostInit() {
        if (MekanismLoaded) {
        	mekanismHooks();
            JCMods.logger.info("Mekanism: successfully");
        }
    }
    
    @Optional.Method(modid = MEKANISM_MOD_ID)
    private static void mekanismHooks() {
    	MekanismIntergration mekanismHook = new MekanismIntergration();
    	mekanismHook.crusherRecipes();
    	mekanismHook.enrichmentChamberRecipes();
    	mekanismHook.purificationChamberRecipes();
    }
}
