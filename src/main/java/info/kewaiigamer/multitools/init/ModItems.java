package info.kewaiigamer.multitools.init;

import info.kewaiigamer.multitools.Ref;
import info.kewaiigamer.multitools.config.ConfigHandler;
import info.kewaiigamer.multitools.item.CustomCreativeTabItemIcon;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

import static info.kewaiigamer.multitools.proxy.ClientProxy.initRender;
import static info.kewaiigamer.multitools.utils.Utils.createPaxel;
import static info.kewaiigamer.multitools.utils.Utils.createUniversalTool;


public class ModItems {
    public static Item woodPaxel;
    public static Item stonePaxel;
    public static Item ironPaxel;
    public static Item goldPaxel;
    public static Item diamondPaxel;


    public static Item woodUniversalTool;
    public static Item stoneUniversalTool;
    public static Item goldUniversalTool;
    public static Item ironUniversalTool;
    public static Item diamondUniversalTool;


    public static Item woodPaxel_tabIcon;
    public static Item woodUniversalTool_tabIcon;

    public ModItems() {
        registerItems();
    }

    public static void registerItems() {
        woodPaxel_tabIcon = new CustomCreativeTabItemIcon(Ref.MODID, "paxel_wood");
        woodUniversalTool_tabIcon = new CustomCreativeTabItemIcon(Ref.MODNAME, "universaltool_wood");

        if (ConfigHandler.vanilla) {
            if (ConfigHandler.vanillaPaxels) {
                if (ConfigHandler.woodenPaxel)
                    woodPaxel = createPaxel(ToolMaterial.WOOD);
                if (ConfigHandler.stonePaxel)
                    stonePaxel = createPaxel(ToolMaterial.STONE);
                if (ConfigHandler.ironPaxel)
                    ironPaxel = createPaxel(ToolMaterial.IRON);
                if (ConfigHandler.goldenPaxel)
                    goldPaxel = createPaxel(ToolMaterial.GOLD);
                if (ConfigHandler.diamondPaxel) {
                    diamondPaxel = createPaxel(ToolMaterial.DIAMOND);
                }
            }
            if (ConfigHandler.vanillaUniversalTools) {
                if (ConfigHandler.woodenUniversalTool)
                    woodUniversalTool = createUniversalTool(ToolMaterial.WOOD);
                if (ConfigHandler.stoneUniversalTool)
                    stoneUniversalTool = createUniversalTool(ToolMaterial.STONE);
                if (ConfigHandler.ironUniversalTool)
                    ironUniversalTool = createUniversalTool(ToolMaterial.IRON);
                if (ConfigHandler.goldenUniversalTool)
                    goldUniversalTool = createUniversalTool(ToolMaterial.GOLD);
                if (ConfigHandler.diamondUniversalTool)
                    diamondUniversalTool = createUniversalTool(ToolMaterial.DIAMOND);
            }
        }
    }
    public static void registerModels() {
        initRender(ModItems.woodPaxel);
        initRender(ModItems.stonePaxel);
        initRender(ModItems.ironPaxel);
        initRender(ModItems.goldPaxel);
        initRender(ModItems.diamondPaxel);

        initRender(ModItems.woodUniversalTool);
        initRender(ModItems.stoneUniversalTool);
        initRender(ModItems.ironUniversalTool);
        initRender(ModItems.goldUniversalTool);
        initRender(ModItems.diamondUniversalTool);

        initRender(ModItems.woodPaxel_tabIcon);
        initRender(ModItems.woodUniversalTool_tabIcon);


    }
}
