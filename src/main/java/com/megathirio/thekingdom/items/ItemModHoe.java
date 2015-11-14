package com.megathirio.thekingdom.items;

import net.minecraft.item.ItemHoe;

/**
 * Created by TheJackyl on 11/13/2015.
 */
public class ItemModHoe extends net.minecraft.item.ItemHoe {
    public ItemModHoe(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
    }
}
