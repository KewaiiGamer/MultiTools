package info.kewaiigamer.multitools;

import info.kewaiigamer.multitools.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class UniversalToolTab extends CreativeTabs {
    public UniversalToolTab() {
        super("universal_tools");
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.diamonduniversaltool;
    }

    public boolean hasSearchBar() {
        return false;
    }
}