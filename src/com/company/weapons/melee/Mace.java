package com.company.weapons.melee;

import com.company.base.Weapon;
import com.company.base.WeaponRange;

public class Mace extends Weapon{
    public Mace() {
        super(WeaponRange.SHORT_MELEE_RANGE, 1.5, 65);
    }

    @Override
    public String attack() {
        return "successfully attacked with a Mace";
    }

    @Override
    public String defend() {
        return "successfully parried against an attack with a Mace";
    }
}
