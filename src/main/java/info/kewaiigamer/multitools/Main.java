package info.kewaiigamer.multitools;

import info.kewaiigamer.multitools.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static info.kewaiigamer.multitools.Ref.*;

@Mod(modid = MODID, version = Ref.MultiTools_VERSION, name = Ref.MODNAME)
public class Main {
    @Instance(MODID)
    public static Main instance = new Main();
    @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = SERVER_PROXY_CLASS)
    public static CommonProxy proxy = new CommonProxy();
    public static CreativeTabs UNIVERSAL_TOOLS = new UniversalToolTab();

    public static CreativeTabs PAXELS = new PaxelTab();

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
