package com.company.Weapon.Ranged_Weapon;

import com.company.Base_classes.Distance_Weapon;

import java.util.Random;


public class Bow extends Distance_Weapon {

    public Bow() {
        super(1,
                2.26,
                156,
                3,
                30);
    }

    @Override
    public String attack() {
        String result;

        int min = 0;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;

        if(--this.arrow_num >= 0 ) {
            if (i <= 30) {
                result = "Missed with Bow shot at the target";
            } else {
                result = "Succesfully hit the target with a Bow arrow";
            }
        }
        else{
            result = "Failed to shoot the Bow because there are no arrows loaded into the Bow";
        }
        return result;
    }

}
