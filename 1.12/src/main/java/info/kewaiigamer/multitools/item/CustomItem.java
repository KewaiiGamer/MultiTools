package info.kewaiigamer.multitools.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by KewaiiGamer on 6/11/2017.
 */

public class CustomItem extends Item {
    public CustomItem(String modId, String name, CreativeTabs tab) {
        setUnlocalizedName(modId + ":" + name);
        setCreativeTab(tab);
        setRegistryName(name);
        GameRegistry.register(this);
    }
}