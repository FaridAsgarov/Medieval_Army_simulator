package com.company.Soldiers.Ranged_Soldiers;

import com.company.Base_classes.Ranged_Soldier;
import com.company.Base_classes.Weapon;
import com.company.Soldiers.Rank_enum;
import com.company.Weapon.Ranged_Weapon.Crossbow;


import java.util.ArrayList;

public class Crossbow_man extends Ranged_Soldier {

    public Crossbow_man(String name) {
        super(Rank_enum.KNIGHT, name, new ArrayList<Weapon>());
        this.arsenal.add(new Crossbow());
        this.active_weapon_index = 0;
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
    public int reload() {
        return super.reload();
    }

}
