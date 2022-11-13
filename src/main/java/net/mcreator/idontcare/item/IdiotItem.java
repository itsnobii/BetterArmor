
package net.mcreator.idontcare.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.idontcare.init.IDontCareModSounds;

public class IdiotItem extends RecordItem {
	public IdiotItem() {
		super(0, IDontCareModSounds.RICK, new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE), 4220);
	}
}
