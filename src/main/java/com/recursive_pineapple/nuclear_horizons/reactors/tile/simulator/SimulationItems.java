package com.recursive_pineapple.nuclear_horizons.reactors.tile.simulator;

import java.util.HashMap;

import javax.annotation.Nullable;

import net.minecraft.item.Item;

import com.recursive_pineapple.nuclear_horizons.reactors.items.ItemList;

public class SimulationItems {

    private static final HashMap<Integer, Item> reactorItemsById = new HashMap<>();
    private static final HashMap<Item, Integer> reactorItemIdsByItem = new HashMap<>();

    public static void registerSimulationItem(int id, Item item) {
        reactorItemsById.put(id, item);
        reactorItemIdsByItem.put(item, id);
    }

    public static void registerSimulationItem(int id, gregtech.api.enums.ItemList item) {
        reactorItemsById.put(id, item.getItem());
        reactorItemIdsByItem.put(item.getItem(), id);
    }

    public static @Nullable Item getSimulationItem(int id) {
        return reactorItemsById.get(id);
    }

    public static @Nullable Integer getSimulationItemId(Item item) {
        return reactorItemIdsByItem.get(item);
    }

    public static void registerSimulationItems() {
        registerSimulationItem(1, ItemList.URANIUM_1X_ROD);
        registerSimulationItem(2, ItemList.URANIUM_2X_ROD);
        registerSimulationItem(3, ItemList.URANIUM_4X_ROD);
        registerSimulationItem(7, ItemList.NEUTRON_REFLECTOR);
        registerSimulationItem(8, ItemList.THICK_NEUTRON_REFLECTOR);
        registerSimulationItem(9, ItemList.BASIC_HEAT_VENT);
        registerSimulationItem(10, ItemList.ADVANCED_HEAT_VENT);
        registerSimulationItem(11, ItemList.REACTOR_HEAT_VENT);
        registerSimulationItem(12, ItemList.COMPONENT_HEAT_VENT);
        registerSimulationItem(13, ItemList.OVERCLOCKED_HEAT_VENT);
        registerSimulationItem(14, ItemList.COOLANT_CELL_10k);
        registerSimulationItem(15, ItemList.COOLANT_CELL_30k);
        registerSimulationItem(16, ItemList.COOLANT_CELL_60k);
        registerSimulationItem(17, ItemList.BASIC_HEAT_EXCHANGER);
        registerSimulationItem(18, ItemList.ADVANCED_HEAT_EXCHANGER);
        registerSimulationItem(19, ItemList.REACTOR_HEAT_EXCHANGER);
        registerSimulationItem(20, ItemList.COMPONENT_HEAT_EXCHANGER);
        registerSimulationItem(21, ItemList.REACTOR_PLATING);
        registerSimulationItem(22, ItemList.REACTOR_PLATING_HEAT);
        registerSimulationItem(23, ItemList.REACTOR_PLATING_EXPLOSIVE);
        registerSimulationItem(24, ItemList.RSH_CONDENSATOR);
        registerSimulationItem(25, ItemList.LZH_CONDENSATOR);
        registerSimulationItem(26, ItemList.THORIUM_1X_ROD);
        registerSimulationItem(27, ItemList.THORIUM_2X_ROD);
        registerSimulationItem(28, ItemList.THORIUM_4X_ROD);
        registerSimulationItem(29, gregtech.api.enums.ItemList.Reactor_Coolant_He_1);
        registerSimulationItem(30, gregtech.api.enums.ItemList.Reactor_Coolant_He_3);
        registerSimulationItem(31, gregtech.api.enums.ItemList.Reactor_Coolant_He_6);
        registerSimulationItem(32, gregtech.api.enums.ItemList.Reactor_Coolant_NaK_1);
        registerSimulationItem(33, gregtech.api.enums.ItemList.Reactor_Coolant_NaK_3);
        registerSimulationItem(34, gregtech.api.enums.ItemList.Reactor_Coolant_NaK_6);
        registerSimulationItem(35, gregtech.api.enums.ItemList.Neutron_Reflector);
        registerSimulationItem(45, ItemList.NAQUADAH_1X_ROD);
        registerSimulationItem(46, ItemList.NAQUADAH_2X_ROD);
        registerSimulationItem(47, ItemList.NAQUADAH_4X_ROD);
        registerSimulationItem(48, ItemList.NAQUADRIA_1X_ROD);
        registerSimulationItem(49, ItemList.NAQUADRIA_2X_ROD);
        registerSimulationItem(50, ItemList.NAQUADRIA_4X_ROD);
        registerSimulationItem(51, ItemList.TIBERIUM_1X_ROD);
        registerSimulationItem(52, ItemList.TIBERIUM_2X_ROD);
        registerSimulationItem(53, ItemList.TIBERIUM_4X_ROD);
        registerSimulationItem(54, ItemList.THE_CORE_ROD); // the core
        registerSimulationItem(55, gregtech.api.enums.ItemList.Reactor_Coolant_Sp_1);
        registerSimulationItem(56, gregtech.api.enums.ItemList.Reactor_Coolant_Sp_2);
        registerSimulationItem(57, gregtech.api.enums.ItemList.Reactor_Coolant_Sp_3);
        registerSimulationItem(58, gregtech.api.enums.ItemList.Reactor_Coolant_Sp_6);
        registerSimulationItem(59, gregtech.api.enums.ItemList.neutroniumHeatCapacitor);
        registerSimulationItem(60, ItemList.HIGH_DENSITY_URANIUM_1X_ROD);
        registerSimulationItem(61, ItemList.HIGH_DENSITY_URANIUM_2X_ROD);
        registerSimulationItem(62, ItemList.HIGH_DENSITY_URANIUM_4X_ROD);
        registerSimulationItem(63, ItemList.HIGH_DENSITY_PLUTONIUM_1X_ROD);
        registerSimulationItem(64, ItemList.HIGH_DENSITY_PLUTONIUM_2X_ROD);
        registerSimulationItem(65, ItemList.HIGH_DENSITY_PLUTONIUM_4X_ROD);
        registerSimulationItem(66, ItemList.EXCITED_URANIUM_1X_ROD);
        registerSimulationItem(67, ItemList.EXCITED_URANIUM_2X_ROD);
        registerSimulationItem(68, ItemList.EXCITED_URANIUM_4X_ROD);
        registerSimulationItem(69, ItemList.EXCITED_PLUTONIUM_1X_ROD);
        registerSimulationItem(70, ItemList.EXCITED_PLUTONIUM_2X_ROD);
        registerSimulationItem(71, ItemList.EXCITED_PLUTONIUM_4X_ROD);
        registerSimulationItem(72, gregtech.api.enums.ItemList.RodGlowstone);
    }
}
