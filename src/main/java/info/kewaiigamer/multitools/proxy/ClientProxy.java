package info.kewaiigamer.multitools.proxy;

import info.kewaiigamer.multitools.Ref;
import info.kewaiigamer.multitools.init.ModItems;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        ModItems.initModels();
    }

    @SubscribeEvent
    @Optional.Method(modid = Ref.BASEMETALS_MODID)
    public static void registerBaseMetalsModels(ModelRegistryEvent event) {
        ModItems.initBaseMetalsModels();
    }

    @SubscribeEvent
    @Optional.Method(modid = Ref.MODERNMETALS_MODID)
    public static void registerModernMetalsModels(ModelRegistryEvent event) {
        ModItems.initModernMetalsModels();
    }

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
}