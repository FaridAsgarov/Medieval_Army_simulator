package com.company.base.armors;

import com.company.base.armors.materials.Material;

public class ArmorElement {
   protected ArmorBodypart armor_bodypart;
   protected Material material;
   protected ArmorElement(ArmorBodypart armor_bodypart, Material material){
       this.armor_bodypart = armor_bodypart;
       this.material = material;
   }

    @Override
    public String toString() {
        return this.armor_bodypart + " and it's " + material.toString();
    }
}
