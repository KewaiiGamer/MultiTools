package info.kewaiigamer.multitools.init;

import exter.substratum.material.EnumMaterialEquipment;
import info.kewaiigamer.kewaiilib.multitools.EnumVanillaMaterial;
import info.kewaiigamer.multitools.utils.Utils;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Loader;

import static info.kewaiigamer.multitools.Ref.Substratum_MODID;

public class ModItems {
    public static Item woodpaxel;
    public static Item stonepaxel;
    public static Item ironpaxel;
    public static Item goldpaxel;
    public static Item diamondpaxel;
    public static Item aluminiumpaxel;
    public static Item bronzepaxel;
    public static Item copperpaxel;
    public static Item electrumpaxel;
    public static Item enderiumpaxel;
    public static Item invarpaxel;
    public static Item lumiumpaxel;
    public static Item signalumpaxel;
    public static Item silverpaxel;
    public static Item steelpaxel;
    public static Item wooduniversaltool;
    public static Item stoneuniversaltool;
    public static Item golduniversaltool;
    public static Item ironuniversaltool;
    public static Item diamonduniversaltool;
    public static Item aluminiumuniversaltool;
    public static Item bronzeuniversaltool;
    public static Item copperuniversaltool;
    public static Item electrumuniversaltool;
    public static Item enderiumuniversaltool;
    public static Item invaruniversaltool;
    public static Item lumiumuniversaltool;
    public static Item signalumuniversaltool;
    public static Item silveruniversaltool;
    public static Item steeluniversaltool;

    public ModItems() {
        ModItems.registerItems();
    }

    public static void registerItems() {
        /** Paxels */
        woodpaxel = Utils.createMultiToolsPaxel(Item.ToolMaterial.WOOD, EnumVanillaMaterial.WOOD);
        stonepaxel = Utils.createMultiToolsPaxel(Item.ToolMaterial.STONE, EnumVanillaMaterial.STONE);
        ironpaxel = Utils.createMultiToolsPaxel(Item.ToolMaterial.IRON, EnumVanillaMaterial.IRON);
        goldpaxel = Utils.createMultiToolsPaxel(Item.ToolMaterial.GOLD, EnumVanillaMaterial.GOLD);
        diamondpaxel = Utils.createMultiToolsPaxel(Item.ToolMaterial.DIAMOND, EnumVanillaMaterial.DIAMOND);
        /** Universal Tools */
        wooduniversaltool = Utils.createMultiToolsUniversalTool(Item.ToolMaterial.WOOD, EnumVanillaMaterial.WOOD);
        stoneuniversaltool = Utils.createMultiToolsUniversalTool(Item.ToolMaterial.STONE, EnumVanillaMaterial.STONE);
        ironuniversaltool = Utils.createMultiToolsUniversalTool(Item.ToolMaterial.IRON, EnumVanillaMaterial.IRON);
        golduniversaltool = Utils.createMultiToolsUniversalTool(Item.ToolMaterial.GOLD, EnumVanillaMaterial.GOLD);
        diamonduniversaltool = Utils.createMultiToolsUniversalTool(Item.ToolMaterial.DIAMOND, EnumVanillaMaterial.DIAMOND);
        if (Loader.isModLoaded(Substratum_MODID)) {
            /** Metal Paxels */
            aluminiumpaxel = Utils.createMultiToolsMetalPaxel(EnumMaterialEquipment.ALUMINIUM);
            bronzepaxel = Utils.createMultiToolsMetalPaxel(EnumMaterialEquipment.BRONZE);
            copperpaxel = Utils.createMultiToolsMetalPaxel(EnumMaterialEquipment.COPPER);
            electrumpaxel = Utils.createMultiToolsMetalPaxel(EnumMaterialEquipment.ELECTRUM);
            enderiumpaxel = Utils.createMultiToolsMetalPaxel(EnumMaterialEquipment.ENDERIUM);
            invarpaxel = Utils.createMultiToolsMetalPaxel(EnumMaterialEquipment.INVAR);
            lumiumpaxel = Utils.createMultiToolsMetalPaxel(EnumMaterialEquipment.LUMIUM);
            signalumpaxel = Utils.createMultiToolsMetalPaxel(EnumMaterialEquipment.SIGNALUM);
            silverpaxel = Utils.createMultiToolsMetalPaxel(EnumMaterialEquipment.SILVER);
            steelpaxel = Utils.createMultiToolsMetalPaxel(EnumMaterialEquipment.STEEL);
            /** Metal Universal Tools*/
            aluminiumuniversaltool = Utils.createMultiToolsMetalUniversalTool(EnumMaterialEquipment.ALUMINIUM);
            bronzeuniversaltool = Utils.createMultiToolsMetalUniversalTool(EnumMaterialEquipment.BRONZE);
            copperuniversaltool = Utils.createMultiToolsMetalUniversalTool(EnumMaterialEquipment.COPPER);
            electrumuniversaltool = Utils.createMultiToolsMetalUniversalTool(EnumMaterialEquipment.ELECTRUM);
            enderiumuniversaltool = Utils.createMultiToolsMetalUniversalTool(EnumMaterialEquipment.ENDERIUM);
            invaruniversaltool = Utils.createMultiToolsMetalUniversalTool(EnumMaterialEquipment.INVAR);
            lumiumuniversaltool = Utils.createMultiToolsMetalUniversalTool(EnumMaterialEquipment.LUMIUM);
            signalumuniversaltool = Utils.createMultiToolsMetalUniversalTool(EnumMaterialEquipment.SIGNALUM);
            silveruniversaltool = Utils.createMultiToolsMetalUniversalTool(EnumMaterialEquipment.SILVER);
            steeluniversaltool = Utils.createMultiToolsMetalUniversalTool(EnumMaterialEquipment.STEEL);
        }
    }
}