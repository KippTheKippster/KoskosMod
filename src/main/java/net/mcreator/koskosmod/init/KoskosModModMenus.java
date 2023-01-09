
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.koskosmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.koskosmod.world.inventory.HampterTradeGUIMenu;
import net.mcreator.koskosmod.KoskosModMod;

public class KoskosModModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, KoskosModMod.MODID);
	public static final RegistryObject<MenuType<HampterTradeGUIMenu>> HAMPTER_TRADE_GUI = REGISTRY.register("hampter_trade_gui",
			() -> IForgeMenuType.create(HampterTradeGUIMenu::new));
}
