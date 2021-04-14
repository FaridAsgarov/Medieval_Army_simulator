package com.company.Armor_category.Arms;

import com.company.Armor_category.Arms.Base.Base_Armguards;
import com.company.Base_classes.Armor_package.Armor_bodypart;
import com.company.Base_classes.Armor_package.Material_package.Material;
import com.company.Base_classes.Armor_package.Material_package.Material_Quality;


public class Сhainmail_Armguards extends Base_Armguards {
    public Сhainmail_Armguards() {
        super(Armor_bodypart.ARMS, new Material(Material_Quality.CHAINMAIL,20,1.5, 100));
    }

    @Override
    public String toString() {
        return "Armguards, protects the arms, they're " + material.toString();
    }
}

