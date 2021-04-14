package com.company.Weapon.Melee_Weapons;

import com.company.Base_classes.Weapon;
import com.company.Base_classes.Weapon_range;

public class Axe extends Weapon{
    public Axe() {
        super(Weapon_range.MIDDLE_RANGE, 3, 150);
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
