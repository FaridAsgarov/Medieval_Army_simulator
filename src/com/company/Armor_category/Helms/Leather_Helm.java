package com.company.Armor_category.Helms;

import com.company.Armor_category.Helms.Base.Base_Helm;
import com.company.Base_classes.Armor_package.Armor_bodypart;
import com.company.Base_classes.Armor_package.Material_package.Material;
import com.company.Base_classes.Armor_package.Material_package.Material_Quality;

public class Leather_Helm extends Base_Helm {
    public Leather_Helm() {
        super(Armor_bodypart.HEAD, new Material(Material_Quality.LEATHER,15,1.2, 100));
    }

    @Override
    public String toString() {
        return "Helm, protects the head, it's " + material.toString();
    }
}

