
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.idontcare.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.idontcare.item.PurenetheriteingotItem;
import net.mcreator.idontcare.item.PureironingotItem;
import net.mcreator.idontcare.item.PuregoldingotItem;
import net.mcreator.idontcare.item.PurediamondItem;
import net.mcreator.idontcare.item.PurecopperingotItem;
import net.mcreator.idontcare.item.NetheritediamondswordItem;
import net.mcreator.idontcare.item.NetheritediamondshovelItem;
import net.mcreator.idontcare.item.NetheritediamondpickaxeItem;
import net.mcreator.idontcare.item.NetheritediamondhoeItem;
import net.mcreator.idontcare.item.NetheritediamondaxeItem;
import net.mcreator.idontcare.item.NetheritediamondarmorItem;
import net.mcreator.idontcare.item.NetheritediamondalloyItem;
import net.mcreator.idontcare.item.IroncopperalloyItem;
import net.mcreator.idontcare.item.IdiotItem;
import net.mcreator.idontcare.item.GoldironalloyItem;
import net.mcreator.idontcare.item.DiamondgoldalloyItem;
import net.mcreator.idontcare.item.CoppershovelItem;
import net.mcreator.idontcare.item.CopperpickaxeItem;
import net.mcreator.idontcare.item.CoppercoalalloyItem;
import net.mcreator.idontcare.item.CopperaxeItem;
import net.mcreator.idontcare.IDontCareMod;

public class IDontCareModItems {
	public static Item COPPERCOALALLOY;
	public static Item DIAMONDGOLDALLOY;
	public static Item GOLDIRONALLOY;
	public static Item IRONCOPPERALLOY;
	public static Item NETHERITEDIAMONDALLOY;
	public static Item PUREIRONINGOT;
	public static Item PUREGOLDINGOT;
	public static Item PUREDIAMOND;
	public static Item PURECOPPERINGOT;
	public static Item PURENETHERITEINGOT;
	public static Item NETHERITEDIAMONDARMOR_HELMET;
	public static Item NETHERITEDIAMONDARMOR_CHESTPLATE;
	public static Item NETHERITEDIAMONDARMOR_LEGGINGS;
	public static Item NETHERITEDIAMONDARMOR_BOOTS;
	public static Item NETHERITEDIAMONDPICKAXE;
	public static Item NETHERITEDIAMONDAXE;
	public static Item NETHERITEDIAMONDSHOVEL;
	public static Item NETHERITEDIAMONDHOE;
	public static Item NETHERITEDIAMONDSWORD;
	public static Item IDIOT;
	public static Item COPPERAXE;
	public static Item COPPERPICKAXE;
	public static Item COPPERSHOVEL;

	public static void load() {
		COPPERCOALALLOY = Registry.register(Registry.ITEM, new ResourceLocation(IDontCareMod.MODID, "coppercoalalloy"), new CoppercoalalloyItem());
		DIAMONDGOLDALLOY = Registry.register(Registry.ITEM, new ResourceLocation(IDontCareMod.MODID, "diamondgoldalloy"), new DiamondgoldalloyItem());
		GOLDIRONALLOY = Registry.register(Registry.ITEM, new ResourceLocation(IDontCareMod.MODID, "goldironalloy"), new GoldironalloyItem());
		IRONCOPPERALLOY = Registry.register(Registry.ITEM, new ResourceLocation(IDontCareMod.MODID, "ironcopperalloy"), new IroncopperalloyItem());
		NETHERITEDIAMONDALLOY = Registry.register(Registry.ITEM, new ResourceLocation(IDontCareMod.MODID, "netheritediamondalloy"),
				new NetheritediamondalloyItem());
		PUREIRONINGOT = Registry.register(Registry.ITEM, new ResourceLocation(IDontCareMod.MODID, "pureironingot"), new PureironingotItem());
		PUREGOLDINGOT = Registry.register(Registry.ITEM, new ResourceLocation(IDontCareMod.MODID, "puregoldingot"), new PuregoldingotItem());
		PUREDIAMOND = Registry.register(Registry.ITEM, new ResourceLocation(IDontCareMod.MODID, "purediamond"), new PurediamondItem());
		PURECOPPERINGOT = Registry.register(Registry.ITEM, new ResourceLocation(IDontCareMod.MODID, "purecopperingot"), new PurecopperingotItem());
		PURENETHERITEINGOT = Registry.register(Registry.ITEM, new ResourceLocation(IDontCareMod.MODID, "purenetheriteingot"),
				new PurenetheriteingotItem());
		NETHERITEDIAMONDARMOR_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(IDontCareMod.MODID, "netheritediamondarmor_helmet"),
				new NetheritediamondarmorItem.Helmet());
		NETHERITEDIAMONDARMOR_CHESTPLATE = Registry.register(Registry.ITEM,
				new ResourceLocation(IDontCareMod.MODID, "netheritediamondarmor_chestplate"), new NetheritediamondarmorItem.Chestplate());
		NETHERITEDIAMONDARMOR_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(IDontCareMod.MODID, "netheritediamondarmor_leggings"),
				new NetheritediamondarmorItem.Leggings());
		NETHERITEDIAMONDARMOR_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(IDontCareMod.MODID, "netheritediamondarmor_boots"),
				new NetheritediamondarmorItem.Boots());
		NETHERITEDIAMONDPICKAXE = Registry.register(Registry.ITEM, new ResourceLocation(IDontCareMod.MODID, "netheritediamondpickaxe"),
				new NetheritediamondpickaxeItem());
		NETHERITEDIAMONDAXE = Registry.register(Registry.ITEM, new ResourceLocation(IDontCareMod.MODID, "netheritediamondaxe"),
				new NetheritediamondaxeItem());
		NETHERITEDIAMONDSHOVEL = Registry.register(Registry.ITEM, new ResourceLocation(IDontCareMod.MODID, "netheritediamondshovel"),
				new NetheritediamondshovelItem());
		NETHERITEDIAMONDHOE = Registry.register(Registry.ITEM, new ResourceLocation(IDontCareMod.MODID, "netheritediamondhoe"),
				new NetheritediamondhoeItem());
		NETHERITEDIAMONDSWORD = Registry.register(Registry.ITEM, new ResourceLocation(IDontCareMod.MODID, "netheritediamondsword"),
				new NetheritediamondswordItem());
		IDIOT = Registry.register(Registry.ITEM, new ResourceLocation(IDontCareMod.MODID, "idiot"), new IdiotItem());
		COPPERAXE = Registry.register(Registry.ITEM, new ResourceLocation(IDontCareMod.MODID, "copperaxe"), new CopperaxeItem());
		COPPERPICKAXE = Registry.register(Registry.ITEM, new ResourceLocation(IDontCareMod.MODID, "copperpickaxe"), new CopperpickaxeItem());
		COPPERSHOVEL = Registry.register(Registry.ITEM, new ResourceLocation(IDontCareMod.MODID, "coppershovel"), new CoppershovelItem());
	}
}
