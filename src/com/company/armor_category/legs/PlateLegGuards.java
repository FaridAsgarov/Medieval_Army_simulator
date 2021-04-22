package com.company.armor_category.legs;

import com.company.armor_category.legs.base.BaseLegGuards;
import com.company.base.armors.ArmorBodypart;
import com.company.base.armors.materials.Material;
import com.company.base.armors.materials.MaterialQuality;

public class PlateLegGuards extends BaseLegGuards {
    public PlateLegGuards(){
        super(ArmorBodypart.LEGS,
                new Material(MaterialQuality.PLATE,35,2.0, 100));
    }

    @Override
    public String toString() {
        return "LegGuards, they protect the legs, they're " + material.toString();
    }
}
