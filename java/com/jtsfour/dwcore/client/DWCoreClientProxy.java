package com.jtsfour.dwcore.client;

import com.jtsfour.dwcore.DWCoreCommonProxy;
import com.jtsfour.dwcore.client.render.item.DWItemRenderHandler;

public class DWCoreClientProxy extends DWCoreCommonProxy {

	public DWCoreClientProxy() {
		super();
		
	}
	
	public void preInit(){
		super.preInit();
		
	}
	
	public void init(){
		super.init();
		DWItemRenderHandler.init();
	}
	
	public void postInit(){
		super.postInit();
		
	}

}
