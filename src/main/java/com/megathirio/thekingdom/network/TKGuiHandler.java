package com.megathirio.thekingdom.network;

import com.megathirio.thekingdom.client.gui.GuiTKTileEntity;
import com.megathirio.thekingdom.guicontainer.ContainerTKTileEntity;
import com.megathirio.thekingdom.tileentities.TKTileEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

/**
 * Created by TheJackyl on 11/18/2015.
 */
public class TKGuiHandler implements IGuiHandler {

    public static final int MOD_TILE_ENTITY_GUI = 0;

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == MOD_TILE_ENTITY_GUI)
            return new ContainerTKTileEntity(player.inventory, (TKTileEntity) world.getTileEntity(new BlockPos(x, y, z)));

        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == MOD_TILE_ENTITY_GUI)
            return new GuiTKTileEntity(player.inventory, (TKTileEntity) world.getTileEntity(new BlockPos(x, y, z)));

        return null;
    }
}
