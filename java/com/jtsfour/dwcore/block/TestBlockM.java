package com.jtsfour.dwcore.block;

import com.jtsfour.dwcore.block.state.EnumColor;
import com.jtsfour.dwcore.item.DWCoreItems;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;

public class TestBlockM extends DWBlock {
	
	public static final PropertyEnum<EnumColor> TYPE = PropertyEnum.create("color",EnumColor.class);

	public TestBlockM() {
		super("testblockm",Material.ROCK);
		setCreativeTab(DWCoreItems.DWCoreTab);
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
	    return new BlockStateContainer(this,new IProperty[]{TYPE});
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
	    //return getDefaultState().withProperty(TYPE, meta == 0 ? EnumType.WHITE : EnumType.BLACK);
		if(meta==0){
			return getDefaultState().withProperty(TYPE,EnumColor.YELLOW);
		}else if(meta==1){
			return getDefaultState().withProperty(TYPE,EnumColor.BLUE);
		}else{
			return getDefaultState().withProperty(TYPE,EnumColor.YELLOW);
		}
		
	}

	@Override
	public int getMetaFromState(IBlockState state) {
	    EnumColor type = (EnumColor) state.getValue(TYPE);
	    return type.getID();
	}

}


