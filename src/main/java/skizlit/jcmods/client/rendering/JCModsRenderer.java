package skizlit.jcmods.client.rendering;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import skizlit.jcmods.common.util.IMetaItem;

public class JCModsRenderer {
	    
    public static void registerItemRender(String domain, Item item) {    	
        if (item instanceof IMetaItem) {
            IMetaItem metaItem = (IMetaItem) item;
            for (int i = 0; i < metaItem.getVariants(); i++) {
                if (metaItem.getTexture(i) == null) {
                    continue;
                }

                ModelResourceLocation loc = new ModelResourceLocation(new ResourceLocation(domain, metaItem.getTexture(i)), "inventory");
                ModelLoader.setCustomModelResourceLocation(item, i, loc);
                ModelBakery.registerItemVariants(item, new ResourceLocation(domain, metaItem.getTexture(i)));
            }

            return;
        }

        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
    
    public static void registerBlockRender(String domain, Block block) {    	
        if (block instanceof IMetaItem) {
            IMetaItem metaItem = (IMetaItem) block;
            for (int i = 0; i < metaItem.getVariants(); i++) {
                if (metaItem.getTexture(i) == null) {
                    continue;
                }

                ModelResourceLocation loc = new ModelResourceLocation(new ResourceLocation(domain, metaItem.getTexture(i)), "inventory");
                ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), i, loc);
                ModelBakery.registerItemVariants(Item.getItemFromBlock(block), new ResourceLocation(domain, metaItem.getTexture(i)));
            }

            return;
        }

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
