package com.company.Armor_category.Torso;

import com.company.Armor_category.Torso.Base.Base_bodyArmor;
import com.company.Base_classes.Armor_package.Armor_bodypart;
import com.company.Base_classes.Armor_package.Material_package.Material;
import com.company.Base_classes.Armor_package.Material_package.Material_Quality;

public class Leather_bodyArmor extends Base_bodyArmor {
    public Leather_bodyArmor() {
        super(Armor_bodypart.TORSO, new Material(Material_Quality.LEATHER,30,1.2, 100));
    }

    @Override
    public String toString() {
        return "Body Armor, protects the torso, it's " + material.toString();
    }
}
