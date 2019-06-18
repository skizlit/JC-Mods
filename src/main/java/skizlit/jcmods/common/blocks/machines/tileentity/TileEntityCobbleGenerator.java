package skizlit.jcmods.common.blocks.machines.tileentity;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemHandlerHelper;
import skizlit.jcmods.common.blocks.machines.storage.InternalInventory;

public class TileEntityCobbleGenerator extends TileEntity implements ITickable {

	int tickCycle = 0;
	
	public InternalInventory inventory = new InternalInventory(1, false, true);
	
	public int getCycleUpdate() {
		return 20;
	}
	
	public int getMaxStackSize() {
		return 64;
	}
	
	public ItemStack getInventoryStack(int slot) {
		return inventory.getStackInSlot(slot);
	}
		
	@Override
	public void update() {
		if(world.isRemote)
			return;
				
		incrementTickCycle();
		
		/*
		 * Add 1 cobblestone to the Internal inventory every Tick Cycle
		 */
		if(tickCycle >= getCycleUpdate()) {
			resetTickCycle();
			
			for (int i = 0; i < inventory.getSlots(); i++) {
				
				if (getInventoryStack(i).getCount() == getMaxStackSize())
					continue;
				
				if (getInventoryStack(i) == ItemStack.EMPTY || getInventoryStack(i).getItem() != Item.getItemFromBlock(Blocks.COBBLESTONE)) {
					inventory.setStackInSlot(i, new ItemStack(Blocks.COBBLESTONE));
				}
				else
				{
					getInventoryStack(i).setCount(Math.min(getMaxStackSize(), getInventoryStack(i).getCount() + 1));
				}
				
				this.inventory.setStackInSlot(i, getInventoryStack(i));
			}
			
			markDirty();
		}
		
		/*
		 * Transferring blocks to external Inventory should happen every tick
		 */
		TileEntity tile = world.getTileEntity(pos.offset(EnumFacing.UP));
				
		if (tile == null) { // Tests Up
			tile = world.getTileEntity(pos.offset(EnumFacing.DOWN));
		}
		
		if (tile == null) { // Tests Down
			tile = world.getTileEntity(pos.offset(EnumFacing.DOWN));
		}
		
		if (tile == null) { // Tests South
			tile = world.getTileEntity(pos.offset(EnumFacing.SOUTH));
		}
		
		if (tile == null) { // Tests North
			tile = world.getTileEntity(pos.offset(EnumFacing.NORTH));
		}
		
		if (tile == null) { // Tests East
			tile = world.getTileEntity(pos.offset(EnumFacing.EAST));
		}
		
		if (tile == null) { // Tests West
			tile = world.getTileEntity(pos.offset(EnumFacing.WEST));
		}
				
		if (tile != null && tile.hasCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)) {
			IItemHandler handler = tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);

			for (int i = 0; i < inventory.getSlots(); i++) {								
				if (getInventoryStack(i) == ItemStack.EMPTY)
					continue;
				
				ItemStack stack = this.inventory.getStackInSlot(0).copy();
				stack.setCount(1);
				ItemStack stack1 = ItemHandlerHelper.insertItem(handler, stack, true);
				if (stack1 == ItemStack.EMPTY || stack1.getCount() == 0) {
					ItemHandlerHelper.insertItem(handler, this.inventory.extractInternal(0, 1, false), false);
				}
							
				markDirty();
			}
		}
	}	
		
	private void incrementTickCycle() {
		tickCycle ++;
	}
	
	private void resetTickCycle() {
		tickCycle = 0;
	}
		
	@SuppressWarnings("unchecked")
    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
        if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return (T) this.inventory;
        }
        return super.getCapability(capability, facing);
    }
		
    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
        return capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY ||
        super.hasCapability(capability, facing);
    }
}

