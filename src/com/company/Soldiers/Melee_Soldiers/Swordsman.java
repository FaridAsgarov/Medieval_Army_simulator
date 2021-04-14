package com.company.Soldiers.Melee_Soldiers;

import com.company.Armor_category.Arms.Сhainmail_Armguards;
import com.company.Armor_category.Helms.Chainmail_Helm;
import com.company.Armor_category.Legs.Chainmail_LegGuards;
import com.company.Armor_category.Torso.Chainmail_bodyArmor;
import com.company.Base_classes.Armor_package.Soldier_Armor_Set;
import com.company.Base_classes.Soldier;
import com.company.Soldiers.Rank_enum;
import com.company.Weapon.Melee_Weapons.Sword;
import com.company.Base_classes.Shield;


public class Swordsman extends Soldier {
    protected Soldier_Armor_Set chainmail_armor_set;
    public Swordsman(String name) {
        super(Rank_enum.KNIGHT, name, new Shield(50,10),100);
        this.arsenal.add_weapon(new Sword());


        this.chainmail_armor_set = new Soldier_Armor_Set();
        this.chainmail_armor_set.initializeInstance(new Chainmail_Helm(), new Сhainmail_Armguards(),
                new Chainmail_LegGuards(), new Chainmail_bodyArmor());
    }

    @Override
    public String defend() {
        return super.defend();
    }

    @Override
    public String attack() {
        return super.attack();
    }

    public Soldier_Armor_Set getChainmail_armor_set() {
        return chainmail_armor_set;
    }

    @Override
    public String toString() {
        return "Swordsman " + this.name + " has armor of: " + chainmail_armor_set.toString();
    }
}
