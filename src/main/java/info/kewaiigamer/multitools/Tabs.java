package info.kewaiigamer.multitools;

import info.kewaiigamer.multitools.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;

import java.util.ArrayList;

public class Tabs {

    public static CreativeTabs PAXELS;
    public static CreativeTabs BASEMETALS_PAXELS;
    public static CreativeTabs BASEMETALS_UNIVERSAL_TOOLS;
    public static CreativeTabs UNIVERSAL_TOOLS;
    public static CreativeTabs MODERNMETALS_PAXELS;
    public static CreativeTabs MODERNMETALS_UNIVERSAL_TOOLS;

    public static void initBaseMetalsTabs() {
        BASEMETALS_PAXELS = new MultiToolsTab("basemetals_paxels", new ArrayList<>(ModItems.baseMetalsPaxels.values()));
        BASEMETALS_UNIVERSAL_TOOLS = new MultiToolsTab("basemetals_universaltools", new ArrayList<>(ModItems.baseMetalsUniversalTools.values()));
    }

    public static void initModernMetalsTabs() {
        MODERNMETALS_PAXELS = new MultiToolsTab("modernmetals_paxels", new ArrayList<>(ModItems.modernMetalsPaxels.values()));
        MODERNMETALS_UNIVERSAL_TOOLS = new MultiToolsTab("modernmetals_universaltools", new ArrayList<>(ModItems.modernMetalsUniversalTools.values()));
    }

    public static void initTabs() {
        PAXELS = new MultiToolsTab("paxels", ModItems.paxels);
        UNIVERSAL_TOOLS = new MultiToolsTab("universaltools", ModItems.universalTools);
    }
}
