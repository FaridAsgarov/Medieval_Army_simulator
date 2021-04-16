package com.company.weapons.melee;

import com.company.base.Weapon;
import com.company.base.WeaponRange;

public class Sword extends Weapon {
   public Sword() {
        super(
               WeaponRange.MIDDLE_RANGE, 1.5, 100
        );
    }

    @Override
    public String attack() {
        return "successfully attacked with a sword";
    }

    @Override
    public String defend() {
        return "successfully parried with a sword against an attack";
    }
}
