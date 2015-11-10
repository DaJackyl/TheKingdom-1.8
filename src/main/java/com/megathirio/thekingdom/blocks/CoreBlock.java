package com.megathirio.thekingdom.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by TheJackyl on 11/9/2015.
 */
public class CoreBlock extends Block{

    public CoreBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(hardness);
        this.setResistance(resistance);
    }

    public CoreBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.rock, hardness, resistance);
    }

    public CoreBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }
}
