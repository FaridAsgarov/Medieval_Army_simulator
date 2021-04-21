package com.company.soldiers.melee;

import com.company.armor_category.arms.LeatherArmguards;
import com.company.armor_category.helms.LeatherHelm;
import com.company.armor_category.legs.LeatherLegGuards;
import com.company.armor_category.torso.LeatherBodyArmor;
import com.company.base.Soldier;
import com.company.soldiers.Rank;
import com.company.weapons.melee.Spear;
import com.company.weapons.melee.Sword;


import java.util.Random;

public class Spearman extends Soldier {

    public Spearman(String name) {
        super(Rank.PEASANT, name, null,100);
        Spear spear = new Spear();
        this.arsenal.addWeapon(spear);
        this.arsenal.addWeapon(new Sword());
        this.arsenal.setActiveWeapon(spear);

        this.soldierArmorSet.initializeInstance(new LeatherHelm(), new LeatherArmguards(),
                new LeatherLegGuards(), new LeatherBodyArmor());

        this.currentHP = this.healthPoints + soldierArmorSet.TotalArmorPoints();
    }

    @Override
    public String toString() {
        return "Spearman " + this.name + " has armor of: " + this.soldierArmorSet.toString();
    }

    @Override
    public String defend() {
        return super.defend();
    }

    @Override
    public String attack(Soldier enemy) {
        return super.attack(enemy);
    }

    public String throw_spear(Soldier enemy) {
        String result;
        if (this.arsenal.getActiveWeapon().getClass().getName().equals(Spear.class.getName())) {
            int min = 0;
            int max = 100;
            int diff = max - min;
            Random random = new Random();
            int i = random.nextInt(diff + 1);
            i += min;

            if (i <= 30) {
                result = "Missed the target with the throw";
            } else {
                enemy.currentHP -= this.arsenal.getActiveWeapon().getDamage();
                result = "Successfully threw the Spear at the target, enemy health is at: " + enemy.currentHP +" HP";
            }
            this.arsenal.removeActiveWeapon();
        }
        else {
            if(arsenal.containsType(Spear.class))
                result = "Spear is not selected";
            else
                result = "No spear to throw";
        }

        return result;

    }
}



