package com.company.Soldiers.Ranged_Soldiers;

import com.company.Base_classes.Ranged_Soldier;
import com.company.Soldiers.Rank_enum;
import com.company.Weapon.Ranged_Weapon.Crossbow;




public class Crossbow_man extends Ranged_Soldier {

    public Crossbow_man(String name) {
        super(Rank_enum.KNIGHT, name);
        this.arsenal.add_weapon(new Crossbow());
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
