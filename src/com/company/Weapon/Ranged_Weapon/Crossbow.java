package com.company.Weapon.Ranged_Weapon;

import com.company.Base_classes.Distance_Weapon;


import java.util.Random;

public class Crossbow extends Distance_Weapon {

    public Crossbow() {
        super(10, 2.26, 50, 5,10);
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
            if (i <= 10) {
                result = "Missed with Crossbow shot at the target";
            } else {
                result = "Succesfully hit the target with a Crossbow arrow";
            }
        }
        else{
            result = "Failed to shoot the Crossbow because there are no arrows";
        }
        return result;
    }

}
