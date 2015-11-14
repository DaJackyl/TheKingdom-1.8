package com.megathirio.thekingdom.world;

import com.megathirio.thekingdom.blocks.ModBlocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * Created by TheJackyl on 11/14/2015.
 */
public class TheKingdomWorldGen implements IWorldGenerator {

    private WorldGenerator gen_bornite_ore; //Generates Bornite Ore (used in Overworld)
    private WorldGenerator gen_amethyst_ore; //Generates Amethyst Ore (used in Overworld)
    private WorldGenerator gen_beryl_ore; //Generates Beryl Ore (used in Overworld)

    public TheKingdomWorldGen() {
        this.gen_bornite_ore = new WorldGenMinable(ModBlocks.borniteOre.getDefaultState(), 7);
        this.gen_amethyst_ore = new WorldGenMinable(ModBlocks.amethystOre.getDefaultState(), 6);
        this.gen_beryl_ore = new WorldGenSingleMinable(ModBlocks.berylOre.getDefaultState(), 2);
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimensionId()) {
            case 0: //Overworld
                this.runGenerator(this.gen_bornite_ore, world, random, chunkX, chunkZ, 35, 0, 256);
                this.runGenerator(this.gen_amethyst_ore, world, random, chunkX, chunkZ, 10, 0, 64);
                this.runGenerator(this.gen_beryl_ore, world, random, chunkX, chunkZ, 10, 0, 256);
                break;
            case -1: //Nether

                break;
            case 1: //End

                break;
        }
    }

    private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
        if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
            throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

        int heightDiff = maxHeight - minHeight + 1;
        for (int i = 0; i < chancesToSpawn; i ++) {
            int x = chunk_X * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunk_Z * 16 + rand.nextInt(16);
            generator.generate(world, rand, new BlockPos(x, y, z));
        }
    }
}