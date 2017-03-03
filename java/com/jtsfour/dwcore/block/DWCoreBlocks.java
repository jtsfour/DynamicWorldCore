package com.jtsfour.dwcore.block;

import com.jtsfour.dwcore.item.DWItemBlock;
import com.jtsfour.dwcore.item.DWItemHandler;
import com.jtsfour.dwcore.item.TestBlockItem;
import com.jtsfour.dwcore.item.TestBlockMetaItem;

public class DWCoreBlocks {

	public DWCoreBlocks() {
		
	}
	
	//Blocks and ItemBlocks
	public static DWBlock testblock;
	public static DWItemBlock itestblock;
	public static DWBlock testblockmeta;
	public static DWItemBlock itestblockmeta;
	
	public static void preInit(){
		testblock = new TestBlock();
		DWBlockHandler.addBlock(testblock);
		itestblock = new TestBlockItem(testblock);
		DWItemHandler.addItemBlock(itestblock);
		
		testblockmeta = new TestBlockMeta();
		DWBlockHandler.addBlock(testblockmeta);
		itestblockmeta = new TestBlockMetaItem(testblockmeta);
		DWItemHandler.addItemBlock(itestblockmeta);
		
		
		
	}

}
