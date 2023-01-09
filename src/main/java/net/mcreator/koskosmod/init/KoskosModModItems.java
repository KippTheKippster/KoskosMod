
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.koskosmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.koskosmod.KoskosModMod;

public class KoskosModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KoskosModMod.MODID);
	public static final RegistryObject<Item> HAMPTER = REGISTRY.register("hampter_spawn_egg",
			() -> new ForgeSpawnEggItem(KoskosModModEntities.HAMPTER, -6710887, -10066330, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
