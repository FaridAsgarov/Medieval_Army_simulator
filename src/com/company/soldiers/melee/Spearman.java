package com.company.soldiers.melee;

import com.company.base.Soldier;
import com.company.soldiers.Rank;
import com.company.weapons.melee.Spear;
import com.company.weapons.melee.Sword;


import java.util.Random;

public class Spearman extends Soldier {

    public Spearman(String name) {
        super(Rank.PEASANT, name, null,100);
        this.arsenal.add_weapon(new Spear());
        this.arsenal.add_weapon(new Sword());
        this.arsenal.setActive_weapon_index(0);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String defend() {
        return super.defend();
    }

    @Override
    public String attack() {
        return super.attack();
    }

    public String throw_spear() {
        String result;
        if (this.arsenal.get_active_weapon().getClass().getName().equals(Spear.class.getName())) {
            int min = 0;
            int max = 100;
            int diff = max - min;
            Random random = new Random();
            int i = random.nextInt(diff + 1);
            i += min;

            if (i <= 30) {
                result = "Missed the target with the throw";
            } else {
                result = "Succesfully threw the Spear at the target";
            }
            this.arsenal.remove_weapon();
        }
        else {
            if((arsenal.search_weapon_in_arsenal(new Spear())) == false)
                result = "Spear is not selected";
            else
                result = "No spear to throw";
        }

        return result;

    }
}


