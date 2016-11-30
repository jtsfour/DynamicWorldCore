package com.jtsfour.dwcore.block;

import com.jtsfour.dwcore.item.DWItemBlock;
import com.jtsfour.dwcore.item.DWItemHandler;
import com.jtsfour.dwcore.item.TestBlockItem;

public class DWCoreBlocks {

	public DWCoreBlocks() {
		
	}
	
	//Blocks and ItemBlocks
	public static DWBlock testblock;
	public static DWItemBlock itestblock;
	
	
	public static void preInit(){
		testblock = new TestBlock();
		DWBlockHandler.addBlock(testblock);
		itestblock = new TestBlockItem(testblock);
		DWItemHandler.addItemBlock(itestblock);
	}

}
