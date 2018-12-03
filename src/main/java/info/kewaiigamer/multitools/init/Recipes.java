package info.kewaiigamer.multitools.init;

import com.mcmoddev.lib.data.Names;
import com.mcmoddev.lib.init.Materials;
import com.mcmoddev.lib.material.MMDMaterial;
import info.kewaiigamer.multitools.Ref;
import info.kewaiigamer.multitools.utils.RebornCraftingHelper;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Recipes {

    public static void initMetalRecies() {
        if (Loader.isModLoaded(Ref.BASEMETALS_MODID)) initMetalsRecipes();
    }

    @Optional.Method(modid = Ref.BASEMETALS_MODID)
    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        initMetalsRecipes();
    }

    @Optional.Method(modid = Ref.BASEMETALS_MODID)
    public static void initMetalsRecipes() {
        for (MMDMaterial material : Materials.getAllMaterials()) {

            if (material.isEmpty()) {
                continue;
            }

            makePaxelRecipe(material);
            makeUniversalToolRecipe(material);
        }
    }

    private static void makePaxelRecipe(MMDMaterial material) {
        if (ModItems.baseMetalsPaxels.get(material) != null) {
            RebornCraftingHelper.addShapedRecipe(new ItemStack(ModItems.baseMetalsPaxels.get(material), 1), "xyz", " s ", " s ",
                    'x', material.getItemStack(Names.AXE),
                    'y', material.getItemStack(Names.PICKAXE),
                    'z', material.getItemStack(Names.SHOVEL),
                    's', Items.STICK);
        } else if (Loader.isModLoaded(Ref.MODERNMETALS_MODID) && ModItems.modernMetalsPaxels.get(material) != null) {
            RebornCraftingHelper.addShapedRecipe(new ItemStack(ModItems.modernMetalsPaxels.get(material), 1), "xyz", " s ", " s ",
                    'x', material.getItemStack(Names.AXE),
                    'y', material.getItemStack(Names.PICKAXE),
                    'z', material.getItemStack(Names.SHOVEL),
                    's', Items.STICK);
        }
    }

    private static void makeUniversalToolRecipe(MMDMaterial material) {
        if (ModItems.baseMetalsUniversalTools.get(material) != null) {
            RebornCraftingHelper.addShapedRecipe(new ItemStack(ModItems.baseMetalsUniversalTools.get(material), 1), "xyz", "hs ", " s ",
                    'x', material.getItemStack(Names.AXE),
                    'y', material.getItemStack(Names.PICKAXE),
                    'z', material.getItemStack(Names.SHOVEL),
                    'h', material.getItemStack(Names.HOE),
                    's', Items.STICK);
        } else if (Loader.isModLoaded(Ref.MODERNMETALS_MODID) && ModItems.modernMetalsUniversalTools.get(material) != null) {
            RebornCraftingHelper.addShapedRecipe(new ItemStack(ModItems.modernMetalsUniversalTools.get(material), 1), "xyz", "hs ", " s ",
                    'x', material.getItemStack(Names.AXE),
                    'y', material.getItemStack(Names.PICKAXE),
                    'z', material.getItemStack(Names.SHOVEL),
                    'h', material.getItemStack(Names.HOE),
                    's', Items.STICK);
        }
    }
}
