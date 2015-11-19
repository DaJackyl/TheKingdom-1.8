package com.megathirio.thekingdom.items;

import com.megathirio.thekingdom.reference.TKTabs;
import net.minecraft.item.ItemAxe;

/**
 * Created by TheJackyl on 11/13/2015.
 */
public class ItemTKAxe extends net.minecraft.item.ItemAxe {
    public ItemTKAxe(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(TKTabs.TOOLS_TAB);
    }
}
