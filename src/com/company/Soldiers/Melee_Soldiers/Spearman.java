package com.company.Soldiers.Melee_Soldiers;

import com.company.Base_classes.Soldier;
import com.company.Base_classes.Weapon;
import com.company.Soldiers.Rank_enum;
import com.company.Weapon.Melee_Weapons.Spear;
import com.company.Weapon.Melee_Weapons.Sword;

import java.util.ArrayList;
import java.util.Random;

public class Spearman extends Soldier {

    public Spearman(String name) {
        super(Rank_enum.PEASANT, name, new ArrayList<Weapon>(), null,100);
        this.arsenal.add(new Spear());
        this.arsenal.add(new Sword());
        this.active_weapon_index = 0;
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
        if (this.arsenal.get(this.active_weapon_index).getClass().getName().equals(Spear.class.getName())) {
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
            this.arsenal.remove(active_weapon_index);
        }
        else {
            boolean isExist = false;
            for(Weapon item : this.arsenal){
                if(item.getClass().getName().equals(Spear.class.getName()))
                    isExist = true;
            }
            if(isExist)
                result = "No spear is not selected";
            else
                result = "No spear to throw";
        }

        return result;

    }
}



