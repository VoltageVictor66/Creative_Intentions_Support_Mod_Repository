
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeintentionssupportmod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CreativeIntentionsSupportModModTabs {
	public static CreativeModeTab TAB_CREATIVE_INTENTIONS_TAB;

	public static void load() {
		TAB_CREATIVE_INTENTIONS_TAB = new CreativeModeTab("tabcreative_intentions_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CreativeIntentionsSupportModModBlocks.DOLOMITE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
