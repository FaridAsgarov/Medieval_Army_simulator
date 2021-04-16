package com.company.Base_classes;

public class Distance_Weapon extends Weapon {
    protected int max_arrow_num;
    protected int arrow_num;
    protected int reload_time_secs;
    protected int miss_chance;

    public Distance_Weapon(int max_arrow_num, double weight_kg, int length_cm, int reload_time_secs, int miss_chance){
        super(Weapon_range.VERY_LONG_RANGE, weight_kg, length_cm );
        this.max_arrow_num = max_arrow_num;
        this.arrow_num = arrow_num;
        this.reload_time_secs = reload_time_secs;
        this.miss_chance = miss_chance;
    }

    @Override
    public String toString() {
        return super.toString() + ",has max of " + this.max_arrow_num + " arrows, reloading it takes " + this.reload_time_secs + " secs";
    }

    @Override
    public String attack() {
       return super.attack();
    }

    @Override
    public String defend() {
        throw new java.lang.UnsupportedOperationException("Can not defend with distance weapon.");
    }

    public String reload(){
        this.arrow_num = this.max_arrow_num;
        return "reloaded ranged weapon, it took " + this.reload_time_secs + " secs";
    }
}

