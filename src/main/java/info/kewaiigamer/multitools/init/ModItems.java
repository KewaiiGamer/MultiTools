package info.kewaiigamer.multitools.init;

import info.kewaiigamer.multitools.Ref;
import info.kewaiigamer.multitools.items.Paxel;
import info.kewaiigamer.multitools.items.UniversalTool;
import info.kewaiigamer.multitools.utils.Utils;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static List<Item> paxels = new ArrayList<>();
    public static List<Item> baseMetalsPaxels = new ArrayList<>();
    public static List<Item> modernMetalsPaxels = new ArrayList<>();
    public static List<Item> universalTools = new ArrayList<>();
    public static List<Item> baseMetalsUniversalTools = new ArrayList<>();
    public static List<Item> modernMetalsUniversalTools = new ArrayList<>();


    @Optional.Method(modid = Ref.MODERNMETALS_MODID)
    public static void initModernMetalsItems() {
        Utils.createModernMetalsPaxel("aluminum");
            /*
            aluminumbrassPaxel = Utils.createModernMetalsPaxel("aluminumbrass");
            cadmiumPaxel = Utils.createModernMetalsPaxel("cadmium");
            chromiumPaxel = Utils.createModernMetalsPaxel("chromium");
            galvanizedsteelPaxel = Utils.createModernMetalsPaxel("galvanizedsteel");
            iridiumPaxel = Utils.createModernMetalsPaxel("iridium");
            */
            Utils.createModernMetalsPaxel("magnesium");
            /*
            manganesePaxel = Utils.createModernMetalsPaxel("manganese");
            nichromePaxel = Utils.createModernMetalsPaxel("nichrome");
            osmiumPaxel = Utils.createModernMetalsPaxel("osmium");
            plutoniumPaxel = Utils.createModernMetalsPaxel("plutonium");
            rutilePaxel = Utils.createModernMetalsPaxel("rutile");
            stainlesssteelPaxel = Utils.createModernMetalsPaxel("stainlesssteel");
            tantalumPaxel = Utils.createModernMetalsPaxel("tantalum");
            titaniumPaxel = Utils.createModernMetalsPaxel("titanium");
            tungstenPaxel = Utils.createModernMetalsPaxel("tungsten");
            uraniumPaxel = Utils.createModernMetalsPaxel("uranium");
            zirconiumPaxel = Utils.createModernMetalsPaxel("zirconium");
            boronPaxel = Utils.createModernMetalsPaxel("boron");
            berylliumPaxel = Utils.createModernMetalsPaxel("beryllium");
            thoriumPaxel = Utils.createModernMetalsPaxel("thorium");
            */
        Utils.createModernMetalsUniversalTool("aluminum");
            /*
            aluminumbrassUniversalTool = Utils.createModernMetalsUniversalTool("aluminumbrass");
            cadmiumUniversalTool = Utils.createModernMetalsUniversalTool("cadmium");
            chromiumUniversalTool = Utils.createModernMetalsUniversalTool("chromium");
            galvanizedsteelUniversalTool = Utils.createModernMetalsUniversalTool("galvanizedsteel");
            iridiumUniversalTool = Utils.createModernMetalsUniversalTool("iridium");
            */
            Utils.createModernMetalsUniversalTool("magnesium");
            /*
            manganeseUniversalTool = Utils.createModernMetalsUniversalTool("manganese");
            nichromeUniversalTool = Utils.createModernMetalsUniversalTool("nichrome");
            osmiumUniversalTool = Utils.createModernMetalsUniversalTool("osmium");
            plutoniumUniversalTool = Utils.createModernMetalsUniversalTool("plutonium");
            rutileUniversalTool = Utils.createModernMetalsUniversalTool("rutile");
            stainlesssteelUniversalTool = Utils.createModernMetalsUniversalTool("stainlesssteel");
            tantalumUniversalTool = Utils.createModernMetalsUniversalTool("tantalum");
            titaniumUniversalTool = Utils.createModernMetalsUniversalTool("titanium");
            tungstenUniversalTool = Utils.createModernMetalsUniversalTool("tungsten");
            uraniumUniversalTool = Utils.createModernMetalsUniversalTool("uranium");
            zirconiumUniversalTool = Utils.createModernMetalsUniversalTool("zirconium");
            boronUniversalTool = Utils.createModernMetalsUniversalTool("boron");
            berylliumUniversalTool = Utils.createModernMetalsUniversalTool("beryllium");
            thoriumUniversalTool = Utils.createModernMetalsUniversalTool("thorium");
            */
    }

    @Optional.Method(modid = Ref.BASEMETALS_MODID)
    public static void initBaseMetalsItems() {
        Utils.createAlternatePaxel("wood");
        Utils.createAlternatePaxel("stone");
        Utils.createAlternatePaxel("iron");
        Utils.createAlternatePaxel("gold");
        Utils.createAlternatePaxel("diamond");
        Utils.createAlternateUniversalTool("wood");
        Utils.createAlternateUniversalTool("stone");
        Utils.createAlternateUniversalTool("iron");
        Utils.createAlternateUniversalTool("gold");
        Utils.createAlternateUniversalTool("diamond");

        Utils.createBaseMetalsPaxel("adamantine");
        Utils.createBaseMetalsPaxel("antimony");
        Utils.createBaseMetalsPaxel("aquarium");
        Utils.createBaseMetalsPaxel("bismuth");
        Utils.createBaseMetalsPaxel("brass");
        Utils.createBaseMetalsPaxel("bronze");
        //Utils.createBaseMetalsPaxel("coal");
        Utils.createBaseMetalsPaxel("coldiron");
        Utils.createBaseMetalsPaxel("copper");
        //Utils.createBaseMetalsPaxel("charcoal");
        Utils.createBaseMetalsPaxel("cupronickel");
        Utils.createBaseMetalsPaxel("electrum");
        Utils.createBaseMetalsPaxel("emerald");
        Utils.createBaseMetalsPaxel("invar");
        //Utils.createBaseMetalsPaxel("lapis");
        Utils.createBaseMetalsPaxel("lead");
        //Utils.createBaseMetalsPaxel("mercury");
        Utils.createBaseMetalsPaxel("mithril");
        Utils.createBaseMetalsPaxel("nickel");
        Utils.createBaseMetalsPaxel("obsidian");
        Utils.createBaseMetalsPaxel("pewter");
        Utils.createBaseMetalsPaxel("platinum");
        //Utils.createBaseMetalsPaxel("prismarine");
        Utils.createBaseMetalsPaxel("quartz");
        //Utils.createBaseMetalsPaxel("redstone");
        Utils.createBaseMetalsPaxel("silver");
        Utils.createBaseMetalsPaxel("starsteel");
        Utils.createBaseMetalsPaxel("steel");
        Utils.createBaseMetalsPaxel("tin");
        Utils.createBaseMetalsPaxel("zinc");

        Utils.createBaseMetalsUniversalTool("adamantine");
        Utils.createBaseMetalsUniversalTool("antimony");
        Utils.createBaseMetalsUniversalTool("aquarium");
        Utils.createBaseMetalsUniversalTool("bismuth");
        Utils.createBaseMetalsUniversalTool("brass");
        Utils.createBaseMetalsUniversalTool("bronze");
        //Utils.createBaseMetalsUniversalTool(("coal");
        Utils.createBaseMetalsUniversalTool("coldiron");
        Utils.createBaseMetalsUniversalTool("copper");
        //Utils.createBaseMetalsUniversalTool(("charcoal");
        Utils.createBaseMetalsUniversalTool("cupronickel");
        Utils.createBaseMetalsUniversalTool("emerald");
        Utils.createBaseMetalsUniversalTool("electrum");
        Utils.createBaseMetalsUniversalTool("invar");
        //Utils.createBaseMetalsUniversalTool(("lapis");
        Utils.createBaseMetalsUniversalTool("lead");
        //Utils.createBaseMetalsUniversalTool(("mercury");
        Utils.createBaseMetalsUniversalTool("mithril");
        Utils.createBaseMetalsUniversalTool("nickel");
        Utils.createBaseMetalsUniversalTool("obsidian");
        Utils.createBaseMetalsUniversalTool("pewter");
        Utils.createBaseMetalsUniversalTool("platinum");
        //Utils.createBaseMetalsUniversalTool(("prismarine");
        Utils.createBaseMetalsUniversalTool("quartz");
        //Utils.createBaseMetalsUniversalTool(("redstone");
        Utils.createBaseMetalsUniversalTool("silver");
        //Utils.createBaseMetalsUniversalTool("starsteel");
        Utils.createBaseMetalsUniversalTool("steel");
        Utils.createBaseMetalsUniversalTool("tin");
        Utils.createBaseMetalsUniversalTool("zinc");
    }

    public static void initItems() {
        if (!Loader.isModLoaded(Ref.BASEMETALS_MODID)) {
            Utils.createPaxel("wood");
            Utils.createPaxel("stone");
            Utils.createPaxel("iron");
            Utils.createPaxel("gold");
            Utils.createPaxel("diamond");

            Utils.createUniversalTool("wood");
            Utils.createUniversalTool("stone");
            Utils.createUniversalTool("iron");
            Utils.createUniversalTool("gold");
            Utils.createUniversalTool("diamond");
        }
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        ModItems.paxels.forEach(item -> ((Paxel) (item)).initModel());
        ModItems.universalTools.forEach(item -> ((UniversalTool) (item)).initModel());
    }


    @SideOnly(Side.CLIENT)
    @Optional.Method(modid = Ref.BASEMETALS_MODID)
    public static void initBaseMetalsModels() {
        ModItems.baseMetalsPaxels.forEach(item -> ((Paxel) (item)).initModel());
        ModItems.baseMetalsUniversalTools.forEach(item -> ((UniversalTool) (item)).initModel());
    }

    @SideOnly(Side.CLIENT)
    @Optional.Method(modid = Ref.MODERNMETALS_MODID)
    public static void initModernMetalsModels() {
        ModItems.modernMetalsPaxels.forEach(item -> ((Paxel) (item)).initModel());
        ModItems.modernMetalsUniversalTools.forEach(item -> ((UniversalTool) (item)).initModel());
    }
}