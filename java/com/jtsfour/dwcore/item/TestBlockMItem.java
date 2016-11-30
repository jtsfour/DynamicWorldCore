package com.jtsfour.dwcore.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import com.jtsfour.dwcore.DynamicWorldCore;
import com.jtsfour.dwcore.block.DWBlock;

public class TestBlockMItem extends DWItemBlock {
	
	private boolean flag=true;

	public TestBlockMItem(DWBlock block) {
		super(block);
	}
	
	public void registerModels(){
		if(flag){
			if(DynamicWorldCore.ISCLIENT){
				Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(this, 0, new ModelResourceLocation(DynamicWorldCore.MODID + ":" +DynamicWorldCore.MODID+"_"+getName(), "inventory"));
				Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(this, 1, new ModelResourceLocation(DynamicWorldCore.MODID + ":" +DynamicWorldCore.MODID+"_"+getName(), "inventory"));
			}
		}
		flag=false;
	}

}
