package me.summerunni.myforge.group;

import me.summerunni.myforge.item.ModItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class BlockGroup extends ItemGroup {
    public BlockGroup() {
        super("block_group");
    }

    @Override
    public @NotNull ItemStack createIcon() {
        return new ItemStack(ModItem.URANIUM_BLOCK.get());
    }
}
