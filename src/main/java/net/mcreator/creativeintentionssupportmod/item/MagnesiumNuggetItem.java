
package net.mcreator.creativeintentionssupportmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.creativeintentionssupportmod.init.CreativeIntentionsSupportModModTabs;

public class MagnesiumNuggetItem extends Item {
	public MagnesiumNuggetItem() {
		super(new Item.Properties().tab(CreativeIntentionsSupportModModTabs.TAB_CREATIVE_INTENTIONS_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
