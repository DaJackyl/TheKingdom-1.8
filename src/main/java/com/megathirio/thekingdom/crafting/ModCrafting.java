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

        //Shapeless

        //Shaped
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperHelmet), "@@@", "@ @", '@', ModItems.copperIngot);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperChestplate), "@ @", "@@@", "@@@", '@', ModItems.copperIngot);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperLeggings), "@@@", "@ @", "@ @", '@', ModItems.copperIngot);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperBoots), "@ @", "@ @", '@', ModItems.copperIngot);

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.flintTool), Items.flint, Items.stick);

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperPickaxe), "@@@", " # ", " # ", '@', ModItems.copperIngot, '#', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperAxe), "@@ ", "@# ", " # ", '@', ModItems.copperIngot, '#', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperHoe), "@@ ", " # ", " # ", '@', ModItems.copperIngot, '#', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperSpade), " @ ", " # ", " # ", '@', ModItems.copperIngot, '#', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperSword), " @ ", " @ ", " # ", '@', ModItems.copperIngot, '#', Items.stick);
        //Smelting
        GameRegistry.addSmelting(ModBlocks.borniteOre, new ItemStack(ModItems.copperIngot), 1.0F);
    }
}
