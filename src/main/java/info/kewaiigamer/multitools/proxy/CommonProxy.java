package info.kewaiigamer.multitools.proxy;

import info.kewaiigamer.multitools.config.ToolsConfig;
import info.kewaiigamer.multitools.init.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        ToolsConfig.initConfig();
    }

    public void init(FMLInitializationEvent e) {
        ModItems.registerItems();
    }

    public void postInit(FMLPostInitializationEvent e) {
    }
}
