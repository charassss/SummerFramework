package me.summerunni.myforge.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase(ItemGroup group) {
        super(new Item.Properties().group(group));
    }
}
