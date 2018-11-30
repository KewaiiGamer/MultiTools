package info.kewaiigamer.multitools.proxy;

import info.kewaiigamer.multitools.Ref;
import info.kewaiigamer.multitools.init.ModItems;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        ModItems.initItems();
        if (!ModItems.paxels.isEmpty()) ModItems.paxels.forEach(item -> event.getRegistry().register(item));
        if (!ModItems.universalTools.isEmpty())
            ModItems.universalTools.forEach(item -> event.getRegistry().register(item));
    }

    @Optional.Method(modid = Ref.BASEMETALS_MODID)
    @SubscribeEvent
    public static void registerBaseMetalsItems(RegistryEvent.Register<Item> event) {
        ModItems.initBaseMetalsItems();
        ModItems.baseMetalsPaxels.forEach(item -> event.getRegistry().register(item));
        ModItems.baseMetalsUniversalTools.forEach(item -> event.getRegistry().register(item));
        if (!ModItems.paxels.isEmpty()) ModItems.paxels.forEach(item -> event.getRegistry().register(item));
        if (!ModItems.universalTools.isEmpty())
            ModItems.universalTools.forEach(item -> event.getRegistry().register(item));
    }


    @Optional.Method(modid = Ref.MODERNMETALS_MODID)
    @SubscribeEvent
    public static void registerModernMetalsItems(RegistryEvent.Register<Item> event) {
        ModItems.initModernMetalsItems();
        ModItems.modernMetalsPaxels.forEach(item -> event.getRegistry().register(item));
        ModItems.modernMetalsUniversalTools.forEach(item -> event.getRegistry().register(item));
    }

    public void preInit(FMLPreInitializationEvent e) {
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    }
}