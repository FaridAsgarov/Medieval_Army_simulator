package com.company.soldiers.ranged;

import com.company.base.RangedSoldier;
import com.company.soldiers.Rank;
import com.company.weapons.ranged.Crossbow;




public class Crossbowman extends RangedSoldier {

    public Crossbowman(String name) {
        super(Rank.KNIGHT, name);
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


}
