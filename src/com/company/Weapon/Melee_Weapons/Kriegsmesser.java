package com.company.Weapon.Melee_Weapons;

import com.company.Base_classes.Weapon;
import com.company.Base_classes.Weapon_range;

public class Kriegsmesser extends Weapon{
    public Kriegsmesser() {
        super(Weapon_range.MELEE_RANGE, 0.96, 75);
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
