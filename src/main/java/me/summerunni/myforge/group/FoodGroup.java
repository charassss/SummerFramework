package me.summerunni.myforge.group;

import me.summerunni.myforge.item.ModItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class FoodGroup extends ItemGroup {
    public FoodGroup() {
        super("food_group");
    }

    @Override
    public @NotNull ItemStack createIcon() {
//      return the stack of the Uranium Ingot item.
        return new ItemStack(ModItem.URANIUM_APPLE.get());
    }
}
