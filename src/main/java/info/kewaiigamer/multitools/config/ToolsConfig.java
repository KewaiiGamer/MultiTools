package info.kewaiigamer.multitools.config;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ToolsConfig {
    public static Configuration config;

    public static File config_dir = new File("config/Multi Tools");

    public static void initConfig() {
        File f = new File(config_dir, "Main.cfg");
        config = new Configuration(f);

        config.load();

        String categoryPaxels = "Paxels";
        String categoryUniversalTools = "Universal Tools";
        String categoryModules = "Modules";
        String categoryModule = "Module";

        config.addCustomCategoryComment(categoryModules + " Vanilla", "Enabling and Disabling Vanilla Modules");
        ConfigHandler.vanilla = config.getBoolean("Vanilla ", categoryModule + " Vanilla", true, "Enable Vanilla Support");
        ConfigHandler.vanillaPaxels = config.getBoolean("Vanilla " + categoryPaxels, categoryModules + " Vanilla", true, "Enable Vanilla Paxels?");
        ConfigHandler.vanillaUniversalTools = config.getBoolean("Vanilla " + categoryUniversalTools, categoryModules + " Vanilla", true, "Enable Vanilla Universal Tools?");

        config.addCustomCategoryComment(categoryPaxels + " Vanilla", "Enabling and Disabling Vanilla Paxels");
        ConfigHandler.woodenPaxel = config.getBoolean("Wooden Paxel", categoryPaxels + " Vanilla", true, "Enable Wooden Paxel?");
        ConfigHandler.stonePaxel = config.getBoolean("Stone Paxel", categoryPaxels + " Vanilla", true, "Enable Stone Paxel?");
        ConfigHandler.ironPaxel = config.getBoolean("Iron Paxel", categoryPaxels + " Vanilla", true, "Enable Iron Paxel?");
        ConfigHandler.goldenPaxel = config.getBoolean("Golden Paxel", categoryPaxels + " Vanilla", true, "Enable Golden Paxel?");
        ConfigHandler.diamondPaxel = config.getBoolean("Diamond Paxel", categoryPaxels + " Vanilla", true, "Enable Diamond Paxel?");


        config.addCustomCategoryComment(categoryUniversalTools + " Vanilla", "Enabling and Disabling Vanilla Universal Tools");
        ConfigHandler.woodenUniversalTool = config.getBoolean("Wooden Universal Tool", categoryUniversalTools + " Vanilla", true, "Enable Wooden Universal Tool");
        ConfigHandler.stoneUniversalTool = config.getBoolean("Stone Universal Tool", categoryUniversalTools + " Vanilla", true, "Enable Stone Universal Tool");
        ConfigHandler.ironUniversalTool = config.getBoolean("Iron Universal Tool", categoryUniversalTools + " Vanilla", true, "Enable Iron Universal Tool");
        ConfigHandler.goldenUniversalTool = config.getBoolean("Golden Universal Tool", categoryUniversalTools + " Vanilla", true, "Enable Golden Universal Tool");
        ConfigHandler.diamondUniversalTool = config.getBoolean("Diamond Universal Tool", categoryUniversalTools + " Vanilla", true, "Enable Diamond Universal Tool");

        if (config.hasChanged()) {
            config.save();
        }
    }
}
