package com.company.soldiers.ranged;

import com.company.armor_category.arms.СhainmailArmguards;
import com.company.armor_category.helms.ChainmailHelm;
import com.company.armor_category.legs.ChainmailLegGuards;
import com.company.armor_category.torso.ChainmailBodyArmor;
import com.company.base.RangedSoldier;
import com.company.base.Soldier;
import com.company.soldiers.Rank;
import com.company.weapons.ranged.Crossbow;




public class Crossbowman extends RangedSoldier {

    public Crossbowman(String name) {
        super(Rank.KNIGHT, name);

        Crossbow crossbow = new Crossbow();
        this.arsenal.addWeapon(crossbow);
        this.arsenal.setActiveWeapon(crossbow);

        this.soldierArmorSet.initializeInstance(new ChainmailHelm(), new СhainmailArmguards(),
                new ChainmailLegGuards(), new ChainmailBodyArmor());

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

    @Override
    public String toString() {
        return "Crossbowman " + this.name + " has armor of: " + this.soldierArmorSet.toString();
    }

}
