package info.kewaiigamer.multitools;

import info.kewaiigamer.multitools.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class UniversalToolTab extends CreativeTabs {
    public UniversalToolTab() {
        super("universal_tools");
    }

    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.woodUniversalTool_tabIcon);
    }

    public boolean hasSearchBar() {
        return false;
    }
}
