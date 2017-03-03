package com.jtsfour.dwcore.item;

import com.jtsfour.dwcore.DynamicWorldCore;
import com.jtsfour.dwcore.block.DWBlock;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class TestBlockMetaItem extends DWItemBlock {

	public TestBlockMetaItem(DWBlock block) {
		super(block);
		this.setMaxDamage(0);
        this.setHasSubtypes(true);
	}
	
	public int getMetadata(int damage){
        return damage;
    }
	
	@Override
	public void registerModels(){
		//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(this, 0, new ModelResourceLocation(DynamicWorldCore.MODID + ":" +DynamicWorldCore.MODID+"_"+getName()+"_0", "inventory"));
		//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(this, 1, new ModelResourceLocation(DynamicWorldCore.MODID + ":" +DynamicWorldCore.MODID+"_"+getName()+"_1", "inventory"));
		//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(getBlock()), 0, new ModelResourceLocation(DynamicWorldCore.MODID+":"+DynamicWorldCore.MODID+"_"+getName()+"_0","inventory"));
		//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(getBlock()), 1, new ModelResourceLocation(DynamicWorldCore.MODID+":"+DynamicWorldCore.MODID+"_"+getName()+"_1","inventory"));
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(DynamicWorldCore.MODID+":"+DynamicWorldCore.MODID+"_"+getName()+"_0","inventory"));
		ModelLoader.setCustomModelResourceLocation(this, 1, new ModelResourceLocation(DynamicWorldCore.MODID+":"+DynamicWorldCore.MODID+"_"+getName()+"_1","inventory"));
	}

}
