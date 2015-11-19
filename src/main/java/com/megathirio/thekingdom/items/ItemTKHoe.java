package com.megathirio.thekingdom.items;

import com.megathirio.thekingdom.reference.TKTabs;
import net.minecraft.item.ItemHoe;

/**
 * Created by TheJackyl on 11/13/2015.
 */
public class ItemTKHoe extends net.minecraft.item.ItemHoe {
    public ItemTKHoe(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(TKTabs.TOOLS_TAB);
    }
}
