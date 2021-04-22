package com.company.armor_category.legs.base;

import com.company.base.armors.ArmorElement;
import com.company.base.armors.ArmorBodypart;
import com.company.base.armors.materials.Material;

public class BaseLegGuards extends ArmorElement {
    protected BaseLegGuards(ArmorBodypart armor_bodypart, Material material) {
        super(armor_bodypart, material);
    }

    @Override
    public String toString() {
        return "LegGuards, protects the " + this.toString();
    }
}
