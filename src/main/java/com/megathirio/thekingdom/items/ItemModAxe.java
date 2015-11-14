package com.megathirio.thekingdom.items;

import net.minecraft.item.ItemAxe;

/**
 * Created by TheJackyl on 11/13/2015.
 */
public class ItemModAxe extends net.minecraft.item.ItemAxe {
    public ItemModAxe(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
    }
}
