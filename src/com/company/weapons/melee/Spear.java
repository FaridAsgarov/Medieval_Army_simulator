package com.company.weapons.melee;

import com.company.base.Weapon;
import com.company.base.WeaponRange;

public class Spear extends Weapon{
   public Spear() {
        super(WeaponRange.LONG_RANGE, 2.0, 228, 20);
    }

    @Override
    public String attack() {
        return "successfully plunge-attacked with a spear";
    }

    @Override
    public String defend() {
        return "successfully parried with a spear against an attack";
    }

}



