package com.company.armor_category.arms;

import com.company.armor_category.arms.base.BaseArmguards;
import com.company.base.armors.ArmorBodypart;
import com.company.base.armors.materials.Material;
import com.company.base.armors.materials.MaterialQuality;

public class PlateArmguards extends BaseArmguards {
    public PlateArmguards() {
        super(ArmorBodypart.ARMS,
                new Material(MaterialQuality.PLATE,35,2.0, 100));
    }

    @Override
    public String toString() {
        return "Armguards, they protect the arms, they're " + material.toString();
    }
}
