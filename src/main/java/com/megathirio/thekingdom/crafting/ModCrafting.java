package com.megathirio.thekingdom.crafting;

import com.megathirio.thekingdom.blocks.ModBlocks;
import com.megathirio.thekingdom.items.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by TheJackyl on 11/9/2015.
 */
public class ModCrafting {

    public static void  initCrafting() {
        GameRegistry.addRecipe(new ItemStack(ModBlocks.tutorialBlock), "##", "##", '#', ModItems.tutorialItem);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tutorialItem), new Object[]{Items.redstone, new ItemStack(Items.dye, 1, 4)});
        GameRegistry.addSmelting(Items.diamond, new ItemStack(ModItems.tutorialItem), 1.0F);
    }
}
