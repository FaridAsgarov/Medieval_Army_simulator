package com.company.Weapon.Melee_Weapons;

import com.company.Base_classes.Weapon;
import com.company.Base_classes.Weapon_range;

public class Mace extends Weapon{
    public Mace() {
        super(Weapon_range.SHORT_MELEE_RANGE, 1.5, 65);
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
