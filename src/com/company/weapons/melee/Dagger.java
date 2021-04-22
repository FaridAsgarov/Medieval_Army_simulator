package com.company.weapons.melee;

import com.company.base.Weapon;
import com.company.base.WeaponRange;
import java.util.Random;

public class Dagger extends Weapon{
    public Dagger() {
        super(WeaponRange.VERY_SHORT_MELEE_RANGE, 0.440, 32,15);
    }

    @Override
    public String attack() {
            return "successfully attacked with a dagger";
    }

    @Override
    public String defend() {
        String result;

        int min = 0;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;

        if (i <= 50) {
                result = "Failed to parry with a dagger";
            } else {
                result = "Succesfully parried against an attack with a dagger";
            }

        return result;
    }
}
