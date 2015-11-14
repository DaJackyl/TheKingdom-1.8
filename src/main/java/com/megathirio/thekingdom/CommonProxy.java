package com.megathirio.thekingdom;

import com.megathirio.thekingdom.blocks.ModBlocks;
import com.megathirio.thekingdom.crafting.ModCrafting;
import com.megathirio.thekingdom.items.ModItems;
import com.megathirio.thekingdom.world.TheKingdomWorldGen;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by TheJackyl on 11/9/2015.
 */
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        ModItems.createItems();
        ModBlocks.createBlocks();
    }

    public void init(FMLInitializationEvent e) {
        ModCrafting.initCrafting();
        GameRegistry.registerWorldGenerator(new TheKingdomWorldGen(), 0);
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
