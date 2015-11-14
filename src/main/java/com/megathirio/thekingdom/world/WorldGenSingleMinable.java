package com.megathirio.thekingdom.world;

import com.google.common.base.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

/**
 * Created by TheJackyl on 11/14/2015.
 */
public class WorldGenSingleMinable extends WorldGenerator{

    private IBlockState block;
    private Predicate<IBlockState> target;

    public WorldGenSingleMinable(IBlockState block, int maxQty, Predicate<IBlockState> target) {
        this.block = block;
        this.target = target;
    }

    @SuppressWarnings("unchecked")
    public WorldGenSingleMinable(IBlockState block, int maxQty) {
        this(block, maxQty, BlockHelper.forBlock(Blocks.stone));
    }

    @Override
    public boolean generate(World world, Random random, BlockPos pos) {
        if (world.getBlockState(pos).getBlock().isReplaceableOreGen(world, pos, this.target))
            world.setBlockState(pos, this.block);
        return true;
    }
}
