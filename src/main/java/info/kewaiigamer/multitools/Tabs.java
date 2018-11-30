package info.kewaiigamer.multitools;

import info.kewaiigamer.multitools.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;

public class Tabs {

    public static CreativeTabs PAXELS;
    public static CreativeTabs BASEMETALS_PAXELS;
    public static CreativeTabs BASEMETALS_UNIVERSAL_TOOLS;
    public static CreativeTabs UNIVERSAL_TOOLS;
    public static CreativeTabs MODERNMETALS_PAXELS;
    public static CreativeTabs MODERNMETALS_UNIVERSAL_TOOLS;

    public static void initBaseMetalsTabs() {
        BASEMETALS_PAXELS = new MultiToolsTab("basemetals_paxels", ModItems.baseMetalsPaxels);
        BASEMETALS_UNIVERSAL_TOOLS = new MultiToolsTab("basemetals_universaltools", ModItems.baseMetalsUniversalTools);
    }

    public static void initModernMetalsTabs() {
        MODERNMETALS_PAXELS = new MultiToolsTab("modernmetals_paxels", ModItems.modernMetalsPaxels);
        MODERNMETALS_UNIVERSAL_TOOLS = new MultiToolsTab("modernmetals_universaltools", ModItems.modernMetalsUniversalTools);
    }

    public static void initTabs() {
        PAXELS = new MultiToolsTab("paxels", ModItems.paxels);
        UNIVERSAL_TOOLS = new MultiToolsTab("universaltools", ModItems.universalTools);
    }
}
