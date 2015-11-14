package com.megathirio.thekingdom.items;

import net.minecraft.item.ItemSword;

/**
 * Created by TheJackyl on 11/13/2015.
 */
public class ItemModSword extends net.minecraft.item.ItemSword {
    public ItemModSword(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
    }
}
