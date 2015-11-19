package com.megathirio.thekingdom.crafting;

import com.megathirio.thekingdom.blocks.TKBlocks;
import com.megathirio.thekingdom.items.TKItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by TheJackyl on 11/9/2015.
 */
public class TKCrafting {

    public static void  initCrafting() {

        //Shapeless

        //Shaped
        GameRegistry.addShapedRecipe(new ItemStack(TKItems.copperHelmet), "@@@", "@ @", '@', TKItems.copperIngot);
        GameRegistry.addShapedRecipe(new ItemStack(TKItems.copperChestplate), "@ @", "@@@", "@@@", '@', TKItems.copperIngot);
        GameRegistry.addShapedRecipe(new ItemStack(TKItems.copperLeggings), "@@@", "@ @", "@ @", '@', TKItems.copperIngot);
        GameRegistry.addShapedRecipe(new ItemStack(TKItems.copperBoots), "@ @", "@ @", '@', TKItems.copperIngot);

        GameRegistry.addShapelessRecipe(new ItemStack(TKItems.flintTool), Items.flint, Items.stick);

        GameRegistry.addShapedRecipe(new ItemStack(TKItems.copperPickaxe), "@@@", " # ", " # ", '@', TKItems.copperIngot, '#', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(TKItems.copperAxe), "@@ ", "@# ", " # ", '@', TKItems.copperIngot, '#', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(TKItems.copperHoe), "@@ ", " # ", " # ", '@', TKItems.copperIngot, '#', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(TKItems.copperSpade), " @ ", " # ", " # ", '@', TKItems.copperIngot, '#', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(TKItems.copperSword), " @ ", " @ ", " # ", '@', TKItems.copperIngot, '#', Items.stick);
        //Smelting
        GameRegistry.addSmelting(TKBlocks.borniteOre, new ItemStack(TKItems.copperIngot), 1.0F);
    }
}
