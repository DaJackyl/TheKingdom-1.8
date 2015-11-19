package com.megathirio.thekingdom.blocks;

import com.megathirio.thekingdom.items.TKItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;

import java.util.ArrayList;

/**
 * Created by TheJackyl on 11/14/2015.
 */
public class BerylOre extends Block{

    protected BerylOre(String unlocalizedName, Material material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setStepSound(soundTypeStone);
        this.setHardness(10.0f);
        this.setResistance(20.0f);
        this.setHarvestLevel("pickaxe", 2);
    }

    @Override
    public ArrayList getDrops(IBlockAccess world, BlockPos pos, IBlockState blockstate, int fortune) {
        ArrayList drops = new ArrayList();
        drops.add(new ItemStack(TKItems.aquamarineGem, RANDOM.nextInt(4) + 1));
        if (RANDOM.nextFloat() < 0.1F)
            drops.add(new ItemStack(TKItems.scarletEmeraldGem, RANDOM.nextInt(2) + 1));
        if (RANDOM.nextFloat() < 0.2F)
            drops.add(new ItemStack(Items.emerald, RANDOM.nextInt(2) + 1));
        return drops;
    }
}
