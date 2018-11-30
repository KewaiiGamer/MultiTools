package info.kewaiigamer.multitools;

import com.google.common.collect.Ordering;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

import java.util.Comparator;
import java.util.List;

public class MultiToolsTab extends CreativeTabs {
    static Comparator<ItemStack> tabSorter;

    List<Item> items;

    public MultiToolsTab(String tab, List<Item> items) {
        super(tab);
        this.items = items;
    }

    @Override
    public ItemStack createIcon() {
        return this.items.get(0).getDefaultInstance();
    }

    public boolean hasSearchBar() {
        return false;
    }

    @Override
    public void displayAllRelevantItems(NonNullList<ItemStack> itemStackNonNullList) {
        super.displayAllRelevantItems(itemStackNonNullList);
        tabSorter = Ordering.explicit(items).onResultOf(ItemStack::getItem);
        itemStackNonNullList.sort(tabSorter);
    }
}