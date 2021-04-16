package com.company.weapons.melee;

import com.company.base.Weapon;
import com.company.base.WeaponRange;

public class Kriegsmesser extends Weapon{
    public Kriegsmesser() {
        super(WeaponRange.MELEE_RANGE, 0.96, 75);
    }

    @Override
    public String attack() {
        return "successfully attacked with a Kriegsmesser";
    }

    @Override
    public String defend() {
        return "successfully parried against an attack with a Kriegsmesser";
    }
}
