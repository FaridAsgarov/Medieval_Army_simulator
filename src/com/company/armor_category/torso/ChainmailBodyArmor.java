package com.company.armor_category.torso;

import com.company.armor_category.torso.base.BaseBodyArmor;
import com.company.base.armors.ArmorBodypart;
import com.company.base.armors.materials.Material;
import com.company.base.armors.materials.MaterialQuality;

public class ChainmailBodyArmor extends BaseBodyArmor {
    public ChainmailBodyArmor() {
        super(ArmorBodypart.TORSO,
                new Material(MaterialQuality.CHAINMAIL,60,1.5, 100));
    }

    @Override
    public String toString() {
        return "Body Armor, it protects the torso, it's " + material.toString();
    }
}
