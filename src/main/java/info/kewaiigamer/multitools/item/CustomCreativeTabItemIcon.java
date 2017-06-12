package info.kewaiigamer.multitools.item;

import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by KewaiiGamer on 6/11/2017.
 */
public class CustomCreativeTabItemIcon extends CustomItem {

    public CustomCreativeTabItemIcon(String modId, String name) {
        super(modId, name + "_tab", (CreativeTabs)null);
    }
}
