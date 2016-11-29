package com.jtsfour.dwcore.client.render.item;

import java.util.ArrayList;

import com.jtsfour.dwcore.DynamicWorldCore;
import com.jtsfour.dwcore.item.DWItem;
import com.jtsfour.dwcore.item.DWItemBlock;
import com.jtsfour.dwcore.item.DWItemHandler;

public class DWItemRenderHandler {
	
	private static boolean init=false;
	
	public DWItemRenderHandler() {
		
	}
	
	public static void init(){
		if(!init){
			if(DynamicWorldCore.ISCLIENT){
				ArrayList<DWItem> items = DWItemHandler.getItems();
				ArrayList<DWItemBlock> itemblocks = DWItemHandler.getItemBlocks();
				for(int i=0;i<items.size();i++){
					items.get(i).registerModels();
				}
				
				for(int c=0;c<itemblocks.size();c++){
					itemblocks.get(c).registerModels();
				}
			}
		}
		init=true;
	}
}
