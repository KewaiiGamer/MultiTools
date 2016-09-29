package kewaiigamer.multitools.recipe;

import exter.substratum.item.SubstratumItems;
import exter.substratum.material.EnumMaterial;
import kewaiigamer.multitools.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Crafting {

	public Crafting() {
		registerCraftings();
	}
	
	public void registerCraftings() 
	{
		if (Loader.isModLoaded("substratum")) 
   	 {

			GameRegistry.addShapedRecipe(new ItemStack(ModItems.aluminiumpaxel, 1), new Object[] {
					"xyz",
					" s ",
					" s ",
					'x', new ItemStack(SubstratumItems.axes.get(EnumMaterial.ALUMINIUM)),
					'y', new ItemStack(SubstratumItems.pickaxes.get(EnumMaterial.ALUMINIUM)),
					'z', new ItemStack(SubstratumItems.shovels.get(EnumMaterial.ALUMINIUM)),
			});
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.bronzepaxel, 1), new Object[] {
					"xyz",
					" s ",
					" s ",
					'x', new ItemStack(SubstratumItems.axes.get(EnumMaterial.BRONZE)),
					'y', new ItemStack(SubstratumItems.pickaxes.get(EnumMaterial.BRONZE)),
					'z', new ItemStack(SubstratumItems.shovels.get(EnumMaterial.BRONZE)),
					's', new ItemStack(Items.STICK)
			});
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperpaxel, 1), new Object[] {
					"xyz",
					" s ",
					" s ",
					'x', new ItemStack(SubstratumItems.axes.get(EnumMaterial.COPPER)),
					'y', new ItemStack(SubstratumItems.pickaxes.get(EnumMaterial.COPPER)),
					'z', new ItemStack(SubstratumItems.shovels.get(EnumMaterial.COPPER)),
					's', new ItemStack(Items.STICK)
			});
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.electrumpaxel, 1), new Object[] {
					"xyz",
					" s ",
					" s ",
					'x', new ItemStack(SubstratumItems.axes.get(EnumMaterial.ELECTRUM)),
					'y', new ItemStack(SubstratumItems.pickaxes.get(EnumMaterial.ELECTRUM)),
					'z', new ItemStack(SubstratumItems.shovels.get(EnumMaterial.ELECTRUM)),
					's', new ItemStack(Items.STICK)
			});
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.enderiumpaxel, 1), new Object[] {
					"xyz",
					" s ",
					" s ",
					'x', new ItemStack(SubstratumItems.axes.get(EnumMaterial.ENDERIUM)),
					'y', new ItemStack(SubstratumItems.pickaxes.get(EnumMaterial.ENDERIUM)),
					'z', new ItemStack(SubstratumItems.shovels.get(EnumMaterial.ENDERIUM)),
					's', new ItemStack(Items.STICK)
			});
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.invarpaxel, 1), new Object[] {
					"xyz",
					" s ",
					" s ",
					'x', new ItemStack(SubstratumItems.axes.get(EnumMaterial.INVAR)),
					'y', new ItemStack(SubstratumItems.pickaxes.get(EnumMaterial.INVAR)),
					'z', new ItemStack(SubstratumItems.shovels.get(EnumMaterial.INVAR)),
					's', new ItemStack(Items.STICK)
			});
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.lumiumpaxel, 1), new Object[] {
					"xyz",
					" s ",
					" s ",
					'x', new ItemStack(SubstratumItems.axes.get(EnumMaterial.LUMIUM)),
					'y', new ItemStack(SubstratumItems.pickaxes.get(EnumMaterial.LUMIUM)),
					'z', new ItemStack(SubstratumItems.shovels.get(EnumMaterial.LUMIUM)),
					's', new ItemStack(Items.STICK)
			});
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.signalumpaxel, 1), new Object[] {
					"xyz",
					" s ",
					" s ",
					'x', new ItemStack(SubstratumItems.axes.get(EnumMaterial.SIGNALUM)),
					'y', new ItemStack(SubstratumItems.pickaxes.get(EnumMaterial.SIGNALUM)),
					'z', new ItemStack(SubstratumItems.shovels.get(EnumMaterial.SIGNALUM)),
					's', new ItemStack(Items.STICK)
			});
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.silverpaxel, 1), new Object[] {
					"xyz",
					" s ",
					" s ",
					'x', new ItemStack(SubstratumItems.axes.get(EnumMaterial.SILVER)),
					'y', new ItemStack(SubstratumItems.pickaxes.get(EnumMaterial.SILVER)),
					'z', new ItemStack(SubstratumItems.shovels.get(EnumMaterial.SILVER)),
					's', new ItemStack(Items.STICK)
			});
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.steelpaxel, 1), new Object[] {
					"xyz",
					" s ",
					" s ",
					'x', new ItemStack(SubstratumItems.axes.get(EnumMaterial.STEEL)),
					'y', new ItemStack(SubstratumItems.pickaxes.get(EnumMaterial.STEEL)),
					'z', new ItemStack(SubstratumItems.shovels.get(EnumMaterial.STEEL)),
					's', new ItemStack(Items.STICK)
			});
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.aluminiumuniversaltool, 1), new Object[] {
					"xyz",
					"hs ",
					" s ",
					'x', new ItemStack(SubstratumItems.axes.get(EnumMaterial.ALUMINIUM)),
					'y', new ItemStack(SubstratumItems.pickaxes.get(EnumMaterial.ALUMINIUM)),
					'z', new ItemStack(SubstratumItems.shovels.get(EnumMaterial.ALUMINIUM)),
					'h', new ItemStack(SubstratumItems.hoes.get(EnumMaterial.ALUMINIUM)),
					's', new ItemStack(Items.STICK)
			});
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.bronzeuniversaltool, 1), new Object[] {
					"xyz",
					"hs ",
					" s ",
					'x', new ItemStack(SubstratumItems.axes.get(EnumMaterial.BRONZE)),
					'y', new ItemStack(SubstratumItems.pickaxes.get(EnumMaterial.BRONZE)),
					'z', new ItemStack(SubstratumItems.shovels.get(EnumMaterial.BRONZE)),
					'h', new ItemStack(SubstratumItems.hoes.get(EnumMaterial.BRONZE)),
					's', new ItemStack(Items.STICK)
			});
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperuniversaltool, 1), new Object[] {
					"xyz",
					"hs ",
					" s ",
					'x', new ItemStack(SubstratumItems.axes.get(EnumMaterial.COPPER)),
					'y', new ItemStack(SubstratumItems.pickaxes.get(EnumMaterial.COPPER)),
					'z', new ItemStack(SubstratumItems.shovels.get(EnumMaterial.COPPER)),
					'h', new ItemStack(SubstratumItems.hoes.get(EnumMaterial.COPPER)),
					's', new ItemStack(Items.STICK)
			});
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.electrumuniversaltool, 1), new Object[] {
					"xyz",
					"hs ",
					" s ",
					'x', new ItemStack(SubstratumItems.axes.get(EnumMaterial.ELECTRUM)),
					'y', new ItemStack(SubstratumItems.pickaxes.get(EnumMaterial.ELECTRUM)),
					'z', new ItemStack(SubstratumItems.shovels.get(EnumMaterial.ELECTRUM)),
					'h', new ItemStack(SubstratumItems.hoes.get(EnumMaterial.ELECTRUM)),
					's', new ItemStack(Items.STICK)
			});
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.enderiumuniversaltool, 1), new Object[] {
					"xyz",
					"hs ",
					" s ",
					'x', new ItemStack(SubstratumItems.axes.get(EnumMaterial.ENDERIUM)),
					'y', new ItemStack(SubstratumItems.pickaxes.get(EnumMaterial.ENDERIUM)),
					'z', new ItemStack(SubstratumItems.shovels.get(EnumMaterial.ENDERIUM)),
					'h', new ItemStack(SubstratumItems.hoes.get(EnumMaterial.ENDERIUM)),
					's', new ItemStack(Items.STICK)
			});
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.invaruniversaltool, 1), new Object[] {
					"xyz",
					"hs ",
					" s ",
					'x', new ItemStack(SubstratumItems.axes.get(EnumMaterial.INVAR)),
					'y', new ItemStack(SubstratumItems.pickaxes.get(EnumMaterial.INVAR)),
					'z', new ItemStack(SubstratumItems.shovels.get(EnumMaterial.INVAR)),
					'h', new ItemStack(SubstratumItems.hoes.get(EnumMaterial.INVAR)),
					's', new ItemStack(Items.STICK)
			});
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.lumiumuniversaltool, 1), new Object[] {
					"xyz",
					"hs ",
					" s ",
					'x', new ItemStack(SubstratumItems.axes.get(EnumMaterial.LUMIUM)),
					'y', new ItemStack(SubstratumItems.pickaxes.get(EnumMaterial.LUMIUM)),
					'z', new ItemStack(SubstratumItems.shovels.get(EnumMaterial.LUMIUM)),
					'h', new ItemStack(SubstratumItems.hoes.get(EnumMaterial.LUMIUM)),
					's', new ItemStack(Items.STICK)
			});
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.signalumuniversaltool, 1), new Object[] {
					"xyz",
					"hs ",
					" s ",
					'x', new ItemStack(SubstratumItems.axes.get(EnumMaterial.SIGNALUM)),
					'y', new ItemStack(SubstratumItems.pickaxes.get(EnumMaterial.SIGNALUM)),
					'z', new ItemStack(SubstratumItems.shovels.get(EnumMaterial.SIGNALUM)),
					'h', new ItemStack(SubstratumItems.hoes.get(EnumMaterial.SIGNALUM)),
					's', new ItemStack(Items.STICK)
			});
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.silveruniversaltool, 1), new Object[] {
					"xyz",
					"hs ",
					" s ",
					'x', new ItemStack(SubstratumItems.axes.get(EnumMaterial.SILVER)),
					'y', new ItemStack(SubstratumItems.pickaxes.get(EnumMaterial.SILVER)),
					'z', new ItemStack(SubstratumItems.shovels.get(EnumMaterial.SILVER)),
					'h', new ItemStack(SubstratumItems.hoes.get(EnumMaterial.SILVER)),
					's', new ItemStack(Items.STICK)
			});
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.steeluniversaltool, 1), new Object[] {
					"xyz",
					"hs ",
					" s ",
					'x', new ItemStack(SubstratumItems.axes.get(EnumMaterial.STEEL)),
					'y', new ItemStack(SubstratumItems.pickaxes.get(EnumMaterial.STEEL)),
					'z', new ItemStack(SubstratumItems.shovels.get(EnumMaterial.STEEL)),
					'h', new ItemStack(SubstratumItems.hoes.get(EnumMaterial.STEEL)),
					's', new ItemStack(Items.STICK)
			});
   	 }
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.woodpaxel, 1), new Object[] {
				"xyz",
				" s ",
				" s ",
				'x', new ItemStack(Items.WOODEN_AXE),
				'y', new ItemStack(Items.WOODEN_PICKAXE),
				'z', new ItemStack(Items.WOODEN_SHOVEL),
				's', new ItemStack(Items.STICK),
		});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.stonepaxel, 1), new Object[] {
				"xyz",
				" s ",
				" s ",
				'x', new ItemStack(Items.STONE_AXE),
				'y', new ItemStack(Items.STONE_PICKAXE),
				'z', new ItemStack(Items.STONE_SHOVEL),
				's', new ItemStack(Items.STICK),
		});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ironpaxel, 1), new Object[] {
				"xyz",
				" s ",
				" s ",
				'x', new ItemStack(Items.IRON_AXE),
				'y', new ItemStack(Items.IRON_PICKAXE),
				'z', new ItemStack(Items.IRON_SHOVEL),
				's', new ItemStack(Items.STICK),
		});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.goldpaxel, 1), new Object[] {
				"xyz",
				" s ",
				" s ",
				'x', new ItemStack(Items.GOLDEN_AXE),
				'y', new ItemStack(Items.GOLDEN_PICKAXE),
				'z', new ItemStack(Items.GOLDEN_SHOVEL),
				's', new ItemStack(Items.STICK),
		});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.diamondpaxel, 1), new Object[] {
				"xyz",
				" s ",
				" s ",
				'x', new ItemStack(Items.DIAMOND_AXE),
				'y', new ItemStack(Items.DIAMOND_PICKAXE),
				'z', new ItemStack(Items.DIAMOND_SHOVEL),
				's', new ItemStack(Items.STICK),
		});
	GameRegistry.addShapedRecipe(new ItemStack(ModItems.wooduniversaltool, 1), new Object[] {
			"xyz",
			"hs ",
			" s ",
			'x', new ItemStack(Items.WOODEN_AXE),
			'y', new ItemStack(Items.WOODEN_PICKAXE),
			'z', new ItemStack(Items.WOODEN_SHOVEL),
			'h', new ItemStack(Items.WOODEN_HOE),
			's', new ItemStack(Items.STICK),
	});
	GameRegistry.addShapedRecipe(new ItemStack(ModItems.stoneuniversaltool, 1), new Object[] {
			"xyz",
			"hs ",
			" s ",
			'x', new ItemStack(Items.STONE_AXE),
			'y', new ItemStack(Items.STONE_PICKAXE),
			'z', new ItemStack(Items.STONE_SHOVEL),
			'h', new ItemStack(Items.STONE_HOE),
			's', new ItemStack(Items.STICK),
	});

	GameRegistry.addShapedRecipe(new ItemStack(ModItems.ironuniversaltool, 1), new Object[] {
			"xyz",
			"hs ",
			" s ",
			'x', new ItemStack(Items.IRON_AXE),
			'y', new ItemStack(Items.IRON_PICKAXE),
			'z', new ItemStack(Items.IRON_SHOVEL),
			'h', new ItemStack(Items.IRON_HOE),
			's', new ItemStack(Items.STICK),
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(ModItems.golduniversaltool, 1), new Object[] {
			"xyz",
			"hs ",
			" s ",
			'x', new ItemStack(Items.GOLDEN_AXE),
			'y', new ItemStack(Items.GOLDEN_PICKAXE),
			'z', new ItemStack(Items.GOLDEN_SHOVEL),
			'h', new ItemStack(Items.GOLDEN_HOE),
			's', new ItemStack(Items.STICK),
	});

	GameRegistry.addShapedRecipe(new ItemStack(ModItems.diamonduniversaltool, 1), new Object[] {
			"xyz",
			"hs ",
			" s ",
			'x', new ItemStack(Items.DIAMOND_AXE),
			'y', new ItemStack(Items.DIAMOND_PICKAXE),
			'z', new ItemStack(Items.DIAMOND_SHOVEL),
			'h', new ItemStack(Items.DIAMOND_HOE),
			's', new ItemStack(Items.STICK),
	});
	
	
}}
		