
package net.mcreator.idontcare.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class NetheritediamondshovelItem extends ShovelItem {
	public NetheritediamondshovelItem() {
		super(new Tier() {
			public int getUses() {
				return 1797;
			}

			public float getSpeed() {
				return 8.5f;
			}

			public float getAttackDamageBonus() {
				return 1f;
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
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant());
	}
}
