package com.jtsfour.dwcore.block;

import com.jtsfour.dwcore.item.DWCoreItems;
import com.jtsfour.dwcore.tileentity.TestTileEntity;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TestTileEntityBlock extends DWBlock implements ITileEntityProvider {

	public TestTileEntityBlock() {
		super("testtileentity", Material.ROCK);
		this.isBlockContainer=true;
		setCreativeTab(DWCoreItems.DWCoreTab);
	}
	
	 public EnumBlockRenderType getRenderType(IBlockState state){
        return EnumBlockRenderType.MODEL;
	 }

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TestTileEntity();
	}
	
	@Override
    public void breakBlock(World world, BlockPos pos, IBlockState state) {
        super.breakBlock(world, pos, state);
        world.removeTileEntity(pos);
    }
	
	@Override
    public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int id, int param){
        super.eventReceived(state, worldIn, pos, id, param);
        TileEntity tileentity = worldIn.getTileEntity(pos);
        return tileentity == null ? false : tileentity.receiveClientEvent(id, param);
    }

}
