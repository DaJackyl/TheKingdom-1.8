package com.megathirio.thekingdom.client.render.items;

import com.megathirio.thekingdom.items.ModItems;
import com.megathirio.thekingdom.reference.Core;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by TheJackyl on 11/9/2015.
 */
public class ItemRenderRegister {

    public static void registerItemRenderer() {
        reg(ModItems.tutorialItem);
    }

    public static String modid = Core.MOD_ID;

    public static void reg(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}