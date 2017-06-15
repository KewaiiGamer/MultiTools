package info.kewaiigamer.multitools.config;

import info.kewaiigamer.multitools.utils.Utils;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

import static info.kewaiigamer.multitools.config.ConfigHandler.*;
import static info.kewaiigamer.multitools.utils.Utils.*;

public class ToolsConfig {
    public static Configuration config;

    public static File config_dir = new File("config/Multi Tools");

    public static void initConfig() {
        File f = new File(config_dir, "Main.cfg");
        config = new Configuration(f);

        config.load();

        String categoryPaxels = "Paxels";
        String categoryUniversalTools = "Universal Tools";

        setVanillaCategoryCommentForModule();

        vanilla.setValue(Utils.getVanillaModule());
        vanillaPaxels.setValue(Utils.getVanillaModulePaxel());
        vanillaUniversalTools.setValue(Utils.getVanillaModuleUniversalTool());

        setVanillaCategoryCommentForSubModule(categoryPaxels);
        woodenPaxel.setValue(getVanillaPaxel(woodenPaxel.getName()));
        stonePaxel.setValue(getVanillaPaxel(stonePaxel.getName()));
        ironPaxel.setValue(getVanillaPaxel(ironPaxel.getName()));
        goldenPaxel.setValue(getVanillaPaxel(goldenPaxel.getName()));
        diamondPaxel.setValue(getVanillaPaxel(diamondPaxel.getName()));

        setVanillaCategoryCommentForSubModule(categoryUniversalTools);
        woodenUniversalTool.setValue(getVanillaUT(woodenUniversalTool.getName()));
        stoneUniversalTool.setValue(getVanillaUT(stoneUniversalTool.getName()));
        ironUniversalTool.setValue(getVanillaUT(ironUniversalTool.getName()));
        goldenUniversalTool.setValue(getVanillaUT(goldenUniversalTool.getName()));
        diamondUniversalTool.setValue(getVanillaUT(diamondUniversalTool.getName()));

        if (config.hasChanged()) {
            config.save();
        }
    }
}
