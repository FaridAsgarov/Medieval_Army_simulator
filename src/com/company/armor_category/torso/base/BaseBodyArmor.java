package com.company.armor_category.torso.base;

import com.company.base.armors.ArmorElement;
import com.company.base.armors.ArmorBodypart;
import com.company.base.armors.materials.Material;

public class BaseBodyArmor extends ArmorElement {
    protected BaseBodyArmor(ArmorBodypart armor_bodypart, Material material) {
        super(armor_bodypart, material);
    }

    @Override
    public String toString() {
        return "Body Armor, protects the " + this.toString();
    }
}
