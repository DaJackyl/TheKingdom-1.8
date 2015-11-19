package com.megathirio.thekingdom.items;

import com.megathirio.thekingdom.reference.TKTabs;
import net.minecraft.item.ItemSpade;

/**
 * Created by TheJackyl on 11/13/2015.
 */
public class ItemTKSpade extends net.minecraft.item.ItemSpade {
    public ItemTKSpade(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(TKTabs.TOOLS_TAB);
    }
}
