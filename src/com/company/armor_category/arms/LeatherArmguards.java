package com.company.armor_category.arms;

import com.company.armor_category.arms.base.BaseArmguards;
import com.company.base.armors.ArmorBodypart;
import com.company.base.armors.materials.Material;
import com.company.base.armors.materials.MaterialQuality;

public class LeatherArmguards extends BaseArmguards {
    public LeatherArmguards() {
        super(ArmorBodypart.ARMS,
                new Material(MaterialQuality.LEATHER,10,1.2, 100));
    }

    @Override
    public String toString() {
        return "Armguards, they protect the arms, they're " + material.toString();
    }
}

