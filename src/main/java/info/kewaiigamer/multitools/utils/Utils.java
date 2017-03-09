package info.kewaiigamer.multitools.utils;

import exter.substratum.material.EnumMaterialEquipment;
import info.kewaiigamer.kewaiilib.multitools.EnumVanillaMaterial;
import info.kewaiigamer.multitools.Main;
import info.kewaiigamer.multitools.Ref;
import net.minecraft.item.Item;

import static info.kewaiigamer.kewaiilib.utils.MultiToolsUtils.*;
public class Utils {

    public static Item createMultiToolsPaxel(Item.ToolMaterial material, EnumVanillaMaterial vanilla) {
        return createPaxel(Ref.MODID, "paxel", material, vanilla, Main.PAXELS);
    }

    public static Item createMultiToolsMetalPaxel(EnumMaterialEquipment equipment) {
        return createMetalPaxel(Ref.MODID, "paxel", equipment, Main.PAXELS);
    }

    public static Item createMultiToolsUniversalTool(Item.ToolMaterial material, EnumVanillaMaterial vanilla) {
        return createUniversalTool(Ref.MODID, "universaltool", material, vanilla, Main.UNIVERSAL_TOOLS);
    }

    public static Item createMultiToolsMetalUniversalTool(EnumMaterialEquipment equipment) {
        return createMetalUniversalTool(Ref.MODID, "universaltool", equipment, Main.UNIVERSAL_TOOLS);
    }
}