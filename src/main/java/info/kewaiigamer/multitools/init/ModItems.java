package info.kewaiigamer.multitools.init;

import com.mcmoddev.basemetals.BaseMetals;
import com.mcmoddev.modernmetals.ModernMetals;
import info.kewaiigamer.multitools.Ref;
import info.kewaiigamer.multitools.items.Paxel;
import info.kewaiigamer.multitools.items.UniversalTool;
import info.kewaiigamer.multitools.utils.Utils;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Loader;
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

    public static void initItems() {
        if (Loader.isModLoaded(BaseMetals.MODID)) {
            Utils.createPaxel("wood", Ref.MODID);
            Utils.createPaxel("stone", Ref.MODID);
            Utils.createPaxel("iron", Ref.MODID);
            Utils.createPaxel("gold", Ref.MODID);
            Utils.createPaxel("diamond", Ref.MODID);

            Utils.createUniversalTool("wood", Ref.MODID);
            Utils.createUniversalTool("stone", Ref.MODID);
            Utils.createUniversalTool("iron", Ref.MODID);
            Utils.createUniversalTool("gold", Ref.MODID);
            Utils.createUniversalTool("diamond", Ref.MODID);

            Utils.createPaxel("adamantine", BaseMetals.MODID);
            Utils.createPaxel("antimony", BaseMetals.MODID);
            Utils.createPaxel("aquarium", BaseMetals.MODID);
            //bismuthPaxel = Utils.createPaxel("bismuth");
            //brassPaxel = Utils.createPaxel("brass");
            Utils.createPaxel("bronze", BaseMetals.MODID);
            //coalPaxel = Utils.createPaxel("coal");
            //coldironPaxel = Utils.createPaxel("coldiron");
            Utils.createPaxel("copper", BaseMetals.MODID);
            //charcoalPaxel = Utils.createPaxel("charcoal");
            //cupronickelPaxel = Utils.createPaxel("cupronickel");
            Utils.createPaxel("electrum", BaseMetals.MODID);
            //emeraldPaxel = Utils.createPaxel("emerald");
            Utils.createPaxel("invar", BaseMetals.MODID);
            /*
            lapisPaxel = Utils.createPaxel("lapis");
            leadPaxel = Utils.createPaxel("lead");
            mercuryPaxel = Utils.createPaxel("mercury");
            mithrilPaxel = Utils.createPaxel("mithril");
            nickelPaxel = Utils.createPaxel("nickel");
            obsidianPaxel = Utils.createPaxel("obsidian");
            pewterPaxel = Utils.createPaxel("pewter");
            platinumPaxel = Utils.createPaxel("platinum");
            prismarinePaxel = Utils.createPaxel("prismarine");
            quartzPaxel = Utils.createPaxel("quartz");
            redstonePaxel = Utils.createPaxel("redstone");
            */
            Utils.createPaxel("silver", BaseMetals.MODID);
            //starsteelPaxel = Utils.createPaxel("starsteel");
            Utils.createPaxel("steel", BaseMetals.MODID);
            //tinPaxel = Utils.createPaxel("tin");
            //zincPaxel = Utils.createPaxel("zinc");

            Utils.createUniversalTool("adamantine", BaseMetals.MODID);
            Utils.createUniversalTool("antimony", BaseMetals.MODID);
            Utils.createUniversalTool("aquarium", BaseMetals.MODID);
            //bismuthUniversalTool = Utils.createUniversalTool("bismuth");
            //brassUniversalTool = Utils.createUniversalTool("brass");
            Utils.createUniversalTool("bronze", BaseMetals.MODID);
            //coalUniversalTool = Utils.createUniversalTool("coal");
            //coldironUniversalTool = Utils.createUniversalTool("coldiron");
            Utils.createUniversalTool("copper", BaseMetals.MODID);
            //charcoalUniversalTool = Utils.createUniversalTool("charcoal");
            //cupronickelUniversalTool = Utils.createUniversalTool("cupronickel");
            //emeraldUniversalTool = Utils.createUniversalTool("emerald");
            Utils.createUniversalTool("electrum", BaseMetals.MODID);
            Utils.createUniversalTool("invar", BaseMetals.MODID);
            /*
            lapisUniversalTool = Utils.createUniversalTool("lapis");
            leadUniversalTool = Utils.createUniversalTool("lead");
            mercuryUniversalTool = Utils.createUniversalTool("mercury");
            mithrilUniversalTool = Utils.createUniversalTool("mithril");
            nickelUniversalTool = Utils.createUniversalTool("nickel");
            obsidianUniversalTool = Utils.createUniversalTool("obsidian");
            pewterUniversalTool = Utils.createUniversalTool("pewter");
            platinumUniversalTool = Utils.createUniversalTool("platinum");
            prismarineUniversalTool = Utils.createUniversalTool("prismarine");
            quartzUniversalTool = Utils.createUniversalTool("quartz");
            redstoneUniversalTool = Utils.createUniversalTool("redstone");
            */
            Utils.createUniversalTool("silver", BaseMetals.MODID);
            //starsteelUniversalTool = Utils.createUniversalTool("starsteel");
            Utils.createUniversalTool("steel", BaseMetals.MODID);
            //tinUniversalTool = Utils.createUniversalTool("tin");
            //zincUniversalTool = Utils.createUniversalTool("zinc");
        } else {
            Utils.createPaxel("wood", BaseMetals.MODID);
            Utils.createPaxel("stone", BaseMetals.MODID);
            Utils.createPaxel("iron", BaseMetals.MODID);
            Utils.createPaxel("gold", BaseMetals.MODID);
            Utils.createPaxel("diamond", BaseMetals.MODID);
            Utils.createUniversalTool("wood", BaseMetals.MODID);
            Utils.createUniversalTool("stone", BaseMetals.MODID);
            Utils.createUniversalTool("iron", BaseMetals.MODID);
            Utils.createUniversalTool("gold", BaseMetals.MODID);
            Utils.createUniversalTool("diamond", BaseMetals.MODID);
        }
        if (Loader.isModLoaded(ModernMetals.MODID)) {
            Utils.createPaxel("aluminum", ModernMetals.MODID);
            /*
            aluminumbrassPaxel = Utils.createPaxel("aluminumbrass");
            cadmiumPaxel = Utils.createPaxel("cadmium");
            chromiumPaxel = Utils.createPaxel("chromium");
            galvanizedsteelPaxel = Utils.createPaxel("galvanizedsteel");
            iridiumPaxel = Utils.createPaxel("iridium");
            magnesiumPaxel = Utils.createPaxel("magneisum");
            manganesePaxel = Utils.createPaxel("manganese");
            nichromePaxel = Utils.createPaxel("nichrome");
            osmiumPaxel = Utils.createPaxel("osmium");
            plutoniumPaxel = Utils.createPaxel("plutonium");
            rutilePaxel = Utils.createPaxel("rutile");
            stainlesssteelPaxel = Utils.createPaxel("stainlesssteel");
            tantalumPaxel = Utils.createPaxel("tantalum");
            titaniumPaxel = Utils.createPaxel("titanium");
            tungstenPaxel = Utils.createPaxel("tungsten");
            uraniumPaxel = Utils.createPaxel("uranium");
            zirconiumPaxel = Utils.createPaxel("zirconium");
            boronPaxel = Utils.createPaxel("boron");
            berylliumPaxel = Utils.createPaxel("beryllium");
            thoriumPaxel = Utils.createPaxel("thorium");
            */
            Utils.createUniversalTool("aluminum", ModernMetals.MODID);
            /*
            aluminumbrassUniversalTool = Utils.createUniversalTool("aluminumbrass");
            cadmiumUniversalTool = Utils.createUniversalTool("cadmium");
            chromiumUniversalTool = Utils.createUniversalTool("chromium");
            galvanizedsteelUniversalTool = Utils.createUniversalTool("galvanizedsteel");
            iridiumUniversalTool = Utils.createUniversalTool("iridium");
            magnesiumUniversalTool = Utils.createUniversalTool("magneisum");
            manganeseUniversalTool = Utils.createUniversalTool("manganese");
            nichromeUniversalTool = Utils.createUniversalTool("nichrome");
            osmiumUniversalTool = Utils.createUniversalTool("osmium");
            plutoniumUniversalTool = Utils.createUniversalTool("plutonium");
            rutileUniversalTool = Utils.createUniversalTool("rutile");
            stainlesssteelUniversalTool = Utils.createUniversalTool("stainlesssteel");
            tantalumUniversalTool = Utils.createUniversalTool("tantalum");
            titaniumUniversalTool = Utils.createUniversalTool("titanium");
            tungstenUniversalTool = Utils.createUniversalTool("tungsten");
            uraniumUniversalTool = Utils.createUniversalTool("uranium");
            zirconiumUniversalTool = Utils.createUniversalTool("zirconium");
            boronUniversalTool = Utils.createUniversalTool("boron");
            berylliumUniversalTool = Utils.createUniversalTool("beryllium");
            thoriumUniversalTool = Utils.createUniversalTool("thorium");
            */
        }
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        ModItems.paxels.forEach(item -> ((Paxel) (item)).initModel());
        ModItems.baseMetalsPaxels.forEach(item -> ((Paxel) (item)).initModel());
        ModItems.modernMetalsPaxels.forEach(item -> ((Paxel) (item)).initModel());
        ModItems.universalTools.forEach(item -> ((UniversalTool) (item)).initModel());
        ModItems.baseMetalsUniversalTools.forEach(item -> ((UniversalTool) (item)).initModel());
        ModItems.modernMetalsUniversalTools.forEach(item -> ((UniversalTool) (item)).initModel());
    }
}