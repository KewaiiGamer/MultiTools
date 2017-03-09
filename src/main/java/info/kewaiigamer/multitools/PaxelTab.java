package info.kewaiigamer.multitools;

import info.kewaiigamer.multitools.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PaxelTab extends CreativeTabs {
    public PaxelTab() {
        super("paxels");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.diamondpaxel);
    }

    public boolean hasSearchBar() {
        return false;
    }
}