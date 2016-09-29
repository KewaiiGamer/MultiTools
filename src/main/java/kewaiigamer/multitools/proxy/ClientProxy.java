package kewaiigamer.multitools.proxy;

import kewaiigamer.multitools.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	
	@Override
	public void preInit(FMLPreInitializationEvent e) 
	{
		super.preInit(e);
	}

	@Override
	public void init(FMLInitializationEvent e) 
	{
		super.init(e);
	}

	@Override
	public void postInit(FMLPostInitializationEvent e) 
	{
		super.postInit(e);
		registerModels();
		
	}
	
	public void registerModels() 
	{
		registerModel(ModItems.woodpaxel, 0);
		registerModel(ModItems.stonepaxel, 0);
		registerModel(ModItems.ironpaxel, 0);
		registerModel(ModItems.diamondpaxel, 0);
		registerModel(ModItems.goldpaxel, 0);
		registerModel(ModItems.wooduniversaltool, 0);
		registerModel(ModItems.stoneuniversaltool, 0);
		registerModel(ModItems.golduniversaltool, 0);
		registerModel(ModItems.ironuniversaltool, 0);
		registerModel(ModItems.diamonduniversaltool, 0);
		
		if (Loader.isModLoaded("substratum")) 
   	 {
		registerModel(ModItems.aluminiumpaxel, 0);
		registerModel(ModItems.bronzepaxel, 0);
		registerModel(ModItems.copperpaxel, 0);
		registerModel(ModItems.electrumpaxel, 0);
		registerModel(ModItems.enderiumpaxel, 0);
		registerModel(ModItems.invarpaxel, 0);
		registerModel(ModItems.lumiumpaxel, 0);
		registerModel(ModItems.signalumpaxel, 0);
		registerModel(ModItems.silverpaxel, 0);
		registerModel(ModItems.steelpaxel, 0);
		registerModel(ModItems.aluminiumuniversaltool, 0);
		registerModel(ModItems.bronzeuniversaltool, 0);
		registerModel(ModItems.copperuniversaltool, 0);
		registerModel(ModItems.electrumuniversaltool, 0);
		registerModel(ModItems.enderiumuniversaltool, 0);
		registerModel(ModItems.invaruniversaltool, 0);
		registerModel(ModItems.lumiumuniversaltool, 0);
		registerModel(ModItems.signalumuniversaltool, 0);
		registerModel(ModItems.silveruniversaltool, 0);
		registerModel(ModItems.steeluniversaltool, 0);
	 }
	}
	
	public static void registerModel(Object obj, int meta) 
	{

		Item item;
		if (obj instanceof Item) {
			item = (Item) obj;
		} else if (obj instanceof Block) {
			item = Item.getItemFromBlock((Block) obj);
		} else {
			throw new IllegalArgumentException("Only item and block instances");
		}
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,meta,new ModelResourceLocation(item.getRegistryName(),"inventory"));
	}
}
