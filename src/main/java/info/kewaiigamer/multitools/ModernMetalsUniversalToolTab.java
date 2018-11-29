package info.kewaiigamer.multitools;

import com.google.common.collect.Ordering;
import info.kewaiigamer.multitools.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

import java.util.Comparator;

public class ModernMetalsUniversalToolTab extends CreativeTabs {
    static Comparator<ItemStack> tabSorter;

    public ModernMetalsUniversalToolTab() {
        super("modernmetals_universaltools");
    }

    @Override
    public ItemStack getTabIconItem() {
        return ModItems.modernMetalsUniversalTools.get(0).getDefaultInstance();
    }

    public boolean hasSearchBar() {
        return false;
    }

    @Override
    public void displayAllRelevantItems(NonNullList<ItemStack> itemStackNonNullList) {
        super.displayAllRelevantItems(itemStackNonNullList);
        tabSorter = Ordering.explicit(ModItems.modernMetalsUniversalTools).onResultOf(ItemStack::getItem);
        itemStackNonNullList.sort(tabSorter);
    }
}