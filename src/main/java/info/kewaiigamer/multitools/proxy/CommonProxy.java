package info.kewaiigamer.multitools.proxy;

import info.kewaiigamer.multitools.init.ModItems;
import info.kewaiigamer.multitools.recipe.Crafting;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
        new ModItems();
    }

    public void init(FMLInitializationEvent e) {
        new Crafting();
    }

    public void postInit(FMLPostInitializationEvent e) {
    }
}