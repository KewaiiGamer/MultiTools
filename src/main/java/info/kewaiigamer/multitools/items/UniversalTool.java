package info.kewaiigamer.multitools.items;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mcmoddev.basemetals.BaseMetals;
import com.mcmoddev.lib.init.Materials;
import com.mcmoddev.lib.material.MMDMaterial;
import com.mcmoddev.modernmetals.ModernMetals;
import info.kewaiigamer.multitools.Tabs;
import info.kewaiigamer.multitools.enums.EnumVanillaMaterial;
import info.kewaiigamer.multitools.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class UniversalTool extends ItemPickaxe {
    private static HashSet<Block> effectiveAgainst = Sets.newHashSet(Blocks.GRASS, Blocks.DIRT, Blocks.SAND, Blocks.GRAVEL, Blocks.SNOW_LAYER, Blocks.SNOW, Blocks.CLAY, Blocks.FARMLAND, Blocks.SOUL_SAND, Blocks.MYCELIUM, Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN);

    public UniversalTool(String modId, Item.ToolMaterial material) {
        super(material);
        EnumVanillaMaterial vanilla = EnumVanillaMaterial.valueOf(material.name());
        this.setRegistryName("universaltool_" + vanilla.suffix);
        this.setTranslationKey(modId + ":universaltool_" + vanilla.suffix);
        this.setCreativeTab(Tabs.UNIVERSAL_TOOLS);
        ModItems.universalTools.add(this);
    }

    public UniversalTool(String modId, MMDMaterial material, String modId2) {
        super(Objects.requireNonNull(Materials.getToolMaterialFor(material)));
        this.setRegistryName("universaltool_" + material.getName());
        this.setTranslationKey(modId + ":universaltool_" + material.getName());
        if (modId2.equals(modId)) {
            ModItems.universalTools.add(this);
            this.setCreativeTab(Tabs.UNIVERSAL_TOOLS);
        } else if (modId2.equals(BaseMetals.MODID)) {
            ModItems.baseMetalsUniversalTools.put(material, this);
            this.setCreativeTab(Tabs.BASEMETALS_UNIVERSAL_TOOLS);
        } else if (modId2.equals(ModernMetals.MODID)) {
            ModItems.modernMetalsUniversalTools.put(material, this);
            this.setCreativeTab(Tabs.MODERNMETALS_UNIVERSAL_TOOLS);
        }
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
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

    public Set<String> getToolClasses(ItemStack stack) {
        return ImmutableSet.of("pickaxe", "spade");
    }

    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        ItemStack itemstack = player.getHeldItem(hand);

        if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack)) {
            return EnumActionResult.FAIL;
        } else {
            int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(itemstack, player, worldIn, pos);
            if (hook != 0) return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;

            IBlockState iblockstate = worldIn.getBlockState(pos);
            Block block = iblockstate.getBlock();

            if (facing != EnumFacing.DOWN && worldIn.isAirBlock(pos.up())) {
                if (block == Blocks.GRASS || block == Blocks.GRASS_PATH) {
                    this.setBlock(itemstack, player, worldIn, pos, Blocks.FARMLAND.getDefaultState());
                    return EnumActionResult.SUCCESS;
                }

                if (block == Blocks.DIRT) {
                    switch (iblockstate.getValue(BlockDirt.VARIANT)) {
                        case DIRT:
                            this.setBlock(itemstack, player, worldIn, pos, Blocks.FARMLAND.getDefaultState());
                            return EnumActionResult.SUCCESS;
                        case COARSE_DIRT:
                            this.setBlock(itemstack, player, worldIn, pos, Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
                            return EnumActionResult.SUCCESS;
                    }
                }
            }

            return EnumActionResult.PASS;
        }
    }


    protected void setBlock(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos, IBlockState state) {
        worldIn.playSound(player, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);

        if (!worldIn.isRemote) {
            worldIn.setBlockState(pos, state, 11);
            stack.damageItem(1, player);
        }
    }

}