package me.summerunni.myforge.item.tools;

import me.summerunni.myforge.group.ModGroup;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;

public class HoeBase extends HoeItem {
    public HoeBase(IItemTier tier, int attackDamageIn, float attackSpeedIn) {
        super(tier, attackDamageIn, attackSpeedIn, (new Item.Properties()).group(ModGroup.TOOL_GROUP));
    }
}
