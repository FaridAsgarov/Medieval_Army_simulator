package com.company.Base_classes.Armor_package;

import com.company.Base_classes.Armor_package.Material_package.Material;

public class Armor_Element {
   protected Armor_bodypart armor_bodypart;
   protected Material material;
   protected Armor_Element(Armor_bodypart armor_bodypart, Material material){
       this.armor_bodypart = armor_bodypart;
       this.material = material;
   }

    @Override
    public String toString() {
        return this.armor_bodypart + " and it's " + material.toString();
    }
}
