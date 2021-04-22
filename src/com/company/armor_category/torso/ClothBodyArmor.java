package com.company.armor_category.torso;

import com.company.armor_category.torso.base.BaseBodyArmor;
import com.company.base.armors.ArmorBodypart;
import com.company.base.armors.materials.Material;
import com.company.base.armors.materials.MaterialQuality;

public class ClothBodyArmor extends BaseBodyArmor {
    public ClothBodyArmor() {
        super(ArmorBodypart.TORSO,
                new Material(MaterialQuality.CLOTH,8,0.5, 100));
    }

    @Override
    public String toString() {
        return "Body Armor, it protects the torso, it's " + material.toString();
    }
}
