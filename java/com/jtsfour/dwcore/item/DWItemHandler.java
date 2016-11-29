package com.jtsfour.dwcore.item;

import java.util.ArrayList;

public class DWItemHandler {
	
	private static ArrayList<DWItem> items = new ArrayList<DWItem>();
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
	
	public static void init(){
		if(!init){
			for(int i=0;i<items.size();i++){
				items.get(i).register();
			}
		}
		init=true;
	}
	
	public static ArrayList<DWItem> getItems(){
		return items;
	}

}
