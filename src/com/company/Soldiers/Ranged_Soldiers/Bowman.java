package com.company.Soldiers.Ranged_Soldiers;

import com.company.Armor_category.Arms.Leather_Armguards;
import com.company.Armor_category.Helms.Leather_Helm;
import com.company.Armor_category.Legs.Leather_LegGuards;
import com.company.Armor_category.Torso.Leather_bodyArmor;
import com.company.Base_classes.Armor_package.Soldier_Armor_Set;
import com.company.Base_classes.Ranged_Soldier;
import com.company.Base_classes.Weapon;
import com.company.Soldiers.Rank_enum;
import com.company.Weapon.Ranged_Weapon.Bow;


import java.util.ArrayList;

public class Bowman extends Ranged_Soldier {
    protected Soldier_Armor_Set leather_armor_set;
    public Bowman(String name) {
        super(Rank_enum.PEASANT, name, new ArrayList<Weapon>());
        this.arsenal.add(new Bow());
        this.active_weapon_index = 0;

        this.leather_armor_set = new Soldier_Armor_Set();
        this.leather_armor_set.initializeInstance(new Leather_Helm(), new Leather_Armguards(),
                new Leather_LegGuards(), new Leather_bodyArmor());
    }

    @Override
    public String defend() {
        return super.defend();
    }

    @Override
    public String attack() {
        return super.attack();
    }

    @Override
    public int reload() {
        return super.reload();
    }

    @Override
    public String toString() {
        return "Bowman " + this.name + " has armor of: " + leather_armor_set.toString();
    }

}
