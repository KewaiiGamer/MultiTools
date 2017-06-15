package info.kewaiigamer.multitools.init;

import info.kewaiigamer.multitools.ConfigValue;
import info.kewaiigamer.multitools.item.CustomCreativeTabItemIcon;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

import static info.kewaiigamer.multitools.config.ConfigHandler.*;
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

    public static List<Item> vanilla = new ArrayList<>();
    public static List<Item> vanillaPaxels = new ArrayList<>();
    public static List<Item> vanillaUniversalTools = new ArrayList<>();

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

    public static void setVanillaLists() {
        setVanillaUniversalTools();
        setVanillaUniversalToolsEnabled();
        setVanillaPaxels();
        setVanillaPaxelsEnabled();
        setVanilla();
        setVanillaEnabled();
    }

    public static void setVanillaPaxels() {
        vanillaPaxels.add(woodPaxel);
        vanillaPaxels.add(stonePaxel);
        vanillaPaxels.add(ironPaxel);
        vanillaPaxels.add(goldPaxel);
        vanillaPaxels.add(diamondPaxel);
    }

    public static void setVanillaUniversalTools() {
        vanillaUniversalTools.add(woodUniversalTool);
        vanillaUniversalTools.add(stoneUniversalTool);
        vanillaUniversalTools.add(ironUniversalTool);
        vanillaUniversalTools.add(goldUniversalTool);
        vanillaUniversalTools.add(diamondUniversalTool);
    }

    public static void setVanilla() {
        vanilla.addAll(vanillaPaxels);
        vanilla.addAll(vanillaUniversalTools);
    }

    public static void registerItems() {
        woodPaxel_tabIcon = new CustomCreativeTabItemIcon("multitools", "paxel_wood");
        woodUniversalTool_tabIcon = new CustomCreativeTabItemIcon("multitools", "universaltool_wood");
        initRender(woodPaxel_tabIcon);
        initRender(woodUniversalTool_tabIcon);
        setVanillaLists();
        createVanillaPaxels();
        createVanillaUniversalTools();
    }

    public static void createVanillaPaxels() {
        for (Item.ToolMaterial material : Item.ToolMaterial.values()) {
            for (ConfigValue bol : vanillaPaxelsEnabled) {
                String bolMaterial = bol.getName();
                String materialName = material.name().replace("ToolMaterial", "");
                if (bolMaterial.equalsIgnoreCase(materialName) && bol.getValue()) {
                    for (Item item : vanillaPaxels) {
                        item = createPaxel(material);
                        initRender(item);
                        break;
                    }
                }
            }
        }
    }

    public static void createVanillaUniversalTools() {
        for (Item.ToolMaterial material : Item.ToolMaterial.values()) {
            for (ConfigValue bol : vanillaUniversalToolsEnabled) {
                String bolMaterial = bol.getName();
                String materialName = material.name().replace("ToolMaterial", "");
                if (bolMaterial.equalsIgnoreCase(materialName) && bol.getValue()) {
                    for (Item item : vanillaUniversalTools) {
                        item = createUniversalTool(material);
                        initRender(item);
                        break;
                    }
                }
            }
        }
    }
}
