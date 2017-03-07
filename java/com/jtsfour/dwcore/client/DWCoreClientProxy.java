package com.jtsfour.dwcore.client;

import com.jtsfour.dwcore.DWCoreCommonProxy;
import com.jtsfour.dwcore.client.render.block.DWCoreTileEntitySpecialRenderers;
import com.jtsfour.dwcore.client.render.block.DWTileEntityRendererHandler;
import com.jtsfour.dwcore.client.render.item.DWItemRenderHandler;

public class DWCoreClientProxy extends DWCoreCommonProxy {

	public DWCoreClientProxy() {
		super();
		
	}
	
	public void preInit(){
		super.preInit();
		DWCoreTileEntitySpecialRenderers.preInit();
	}
	
	public void init(){
		super.init();
		DWItemRenderHandler.init();
		DWTileEntityRendererHandler.init();
	}
	
	public void postInit(){
		super.postInit();
		
	}

}
