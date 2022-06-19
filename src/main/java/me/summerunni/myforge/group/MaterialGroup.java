package me.summerunni.myforge.group;

import me.summerunni.myforge.item.ModItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;

public class MaterialGroup extends ItemGroup {
    public MaterialGroup() {
        super("material_group");
    }


    @Override
    public @NotNull ItemStack createIcon() {
        return new ItemStack(ModItem.URANIUM_INGOT.get());
    }
}
