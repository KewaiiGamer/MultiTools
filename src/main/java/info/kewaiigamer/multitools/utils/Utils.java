package info.kewaiigamer.multitools.utils;

import com.mcmoddev.basemetals.BaseMetals;
import com.mcmoddev.lib.init.Materials;
import info.kewaiigamer.multitools.Ref;
import info.kewaiigamer.multitools.items.Paxel;
import info.kewaiigamer.multitools.items.UniversalTool;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Loader;

public class Utils {

    public static Paxel createPaxel(String material, String modId) {
        Item.ToolMaterial toolMaterial = null;
        for (Item.ToolMaterial mat : Item.ToolMaterial.values()) {
            if (mat.name().equals(material)) {
                toolMaterial = Item.ToolMaterial.valueOf(material);
            }
        }
        Paxel item = toolMaterial != null && !Loader.isModLoaded(BaseMetals.MODID) ? new Paxel(Ref.MODID, toolMaterial) : new Paxel(Ref.MODID, Materials.getMaterialByName(material), modId);
        return item;
    }

    public static UniversalTool createUniversalTool(String material, String modId) {
        Item.ToolMaterial toolMaterial = null;
        for (Item.ToolMaterial mat : Item.ToolMaterial.values()) {
            if (mat.name().equals(material)) {
                toolMaterial = Item.ToolMaterial.valueOf(material);
            }
        }
        UniversalTool item = toolMaterial != null && !Loader.isModLoaded(BaseMetals.MODID) ? new UniversalTool(Ref.MODID, toolMaterial) : new UniversalTool(Ref.MODID, Materials.getMaterialByName(material), modId);
        return item;
    }
}