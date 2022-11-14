
package net.mcreator.idontcare.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.InteractionResult;

import net.mcreator.idontcare.procedures.IdiotRightclickedOnBlockProcedure;
import net.mcreator.idontcare.init.IDontCareModSounds;

public class IdiotItem extends RecordItem {
	public IdiotItem() {
		super(15, IDontCareModSounds.RICK, new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE), 4220);
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		IdiotRightclickedOnBlockProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder()
				.put("blockstate", context.getLevel().getBlockState(context.getClickedPos())).put("entity", context.getPlayer()).build());
		return retval;
	}
}
