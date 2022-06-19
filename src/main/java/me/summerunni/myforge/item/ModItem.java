package me.summerunni.myforge.item;

import me.summerunni.myforge.block.ModBlocks;
import me.summerunni.myforge.group.ModGroup;
import me.summerunni.myforge.item.tools.*;
import me.summerunni.myforge.tier.ModArmorMaterial;
import me.summerunni.myforge.tier.ModItemTier;
import me.summerunni.myforge.util.Reference;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MODID);
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot", () -> new ItemBase(ModGroup.MATERIAL_GROUP));
//  剑: 3, -2.f
    public static final RegistryObject<SwordItem> URANIUM_SWORD = ITEMS.register("uranium_sword", () -> new SwordBase(ModItemTier.URANIUM, 3, -2.4f));
//  镐: 1, -3.0f
    public static final RegistryObject<PickaxeItem> URANIUM_PICKAXE = ITEMS.register("uranium_pickaxe", () -> new PickaxeBase(ModItemTier.URANIUM, 1, -3.0f));
//  锄: 1, -3.0f
    public static final RegistryObject<HoeItem> URANIUM_HOE = ITEMS.register("uranium_hoe", () -> new HoeBase(ModItemTier.URANIUM, 1, -2.8f));
//  铲: 1, -1.0f
    public static final RegistryObject<ShovelItem> URANIUM_SHOVEL = ITEMS.register("uranium_shovel", () -> new ShovelBase(ModItemTier.URANIUM, 1.5f, -3.0f));
//  斧: 1, -1.0f
    public static final RegistryObject<AxeItem> URANIUM_AXE = ITEMS.register("uranium_axe", () -> new AxeBase(ModItemTier.URANIUM, 6.0F,-3.2f));

    public static final RegistryObject<Item> URANIUM_HELMET = ITEMS.register("uranium_helmet", () -> new ArmorBase(ModArmorMaterial.URANIUM, EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> URANIUM_CHESTPLATE = ITEMS.register("uranium_chestplate", () -> new ArmorBase(ModArmorMaterial.URANIUM, EquipmentSlotType.CHEST));
    public static final RegistryObject<Item> URANIUM_LEGGINGS = ITEMS.register("uranium_leggings", () -> new ArmorBase(ModArmorMaterial.URANIUM, EquipmentSlotType.LEGS));
    public static final RegistryObject<Item> URANIUM_BOOTS = ITEMS.register("uranium_boots", () -> new ArmorBase(ModArmorMaterial.URANIUM, EquipmentSlotType.FEET));

    public static final RegistryObject<Item> URANIUM_BLOCK = ITEMS.register("uranium_block", () -> new BlockItem(ModBlocks.URANIUM_BLOCK.get(), new Item.Properties().group(ModGroup.BLOCK_GROUP)));

    public static final RegistryObject<Item> URANIUM_APPLE = ITEMS.register("uranium_apple", () -> new Item(
            new Item.Properties().
                    food(new Food.Builder().
                            hunger(4).
                            saturation(0.2f).
                            effect(() -> new EffectInstance(Effects.WITHER/* Wither Effect */, 4 * 20/* 4 * 20 ticks = 4s */, 2/* Level 2 */), 0.7F/* 70% */).
                            effect(() -> new EffectInstance(Effects.BLINDNESS/* Blindness Effect*/, 7 * 20/* 7 * 20 ticks = 7s */, 1/* Level 1 */), 1/* 100% */).
                            build()
                    ).
                    group(ModGroup.FOOD_GROUP)
    ));
}
