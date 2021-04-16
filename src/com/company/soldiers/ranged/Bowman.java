package com.company.soldiers.ranged;

import com.company.armor_category.arms.LeatherArmguards;
import com.company.armor_category.helms.LeatherHelm;
import com.company.armor_category.legs.LeatherLegGuards;
import com.company.armor_category.torso.LeatherBodyArmor;
import com.company.base.armors.SoldierArmorSet;
import com.company.base.RangedSoldier;
import com.company.soldiers.Rank;
import com.company.weapons.ranged.Bow;


public class Bowman extends RangedSoldier {
    protected SoldierArmorSet leather_armor_set;

    public Bowman(String name) {
        super(Rank.PEASANT, name);
        this.arsenal.add_weapon(new Bow());

        this.leather_armor_set = new SoldierArmorSet();
        this.leather_armor_set.initializeInstance(new LeatherHelm(), new LeatherArmguards(),
                new LeatherLegGuards(), new LeatherBodyArmor());
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
    public String toString() {
        return "Bowman " + this.name + " has armor of: " + leather_armor_set.toString();
    }

}
