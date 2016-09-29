package kewaiigamer.multitools;


import kewaiigamer.multitools.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;



@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.MODNAME)
public class Main
{

	
	@Instance(Reference.MODID)
	public static Main instance = new Main();
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy = new CommonProxy();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
		Main.proxy.preInit(e);
	}
	@EventHandler
	public void init(FMLInitializationEvent e)
	{
		Main.proxy.init(e);
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent e)
	{
		Main.proxy.postInit(e);
	}
	
	
}
