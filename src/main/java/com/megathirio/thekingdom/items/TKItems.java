package com.megathirio.thekingdom.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by TheJackyl on 11/9/2015.
 */
public class TKItems {

    public static ToolMaterial FLINT = EnumHelper.addToolMaterial("FLINT", 0, 19, 2.0F, 0.0F, 1);
    public static ToolMaterial COPPER = EnumHelper.addToolMaterial("COPPER", 2, 175, 5.0F, 1.5F, 18);
    public static ItemArmor.ArmorMaterial COPPER_ARMOR = EnumHelper.addArmorMaterial("COPPER_ARMOR", "thekingdom:copper_armor", 10, new int[] {2, 5, 4, 2}, 18);

    public static Item copperIngot;
    public static Item amethystGem;
    public static Item aquamarineGem;
    public static Item scarletEmeraldGem;

    public static Item copperPickaxe;
    public static Item copperAxe;
    public static Item copperSpade;
    public static Item copperHoe;
    public static Item copperSword;

    public static Item copperHelmet;
    public static Item copperChestplate;
    public static Item copperLeggings;
    public static Item copperBoots;

    public static Item flintTool;

    public static Item curedBeef;
    public static Item curedPork;

    public static void createItems() {
        GameRegistry.registerItem(copperIngot = new CoreItem("copper_ingot"), "copper_ingot");
        GameRegistry.registerItem(amethystGem = new CoreItem("amethyst_gem"), "amethyst_gem");
        GameRegistry.registerItem(aquamarineGem = new CoreItem("aquamarine_gem"), "aquamarine_gem");
        GameRegistry.registerItem(scarletEmeraldGem = new CoreItem("scarlet_emerald_gem"), "scarlet_emerald_gem");

        GameRegistry.registerItem(copperPickaxe = new ItemTKPickaxe("copper_pickaxe", COPPER), "copper_pickaxe");
        GameRegistry.registerItem(copperAxe = new ItemTKAxe("copper_axe", COPPER), "copper_axe");
        GameRegistry.registerItem(copperSpade = new ItemTKSpade("copper_spade", COPPER), "copper_spade");
        GameRegistry.registerItem(copperHoe = new ItemTKHoe("copper_hoe", COPPER), "copper_hoe");
        GameRegistry.registerItem(copperSword = new ItemTKSword("copper_sword", COPPER), "copper_sword");

        GameRegistry.registerItem(copperHelmet = new ItemTKArmor("copper_helmet", COPPER_ARMOR, 1, 0), "copper_helmet");
        GameRegistry.registerItem(copperChestplate = new ItemTKArmor("copper_chestplate", COPPER_ARMOR, 1, 1), "copper_chestplate");
        GameRegistry.registerItem(copperLeggings = new ItemTKArmor("copper_leggings", COPPER_ARMOR, 2, 2), "copper_leggings");
        GameRegistry.registerItem(copperBoots = new ItemTKArmor("copper_boots", COPPER_ARMOR, 1, 3), "copper_boots");

        GameRegistry.registerItem(flintTool = new ItemFlintTool("flint_tool", FLINT), "flint_tool");

        GameRegistry.registerItem(curedBeef = new ItemTKFood("cured_beef", 2, 1.0f, true).setAlwaysEdible(), "cured_beef");
        GameRegistry.registerItem(curedPork = new ItemTKFood("cured_pork", 2, 1.0f, true).setAlwaysEdible(), "cured_pork");
    }
}