package com.company.Armor_category.Arms.Base;

import com.company.Base_classes.Armor_package.Armor_Element;
import com.company.Base_classes.Armor_package.Armor_bodypart;
import com.company.Base_classes.Armor_package.Material_package.Material;

public class Base_Armguards extends Armor_Element{

    protected Base_Armguards(Armor_bodypart armor_bodypart, Material material) {
        super(armor_bodypart, material);
    }

    @Override
    public String toString() {
        return "Armguards, protects the " + this.toString();
    }
}
