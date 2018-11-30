package info.kewaiigamer.multitools.utils;

import com.mcmoddev.basemetals.BaseMetals;
import com.mcmoddev.lib.init.Materials;
import com.mcmoddev.modernmetals.ModernMetals;
import info.kewaiigamer.multitools.Ref;
import info.kewaiigamer.multitools.items.Paxel;
import info.kewaiigamer.multitools.items.UniversalTool;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Optional;

public class Utils {

    @Optional.Method(modid = Ref.BASEMETALS_MODID)
    public static Paxel createBaseMetalsPaxel(String material) {
        return new Paxel(Ref.MODID, Materials.getMaterialByName(material), BaseMetals.MODID);
    }

    @Optional.Method(modid = Ref.MODERNMETALS_MODID)
    public static Paxel createModernMetalsPaxel(String material) {
        return new Paxel(Ref.MODID, Materials.getMaterialByName(material), ModernMetals.MODID);
    }

    @Optional.Method(modid = Ref.BASEMETALS_MODID)
    public static Paxel createAlternatePaxel(String material) {
        return new Paxel(Ref.MODID, Materials.getMaterialByName(material), Ref.MODID);
    }

    public static Paxel createPaxel(String material) {
        Item.ToolMaterial toolMaterial = null;
        for (Item.ToolMaterial mat : Item.ToolMaterial.values()) {
            if (mat.name().equals(material.toUpperCase())) {
                toolMaterial = Item.ToolMaterial.valueOf(material.toUpperCase());
            }
        }
        return new Paxel(Ref.MODID, toolMaterial);
    }


    @Optional.Method(modid = Ref.BASEMETALS_MODID)
    public static UniversalTool createBaseMetalsUniversalTool(String material) {
        return new UniversalTool(Ref.MODID, Materials.getMaterialByName(material), BaseMetals.MODID);
    }

    @Optional.Method(modid = Ref.MODERNMETALS_MODID)
    public static UniversalTool createModernMetalsUniversalTool(String material) {
        return new UniversalTool(Ref.MODID, Materials.getMaterialByName(material), ModernMetals.MODID);
    }

    @Optional.Method(modid = Ref.BASEMETALS_MODID)
    public static UniversalTool createAlternateUniversalTool(String material) {
        return new UniversalTool(Ref.MODID, Materials.getMaterialByName(material), Ref.MODID);
    }

    public static UniversalTool createUniversalTool(String material) {
        Item.ToolMaterial toolMaterial = null;
        for (Item.ToolMaterial mat : Item.ToolMaterial.values()) {
            if (mat.name().equals(material.toUpperCase())) {
                toolMaterial = Item.ToolMaterial.valueOf(material.toUpperCase());
            }
        }
        return new UniversalTool(Ref.MODID, toolMaterial);
    }
}