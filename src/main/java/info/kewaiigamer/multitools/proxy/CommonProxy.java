package info.kewaiigamer.multitools.proxy;

import info.kewaiigamer.multitools.init.ModItems;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        ModItems.initItems();
        ModItems.paxels.forEach(item -> event.getRegistry().register(item));
        ModItems.baseMetalsPaxels.forEach(item -> event.getRegistry().register(item));
        ModItems.modernMetalsPaxels.forEach(item -> event.getRegistry().register(item));
        ModItems.universalTools.forEach(item -> event.getRegistry().register(item));
        ModItems.baseMetalsUniversalTools.forEach(item -> event.getRegistry().register(item));
        ModItems.modernMetalsUniversalTools.forEach(item -> event.getRegistry().register(item));
    }

    public void preInit(FMLPreInitializationEvent e) {
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    }
}