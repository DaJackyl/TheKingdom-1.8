package com.megathirio.thekingdom.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by TheJackyl on 11/9/2015.
 */
public class ModBlocks {

    public static Block tutorialBlock;

    public static void createBlocks() {
        GameRegistry.registerBlock(tutorialBlock = new CoreBlock("tutorial_block").setLightLevel(1.0f), "tutorial_block");
    }
}
