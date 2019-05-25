package skizlit.jcmods.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = JCMods.MOD_ID, name = JCMods.MOD_NAME, version = JCMods.MOD_VERSION)
public class JCMods
{
    public static final String MOD_ID = "jcmods";
    public static final String MOD_NAME = "JC Mods";
    public static final String MOD_VERSION = "${version}";
    public static final String ACCEPTED_VERSIONS = "[1.12.2]";
    public static final String CLIENT_PROXY = "skizlit.jcmods.client.ClientProxy";
    public static final String COMMON_PROXY = "skizlit.jcmods.common.CommonProxy";

    /**
     * JC Mods mod instance
     */
    @Instance(MOD_ID)
    public static JCMods instance;
    /**
     * JC Mods logger instance
     */
    public static Logger logger = LogManager.getLogger(MOD_NAME);
    /**
     * JC Mods proxy instance
     */
    @SidedProxy(clientSide = CLIENT_PROXY, serverSide = COMMON_PROXY)
    public static CommonProxy proxy;
    /**
     * JC Mods creative tab
     */

    
    @EventHandler
    public void init(FMLPreInitializationEvent event)
    {

    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    }
    
    @EventHandler
    public void init(FMLPostInitializationEvent event)
    {
    	
    }
}
