package com.megathirio.thekingdom.guicontainer;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

/**
 * Created by TheJackyl on 11/18/2015.
 */
public class SingleItemSlot extends Slot {

    public SingleItemSlot(IInventory inventory, int index, int xPosition, int yPosition) {
        super(inventory, index, xPosition, yPosition);
    }

    @Override
    public int getSlotStackLimit() {
        return 1;
    }
}
