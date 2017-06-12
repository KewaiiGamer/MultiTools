package info.kewaiigamer.multitools;

import info.kewaiigamer.multitools.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PaxelTab extends CreativeTabs {
    public PaxelTab() {
        super("paxels");
    }

    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.woodPaxel_tabIcon);
    }

    public boolean hasSearchBar() {
        return false;
    }
}
