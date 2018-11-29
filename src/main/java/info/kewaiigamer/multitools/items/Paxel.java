package info.kewaiigamer.multitools.items;


import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mcmoddev.basemetals.BaseMetals;
import com.mcmoddev.lib.init.Materials;
import com.mcmoddev.lib.material.MMDMaterial;
import com.mcmoddev.modernmetals.ModernMetals;
import info.kewaiigamer.multitools.Main;
import info.kewaiigamer.multitools.enums.EnumVanillaMaterial;
import info.kewaiigamer.multitools.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Paxel extends ItemPickaxe {
    private static HashSet<Block> effectiveAgainst = Sets.newHashSet(Blocks.GRASS, Blocks.DIRT, Blocks.SAND, Blocks.GRAVEL, Blocks.SNOW_LAYER, Blocks.SNOW, Blocks.CLAY, Blocks.FARMLAND, Blocks.SOUL_SAND, Blocks.MYCELIUM, Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN);

    public Paxel(String modId, Item.ToolMaterial material) {
        super(material);
        EnumVanillaMaterial vanilla = EnumVanillaMaterial.valueOf(material.name());
        this.setRegistryName("paxel_" + vanilla.suffix);
        this.setUnlocalizedName(modId + ":paxel_" + vanilla.suffix);
        this.setCreativeTab(Main.PAXELS);
        ModItems.paxels.add(this);
    }

    public Paxel(String modId, MMDMaterial material, String modId2) {
        super(Objects.requireNonNull(Materials.getToolMaterialFor(material)));
        this.setUnlocalizedName(modId + ":paxel_" + material.getName());
        this.setRegistryName("paxel_" + material.getName());
        if (modId2.equals(modId)) {
            ModItems.paxels.add(this);
            this.setCreativeTab(Main.PAXELS);
        }
        if (modId2.equals(BaseMetals.MODID)) {
            ModItems.baseMetalsPaxels.add(this);
            this.setCreativeTab(Main.BASEMETALS_PAXELS);
        }
        if (modId2.equals(ModernMetals.MODID)) {
            ModItems.modernMetalsPaxels.add(this);
            this.setCreativeTab(Main.MODERNMETALS_PAXELS);
        }
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    public Set<String> getToolClasses(ItemStack stack) {
        return ImmutableSet.of("pickaxe", "spade");
    }

    public boolean canHarvestBlock(IBlockState blockIn) {
        if (effectiveAgainst.contains(blockIn)) {
            return true;
        }
        boolean bl = super.canHarvestBlock(blockIn);
        return bl;
    }

    public float getDestroySpeed(ItemStack stack, IBlockState state) {
        float f;
        if (state.getMaterial() == Material.WOOD) return this.efficiency;
        if (state.getMaterial() == Material.VINE) return this.efficiency;
        if (state.getMaterial() == Material.PLANTS) return this.efficiency;
        if (state.getMaterial() == Material.GROUND) return this.efficiency;
        if (state.getMaterial() == Material.GRASS) return this.efficiency;
        if (state.getMaterial() == Material.SAND) {
            return this.efficiency;
        }
        if (effectiveAgainst.contains(state)) {
            f = this.efficiency;
            return f;
        }
        f = super.getDestroySpeed(stack, state);
        return f;
    }
}
