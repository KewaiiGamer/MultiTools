package kewaiigamer.multitools.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import exter.substratum.material.EnumMaterialEquipment;
import kewaiigamer.multitools.CreativeTab;
import kewaiigamer.multitools.item.EnumVanillaMaterial;
import kewaiigamer.multitools.item.MetalPaxel;
import kewaiigamer.multitools.item.MetalUniversalTool;
import kewaiigamer.multitools.item.Paxel;
import kewaiigamer.multitools.item.UniversalTool;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegistryUtils {
	private static Map<Item,String> itemRegistry = new HashMap<>();
	private static Map<ToolMaterial,List<Item>> itemsByMaterial = new HashMap<>();
	private static Map<EnumMaterialEquipment,List<Item>> itemsByEquipment = new HashMap<>();
	public static Item createPaxel(ToolMaterial material, EnumVanillaMaterial vanilla){
		return registerItem(new Paxel(material, vanilla), material.name().toLowerCase()+"paxel", material, CreativeTab.tabMultiTools);
	}
	public static Item createMetalPaxel(EnumMaterialEquipment equipment) {
		return registerMetalItem(new MetalPaxel(equipment), equipment.name().toLowerCase()+"paxel", equipment, CreativeTab.tabMultiTools);
	}
	
	public static Item createUniversalTool(ToolMaterial material, EnumVanillaMaterial vanilla) {
		return registerItem(new UniversalTool(material, vanilla), material.name().toLowerCase()+"universaltool", material, CreativeTab.tabMultiTools);
	}
	
	public static Item createMetalUniversalTool(EnumMaterialEquipment equipment) {
		return registerMetalItem(new MetalUniversalTool(equipment), equipment.name().toLowerCase()+"universaltool", equipment, CreativeTab.tabMultiTools);
	}
	public static Item registerItem(Item item, String name, ToolMaterial material, CreativeTabs tab){
		GameRegistry.register(item); 
		itemRegistry.put(item, name);
		if(tab != null){
			item.setCreativeTab(tab);
		}
		if(material != null){
		itemsByMaterial.computeIfAbsent(material, (ToolMaterial g)->new ArrayList<>());
		itemsByMaterial.get(material).add(item);
		}
		return item;
		}
	
	public static Item registerMetalItem(Item item, String name, EnumMaterialEquipment equipment, CreativeTabs tab) {
		GameRegistry.register(item); 
		itemRegistry.put(item, name);
		if(tab != null){
			item.setCreativeTab(tab);
		}
		if(equipment != null){
		itemsByEquipment.computeIfAbsent(equipment, (EnumMaterialEquipment g)->new ArrayList<>());
		itemsByEquipment.get(equipment).add(item);
		}
		return item;
		}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
