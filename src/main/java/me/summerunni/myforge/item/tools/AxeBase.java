package me.summerunni.myforge.item.tools;

import me.summerunni.myforge.group.ModGroup;
import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;

public class AxeBase extends AxeItem {
    public AxeBase(IItemTier tier, float attackDamageIn, float attackSpeedIn) {
        super(tier, attackDamageIn, attackSpeedIn, (new Item.Properties()).group(ModGroup.TOOL_GROUP));
    }
}
