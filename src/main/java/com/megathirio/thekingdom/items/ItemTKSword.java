package com.megathirio.thekingdom.items;

import com.megathirio.thekingdom.reference.TKTabs;
import net.minecraft.item.ItemSword;

/**
 * Created by TheJackyl on 11/13/2015.
 */
public class ItemTKSword extends net.minecraft.item.ItemSword {
    public ItemTKSword(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(TKTabs.TOOLS_TAB);
    }
}
