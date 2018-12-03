package info.kewaiigamer.multitools.proxy;

import info.kewaiigamer.multitools.Ref;
import info.kewaiigamer.multitools.Tabs;
import info.kewaiigamer.multitools.init.ModItems;
import info.kewaiigamer.multitools.init.Recipes;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
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
        if (!Loader.isModLoaded(Ref.BASEMETALS_MODID) && !ModItems.paxels.isEmpty())
            ModItems.paxels.forEach(item -> event.getRegistry().register(item));
        if (!Loader.isModLoaded(Ref.BASEMETALS_MODID) && !ModItems.universalTools.isEmpty())
            ModItems.universalTools.forEach(item -> event.getRegistry().register(item));
    }

    @Optional.Method(modid = Ref.BASEMETALS_MODID)
    @SubscribeEvent
    public static void registerBaseMetalsItems(RegistryEvent.Register<Item> event) {
        ModItems.initBaseMetalsItems();
        ModItems.baseMetalsPaxels.values().forEach(item -> event.getRegistry().register(item));
        ModItems.baseMetalsUniversalTools.values().forEach(item -> event.getRegistry().register(item));
        if (!ModItems.paxels.isEmpty()) ModItems.paxels.forEach(item -> event.getRegistry().register(item));
        if (!ModItems.universalTools.isEmpty())
            ModItems.universalTools.forEach(item -> event.getRegistry().register(item));
        Tabs.initBaseMetalsTabs();
        ModItems.baseMetalsPaxels.values().forEach(item -> item.setCreativeTab(Tabs.BASEMETALS_PAXELS));
        ModItems.baseMetalsUniversalTools.values().forEach(item -> item.setCreativeTab(Tabs.BASEMETALS_UNIVERSAL_TOOLS));
    }


    @Optional.Method(modid = Ref.MODERNMETALS_MODID)
    @SubscribeEvent
    public static void registerModernMetalsItems(RegistryEvent.Register<Item> event) {
        ModItems.initModernMetalsItems();
        ModItems.modernMetalsPaxels.values().forEach(item -> event.getRegistry().register(item));
        ModItems.modernMetalsUniversalTools.values().forEach(item -> event.getRegistry().register(item));
        Tabs.initModernMetalsTabs();
        ModItems.modernMetalsPaxels.values().forEach(item -> item.setCreativeTab(Tabs.MODERNMETALS_PAXELS));
        ModItems.modernMetalsUniversalTools.values().forEach(item -> item.setCreativeTab(Tabs.MODERNMETALS_UNIVERSAL_TOOLS));
    }

    public void preInit(FMLPreInitializationEvent e) {
    }

    public void init(FMLInitializationEvent e) {
        if (Loader.isModLoaded(Ref.BASEMETALS_MODID)) {
            Recipes.initMetalsRecipes();
            MinecraftForge.EVENT_BUS.register(Recipes.class);
        }
    }

    public void postInit(FMLPostInitializationEvent e) {
    }
}