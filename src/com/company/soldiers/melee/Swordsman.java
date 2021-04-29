package com.company.soldiers.melee;

import com.company.armor_category.arms.PlateArmguards;
import com.company.armor_category.helms.PlateHelm;
import com.company.armor_category.legs.PlateLegGuards;
import com.company.armor_category.torso.PlateBodyArmor;
import com.company.base.armors.SoldierArmorSet;
import com.company.base.Soldier;
import com.company.shields.Buckler;
import com.company.shields.KiteShield;
import com.company.soldiers.Rank;
import com.company.weapons.melee.Sword;
import com.company.base.Shield;


public class Swordsman extends Soldier {
    public Swordsman(String name) {
        super(Rank.KNIGHT, name, new KiteShield(),100);
        Sword sword = new Sword();
        this.arsenal.addWeapon(sword);
        this.arsenal.setActiveWeapon(sword);

        this.soldierArmorSet.initializeInstance(new PlateHelm(), new PlateArmguards(),
                new PlateLegGuards(), new PlateBodyArmor());

        this.currentHP = this.healthPoints + soldierArmorSet.TotalArmorPoints();
    }

    @Override
    public String defend() {
        return super.defend();
    }

    @Override
    public String attack(Soldier enemy) {
        return super.attack(enemy);
    }

    public SoldierArmorSet getArmorSet() {
        return this.soldierArmorSet;
    }

    @Override
    public String toString() {
        return "Swordsman " + this.name + " has armor of: "
                + this.soldierArmorSet.toString();
    }
}
