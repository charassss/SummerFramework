package me.summerunni.myforge.item;

import me.summerunni.myforge.group.ModGroup;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;

public class ArmorBase extends ArmorItem {

    public ArmorBase(IArmorMaterial materialIn, EquipmentSlotType slot) {
        super(materialIn, slot, (new Item.Properties().group(ModGroup.ARMOR_GROUP)));
    }
}
