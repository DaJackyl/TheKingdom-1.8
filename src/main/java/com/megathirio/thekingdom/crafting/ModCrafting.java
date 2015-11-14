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
        GameRegistry.addSmelting(ModBlocks.borniteOre, new ItemStack(ModItems.copperIngot), 1.0F);
    }
}
