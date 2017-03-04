package com.jtsfour.dwcore.tileentity;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class DWTileEntityHandler {
	
	private static ArrayList<Class<? extends TileEntity>> tclasses = new ArrayList<Class<? extends TileEntity>>();
	private static ArrayList<String> tnames = new ArrayList<String>();
	
	private static boolean init=false;
	
	public DWTileEntityHandler(){
		
	}
	
	public static boolean addTileEntity(Class<? extends TileEntity> c, String name){
		if(!init){
			tclasses.add(c);
			tnames.add(name);
			return true;
		}
		return false;
	}
	
	public static boolean init(){
		if(!init){
			for(int i=0;i<tclasses.size();i++){
				GameRegistry.registerTileEntity(tclasses.get(i), tnames.get(i));
			}
			return true;
		}
		return false;
	}

}
