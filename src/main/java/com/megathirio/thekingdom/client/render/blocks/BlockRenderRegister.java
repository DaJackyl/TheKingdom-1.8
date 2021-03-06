package com.megathirio.thekingdom.client.render.blocks;

import com.megathirio.thekingdom.blocks.TKBlocks;
import com.megathirio.thekingdom.reference.Core;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by TheJackyl on 11/9/2015.
 */
public class BlockRenderRegister {

    public static String modid = Core.MOD_ID;

    public static void registerBlockRenderer() {
        reg(TKBlocks.borniteOre);
        reg(TKBlocks.berylOre);
        reg(TKBlocks.amethystOre);
        reg(TKBlocks.teBlock);
    }

    public static void reg(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }

    public static void reg(Block block, int meta, String file) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), meta, new ModelResourceLocation(modid + ":" + file, "inventory"));
    }
}
