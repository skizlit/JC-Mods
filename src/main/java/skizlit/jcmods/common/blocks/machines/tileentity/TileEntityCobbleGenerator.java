package skizlit.jcmods.common.blocks.machines.tileentity;

import javax.annotation.Nullable;

import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemHandlerHelper;
import skizlit.jcmods.common.blocks.machines.storage.InternalInventory;

public class TileEntityCobbleGenerator extends TileEntity implements ITickable {

	int tickCycle = 0;
	
	public InternalInventory inventory = new InternalInventory(6, false, true);
	
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
			
			for (int i = 0; 1 < inventory.getSlots(); i++) {
				
				if (getInventoryStack(i).getCount() == getMaxStackSize())
					continue;
				
				if (getInventoryStack(i) == ItemStack.EMPTY) {
					inventory.setStackInSlot(i, new ItemStack(Blocks.COBBLESTONE));
				}
				else if (getInventoryStack(i).getCount() < getMaxStackSize())
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
		if (tile != null && tile.hasCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.DOWN)) {
			IItemHandler handler = tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.DOWN);
			
			for (int i = 0; 1 < inventory.getSlots(); i++) {
				if (this.inventory.getStackInSlot(i) == ItemStack.EMPTY) 
					continue;
				
				ItemHandlerHelper.insertItem(handler, this.inventory.extractInternal(0, 1, false), false);
			
				markDirty();
			}
		}
		else if (tile instanceof IInventory) {
			IInventory iinventory = (IInventory) tile;
			if (iinventory instanceof TileEntityCobbleGenerator)
				return;
			
			if (isAttachedFull(iinventory, EnumFacing.UP)) {
				System.out.println("Full");
				return;
			}
			else {
				for (int i = 0; 1 < inventory.getSlots(); i++) {
					if (this.inventory.getStackInSlot(i) == ItemStack.EMPTY || this.inventory.getStackInSlot(i).getCount() > 0) 
						continue;
					
					ItemStack stack = this.inventory.getStackInSlot(i).copy();
					ItemStack stack1 = pushStackToInventory(iinventory, stack, EnumFacing.UP);
					if (stack1 == ItemStack.EMPTY || stack1.getCount() == 0 && stack.getCount() != stack1.getCount())
						iinventory.markDirty();
					else
						this.inventory.setStackInSlot(i, stack1);
				}
			}
			
		}
	}	
	
	/*
	 * Checks if the attached inventory is full
	 */
	protected boolean isAttachedFull(IInventory inventoryIn, EnumFacing side) {
		if (inventoryIn instanceof ISidedInventory) {
			ISidedInventory isidedinventory = (ISidedInventory) inventoryIn;
			int[] slots = isidedinventory.getSlotsForFace(side);

			for (int i : slots) {
				ItemStack stack = isidedinventory.getStackInSlot(i);

				if (stack == ItemStack.EMPTY || stack.getCount() < stack.getMaxStackSize())
					return false;
			}
		} else {
			int size = inventoryIn.getSizeInventory();

			for (int i = 0; i < size; i++) {
				ItemStack itemstack = inventoryIn.getStackInSlot(i);

				if (itemstack == ItemStack.EMPTY || itemstack.getCount() < itemstack.getMaxStackSize())
					return false;
			}
		}

		return true;
	}
	
	public static ItemStack pushStackToInventory(IInventory inventoryIn, ItemStack stack, @Nullable EnumFacing side) {
		if (inventoryIn instanceof ISidedInventory && side != null && inventoryIn.isItemValidForSlot(0, stack.copy())) {
			ISidedInventory isidedinventory = (ISidedInventory) inventoryIn;
			int[] slots = isidedinventory.getSlotsForFace(side);

			for (int i = 0; i < slots.length; i++)
				stack = insertStack(inventoryIn, stack, slots[i], side);
		} else {
			int slots = inventoryIn.getSizeInventory();

			for (int i = 0; i < slots && stack != ItemStack.EMPTY && stack.getCount() > 0; i++)
				stack = insertStack(inventoryIn, stack, i, side);
		}

		if (stack != ItemStack.EMPTY && stack.getCount() == 0)
			stack = ItemStack.EMPTY;

		return stack;
	}
	
	private static ItemStack insertStack(IInventory inventoryIn, ItemStack stack, int index, EnumFacing side) {
		ItemStack itemstack = inventoryIn.getStackInSlot(index);

		if (canInsertItemInSlot(inventoryIn, stack, index, side)) 
			return stack;
		
		int max = Math.min(stack.getMaxStackSize(), inventoryIn.getInventoryStackLimit());
		
		if (itemstack == ItemStack.EMPTY) {
			if (max >= stack.getCount()) {
				inventoryIn.setInventorySlotContents(index, stack);
				stack = ItemStack.EMPTY;
			} else
				inventoryIn.setInventorySlotContents(index, stack.splitStack(max));
		} else if (canCombine(itemstack, stack)) {
				if (max > itemstack.getCount()) {
					int x = max - itemstack.getCount();
					int y = Math.min(stack.getCount(), x);
					stack.setCount(stack.getCount() - y);
					itemstack.setCount(itemstack.getCount() + y);
				}
			}

		return stack;
	}
	
	private static boolean canInsertItemInSlot(IInventory inventoryIn, ItemStack stack, int index, EnumFacing side) {
		return inventoryIn.isItemValidForSlot(index, stack) && (!(inventoryIn instanceof ISidedInventory) || ((ISidedInventory) inventoryIn).canInsertItem(index, stack, side));
	}

	private static boolean canCombine(ItemStack stack1, ItemStack stack2) {
		return stack1.getItem() == stack2.getItem() && (stack1.getMetadata() == stack2.getMetadata() && (stack1.getCount() <= stack1.getMaxStackSize() && ItemStack.areItemStackTagsEqual(stack1, stack2)));
	}
	
	private void incrementTickCycle() {
		tickCycle ++;
	}
	
	private void resetTickCycle() {
		tickCycle = 0;
	}
}

