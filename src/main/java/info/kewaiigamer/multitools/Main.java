package info.kewaiigamer.multitools;

import info.kewaiigamer.multitools.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import static info.kewaiigamer.multitools.Ref.*;

@Mod(modid = MODID, version = VERSION_MAJOR + VERSION_MINOR + VERSION_PATCH, name = MODNAME, acceptedMinecraftVersions = ACCEPTED_MC_VERSIONS)
public class Main {
    @Mod.Instance(Ref.MODID)
    public static Main instance = new Main();

    @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    public static CreativeTabs PAXELS = new PaxelTab();
    public static CreativeTabs BASEMETALS_PAXELS = new BaseMetalsPaxelTab();
    public static CreativeTabs MODERNMETALS_PAXELS = new ModernMetalsPaxelTab();
    public static CreativeTabs UNIVERSAL_TOOLS = new UniversalToolTab();
    public static CreativeTabs BASEMETALS_UNIVERSAL_TOOLS = new BaseMetalsUniversalToolTab();
    public static CreativeTabs MODERNMETALS_UNIVERSAL_TOOLS = new ModernMetalsUniversalToolTab();

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        logger = e.getModLog();
        proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}