package skizlit.jcmods.common.blocks.machines.storage;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemStackHandler;

public class InternalInventory extends ItemStackHandler {
	
	private final String name;
	private final boolean canInsert, canExtract;
	
	public InternalInventory(int inventorySize) {
		this(null, inventorySize, true, true);
	}
	   
	public InternalInventory(String name, int inventorySize) {
		this(null, inventorySize, true, true);
	}
	
	public InternalInventory(int inventorySize, boolean canInsert, boolean canExtract) {
		this(null, inventorySize, true, true);
	}
	
	public InternalInventory(String name, int inventorySize, boolean canInsert, boolean canExtract) {
		super(inventorySize);
	    this.name = name;
	    this.canInsert = canInsert;
	    this.canExtract = canExtract;
	}
	
    public String getName() {
        return name;
    }
    
    public boolean hasCustomName() {
        return name != null;
    }
    
    public ITextComponent getCustomName() {
        return new TextComponentTranslation(name);
    }
    
	public boolean isEmpty() {
		for (int i = 0; i < this.getSlots(); i++) {
			if (this.getStackInSlot(i) != null || this.getStackInSlot(i).getCount() != 0)
				return false;	
		}
		
		return true;
	}
    
    @Override
    public ItemStack insertItem(int slot, ItemStack stack, boolean simulate) {
    	if(canInsert())
    		return super.insertItem(slot, stack, simulate);
    	else
    		return stack;
    }
        
    @Override
    public ItemStack extractItem(int slot, int amount, boolean simulate)
    {
    	if(canExtract())
    		return super.extractItem(slot, amount, simulate);
    	else
    		return ItemStack.EMPTY;	
    }
    	
    /**
     * Used for machine operations to insert
     */
    public ItemStack insertInternal(int slot, ItemStack stack, boolean simulate) {
    	return super.insertItem(slot, stack, simulate);
    }
    
    /**
     * Used for machine operations to extract
     */
    public ItemStack extractInternal(int slot, int amount, boolean simulate)
    {
    	return super.extractItem(slot, amount, simulate);
    }
    
    /**
     *  Used to extract full stack items
     */
	public ItemStack getAndRemoveSlot(int slot)	{
		ItemStack extract = this.getStackInSlot(slot).copy();
		
		if(!extract.isEmpty())
			this.setStackInSlot(slot, ItemStack.EMPTY);
		
		return extract;
	}
	
    /**
     * Inserts an ItemStack into the inventory filling at each available slot till no more slots are available. 
     */	
	public ItemStack insertItemFirstAvaliableSlot(ItemStack stack, boolean simulate) {		
		for(int i = 0; i < this.getSlots(); i++) {
			
		if(insertItem(i, stack, true) != stack) 
				return insertItem(i, stack, false);
		}
		
		return stack;
	}
	
	/**
	 * Drops items from inventory, normally used for when breaking the block/machine.
	 * @param storeInventory - This boolean will be used if the item is to keep its inventory when broken
	 */
	public void dropInventory(World world, BlockPos pos, boolean storeInventory) {
		if (!storeInventory) {
			for (int i = 0; i < this.getSlots(); ++i)
			{
				ItemStack stack = this.getStackInSlot(i).copy();
				
				this.setStackInSlot(i, ItemStack.EMPTY);
				
				if(!stack.isEmpty()){
					world.spawnEntity(new EntityItem(world, pos.getX(), pos.getY()+1, pos.getZ(), stack));
				}
			}	
		}			
	}
	
    /**
     * Can Items be extracted
     */
	public boolean canExtract()
	{
		return canExtract;
	}
	
	/**
	 * Can Items be inserted
	 */
	public boolean canInsert()
	{
		return canInsert;
	}
	
	/**
	 * This will drop all items in inventory
	 */
	public void dropInventory(World world, BlockPos pos) {
        for (int i = 0; i < this.getSlots(); ++i)
        {
        	ItemStack stack = getAndRemoveSlot(i);
        	
        	if(!stack.isEmpty()){
        		world.spawnEntity(new EntityItem(world, pos.getX(), pos.getY()+1, pos.getZ(), stack));
        	}
        }
	}
	
    public void writeToNBT(NBTTagCompound compound)
    {
    	compound.setTag("inventory", serializeNBT());
    }
     
    public void readFromNBT(NBTTagCompound compound)
    {
    	deserializeNBT(compound.getCompoundTag("inventory"));
    }
}
