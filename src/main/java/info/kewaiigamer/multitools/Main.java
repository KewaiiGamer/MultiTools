package info.kewaiigamer.multitools;

import info.kewaiigamer.multitools.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static info.kewaiigamer.multitools.Ref.*;

@Mod(modid=MODID, version= VERSION_MAJOR + VERSION_MINOR + VERSION_PATCH + VERSION_BUILD, name=MODNAME, acceptedMinecraftVersions=ACCEPTED_MC_VERSIONS,
        dependencies = "required-after:" + KewaiiLib_MODID + ModVersion + KewaiiLib_VERSION_MAJOR + KewaiiLib_VERSION_MINOR + KewaiiLib_VERSION_PATCH + KewaiiLib_VERSION_BUILD + NewerVersions)
public class Main {
    @Mod.Instance(Ref.MODID)
    public static Main instance = new Main();
    @SidedProxy(clientSide=CLIENT_PROXY_CLASS, serverSide=SERVER_PROXY_CLASS)
    public static CommonProxy proxy = new CommonProxy();

    public static CreativeTabs PAXELS = new PaxelTab();
    public static CreativeTabs UNIVERSAL_TOOLS= new UniversalToolTab();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
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