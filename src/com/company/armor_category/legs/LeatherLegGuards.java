package com.company.armor_category.legs;

import com.company.armor_category.legs.base.BaseLegGuards;
import com.company.base.armors.ArmorBodypart;
import com.company.base.armors.materials.Material;
import com.company.base.armors.materials.MaterialQuality;

public class LeatherLegGuards extends BaseLegGuards {
    public LeatherLegGuards(){
        super(ArmorBodypart.LEGS, new Material(MaterialQuality.LEATHER,10,1.2, 100));
    }

    @Override
    public String toString() {
        return "LegGuards, protects the legs, they're " + material.toString();
    }
}

