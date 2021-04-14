package com.company.Weapon.Melee_Weapons;

import com.company.Base_classes.Weapon;
import com.company.Base_classes.Weapon_range;

public class Sword extends Weapon {
   public Sword() {
        super(
               Weapon_range.MIDDLE_RANGE, 1.5, 100
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
