package com.jtsfour.dwcore;

import com.jtsfour.dwcore.item.DWCoreItems;
import com.jtsfour.dwcore.item.DWItemHandler;

public class DWCoreCommonProxy {
	
	public DWCoreCommonProxy(){
		
	}
	
	public void preInit(){
		DWCoreItems.preInit();
	}
	
	public void init(){
		DWItemHandler.init();
	}
	
	public void postInit(){
		
	}
}
