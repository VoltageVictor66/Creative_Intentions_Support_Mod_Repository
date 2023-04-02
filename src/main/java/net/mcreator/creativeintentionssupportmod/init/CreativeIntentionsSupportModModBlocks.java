
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeintentionssupportmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.creativeintentionssupportmod.block.VulcanWoodBlock;
import net.mcreator.creativeintentionssupportmod.block.VulcanWartBlockBlock;
import net.mcreator.creativeintentionssupportmod.block.VulcanStairsBlock;
import net.mcreator.creativeintentionssupportmod.block.VulcanSlabBlock;
import net.mcreator.creativeintentionssupportmod.block.VulcanRootsBlock;
import net.mcreator.creativeintentionssupportmod.block.VulcanPressurePlateBlock;
import net.mcreator.creativeintentionssupportmod.block.VulcanPlanksBlock;
import net.mcreator.creativeintentionssupportmod.block.VulcanNyliumBlock;
import net.mcreator.creativeintentionssupportmod.block.VulcanLogBlock;
import net.mcreator.creativeintentionssupportmod.block.VulcanFungusBlock;
import net.mcreator.creativeintentionssupportmod.block.VulcanFenceGateBlock;
import net.mcreator.creativeintentionssupportmod.block.VulcanFenceBlock;
import net.mcreator.creativeintentionssupportmod.block.VulcanButtonBlock;
import net.mcreator.creativeintentionssupportmod.block.StrippedVulcanStemBlock;
import net.mcreator.creativeintentionssupportmod.block.StrippedVulcanHyphaeBlock;
import net.mcreator.creativeintentionssupportmod.block.ScoriaBlock;
import net.mcreator.creativeintentionssupportmod.block.RawMagnesiumBlockBlock;
import net.mcreator.creativeintentionssupportmod.block.PolishedDolomiteWallBlock;
import net.mcreator.creativeintentionssupportmod.block.PolishedDolomiteStairsBlock;
import net.mcreator.creativeintentionssupportmod.block.PolishedDolomiteSlabBlock;
import net.mcreator.creativeintentionssupportmod.block.PolishedDolomiteBlock;
import net.mcreator.creativeintentionssupportmod.block.OverworldQuartzOreBlock;
import net.mcreator.creativeintentionssupportmod.block.MoltenVinesPlantBlock;
import net.mcreator.creativeintentionssupportmod.block.MoltenVinesBlock;
import net.mcreator.creativeintentionssupportmod.block.MistyWoodsPortalBlock;
import net.mcreator.creativeintentionssupportmod.block.MagnesiumOreBlock;
import net.mcreator.creativeintentionssupportmod.block.MagnesiumBlockBlock;
import net.mcreator.creativeintentionssupportmod.block.MagmaCrackedNetherBricksBlock;
import net.mcreator.creativeintentionssupportmod.block.DolomiteWallBlock;
import net.mcreator.creativeintentionssupportmod.block.DolomiteStairsBlock;
import net.mcreator.creativeintentionssupportmod.block.DolomiteSlabBlock;
import net.mcreator.creativeintentionssupportmod.block.DolomiteBricksBlock;
import net.mcreator.creativeintentionssupportmod.block.DolomiteBrickWallBlock;
import net.mcreator.creativeintentionssupportmod.block.DolomiteBrickStairsBlock;
import net.mcreator.creativeintentionssupportmod.block.DolomiteBrickSlabBlock;
import net.mcreator.creativeintentionssupportmod.block.DolomiteBlock;
import net.mcreator.creativeintentionssupportmod.block.DeepslateOverworldQuartzoreBlock;
import net.mcreator.creativeintentionssupportmod.block.CobbledDolomiteWallBlock;
import net.mcreator.creativeintentionssupportmod.block.CobbledDolomiteStairsBlock;
import net.mcreator.creativeintentionssupportmod.block.CobbledDolomiteSlabBlock;
import net.mcreator.creativeintentionssupportmod.block.CobbledDolomiteBlock;
import net.mcreator.creativeintentionssupportmod.block.ChiseledDolomiteBricksBlock;
import net.mcreator.creativeintentionssupportmod.CreativeIntentionsSupportModMod;

public class CreativeIntentionsSupportModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CreativeIntentionsSupportModMod.MODID);
	public static final RegistryObject<Block> DOLOMITE = REGISTRY.register("dolomite", () -> new DolomiteBlock());
	public static final RegistryObject<Block> DOLOMITE_STAIRS = REGISTRY.register("dolomite_stairs", () -> new DolomiteStairsBlock());
	public static final RegistryObject<Block> DOLOMITE_SLAB = REGISTRY.register("dolomite_slab", () -> new DolomiteSlabBlock());
	public static final RegistryObject<Block> DOLOMITE_WALL = REGISTRY.register("dolomite_wall", () -> new DolomiteWallBlock());
	public static final RegistryObject<Block> POLISHED_DOLOMITE = REGISTRY.register("polished_dolomite", () -> new PolishedDolomiteBlock());
	public static final RegistryObject<Block> POLISHED_DOLOMITE_STAIRS = REGISTRY.register("polished_dolomite_stairs", () -> new PolishedDolomiteStairsBlock());
	public static final RegistryObject<Block> POLISHED_DOLOMITE_SLAB = REGISTRY.register("polished_dolomite_slab", () -> new PolishedDolomiteSlabBlock());
	public static final RegistryObject<Block> POLISHED_DOLOMITE_WALL = REGISTRY.register("polished_dolomite_wall", () -> new PolishedDolomiteWallBlock());
	public static final RegistryObject<Block> DOLOMITE_BRICKS = REGISTRY.register("dolomite_bricks", () -> new DolomiteBricksBlock());
	public static final RegistryObject<Block> DOLOMITE_BRICK_STAIRS = REGISTRY.register("dolomite_brick_stairs", () -> new DolomiteBrickStairsBlock());
	public static final RegistryObject<Block> DOLOMITE_BRICK_SLAB = REGISTRY.register("dolomite_brick_slab", () -> new DolomiteBrickSlabBlock());
	public static final RegistryObject<Block> DOLOMITE_BRICK_WALL = REGISTRY.register("dolomite_brick_wall", () -> new DolomiteBrickWallBlock());
	public static final RegistryObject<Block> CHISELED_DOLOMITE_BRICKS = REGISTRY.register("chiseled_dolomite_bricks", () -> new ChiseledDolomiteBricksBlock());
	public static final RegistryObject<Block> COBBLED_DOLOMITE = REGISTRY.register("cobbled_dolomite", () -> new CobbledDolomiteBlock());
	public static final RegistryObject<Block> COBBLED_DOLOMITE_STAIRS = REGISTRY.register("cobbled_dolomite_stairs", () -> new CobbledDolomiteStairsBlock());
	public static final RegistryObject<Block> COBBLED_DOLOMITE_SLAB = REGISTRY.register("cobbled_dolomite_slab", () -> new CobbledDolomiteSlabBlock());
	public static final RegistryObject<Block> COBBLED_DOLOMITE_WALL = REGISTRY.register("cobbled_dolomite_wall", () -> new CobbledDolomiteWallBlock());
	public static final RegistryObject<Block> OVERWORLD_QUARTZ_ORE = REGISTRY.register("overworld_quartz_ore", () -> new OverworldQuartzOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_OVERWORLD_QUARTZORE = REGISTRY.register("deepslate_overworld_quartzore", () -> new DeepslateOverworldQuartzoreBlock());
	public static final RegistryObject<Block> MAGNESIUM_ORE = REGISTRY.register("magnesium_ore", () -> new MagnesiumOreBlock());
	public static final RegistryObject<Block> RAW_MAGNESIUM_BLOCK = REGISTRY.register("raw_magnesium_block", () -> new RawMagnesiumBlockBlock());
	public static final RegistryObject<Block> MAGNESIUM_BLOCK = REGISTRY.register("magnesium_block", () -> new MagnesiumBlockBlock());
	public static final RegistryObject<Block> VULCAN_HYPHAE = REGISTRY.register("vulcan_hyphae", () -> new VulcanWoodBlock());
	public static final RegistryObject<Block> VULCAN_STEM = REGISTRY.register("vulcan_stem", () -> new VulcanLogBlock());
	public static final RegistryObject<Block> STRIPPED_VULCAN_HYPHAE = REGISTRY.register("stripped_vulcan_hyphae", () -> new StrippedVulcanHyphaeBlock());
	public static final RegistryObject<Block> STRIPPED_VULCAN_STEM = REGISTRY.register("stripped_vulcan_stem", () -> new StrippedVulcanStemBlock());
	public static final RegistryObject<Block> VULCAN_PLANKS = REGISTRY.register("vulcan_planks", () -> new VulcanPlanksBlock());
	public static final RegistryObject<Block> VULCAN_STAIRS = REGISTRY.register("vulcan_stairs", () -> new VulcanStairsBlock());
	public static final RegistryObject<Block> VULCAN_SLAB = REGISTRY.register("vulcan_slab", () -> new VulcanSlabBlock());
	public static final RegistryObject<Block> VULCAN_FENCE = REGISTRY.register("vulcan_fence", () -> new VulcanFenceBlock());
	public static final RegistryObject<Block> VULCAN_FENCE_GATE = REGISTRY.register("vulcan_fence_gate", () -> new VulcanFenceGateBlock());
	public static final RegistryObject<Block> VULCAN_PRESSURE_PLATE = REGISTRY.register("vulcan_pressure_plate", () -> new VulcanPressurePlateBlock());
	public static final RegistryObject<Block> VULCAN_BUTTON = REGISTRY.register("vulcan_button", () -> new VulcanButtonBlock());
	public static final RegistryObject<Block> MISTY_WOODS_PORTAL = REGISTRY.register("misty_woods_portal", () -> new MistyWoodsPortalBlock());
	public static final RegistryObject<Block> VULCAN_NYLIUM = REGISTRY.register("vulcan_nylium", () -> new VulcanNyliumBlock());
	public static final RegistryObject<Block> VULCAN_WART_BLOCK = REGISTRY.register("vulcan_wart_block", () -> new VulcanWartBlockBlock());
	public static final RegistryObject<Block> VULCAN_FUNGUS = REGISTRY.register("vulcan_fungus", () -> new VulcanFungusBlock());
	public static final RegistryObject<Block> VULCAN_ROOTS = REGISTRY.register("vulcan_roots", () -> new VulcanRootsBlock());
	public static final RegistryObject<Block> SCORIA = REGISTRY.register("scoria", () -> new ScoriaBlock());
	public static final RegistryObject<Block> MAGMA_CRACKED_NETHER_BRICKS = REGISTRY.register("magma_cracked_nether_bricks", () -> new MagmaCrackedNetherBricksBlock());
	public static final RegistryObject<Block> MOLTEN_VINES_PLANT = REGISTRY.register("molten_vines_plant", () -> new MoltenVinesPlantBlock());
	public static final RegistryObject<Block> MOLTEN_VINES = REGISTRY.register("molten_vines", () -> new MoltenVinesBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			DolomiteWallBlock.registerRenderLayer();
			PolishedDolomiteWallBlock.registerRenderLayer();
			DolomiteBrickWallBlock.registerRenderLayer();
			CobbledDolomiteWallBlock.registerRenderLayer();
			MistyWoodsPortalBlock.registerRenderLayer();
			VulcanFungusBlock.registerRenderLayer();
			VulcanRootsBlock.registerRenderLayer();
			MoltenVinesPlantBlock.registerRenderLayer();
			MoltenVinesBlock.registerRenderLayer();
		}
	}
}
