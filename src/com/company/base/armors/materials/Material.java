package com.company.base.armors.materials;

public class Material {
    MaterialQuality material_quality;
    protected int material_hp;
    protected double mobility_debuff;
    protected int durability;

    public Material(MaterialQuality material_quality, int material_hp, double mobility_debuff, int durability){
        this.material_quality = material_quality;
        this.material_hp = material_hp;
        this.mobility_debuff = mobility_debuff;
        this.durability = durability;
    }

    @Override
    public String toString() {
        return "made from " + material_quality + ", gives " + material_hp + " armor HP" +
                ", decreases mobility by " + mobility_debuff + " times, has " + durability +  " durability left";
    }

    protected int getMaterial_hp() {
        return material_hp;
    }

    public int getMaterialHP(){
        return this.material_hp;
    }

}
