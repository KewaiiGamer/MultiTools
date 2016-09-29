package kewaiigamer.multitools.item;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import kewaiigamer.multitools.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

import java.util.HashSet;
import java.util.Set;

public class Paxel extends ItemPickaxe {
	
	public Paxel(ToolMaterial material, EnumVanillaMaterial vanilla) {
		super(material);
		setUnlocalizedName(Reference.MODID + ".paxel" + vanilla.suffix);
		setRegistryName("paxel" + vanilla.suffix);
	}
	public Set<String> getToolClasses(ItemStack stack) {
		return ImmutableSet.of("pickaxe", "spade");
		
	}
	private static HashSet<Block> effectiveAgainst = Sets.newHashSet(new Block[] {
		    Blocks.GRASS, Blocks.DIRT, Blocks.SAND, Blocks.GRAVEL, 
		    Blocks.SNOW_LAYER, Blocks.SNOW, Blocks.CLAY, Blocks.FARMLAND, 
		    Blocks.SOUL_SAND, Blocks.MYCELIUM, Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, 
		    Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN});

	@Override
	public boolean canHarvestBlock(IBlockState blockIn) {
			return effectiveAgainst.contains(blockIn) ? true : super.canHarvestBlock(blockIn);
	}

	@Override
	public float getStrVsBlock(ItemStack stack, IBlockState state) {
		 if (state.getMaterial() == Material.WOOD || state.getMaterial() == Material.VINE || state.getMaterial() == Material.PLANTS || state.getMaterial() == Material.GROUND || state.getMaterial() == Material.GRASS || state.getMaterial() == Material.SAND)
		        return this.efficiencyOnProperMaterial;
		 return effectiveAgainst.contains(state) ? this.efficiencyOnProperMaterial : super.getStrVsBlock(stack, state);
	}

}
