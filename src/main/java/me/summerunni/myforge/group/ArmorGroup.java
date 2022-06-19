package me.summerunni.myforge.group;

import me.summerunni.myforge.item.ModItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ArmorGroup extends ItemGroup {
    public ArmorGroup() {
        super("armor_group");
    }

    @Override
    public @NotNull ItemStack createIcon() {
        return new ItemStack(ModItem.URANIUM_CHESTPLATE.get());
    }
}
