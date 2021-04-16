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
    protected SoldierArmorSet chainmail_armor_set;
    public Swordsman(String name) {
        super(Rank.KNIGHT, name, new Shield(50,10),100);
        this.arsenal.add_weapon(new Sword());


        this.chainmail_armor_set = new SoldierArmorSet();
        this.chainmail_armor_set.initializeInstance(new ChainmailHelm(), new СhainmailArmguards(),
                new ChainmailLegGuards(), new ChainmailBodyArmor());
    }

    @Override
    public String defend() {
        return super.defend();
    }

    @Override
    public String attack() {
        return super.attack();
    }

    public SoldierArmorSet getChainmail_armor_set() {
        return chainmail_armor_set;
    }

    @Override
    public String toString() {
        return "Swordsman " + this.name + " has armor of: " + chainmail_armor_set.toString();
    }
}
