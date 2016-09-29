	package kewaiigamer.multitools;

import kewaiigamer.multitools.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab {
	public static final CreativeTabs tabMultiTools = new CreativeTabs("MultiTools")
	{
		@Override
		public Item getTabIconItem() {
			return ModItems.woodpaxel;
		}
		@Override
		public boolean hasSearchBar() {
			return false;
		}
	};
}
