package info.kewaiigamer.multitools;

import info.kewaiigamer.multitools.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PaxelTab extends CreativeTabs {
    public PaxelTab() {
        super("paxels");
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.diamondpaxel;
    }

    public boolean hasSearchBar() {
        return false;
    }
}