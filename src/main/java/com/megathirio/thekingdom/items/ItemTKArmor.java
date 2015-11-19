package com.megathirio.thekingdom.items;

import com.megathirio.thekingdom.reference.TKTabs;
import net.minecraft.item.ItemArmor;

/**
 * Created by TheJackyl on 11/13/2015.
 */
public class ItemTKArmor extends ItemArmor {

    public ItemTKArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);

        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(TKTabs.ARMOR_TAB);
    }
}
