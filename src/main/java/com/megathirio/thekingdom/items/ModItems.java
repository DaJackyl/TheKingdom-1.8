package com.megathirio.thekingdom.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by TheJackyl on 11/9/2015.
 */
public class ModItems {

    public static Item tutorialItem;

    public static void createItems() {
        GameRegistry.registerItem(tutorialItem = new CoreItem("tutorial_item"), "tutorial_item");
    }
}
