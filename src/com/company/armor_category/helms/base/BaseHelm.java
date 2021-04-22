package com.company.armor_category.helms.base;

import com.company.base.armors.ArmorElement;
import com.company.base.armors.ArmorBodypart;
import com.company.base.armors.materials.Material;

public class BaseHelm extends ArmorElement {
    protected BaseHelm(ArmorBodypart armor_bodypart, Material material) {
        super(armor_bodypart, material);
    }

    @Override
    public String toString() {
        return "Helm, protects the " + this.toString();
    }
}
