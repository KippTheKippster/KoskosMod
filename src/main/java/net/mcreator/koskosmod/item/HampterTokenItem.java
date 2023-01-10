
package net.mcreator.koskosmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.koskosmod.init.KoskosModModTabs;

public class HampterTokenItem extends Item {
	public HampterTokenItem() {
		super(new Item.Properties().tab(KoskosModModTabs.TAB_KOSKOS_MOD_TAB).stacksTo(16).rarity(Rarity.COMMON));
	}
}
