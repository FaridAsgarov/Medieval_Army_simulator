package com.company.Weapon.Melee_Weapons;

import com.company.Base_classes.Weapon;
import com.company.Base_classes.Weapon_range;

public class Spear extends Weapon{
   public Spear() {
        super(Weapon_range.LONG_RANGE, 2.0, 228);
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



