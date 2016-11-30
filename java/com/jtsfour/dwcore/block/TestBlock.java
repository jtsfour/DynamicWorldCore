package com.jtsfour.dwcore.block;

import com.jtsfour.dwcore.item.DWCoreItems;

import net.minecraft.block.material.Material;

public class TestBlock extends DWBlock {

	public TestBlock() {
		super("testblock", Material.ROCK);
		setCreativeTab(DWCoreItems.DWCoreTab);
		this.setLightLevel(2.0F);
	}

}
