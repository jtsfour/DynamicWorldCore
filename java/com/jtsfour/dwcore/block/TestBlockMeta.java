package com.jtsfour.dwcore.block;



import java.util.List;

import com.jtsfour.dwcore.block.state.EnumColor;
import com.jtsfour.dwcore.item.DWCoreItems;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class TestBlockMeta extends DWBlock {
	
	public static final PropertyEnum TYPE = PropertyEnum.create("color", EnumColor.class);

	public TestBlockMeta() {
		super("testblockmeta", Material.ROCK);
		setCreativeTab(DWCoreItems.DWCoreTab);
		this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, EnumColor.BLUE));
	}
	
	@Override
	public BlockStateContainer createBlockState(){
		return new BlockStateContainer(this, new IProperty[] { TYPE });
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
	    return getDefaultState().withProperty(TYPE, meta == 0 ? EnumColor.BLUE : EnumColor.YELLOW);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
	    EnumColor type = (EnumColor) state.getValue(TYPE);
	    return type.getID();
	}
	
	@Override
	public int damageDropped(IBlockState state) {
	    return getMetaFromState(state);
	}
	
	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> list) {
	    list.add(new ItemStack(itemIn, 1, 0)); 
	    list.add(new ItemStack(itemIn, 1, 1)); 
	}
	

	
	
	
	

}
