package com.teamfractal.xkdeco.common.material;

import com.teamfractal.xkdeco.common.item.init.punk.XKPunkItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum XKSteelArmors implements ArmorMaterial {
    STEEL("steel_armor",24,new int[]{2,5,7,2},9, SoundEvents.ARMOR_EQUIP_IRON,1f,0f,
            () -> {
                return Ingredient.of(XKPunkItems.steelIngot.get());
            }
    );
    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    XKSteelArmors(String name, int multiplier, int[] protections, int enchantability, SoundEvent sound
            , float tough, float knockback, Supplier<Ingredient> item){
        this.name = name;
        this.durabilityMultiplier = multiplier;
        this.slotProtections = protections;
        this.enchantmentValue = enchantability;
        this.sound = sound;
        this.toughness = tough;
        this.knockbackResistance = knockback;
        this.repairIngredient = new LazyLoadedValue<>(item);
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot p_40484_) {
        return HEALTH_PER_SLOT[p_40484_.getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot p_40487_) {
        return this.slotProtections[p_40487_.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}

