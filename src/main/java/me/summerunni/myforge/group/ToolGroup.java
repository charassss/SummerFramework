package me.summerunni.myforge.group;

import me.summerunni.myforge.item.ModItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ToolGroup extends ItemGroup {
    public ToolGroup() {
        super("tool_group");
    }

    @Override
    public @NotNull ItemStack createIcon() {
        return new ItemStack(ModItem.URANIUM_SWORD.get());
    }
}
