package com.jtsfour.dwcore.block;

import com.jtsfour.dwcore.item.DWItemBlock;
import com.jtsfour.dwcore.item.DWItemHandler;
import com.jtsfour.dwcore.item.TestBlockItem;
import com.jtsfour.dwcore.item.TestBlockMetaItem;
import com.jtsfour.dwcore.item.TestTileEntityItem;
import com.jtsfour.dwcore.tileentity.DWTileEntityHandler;
import com.jtsfour.dwcore.tileentity.TestTileEntity;

public class DWCoreBlocks {

	public DWCoreBlocks() {
		
	}
	
	//Blocks and ItemBlocks
	public static DWBlock testblock;
	public static DWItemBlock itestblock;
	public static DWBlock testblockmeta;
	public static DWItemBlock itestblockmeta;
	
	public static DWBlock testtileentityblock;
	public static DWItemBlock testtileentityitem;
	
	public static void preInit(){
		testblock = new TestBlock();
		DWBlockHandler.addBlock(testblock);
		itestblock = new TestBlockItem(testblock);
		DWItemHandler.addItemBlock(itestblock);
		
		testblockmeta = new TestBlockMeta();
		DWBlockHandler.addBlock(testblockmeta);
		itestblockmeta = new TestBlockMetaItem(testblockmeta);
		DWItemHandler.addItemBlock(itestblockmeta);
		
		testtileentityblock = new TestTileEntityBlock();
		DWBlockHandler.addBlock(testtileentityblock);
		testtileentityitem = new TestTileEntityItem(testtileentityblock);
		DWItemHandler.addItemBlock(testtileentityitem);
		
		DWTileEntityHandler.addTileEntity(TestTileEntity.class, testtileentityblock.getName());
		
		
	}

}
