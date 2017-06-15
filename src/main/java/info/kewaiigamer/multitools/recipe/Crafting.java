package info.kewaiigamer.multitools.recipe;

import info.kewaiigamer.multitools.config.ConfigHandler;
import info.kewaiigamer.multitools.init.ModItems;
import info.kewaiigamer.multitools.utils.RecipeHelper;
import net.minecraft.item.Item;

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
        if (ConfigHandler.vanilla.getValue()) {
            if (ConfigHandler.vanillaPaxels.getValue()) {
                if (ConfigHandler.woodenPaxel.getValue()) {
                    axe = WOODEN_AXE;
                    pickaxe = WOODEN_PICKAXE;
                    shovel = WOODEN_SHOVEL;
                    RecipeHelper.addShaped(ModItems.woodPaxel, 3, 3, axe, pickaxe, shovel, null, s, null, null, s, null);
                }
                if (ConfigHandler.stonePaxel.getValue()) {
                    axe = STONE_AXE;
                    pickaxe = STONE_AXE;
                    shovel = STONE_AXE;
                    RecipeHelper.addShaped(ModItems.stonePaxel, 3, 3, axe, pickaxe, shovel, null, s, null, null, s, null);
                }
                if (ConfigHandler.ironPaxel.getValue()) {
                    axe = IRON_AXE;
                    pickaxe = IRON_PICKAXE;
                    shovel = IRON_SHOVEL;
                    RecipeHelper.addShaped(ModItems.woodPaxel, 3, 3, axe, pickaxe, shovel, null, s, null, null, s, null);
                }
                if (ConfigHandler.goldenPaxel.getValue()) {
                    axe = GOLDEN_AXE;
                    pickaxe = GOLDEN_PICKAXE;
                    shovel = GOLDEN_SHOVEL;
                    RecipeHelper.addShaped(ModItems.woodPaxel, 3, 3, axe, pickaxe, shovel, null, s, null, null, s, null);
                }
                if (ConfigHandler.diamondPaxel.getValue()) {
                    axe = DIAMOND_AXE;
                    pickaxe = DIAMOND_PICKAXE;
                    shovel = DIAMOND_SHOVEL;
                    RecipeHelper.addShaped(ModItems.woodPaxel, 3, 3, axe, pickaxe, shovel, null, s, null, null, s, null);
                }
            }
            if (ConfigHandler.vanillaUniversalTools.getValue()) {

                if (ConfigHandler.woodenUniversalTool.getValue()) {
                    axe = WOODEN_AXE;
                    pickaxe = WOODEN_PICKAXE;
                    shovel = WOODEN_SHOVEL;
                    hoe = WOODEN_HOE;
                    RecipeHelper.addShaped(ModItems.woodPaxel, 3, 3, axe, pickaxe, shovel, hoe, s, null, null, s, null);
                }
                if (ConfigHandler.stoneUniversalTool.getValue()) {
                    axe = STONE_AXE;
                    pickaxe = STONE_PICKAXE;
                    shovel = STONE_SHOVEL;
                    hoe = STONE_HOE;
                    RecipeHelper.addShaped(ModItems.woodPaxel, 3, 3, axe, pickaxe, shovel, hoe, s, null, null, s, null);
                }
                if (ConfigHandler.ironUniversalTool.getValue()) {
                    axe = IRON_AXE;
                    pickaxe = IRON_PICKAXE;
                    shovel = IRON_SHOVEL;
                    hoe = IRON_HOE;
                    RecipeHelper.addShaped(ModItems.woodPaxel, 3, 3, axe, pickaxe, shovel, hoe, s, null, null, s, null);
                }
                if (ConfigHandler.goldenUniversalTool.getValue()) {
                    axe = GOLDEN_AXE;
                    pickaxe = GOLDEN_PICKAXE;
                    shovel = GOLDEN_SHOVEL;
                    hoe = GOLDEN_HOE;
                    RecipeHelper.addShaped(ModItems.woodPaxel, 3, 3, axe, pickaxe, shovel, hoe, s, null, null, s, null);
                }
                if (ConfigHandler.diamondUniversalTool.getValue()) {
                    axe = DIAMOND_AXE;
                    pickaxe = DIAMOND_PICKAXE;
                    shovel = DIAMOND_SHOVEL;
                    hoe = DIAMOND_HOE;
                    RecipeHelper.addShaped(ModItems.woodPaxel, 3, 3, axe, pickaxe, shovel, hoe, s, null, null, s, null);
                }
            }
        }
    }
}
