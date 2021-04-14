package com.company.Armor_category.Torso.Base;

import com.company.Base_classes.Armor_package.Armor_Element;
import com.company.Base_classes.Armor_package.Armor_bodypart;
import com.company.Base_classes.Armor_package.Material_package.Material;

public class Base_bodyArmor extends Armor_Element {
    protected Base_bodyArmor(Armor_bodypart armor_bodypart, Material material) {
        super(armor_bodypart, material);
    }

    @Override
    public String toString() {
        return "Body Armor, protects the " + this.toString();
    }
}
