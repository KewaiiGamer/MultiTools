package info.kewaiigamer.multitools.recipe;

import info.kewaiigamer.multitools.config.ConfigHandler;
import info.kewaiigamer.multitools.init.ModItems;
import info.kewaiigamer.multitools.utils.RecipeHelper;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static net.minecraft.init.Items.*;

public class Crafting {
    public Crafting() {
        registerCraftings();
    }

    public void registerCraftings() {
        Item axe;
        Item pickaxe;
        Item shovel;
        Item hoe;
        Item s = STICK;
        if (ConfigHandler.woodenPaxel) {
            axe = WOODEN_AXE;
            pickaxe = WOODEN_PICKAXE;
            shovel = WOODEN_SHOVEL;
            RecipeHelper.addShaped(ModItems.woodPaxel, 3, 3, axe, pickaxe, shovel, null, s, null, null, s, null);
        }
        if (ConfigHandler.stonePaxel) {
            axe = STONE_AXE;
            pickaxe = STONE_AXE;
            shovel = STONE_AXE;
            RecipeHelper.addShaped(ModItems.stonePaxel, 3, 3, axe, pickaxe, shovel, null, s, null, null, s, null);
        }
        if (ConfigHandler.ironPaxel) {
            axe = IRON_AXE;
            pickaxe = IRON_PICKAXE;
            shovel = IRON_SHOVEL;
            RecipeHelper.addShaped(ModItems.woodPaxel, 3, 3, axe, pickaxe, shovel, null, s, null, null, s, null);
        }
        if (ConfigHandler.goldenPaxel) {
            axe = GOLDEN_AXE;
            pickaxe = GOLDEN_PICKAXE;
            shovel = GOLDEN_SHOVEL;
            RecipeHelper.addShaped(ModItems.woodPaxel, 3, 3, axe, pickaxe, shovel, null, s, null, null, s, null);
        }
        if (ConfigHandler.diamondPaxel) {
            axe = DIAMOND_AXE;
            pickaxe = DIAMOND_PICKAXE;
            shovel = DIAMOND_SHOVEL;
            RecipeHelper.addShaped(ModItems.woodPaxel, 3, 3, axe, pickaxe, shovel, null, s, null, null, s, null);
        }
        if (ConfigHandler.woodenUniversalTool) {
            
            axe = WOODEN_AXE;
            pickaxe = WOODEN_PICKAXE;
            shovel = WOODEN_SHOVEL;
            hoe = WOODEN_HOE;
            RecipeHelper.addShaped(ModItems.woodPaxel, 3, 3, axe, pickaxe, shovel, hoe, s, null, null, s, null);
    }
        if (ConfigHandler.stoneUniversalTool) {
            axe = STONE_AXE;
            pickaxe = STONE_PICKAXE;
            shovel = STONE_SHOVEL;
            hoe = STONE_HOE;
            RecipeHelper.addShaped(ModItems.woodPaxel, 3, 3, axe, pickaxe, shovel, hoe, s, null, null, s, null);
        }
        if (ConfigHandler.ironUniversalTool) {
            axe = IRON_AXE;
            pickaxe = IRON_PICKAXE;
            shovel = IRON_SHOVEL;
            hoe = IRON_HOE;
            RecipeHelper.addShaped(ModItems.woodPaxel, 3, 3, axe, pickaxe, shovel, hoe, s, null, null, s, null);
        }
        if (ConfigHandler.goldenUniversalTool) {
            axe = GOLDEN_AXE;
            pickaxe = GOLDEN_PICKAXE;
            shovel = GOLDEN_SHOVEL;
            hoe = GOLDEN_HOE;
            RecipeHelper.addShaped(ModItems.woodPaxel, 3, 3, axe, pickaxe, shovel, hoe, s, null, null, s, null);
        }
        if (ConfigHandler.diamondUniversalTool) {
            axe = DIAMOND_AXE;
            pickaxe = DIAMOND_PICKAXE;
            shovel = DIAMOND_SHOVEL;
            hoe = DIAMOND_HOE;
            RecipeHelper.addShaped(ModItems.woodPaxel, 3, 3, axe, pickaxe, shovel, hoe, s, null, null, s, null);
        }
    }
}
