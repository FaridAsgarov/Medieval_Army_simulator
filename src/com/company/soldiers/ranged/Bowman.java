package com.company.soldiers.ranged;

import com.company.armor_category.arms.LeatherArmguards;
import com.company.armor_category.helms.LeatherHelm;
import com.company.armor_category.legs.LeatherLegGuards;
import com.company.armor_category.torso.LeatherBodyArmor;
import com.company.base.Soldier;
import com.company.base.armors.SoldierArmorSet;
import com.company.base.RangedSoldier;
import com.company.soldiers.Rank;
import com.company.weapons.ranged.Bow;


public class Bowman extends RangedSoldier {

    public Bowman(String name) {
        super(Rank.PEASANT, name);

        Bow bow = new Bow();
        this.arsenal.addWeapon(bow);
        this.arsenal.setActiveWeapon(bow);

        this.soldierArmorSet.initializeInstance(new LeatherHelm(), new LeatherArmguards(),
                new LeatherLegGuards(), new LeatherBodyArmor());
    }

    @Override
    public String defend() {
        return super.defend();
    }

    @Override
    public String attack(Soldier enemy) {
        return super.attack(enemy);
    }

    @Override
    public String toString() {
        return "Bowman " + this.name + " has armor of: " + this.soldierArmorSet.toString();
    }

}
