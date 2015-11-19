package com.megathirio.thekingdom.items;

import com.megathirio.thekingdom.reference.TKTabs;
import net.minecraft.item.ItemPickaxe;

/**
 * Created by TheJackyl on 11/13/2015.
 */
public class ItemTKPickaxe extends net.minecraft.item.ItemPickaxe {
    public ItemTKPickaxe(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(TKTabs.TOOLS_TAB);
    }
}
