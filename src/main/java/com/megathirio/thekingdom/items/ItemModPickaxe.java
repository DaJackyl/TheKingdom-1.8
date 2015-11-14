package com.megathirio.thekingdom.items;

import net.minecraft.item.ItemPickaxe;

/**
 * Created by TheJackyl on 11/13/2015.
 */
public class ItemModPickaxe extends net.minecraft.item.ItemPickaxe {
    public ItemModPickaxe(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
    }
}
