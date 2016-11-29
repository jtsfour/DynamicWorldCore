package com.jtsfour.dwcore.item;

import com.jtsfour.dwcore.DynamicWorldCore;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DWItem	extends Item {
	private String NAME;
	private boolean flag=true;
	private boolean flag2=true;

	public DWItem(String name) {
		super();
		NAME=name;
	}
	
	protected void register(){
		if(flag){
			setUnlocalizedName(DynamicWorldCore.MODID+"_"+NAME);
			setRegistryName(DynamicWorldCore.MODID+"_"+NAME);
			GameRegistry.register(this);
		 }
		flag=false;
	}
	//Override to implement different models
	public void registerModels(){
		if(flag2){
			if(DynamicWorldCore.ISCLIENT){
			    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(this, 0, new ModelResourceLocation(DynamicWorldCore.MODID + ":" +DynamicWorldCore.MODID+"_"+NAME, "inventory"));
			}
		}
		flag2=false;
	}
	
	public String getName(){
		return NAME;
	}

}
