package com.company.base;

public class Shield {
    protected int area_protection;
    protected double weight_kgs;

    public Shield(int area_protection, double weight_kgs){
        this.area_protection = area_protection;
        this.weight_kgs = weight_kgs;
    }

    public String defend_shield(){
        return "defended by shield";
    }
}
