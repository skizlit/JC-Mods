package skizlit.jcmods.common.blocks.machines.gui;

import com.kashdeya.tinyprogressions.container.OreDoublerContainer;
import com.kashdeya.tinyprogressions.tiles.TileEntityOreDoubler;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import skizlit.jcmods.common.JCMods;
import skizlit.jcmods.common.blocks.machines.tileentity.TileEntityCobbleGenerator;

public class GUICobbleGenerator extends GuiContainer {
	
	private static final ResourceLocation TEXTURES = new ResourceLocation(JCMods.MOD_ID + ":textures/gui/cobblegenerator.png");
	private final TileEntityCobbleGenerator cobbleGenerator;
	private final InventoryPlayer playerinventory;
	
	public GUICobbleGenerator(InventoryPlayer playerinventory, TileEntityCobbleGenerator cobbleGenerator) 
	{
		super(new )
		this.playerinventory = playerinventory;
		this.TileEntityCobbleGenerator = cobbleGenerator;
	}
	
}
