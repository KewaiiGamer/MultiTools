package kewaiigamer.multitools.init;

import exter.substratum.material.EnumMaterialEquipment;
import kewaiigamer.multitools.item.EnumVanillaMaterial;
import kewaiigamer.multitools.utils.RegistryUtils;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.Loader;

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
    	registerItems();
    }
    
   
    public static void registerItems() {
    	 if (Loader.isModLoaded("substratum")) 
    	 {
    		 aluminiumpaxel = RegistryUtils.createMetalPaxel(EnumMaterialEquipment.ALUMINIUM);
    	     bronzepaxel = RegistryUtils.createMetalPaxel(EnumMaterialEquipment.BRONZE);
    	  	 copperpaxel = RegistryUtils.createMetalPaxel(EnumMaterialEquipment.COPPER);
    	   	 electrumpaxel = RegistryUtils.createMetalPaxel(EnumMaterialEquipment.ELECTRUM);
    	   	 enderiumpaxel = RegistryUtils.createMetalPaxel(EnumMaterialEquipment.ENDERIUM);
    	   	 invarpaxel = RegistryUtils.createMetalPaxel(EnumMaterialEquipment.INVAR);
    	   	 lumiumpaxel = RegistryUtils.createMetalPaxel(EnumMaterialEquipment.LUMIUM);
    	   	 signalumpaxel = RegistryUtils.createMetalPaxel(EnumMaterialEquipment.SIGNALUM);
    	   	 silverpaxel = RegistryUtils.createMetalPaxel(EnumMaterialEquipment.SILVER);
    	   	 steelpaxel = RegistryUtils.createMetalPaxel(EnumMaterialEquipment.STEEL);
    	   	 aluminiumuniversaltool = RegistryUtils.createMetalUniversalTool(EnumMaterialEquipment.ALUMINIUM);
    	   	 bronzeuniversaltool = RegistryUtils.createMetalUniversalTool(EnumMaterialEquipment.BRONZE);
    	   	 copperuniversaltool = RegistryUtils.createMetalUniversalTool(EnumMaterialEquipment.COPPER);
    	   	 electrumuniversaltool = RegistryUtils.createMetalUniversalTool(EnumMaterialEquipment.ELECTRUM);
    	   	 enderiumuniversaltool = RegistryUtils.createMetalUniversalTool(EnumMaterialEquipment.ENDERIUM);
    	   	 invaruniversaltool = RegistryUtils.createMetalUniversalTool(EnumMaterialEquipment.INVAR);
    	   	 lumiumuniversaltool = RegistryUtils.createMetalUniversalTool(EnumMaterialEquipment.LUMIUM);
    	   	 signalumuniversaltool = RegistryUtils.createMetalUniversalTool(EnumMaterialEquipment.SIGNALUM);
    	   	 silveruniversaltool = RegistryUtils.createMetalUniversalTool(EnumMaterialEquipment.SILVER);
    	   	 steeluniversaltool = RegistryUtils.createMetalUniversalTool(EnumMaterialEquipment.STEEL); 
    	 }
    	woodpaxel = RegistryUtils.createPaxel(ToolMaterial.WOOD, EnumVanillaMaterial.WOOD);
    	stonepaxel = RegistryUtils.createPaxel(ToolMaterial.STONE, EnumVanillaMaterial.STONE);
    	ironpaxel = RegistryUtils.createPaxel(ToolMaterial.IRON, EnumVanillaMaterial.IRON);
    	goldpaxel = RegistryUtils.createPaxel(ToolMaterial.GOLD, EnumVanillaMaterial.GOLD);
    	diamondpaxel = RegistryUtils.createPaxel(ToolMaterial.DIAMOND, EnumVanillaMaterial.DIAMOND);
    	wooduniversaltool = RegistryUtils.createUniversalTool(ToolMaterial.WOOD, EnumVanillaMaterial.WOOD); 
    	stoneuniversaltool = RegistryUtils.createUniversalTool(ToolMaterial.STONE, EnumVanillaMaterial.STONE);
    	ironuniversaltool = RegistryUtils.createUniversalTool(ToolMaterial.IRON, EnumVanillaMaterial.IRON);
    	golduniversaltool = RegistryUtils.createUniversalTool(ToolMaterial.GOLD, EnumVanillaMaterial.GOLD);
    	diamonduniversaltool = RegistryUtils.createUniversalTool(ToolMaterial.DIAMOND, EnumVanillaMaterial.DIAMOND);
    
	}
}