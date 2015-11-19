package com.megathirio.thekingdom.tileentities;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by TheJackyl on 11/16/2015.
 */
public class TKTileEntities {

    public static void init() {
        GameRegistry.registerTileEntity(TKTileEntity.class, "tutorial_tile_entity");
    }
}
