package com.teamfractal.xkdeco.common.material;

import com.teamfractal.xkdeco.common.item.init.punk.XKPunkItems;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public enum XKSteelTools implements Tier {
    STEEL(3,1164,8f,3f,14
            ,() ->{return Ingredient.of(new ItemStack(XKPunkItems.steelIngot.get()));}
    );
    private final int level;
    private final int durability;
    private final float efficiency;
    private final float damage;
    private final int value;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    XKSteelTools(int harvestlevel, int durability, float efficiency, float attackDamage, int enchantValue, Supplier<Ingredient> repairItem){
        this.level = harvestlevel;
        this.durability = durability;
        this.efficiency = efficiency;
        this.damage = attackDamage;
        this.value = enchantValue;
        this.repairIngredient = new LazyLoadedValue<>(repairItem);
    }

    @Override
    public int getUses() {
        return this.durability;
    }

    @Override
    public float getSpeed() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getEnchantmentValue() {
        return this.value;
    }

    @Nonnull
    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
