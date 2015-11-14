package com.megathirio.thekingdom.items;

import net.minecraft.item.ItemArmor;

/**
 * Created by TheJackyl on 11/13/2015.
 */
public class ItemModArmor extends ItemArmor {

    public ItemModArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);

        this.setUnlocalizedName(unlocalizedName);
    }
}
