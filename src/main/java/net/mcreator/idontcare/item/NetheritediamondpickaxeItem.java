
package net.mcreator.idontcare.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.idontcare.init.IDontCareModTabs;

public class NetheritediamondpickaxeItem extends PickaxeItem {
	public NetheritediamondpickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1797;
			}

			public float getSpeed() {
				return 8.5f;
			}

			public float getAttackDamageBonus() {
				return 3.5f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 13;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.DIAMOND));
			}
		}, 1, -2.8f, new Item.Properties().tab(IDontCareModTabs.TAB_IDC).fireResistant());
	}
}
