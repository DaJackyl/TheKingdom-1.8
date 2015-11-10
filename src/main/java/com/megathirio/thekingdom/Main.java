package com.megathirio.thekingdom;

import com.megathirio.thekingdom.reference.Core;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by TheJackyl on 11/9/2015.
 */
@Mod(modid = Core.MOD_ID, name = Core.MOD_NAME, version = Core.VERSION)
public class Main {

    @Mod.Instance
    public static Main instance = new Main();

    @SidedProxy(clientSide=Core.CLIENT_PROXY, serverSide=Core.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        this.proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        this.proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        this.proxy.postInit(e);
    }
}
