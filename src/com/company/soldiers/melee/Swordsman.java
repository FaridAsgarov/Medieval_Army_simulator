package com.company.soldiers.melee;

import com.company.armor_category.arms.СhainmailArmguards;
import com.company.armor_category.helms.ChainmailHelm;
import com.company.armor_category.legs.ChainmailLegGuards;
import com.company.armor_category.torso.ChainmailBodyArmor;
import com.company.base.armors.SoldierArmorSet;
import com.company.base.Soldier;
import com.company.soldiers.Rank;
import com.company.weapons.melee.Sword;
import com.company.base.Shield;


public class Swordsman extends Soldier {
    public Swordsman(String name) {
        super(Rank.KNIGHT, name, new Shield(50,10),100);
        Sword sword = new Sword();
        this.arsenal.addWeapon(sword);
        this.arsenal.setActiveWeapon(sword);

        this.soldierArmorSet.initializeInstance(new ChainmailHelm(), new СhainmailArmguards(),
                new ChainmailLegGuards(), new ChainmailBodyArmor());
        // Need to refactor in the future
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

    public SoldierArmorSet getChainmail_armor_set() {
        return this.soldierArmorSet;
    }

    @Override
    public String toString() {
        return "Swordsman " + this.name + " has armor of: " + this.soldierArmorSet.toString();
    }
}
