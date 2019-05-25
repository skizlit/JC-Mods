package skizlit.jcmods.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import skizlit.jcmods.world.JCModsWorldGen;

@Mod(modid = JCMods.MOD_ID, name = JCMods.MOD_NAME, version = JCMods.MOD_VERSION)
@EventBusSubscriber()
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
    public static CreativeTabJCMods tabJCMods = new CreativeTabJCMods();
    
    @EventHandler
    public void init(FMLPreInitializationEvent event)
    {
    	GameRegistry.registerWorldGenerator(new JCModsWorldGen(), 3);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    }
    
    @EventHandler
    public void init(FMLPostInitializationEvent event)
    {
    	
    }
    
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        // Register items and itemBlocks
    	event.getRegistry().registerAll(JCModsItems.ITEMS.toArray(new Item[0]));
    }
    
    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        // Register items and itemBlocks
    	event.getRegistry().registerAll(JCModsBlocks.BLOCKS.toArray(new Block[0]));
    	
    	// Update Harvest level of Blocks from Default
    	proxy.updateBlockStats();
    }
    
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        // Register items and itemBlocks
    	proxy.registerItemModels();
    	proxy.registerItemBlocksModels();
    }
}
