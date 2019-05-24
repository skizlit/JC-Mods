package skizlit.jcmods.common;

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
