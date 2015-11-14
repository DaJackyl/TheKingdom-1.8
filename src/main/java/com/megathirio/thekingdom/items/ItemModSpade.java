package com.megathirio.thekingdom.items;

import net.minecraft.item.ItemSpade;

/**
 * Created by TheJackyl on 11/13/2015.
 */
public class ItemModSpade extends net.minecraft.item.ItemSpade {
    public ItemModSpade(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
    }
}
