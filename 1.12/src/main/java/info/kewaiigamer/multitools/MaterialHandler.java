package info.kewaiigamer.multitools;

import net.minecraft.item.Item;

/**
 * Created by KewaiiGamer on 6/11/2017.
 */
public class MaterialHandler {
    public static String suffix(Item.ToolMaterial material) {
        String[] parts = material.name().split("Tool");
        return parts[0];
    }
}
