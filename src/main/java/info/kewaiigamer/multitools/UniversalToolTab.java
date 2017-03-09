package info.kewaiigamer.multitools;

import info.kewaiigamer.multitools.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class UniversalToolTab extends CreativeTabs {
    public UniversalToolTab() {
        super("universal_tools");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.diamonduniversaltool);
    }

    public boolean hasSearchBar() {
        return false;
    }
}