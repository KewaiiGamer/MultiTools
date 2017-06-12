package info.kewaiigamer.multitools.utils;

import info.kewaiigamer.multitools.Main;
import info.kewaiigamer.multitools.item.Paxel;
import info.kewaiigamer.multitools.Ref;
import info.kewaiigamer.multitools.item.UniversalTool;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utils {

    private static Map<Item, String> itemRegistry = new HashMap<>();
    private static Map<Item.ToolMaterial, List<Item>> itemsByMaterial = new HashMap<>();

    public static Item createPaxel(Item.ToolMaterial material) {
        return registerItem(new Paxel(Ref.MODID, material), material.name().toLowerCase() + "paxel", material, Main.PAXELS);
    }

    public static Item createUniversalTool(Item.ToolMaterial material) {
        return registerItem(new UniversalTool(Ref.MODID, material), material.name().toLowerCase() + "universaltool", material, Main.UNIVERSAL_TOOLS);
    }

    public static Item registerItem(Item item, String name, Item.ToolMaterial material, CreativeTabs tab) {
        GameRegistry.register(item);
        itemRegistry.put(item, name);
        if(tab != null) {
            item.setCreativeTab(tab);
        }

        if(material == null) {
            return item;
        } else {
            itemsByMaterial.computeIfAbsent(material, (g) -> {
                return new ArrayList();
            });
            ((List)itemsByMaterial.get(material)).add(item);
            return item;
        }
    }

}
