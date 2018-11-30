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
            magnesiumPaxel = Utils.createModernMetalsPaxel("magneisum");
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
            magnesiumUniversalTool = Utils.createModernMetalsUniversalTool("magneisum");
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
        //bismuthPaxel = Utils.createBaseMetalsPaxel("bismuth");
        //brassPaxel = Utils.createBaseMetalsPaxel("brass");
        Utils.createBaseMetalsPaxel("bronze");
        //coalPaxel = Utils.createBaseMetalsPaxel("coal");
        //coldironPaxel = Utils.createBaseMetalsPaxel("coldiron");
        Utils.createBaseMetalsPaxel("copper");
        //charcoalPaxel = Utils.createBaseMetalsPaxel("charcoal");
        //cupronickelPaxel = Utils.createBaseMetalsPaxel("cupronickel");
        Utils.createBaseMetalsPaxel("electrum");
        //emeraldPaxel = Utils.createBaseMetalsPaxel("emerald");
        Utils.createBaseMetalsPaxel("invar");
        /*
        lapisPaxel = Utils.createBaseMetalsPaxel("lapis");
        leadPaxel = Utils.createBaseMetalsPaxel("lead");
        mercuryPaxel = Utils.createBaseMetalsPaxel("mercury");
        mithrilPaxel = Utils.createBaseMetalsPaxel("mithril");
        nickelPaxel = Utils.createBaseMetalsPaxel("nickel");
        obsidianPaxel = Utils.createBaseMetalsPaxel("obsidian");
        pewterPaxel = Utils.createBaseMetalsPaxel("pewter");
        platinumPaxel = Utils.createBaseMetalsPaxel("platinum");
        prismarinePaxel = Utils.createBaseMetalsPaxel("prismarine");
        quartzPaxel = Utils.createBaseMetalsPaxel("quartz");
        redstonePaxel = Utils.createBaseMetalsPaxel("redstone");
        */
        Utils.createBaseMetalsPaxel("silver");
        //starsteelPaxel = Utils.createBaseMetalsPaxel("starsteel");
        Utils.createBaseMetalsPaxel("steel");
        //tinPaxel = Utils.createBaseMetalsPaxel("tin");
        //zincPaxel = Utils.createBaseMetalsPaxel("zinc");

        Utils.createBaseMetalsUniversalTool("adamantine");
        Utils.createBaseMetalsUniversalTool("antimony");
        Utils.createBaseMetalsUniversalTool("aquarium");
        //bismuthUniversalTool = Utils.createBaseMetalsUniversalTool(("bismuth");
        //brassUniversalTool = Utils.createBaseMetalsUniversalTool(("brass");
        Utils.createBaseMetalsUniversalTool("bronze");
        //coalUniversalTool = Utils.createBaseMetalsUniversalTool(("coal");
        //coldironUniversalTool = Utils.createBaseMetalsUniversalTool(("coldiron");
        Utils.createBaseMetalsUniversalTool("copper");
        //charcoalUniversalTool = Utils.createBaseMetalsUniversalTool(("charcoal");
        //cupronickelUniversalTool = Utils.createBaseMetalsUniversalTool(("cupronickel");
        //emeraldUniversalTool = Utils.createBaseMetalsUniversalTool(("emerald");
        Utils.createBaseMetalsUniversalTool("electrum");
        Utils.createBaseMetalsUniversalTool("invar");
        /*
        lapisUniversalTool = Utils.createBaseMetalsUniversalTool(("lapis");
        leadUniversalTool = Utils.createBaseMetalsUniversalTool(("lead");
        mercuryUniversalTool = Utils.createBaseMetalsUniversalTool(("mercury");
        mithrilUniversalTool = Utils.createBaseMetalsUniversalTool(("mithril");
        nickelUniversalTool = Utils.createBaseMetalsUniversalTool(("nickel");
        obsidianUniversalTool = Utils.createBaseMetalsUniversalTool(("obsidian");
        pewterUniversalTool = Utils.createBaseMetalsUniversalTool(("pewter");
        platinumUniversalTool = Utils.createBaseMetalsUniversalTool(("platinum");
        prismarineUniversalTool = Utils.createBaseMetalsUniversalTool(("prismarine");
        quartzUniversalTool = Utils.createBaseMetalsUniversalTool(("quartz");
        redstoneUniversalTool = Utils.createBaseMetalsUniversalTool(("redstone");
        */
        Utils.createBaseMetalsUniversalTool("silver");
        //starsteelUniversalTool = Utils.createBaseMetalsUniversalTool(("starsteel");
        Utils.createBaseMetalsUniversalTool("steel");
        //tinUniversalTool = Utils.createBaseMetalsUniversalTool(("tin");
        //zincUniversalTool = Utils.createBaseMetalsUniversalTool(("zinc");
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