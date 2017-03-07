package com.jtsfour.dwcore.client.render.block;

import com.jtsfour.dwcore.tileentity.TestTileEntity;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class DWCoreTileEntitySpecialRenderers {
	
	public static TileEntitySpecialRenderer testtileentityspecialrenderer;
	
	public static void preInit(){
		testtileentityspecialrenderer = new TestTileEntitySpecialRenderer();
		DWTileEntityRendererHandler.addRenderer(TestTileEntity.class, testtileentityspecialrenderer);
	}
}
