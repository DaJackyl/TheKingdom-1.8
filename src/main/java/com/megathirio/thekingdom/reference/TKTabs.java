package com.megathirio.thekingdom.reference;

import com.megathirio.thekingdom.items.TKItems;
import com.megathirio.thekingdom.reference.Core;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by TheJackyl on 11/18/2015.
 */
public class TKTabs {

    public static final CreativeTabs TOOLS_TAB = new CreativeTabs(Core.RESOURCE_PREFIX + "tools_tab") {
        @Override
        public Item getTabIconItem() {
            return TKItems.flintTool;
        }
    };

    public static final CreativeTabs ARMOR_TAB = new CreativeTabs(Core.RESOURCE_PREFIX + "armor_tab") {
        @Override
        public Item getTabIconItem() {
            return TKItems.copperChestplate;
        }
    };

    public static final CreativeTabs FOOD_TAB = new CreativeTabs(Core.RESOURCE_PREFIX + "food_tab") {
        @Override
        public Item getTabIconItem() {
            return TKItems.curedBeef;
        }
    };

    public static final CreativeTabs ITEMS_TAB = new CreativeTabs(Core.RESOURCE_PREFIX + "items_tab") {
        @Override
        public Item getTabIconItem() {
            return TKItems.copperIngot;
        }
    };

}
