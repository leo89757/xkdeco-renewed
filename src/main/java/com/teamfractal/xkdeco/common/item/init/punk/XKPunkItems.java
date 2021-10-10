package com.teamfractal.xkdeco.common.item.init.punk;

import com.teamfractal.xkdeco.common.creativeTab.init.XKTabs;
import com.teamfractal.xkdeco.common.material.XKSteelArmors;
import com.teamfractal.xkdeco.common.material.XKSteelTools;
import com.teamfractal.xkdeco.common.util.XKRegistryHandler;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.fmllegacy.RegistryObject;

public class XKPunkItems {
    public static RegistryObject<Item> steelShovel;
    public static RegistryObject<Item> steelPickaxe;
    public static RegistryObject<Item> steelAxe;
    public static RegistryObject<Item> steelHoe;
    public static RegistryObject<Item> steelSword;
    public static RegistryObject<Item> steelArmorHelmet;
    public static RegistryObject<Item> steelArmorChestplate;
    public static RegistryObject<Item> steelArmorLeggings;
    public static RegistryObject<Item> steelArmorBoots;
    public static RegistryObject<Item> steelIngot;


    public static void register(){
        steelIngot = XKRegistryHandler.Items.register("steel_ingot"
                ,() -> new Item(new Item.Properties().tab(XKTabs.xkpunk)));
        steelShovel = XKRegistryHandler.Items.register("steel_shovel"
                , () -> new ShovelItem(XKSteelTools.STEEL,1.5f,-3f,new Item.Properties().tab(XKTabs.xkpunk)));
        steelPickaxe =  XKRegistryHandler.Items.register("steel_pickaxe"
                , () -> new PickaxeItem(XKSteelTools.STEEL,1,-2.8f,new Item.Properties().tab(XKTabs.xkpunk)));
        steelAxe =  XKRegistryHandler.Items.register("steel_axe"
                , () -> new AxeItem(XKSteelTools.STEEL,5f,-3.2f,new Item.Properties().tab(XKTabs.xkpunk)));
        steelHoe =  XKRegistryHandler.Items.register("steel_hoe"
                , () -> new HoeItem(XKSteelTools.STEEL,-3,-3f,new Item.Properties().tab(XKTabs.xkpunk)));
        steelSword =  XKRegistryHandler.Items.register("steel_sword"
                , () -> new SwordItem(XKSteelTools.STEEL,3,-2.4f,new Item.Properties().tab(XKTabs.xkpunk)));
        steelArmorHelmet = XKRegistryHandler.Items.register("steel_armor_helmet"
                ,() -> new ArmorItem(XKSteelArmors.STEEL, EquipmentSlot.HEAD, (new Item.Properties()).tab(XKTabs.xkpunk)));
        steelArmorChestplate = XKRegistryHandler.Items.register("steel_armor_chestplate"
                ,() -> new ArmorItem(XKSteelArmors.STEEL, EquipmentSlot.CHEST, (new Item.Properties()).tab(XKTabs.xkpunk)));
        steelArmorLeggings = XKRegistryHandler.Items.register("steel_armor_leggings"
                ,() -> new ArmorItem(XKSteelArmors.STEEL, EquipmentSlot.LEGS, (new Item.Properties()).tab(XKTabs.xkpunk)));
        steelArmorBoots = XKRegistryHandler.Items.register("steel_armor_boots"
                ,() -> new ArmorItem(XKSteelArmors.STEEL, EquipmentSlot.FEET, (new Item.Properties()).tab(XKTabs.xkpunk)));
    }
}
