package com.jtsfour.dwcore.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DWCoreItems {

	public DWCoreItems() {
		
	}
	
	public final static CreativeTabs DWCoreTab = new CreativeTabs("dwcore_tab"){
			public ItemStack getTabIconItem() {
				return new ItemStack(DWCoreItems.testitem);
			}
	   	
		};
	
		//ITEMS
	public static DWItem testitem;
	
	//items generated in preInit they are actually registered to Minecraft in init
	public static void preInit(){
		
		
		testitem = new TestItem();
		testitem.setCreativeTab(DWCoreTab);
		
		DWItemHandler.addItem(testitem);
		
	}

}
