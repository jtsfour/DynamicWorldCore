package com.jtsfour.dwcore.item;

import java.util.ArrayList;

public class DWItemHandler {
	
	private static ArrayList<DWItem> items = new ArrayList<DWItem>();
	private static ArrayList<DWItemBlock> itemblocks = new ArrayList<DWItemBlock>();
	
	private static boolean init=false;

	public DWItemHandler() {
		
	}
	
	public static boolean addItem(DWItem item){
		if(!init){
			items.add(item);
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean addItemBlock(DWItemBlock item){
		if(!init){
			itemblocks.add(item);
			return true;
		}else{
			return false;
		}
	}
	
	public static void init(){
		if(!init){
			for(int i=0;i<items.size();i++){
				items.get(i).register();
			}
			
			for(int c=0;c<itemblocks.size();c++){
				itemblocks.get(c).register();
			}
		}
		init=true;
	}
	
	public static ArrayList<DWItem> getItems(){
		return items;
	}
	
	public static ArrayList<DWItemBlock> getItemBlocks(){
		return itemblocks;
	}

}
