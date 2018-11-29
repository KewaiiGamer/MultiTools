package info.kewaiigamer.multitools;

import com.google.common.collect.Ordering;
import info.kewaiigamer.multitools.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

import java.util.Comparator;

public class UniversalToolTab extends CreativeTabs {
    static Comparator<ItemStack> tabSorter;

    public UniversalToolTab() {
        super("universal_tools");
    }

    @Override
    public ItemStack getTabIconItem() {
        return ModItems.universalTools.get(0).getDefaultInstance();
    }

    public boolean hasSearchBar() {
        return false;
    }

    @Override
    public void displayAllRelevantItems(NonNullList<ItemStack> itemStackNonNullList) {
        super.displayAllRelevantItems(itemStackNonNullList);
        tabSorter = Ordering.explicit(ModItems.universalTools).onResultOf(ItemStack::getItem);
        itemStackNonNullList.sort(tabSorter);
    }
}