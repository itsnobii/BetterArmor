
package net.mcreator.idontcare.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.idontcare.init.IDontCareModTabs;

public class NetheritediamondalloyItem extends Item {
	public NetheritediamondalloyItem() {
		super(new Item.Properties().tab(IDontCareModTabs.TAB_IDC).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
