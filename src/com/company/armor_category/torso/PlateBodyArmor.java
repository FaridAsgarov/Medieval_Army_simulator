package com.company.armor_category.torso;

import com.company.armor_category.torso.base.BaseBodyArmor;
import com.company.base.armors.ArmorBodypart;
import com.company.base.armors.materials.Material;
import com.company.base.armors.materials.MaterialQuality;

public class PlateBodyArmor extends BaseBodyArmor {
    public PlateBodyArmor() {
        super(ArmorBodypart.TORSO,
                new Material(MaterialQuality.PLATE,105,2.0, 100));
    }

    @Override
    public String toString() {
        return "Body Armor, it protects the torso, it's " + material.toString();
    }
}
