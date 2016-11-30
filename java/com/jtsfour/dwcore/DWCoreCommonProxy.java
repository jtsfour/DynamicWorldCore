package com.jtsfour.dwcore;

import com.jtsfour.dwcore.block.DWBlockHandler;
import com.jtsfour.dwcore.block.DWCoreBlocks;
import com.jtsfour.dwcore.item.DWCoreItems;
import com.jtsfour.dwcore.item.DWItemHandler;

public class DWCoreCommonProxy {
	
	public DWCoreCommonProxy(){
		
	}
	
	public void preInit(){
		DWCoreItems.preInit();
		DWCoreBlocks.preInit();
	}
	
	public void init(){
		DWBlockHandler.init();//register blocks first IMPORTANT!!!!! (i think)
		DWItemHandler.init();
	}
	
	public void postInit(){
		
	}
}
