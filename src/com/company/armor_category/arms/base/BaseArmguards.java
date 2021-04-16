package com.company.armor_category.arms.base;

import com.company.base.armors.ArmorElement;
import com.company.base.armors.ArmorBodypart;
import com.company.base.armors.materials.Material;

public class BaseArmguards extends ArmorElement {

    protected BaseArmguards(ArmorBodypart armor_bodypart, Material material) {
        super(armor_bodypart, material);
    }

    @Override
    public String toString() {
        return "Armguards, protects the " + this.toString();
    }
}
