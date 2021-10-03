
package net.mcreator.cheesbeandeen.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.cheesbeandeen.item.EncasedOrbItem;
import net.mcreator.cheesbeandeen.CheesbeandeenModElements;

@CheesbeandeenModElements.ModElement.Tag
public class CBiomeItemGroup extends CheesbeandeenModElements.ModElement {
	public CBiomeItemGroup(CheesbeandeenModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabc_biome") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(EncasedOrbItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
