package info.kewaiigamer.multitools.proxy;

import info.kewaiigamer.multitools.Ref;
import info.kewaiigamer.multitools.init.ModItems;
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
        this.registerModels();
    }

    public void registerModels() {
        ClientProxy.registerModel(ModItems.woodpaxel, 0);
        ClientProxy.registerModel(ModItems.stonepaxel, 0);
        ClientProxy.registerModel(ModItems.ironpaxel, 0);
        ClientProxy.registerModel(ModItems.diamondpaxel, 0);
        ClientProxy.registerModel(ModItems.goldpaxel, 0);
        ClientProxy.registerModel(ModItems.wooduniversaltool, 0);
        ClientProxy.registerModel(ModItems.stoneuniversaltool, 0);
        ClientProxy.registerModel(ModItems.golduniversaltool, 0);
        ClientProxy.registerModel(ModItems.ironuniversaltool, 0);
        ClientProxy.registerModel(ModItems.diamonduniversaltool, 0);
        if (Loader.isModLoaded(Ref.Substratum_MODID)) {
            ClientProxy.registerModel(ModItems.aluminiumpaxel, 0);
            ClientProxy.registerModel(ModItems.bronzepaxel, 0);
            ClientProxy.registerModel(ModItems.copperpaxel, 0);
            ClientProxy.registerModel(ModItems.electrumpaxel, 0);
            ClientProxy.registerModel(ModItems.enderiumpaxel, 0);
            ClientProxy.registerModel(ModItems.invarpaxel, 0);
            ClientProxy.registerModel(ModItems.lumiumpaxel, 0);
            ClientProxy.registerModel(ModItems.signalumpaxel, 0);
            ClientProxy.registerModel(ModItems.silverpaxel, 0);
            ClientProxy.registerModel(ModItems.steelpaxel, 0);
            ClientProxy.registerModel(ModItems.aluminiumuniversaltool, 0);
            ClientProxy.registerModel(ModItems.bronzeuniversaltool, 0);
            ClientProxy.registerModel(ModItems.copperuniversaltool, 0);
            ClientProxy.registerModel(ModItems.electrumuniversaltool, 0);
            ClientProxy.registerModel(ModItems.enderiumuniversaltool, 0);
            ClientProxy.registerModel(ModItems.invaruniversaltool, 0);
            ClientProxy.registerModel(ModItems.lumiumuniversaltool, 0);
            ClientProxy.registerModel(ModItems.signalumuniversaltool, 0);
            ClientProxy.registerModel(ModItems.silveruniversaltool, 0);
            ClientProxy.registerModel(ModItems.steeluniversaltool, 0);
        }
    }

    public static void registerModel(Object obj, int meta) {
        Item item;
        if (obj instanceof Item) {
            item = (Item)obj;
        } else {
            if (!(obj instanceof Block)) throw new IllegalArgumentException("Only item and block instances");
            item = Item.getItemFromBlock((Block) obj);
        }
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}