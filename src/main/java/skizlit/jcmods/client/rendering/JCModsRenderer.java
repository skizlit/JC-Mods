package skizlit.jcmods.client.rendering;

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
}
