package info.kewaiigamer.multitools.utils;

import info.kewaiigamer.multitools.Main;
import info.kewaiigamer.multitools.Ref;
import info.kewaiigamer.multitools.config.ToolsConfig;
import info.kewaiigamer.multitools.item.Paxel;
import info.kewaiigamer.multitools.item.UniversalTool;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utils {


    private static String categoryPaxels = "Paxels";
    private static String categoryUniversalTools = "Universal Tools";
    private static String categoryModules = "Modules";
    private static String categoryModule = "Module";

    private static Map<Item, String> itemRegistry = new HashMap<>();
    private static Map<Item.ToolMaterial, List<Item>> itemsByMaterial = new HashMap<>();

    public static Item createPaxel(Item.ToolMaterial material) {
        return registerItem(new Paxel(Ref.MODID, material), material.name().toLowerCase() + "paxel", material, Main.PAXELS);
    }

    public static Item createUniversalTool(Item.ToolMaterial material) {
        return registerItem(new UniversalTool(Ref.MODID, material), material.name().toLowerCase() + "universaltool", material, Main.UNIVERSAL_TOOLS);
    }

    public static Item registerItem(Item item, String name, Item.ToolMaterial material, CreativeTabs tab) {
        GameRegistry.register(item);
        itemRegistry.put(item, name);
        if(tab != null) {
            item.setCreativeTab(tab);
        }

        if(material == null) {
            return item;
        } else {
            itemsByMaterial.computeIfAbsent(material, (g) -> {
                return new ArrayList();
            });
            ((List)itemsByMaterial.get(material)).add(item);
            return item;
        }
    }


    public static String makeCapitalized(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1, str.length());
    }


    public static boolean getVanillaPaxel(String itemName) {
        return getConfigDescForPaxel(itemName, categoryPaxels, "Vanilla", ToolsConfig.config);
    }

    public static boolean getVanillaUT(String itemName) {
        return getConfigDescForUniversalTool(itemName, categoryUniversalTools, "Vanilla", ToolsConfig.config);
    }

    public static boolean getVanillaModulePaxel() {
        return getSubModule("Vanilla", ToolsConfig.config, categoryPaxels);
    }

    public static boolean getVanillaModuleUniversalTool() {
        return getSubModule("Vanilla", ToolsConfig.config, categoryUniversalTools);
    }

    public static boolean getVanillaModule() {
        return getModule("Vanilla", ToolsConfig.config);
    }

    public static boolean getConfigDescForPaxel(String itemName, String category, String compatMod, Configuration config) {
        return config.getBoolean(makeCapitalized(itemName) + " Paxel", category + " " + compatMod, true, "Enable " + itemName + "?");
    }

    public static boolean getConfigDescForUniversalTool(String itemName, String category, String compatMod, Configuration config) {
        return config.getBoolean(makeCapitalized(itemName) + " Universal Tool", category + " " + compatMod, true, "Enable " + itemName + "?");
    }

    public static boolean getModule(String moduleName, Configuration config) {
        return config.getBoolean(moduleName, categoryModule + " " + moduleName, true, "Enable " + moduleName + " Support");
    }

    public static boolean getSubModule(String moduleName, Configuration config, String category) {
        return config.getBoolean(moduleName + " " + category, categoryModules + " " + moduleName, true, "Enable " + moduleName + " " + category + "?");
    }

    public static void setCategoryCommentForSubModule(String category, String moduleName, Configuration config) {
        config.addCustomCategoryComment(category + " " + moduleName, "Enabling and Disabling " + moduleName + " " + category);
    }

    public static void setVanillaCategoryCommentForSubModule(String category) {
        setCategoryCommentForSubModule(category, "Vanilla", ToolsConfig.config);
    }

    public static void setCategoryCommentForModule(String moduleName, Configuration config) {
        config.addCustomCategoryComment(categoryModules + " " + moduleName, "Enabling and Disabling " + moduleName + " " + categoryModules);
    }

    public static void setVanillaCategoryCommentForModule() {
        setCategoryCommentForModule("Vanilla", ToolsConfig.config);
    }

}
