package me.summerunni.myforge.item.tools;

import me.summerunni.myforge.group.ModGroup;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class SwordBase extends SwordItem {
    public SwordBase(IItemTier tier, int attackDamageIn, float attackSpeedIn) {
        super(tier, attackDamageIn, attackSpeedIn, new Item.Properties().group(ModGroup.TOOL_GROUP));
    }
}
