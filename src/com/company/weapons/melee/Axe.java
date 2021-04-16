package com.company.weapons.melee;

import com.company.base.Weapon;
import com.company.base.WeaponRange;

public class Axe extends Weapon{
    public Axe() {
        super(WeaponRange.MIDDLE_RANGE, 3, 150);
    }

    @Override
    public String attack() {
        return "successfully attacked with an Axe";
    }

    @Override
    public String defend() {
        return "successfully parried against an attack with an Axe";
    }
}
