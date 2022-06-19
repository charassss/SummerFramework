package me.summerunni.myforge.item.tools;

import me.summerunni.myforge.group.ModGroup;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;

public class PickaxeBase extends PickaxeItem {
    public PickaxeBase(IItemTier tier, int attackDamageIn, float attackSpeedIn) {
        super(tier, attackDamageIn, attackSpeedIn, (new Item.Properties()).group(ModGroup.TOOL_GROUP));
    }
}
