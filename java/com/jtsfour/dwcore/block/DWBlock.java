package com.jtsfour.dwcore.block;

import com.jtsfour.dwcore.DynamicWorldCore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
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
			setRegistryName(DynamicWorldCore.MODID+"_"+NAME);
			GameRegistry.register(this);
		}
		flag=false;
	}
	
	public String getName(){
		return NAME;
	}

}
