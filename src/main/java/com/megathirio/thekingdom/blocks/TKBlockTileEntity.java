package com.megathirio.thekingdom.blocks;

import com.megathirio.thekingdom.Main;
import com.megathirio.thekingdom.network.TKGuiHandler;
import com.megathirio.thekingdom.tileentities.TKTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

/**
 * Created by TheJackyl on 11/16/2015.
 */
public class TKBlockTileEntity extends Block implements ITileEntityProvider{

    protected TKBlockTileEntity(String unlocalizedName) {
        super(Material.iron);
        this.setUnlocalizedName(unlocalizedName);
        this.setHardness(2.0f);
        this.setResistance(6.0f);
        this.setHarvestLevel("pickaxe", 2);
    }

    @Override
    public void breakBlock(World world, BlockPos pos, IBlockState blockstate) {
        TKTileEntity te = (TKTileEntity) world.getTileEntity(pos);
        InventoryHelper.dropInventoryItems(world, pos, te);
        super.breakBlock(world, pos, blockstate);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TKTileEntity();
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        if (stack.hasDisplayName()) {
            ((TKTileEntity) worldIn.getTileEntity(pos)).setCustomName(stack.getDisplayName());
        }
    }

    @Override
    public int getRenderType() {
        return 3;
    }

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (!world.isRemote) {
            player.openGui(Main.instance, TKGuiHandler.MOD_TILE_ENTITY_GUI, world, pos.getX(), pos.getY(), pos.getZ());
        }
        return true;
    }
}
