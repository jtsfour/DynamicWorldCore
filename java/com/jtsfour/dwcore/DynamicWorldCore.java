package com.jtsfour.dwcore;

import com.jtsfour.dwcore.client.DWCoreClientProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DynamicWorldCore.MODID, version = DynamicWorldCore.VERSION)
public class DynamicWorldCore
{
    public static final String MODID = "dwcore";
    public static final String VERSION = "1.0";
    
    public static boolean ISCLIENT = false;
    
    @SidedProxy(clientSide = "com.jtsfour.dwcore.client.DWCoreClientProxy",serverSide = "com.jtsfour.dwcore.DWCoreCommonProxy")
    public static DWCoreCommonProxy proxy;
    
    @Mod.Instance("dwcore")
    public static DynamicWorldCore instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	if(proxy instanceof DWCoreClientProxy){
    		ISCLIENT=true;
    	}
        proxy.preInit();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit();
    }
}
