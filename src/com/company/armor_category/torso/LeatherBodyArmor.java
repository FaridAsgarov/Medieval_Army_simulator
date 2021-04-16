package com.company.armor_category.torso;

import com.company.armor_category.torso.base.BaseBodyArmor;
import com.company.base.armors.ArmorBodypart;
import com.company.base.armors.materials.Material;
import com.company.base.armors.materials.MaterialQuality;

public class LeatherBodyArmor extends BaseBodyArmor {
    public LeatherBodyArmor() {
        super(ArmorBodypart.TORSO, new Material(MaterialQuality.LEATHER,30,1.2, 100));
    }

    @Override
    public String toString() {
        return "Body Armor, protects the torso, it's " + material.toString();
    }
}
