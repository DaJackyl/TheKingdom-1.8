package com.megathirio.thekingdom;

import com.megathirio.thekingdom.blocks.ModBlocks;
import com.megathirio.thekingdom.crafting.ModCrafting;
import com.megathirio.thekingdom.items.ModItems;
import com.megathirio.thekingdom.network.ModGuiHandler;
import com.megathirio.thekingdom.tileentities.ModTileEntities;
import com.megathirio.thekingdom.world.TheKingdomWorldGen;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by TheJackyl on 11/9/2015.
 */
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        ModItems.createItems();
        ModBlocks.createBlocks();
        ModTileEntities.init();
    }

    public void init(FMLInitializationEvent e) {
        ModCrafting.initCrafting();
        GameRegistry.registerWorldGenerator(new TheKingdomWorldGen(), 0);
        NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new ModGuiHandler());
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
