package com.megathirio.thekingdom;

import com.megathirio.thekingdom.blocks.TKBlocks;
import com.megathirio.thekingdom.crafting.TKCrafting;
import com.megathirio.thekingdom.items.TKItems;
import com.megathirio.thekingdom.network.TKGuiHandler;
import com.megathirio.thekingdom.tileentities.TKTileEntities;
import com.megathirio.thekingdom.world.TKWorldGen;
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
        TKItems.createItems();
        TKBlocks.createBlocks();
        TKTileEntities.init();
    }

    public void init(FMLInitializationEvent e) {
        TKCrafting.initCrafting();
        GameRegistry.registerWorldGenerator(new TKWorldGen(), 0);
        NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new TKGuiHandler());
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
