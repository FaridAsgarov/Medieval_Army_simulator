package com.company.Armor_category.Legs;

import com.company.Armor_category.Legs.Base.Base_LegGuards;
import com.company.Base_classes.Armor_package.Armor_bodypart;
import com.company.Base_classes.Armor_package.Material_package.Material;
import com.company.Base_classes.Armor_package.Material_package.Material_Quality;

public class Chainmail_LegGuards extends Base_LegGuards {
    public Chainmail_LegGuards(){
        super(Armor_bodypart.LEGS, new Material(Material_Quality.CHAINMAIL,20,1.5, 100));
    }

    @Override
    public String toString() {
        return "LegGuards, protects the legs, they're " + material.toString();
    }
}

