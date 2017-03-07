package com.jtsfour.dwcore.client.render.block;

import java.util.ArrayList;

import com.jtsfour.dwcore.DynamicWorldCore;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class DWTileEntityRendererHandler {
	
	private static ArrayList<Class<? extends TileEntity>> teclasses = new ArrayList<Class<? extends TileEntity>>();
	private static ArrayList<TileEntitySpecialRenderer> terenderers = new ArrayList<TileEntitySpecialRenderer>();
	
	private static boolean init=false;
	
	public static boolean addRenderer(Class<? extends TileEntity> cla, TileEntitySpecialRenderer ter){
		if(!init){
			teclasses.add(cla);
			terenderers.add(ter);
			return true;
		}
		return false;
	}
	
	public static boolean init(){
		if(!init){
			if(DynamicWorldCore.ISCLIENT){
				for(int i=0;i<teclasses.size();i++){
					ClientRegistry.bindTileEntitySpecialRenderer(teclasses.get(i), terenderers.get(i));
				}
				init=true;
				return true;
			}
			return false;
		}
		return false;
	}

}
