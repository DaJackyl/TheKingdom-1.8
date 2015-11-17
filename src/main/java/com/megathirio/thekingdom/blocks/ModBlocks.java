package com.megathirio.thekingdom.blocks;

import com.megathirio.thekingdom.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by TheJackyl on 11/9/2015.
 */
public class ModBlocks {

    public static Block borniteOre;
    public static Block amethystOre;
    public static Block berylOre;
    public static Block teBlock;

    public static void createBlocks() {
        GameRegistry.registerBlock(borniteOre = new CoreBlock("bornite_ore"), "bornite_ore");
        GameRegistry.registerBlock(amethystOre = new ModBlockOre("amethyst_ore", Material.rock, ModItems.amethystGem, 1, 4), "amethyst_ore");
        GameRegistry.registerBlock(berylOre = new ModBlockBerylOre("beryl_ore", Material.rock), "beryl_ore");
        GameRegistry.registerBlock(teBlock = new ModBlockTileEntity("te_block"), "te_block");
    }
}
