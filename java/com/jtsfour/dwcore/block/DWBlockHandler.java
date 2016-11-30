package com.jtsfour.dwcore.block;

import java.util.ArrayList;

public class DWBlockHandler {
	
	private static ArrayList<DWBlock> blocks = new ArrayList<DWBlock>();
	private static boolean init=false;

	public DWBlockHandler() {
		
	}
	
	public static boolean addBlock(DWBlock block){
		if(!init){
			blocks.add(block);
			return true;
		}
		return false;
	}
	
	public static void init(){
		if(!init){
			for(int i=0;i<blocks.size();i++){
				blocks.get(i).register();
			}
		}
		init=true;
	}
	

}
