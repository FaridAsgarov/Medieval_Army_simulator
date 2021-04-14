package com.company.Base_classes.Armor_package;

import com.company.Base_classes.Armor_package.Material_package.Material;

public class Base_Armor {
    protected Material material;
    protected Armor_bodypart armor_bodypart;
    protected double armor_weight_kgs;
    protected int armor_size;

    protected Base_Armor(Material material, Armor_bodypart armor_bodypart, double armor_weight_kgs, int armor_size){
        this.material = material;
        this.armor_bodypart = armor_bodypart;
        this.armor_weight_kgs = armor_weight_kgs;
        this.armor_size = armor_size;
    }

    @Override
    public String toString() {
        return material.toString() + " armor weight: " + armor_weight_kgs + " kgs,armor size: " + armor_size;
    }

    public Material getMaterial() {
        return material;
    }
}
