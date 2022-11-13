
package net.mcreator.idontcare.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class PuregoldpickaxeItem extends PickaxeItem {
	public PuregoldpickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 905;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 2.5f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.GOLD_INGOT));
			}
		}, 1, -2.7999999999999998f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
