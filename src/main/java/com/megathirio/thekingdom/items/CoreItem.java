package com.megathirio.thekingdom.items;

import com.megathirio.thekingdom.reference.TKTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by TheJackyl on 11/9/2015.
 */
public class CoreItem extends Item{
    public CoreItem(String unlocalizedName){
        super();

        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(TKTabs.ITEMS_TAB);
    }
}
