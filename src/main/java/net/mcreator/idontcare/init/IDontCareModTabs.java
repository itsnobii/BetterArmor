
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.idontcare.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class IDontCareModTabs {
	public static CreativeModeTab TAB_IDC;

	public static void load() {
		TAB_IDC = FabricItemGroupBuilder.create(new ResourceLocation("i_dont_care", "idc")).icon(() -> new ItemStack(Items.GOLDEN_HOE)).build();
	}
}
