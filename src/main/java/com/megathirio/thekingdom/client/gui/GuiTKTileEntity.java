package com.megathirio.thekingdom.client.gui;

import com.megathirio.thekingdom.guicontainer.ContainerTKTileEntity;
import com.megathirio.thekingdom.tileentities.TKTileEntity;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

/**
 * Created by TheJackyl on 11/18/2015.
 */
public class GuiTKTileEntity extends GuiContainer {

    private IInventory playerInv;
    private TKTileEntity te;

    public GuiTKTileEntity(IInventory playerInv, TKTileEntity te) {
        super(new ContainerTKTileEntity(playerInv, te));

        this.playerInv = playerInv;
        this.te = te;

        this.xSize = 176;
        this.ySize = 166;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(new ResourceLocation("thekingdom:textures/gui/container/tk_tile_entity.png"));
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        String s = this.te.getDisplayName().getUnformattedText();
        this.fontRendererObj.drawString(s, 88 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);            //#404040
        this.fontRendererObj.drawString(this.playerInv.getDisplayName().getUnformattedText(), 8, 72, 4210752);      //#404040
    }
}
