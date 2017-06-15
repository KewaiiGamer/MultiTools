package info.kewaiigamer.multitools.config;

import info.kewaiigamer.multitools.ConfigValue;

import java.util.ArrayList;
import java.util.List;

public class ConfigHandler {
    public static ConfigValue woodenPaxel = new ConfigValue("wood");
    public static ConfigValue stonePaxel = new ConfigValue("stone");
    public static ConfigValue goldenPaxel = new ConfigValue("gold");
    public static ConfigValue ironPaxel = new ConfigValue("iron");
    public static ConfigValue diamondPaxel = new ConfigValue("diamond");

    public static ConfigValue woodenUniversalTool = new ConfigValue("wood");
    public static ConfigValue stoneUniversalTool = new ConfigValue("stone");
    public static ConfigValue ironUniversalTool = new ConfigValue("iron");
    public static ConfigValue goldenUniversalTool = new ConfigValue("gold");
    public static ConfigValue diamondUniversalTool = new ConfigValue("diamond");

    public static ConfigValue vanilla = new ConfigValue("vanilla");
    public static ConfigValue vanillaPaxels = new ConfigValue("vanillaPaxels");
    public static ConfigValue vanillaUniversalTools = new ConfigValue("vanillaUniversalTools");


    public static List<ConfigValue> vanillaPaxelsEnabled = new ArrayList<>();
    public static List<ConfigValue> vanillaUniversalToolsEnabled = new ArrayList<>();
    public static List<ConfigValue> vanillaEnabled = new ArrayList<>();

    public static void setVanillaPaxelsEnabled() {
        vanillaPaxelsEnabled.add(woodenPaxel);
        vanillaPaxelsEnabled.add(stonePaxel);
        vanillaPaxelsEnabled.add(ironPaxel);
        vanillaPaxelsEnabled.add(goldenPaxel);
        vanillaPaxelsEnabled.add(diamondPaxel);
    }

    public static void setVanillaUniversalToolsEnabled() {
        vanillaUniversalToolsEnabled.add(woodenUniversalTool);
        vanillaUniversalToolsEnabled.add(stoneUniversalTool);
        vanillaUniversalToolsEnabled.add(ironUniversalTool);
        vanillaUniversalToolsEnabled.add(goldenUniversalTool);
        vanillaUniversalToolsEnabled.add(diamondUniversalTool);
    }

    public static void setVanillaEnabled() {
        vanillaEnabled.addAll(vanillaPaxelsEnabled);
        vanillaEnabled.addAll(vanillaUniversalToolsEnabled);
    }
}
