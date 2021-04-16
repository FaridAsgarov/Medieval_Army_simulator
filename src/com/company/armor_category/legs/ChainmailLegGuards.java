package com.company.armor_category.legs;

import com.company.armor_category.legs.base.BaseLegGuards;
import com.company.base.armors.ArmorBodypart;
import com.company.base.armors.materials.Material;
import com.company.base.armors.materials.MaterialQuality;

public class ChainmailLegGuards extends BaseLegGuards {
    public ChainmailLegGuards(){
        super(ArmorBodypart.LEGS, new Material(MaterialQuality.CHAINMAIL,20,1.5, 100));
    }

    @Override
    public String toString() {
        return "LegGuards, protects the legs, they're " + material.toString();
    }
}

