package com.company.armor_category.legs;

import com.company.armor_category.legs.base.BaseLegGuards;
import com.company.base.armors.ArmorBodypart;
import com.company.base.armors.materials.Material;
import com.company.base.armors.materials.MaterialQuality;

public class ClothLegGuards extends BaseLegGuards {
    public ClothLegGuards(){
        super(ArmorBodypart.LEGS,
                new Material(MaterialQuality.CLOTH,2,0.5, 100));
    }

    @Override
    public String toString() {
        return "LegGuards, they protect the legs, they're " + material.toString();
    }
}