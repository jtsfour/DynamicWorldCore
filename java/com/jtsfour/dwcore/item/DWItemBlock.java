package com.jtsfour.dwcore.item;

import com.jtsfour.dwcore.DynamicWorldCore;
import com.jtsfour.dwcore.block.DWBlock;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class DWItemBlock extends ItemBlock {
	
	private String NAME;
	private boolean flag=true;
	private boolean flag2=true;
	
	public DWItemBlock(DWBlock block) {
		super(block);
		NAME=block.getName();
	}
	
	protected void register(){
		if(flag){
			setUnlocalizedName(DynamicWorldCore.MODID+"_"+NAME);
			setRegistryName(DynamicWorldCore.MODID+"_"+NAME);
			GameRegistry.register(this);
		}
		flag=false;
	}
	
	public void registerModels(){
		if(flag2){
			if(DynamicWorldCore.ISCLIENT){
				Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(this, 0, new ModelResourceLocation(DynamicWorldCore.MODID + ":" +DynamicWorldCore.MODID+"_"+NAME, "inventory"));
			}
		}
		flag2=false;
	}

}
