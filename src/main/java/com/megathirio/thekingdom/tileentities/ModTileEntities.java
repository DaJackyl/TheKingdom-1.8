package com.megathirio.thekingdom.tileentities;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by TheJackyl on 11/16/2015.
 */
public class ModTileEntities {

    public static void init() {
        GameRegistry.registerTileEntity(ModTileEntity.class, "tutorial_tile_entity");
    }
}
