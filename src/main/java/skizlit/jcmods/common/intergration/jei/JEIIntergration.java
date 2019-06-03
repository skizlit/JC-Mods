package skizlit.jcmods.common.intergration.jei;

import java.util.IllegalFormatException;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import net.minecraft.util.text.translation.I18n;

@SuppressWarnings("deprecation")
@JEIPlugin
public class JEIIntergration implements IModPlugin {
	
	@Override
	public void registerCategories(IRecipeCategoryRegistration registry) {
		final IJeiHelpers helpers = registry.getJeiHelpers();
		final IGuiHelper gui = helpers.getGuiHelper();
		
		// registry.addRecipeCategories(recipeCategories);
	}
	
	@Override
	public void register(IModRegistry registry) {
		
	}
	
	public static String translateToLocal(String key) {
		if (I18n.canTranslate(key)) return I18n.translateToLocal(key);
		else return I18n.translateToFallback(key);
	}
	
	public static String translateToLocalFormatter(String key, Object... format) {
		String s = translateToLocal(key);
		
		try {
			return String.format(s, format);
		}catch (IllegalFormatException e) {
			return "Format error: " + s;
		}	
	}
}
