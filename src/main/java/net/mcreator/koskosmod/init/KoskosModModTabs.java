
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.koskosmod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class KoskosModModTabs {
	public static CreativeModeTab TAB_KOSKOS_MOD_TAB;

	public static void load() {
		TAB_KOSKOS_MOD_TAB = new CreativeModeTab("tabkoskos_mod_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(KoskosModModItems.HAMPTER_FRAGMENT.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
