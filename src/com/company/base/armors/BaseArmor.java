package com.company.base.armors;

import com.company.base.armors.materials.Material;

public class BaseArmor {
    protected Material material;
    protected ArmorBodypart armor_bodypart;
    protected double armor_weight_kgs;
    protected int armor_size;

    protected BaseArmor(Material material, ArmorBodypart armor_bodypart, double armor_weight_kgs, int armor_size){
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
