package com.jtsfour.dwcore.block;

import com.jtsfour.dwcore.DynamicWorldCore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class DWBlock extends Block {
	
	private String NAME;
	private boolean flag=true;
	private boolean flag2=true;

	public DWBlock(String name, Material material){
		super(material);
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
	
	/*public void registerModels(){
		if(flag2){
			if(DynamicWorldCore.ISCLIENT){
				//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register((Block)this, 0, new ModelResourceLocation("tutorial:tutorial_block", "inventory"));
				
			}
		}
		flag2=false;
	}*/
	
	public String getName(){
		return NAME;
	}

}
