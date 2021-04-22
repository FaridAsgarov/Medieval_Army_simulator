package com.company.base;


public class Weapon implements Weaponable{
    protected WeaponRange weapon_range;
    protected double weight_kg;
    protected int length_cm;
    protected int damage;

    public Weapon(WeaponRange weapon_range, double weight_kg, int length_cm, int damage){
        this.weapon_range = weapon_range;
        this.weight_kg = weight_kg;
        this.length_cm = length_cm;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " has range of " + this.weapon_range + ", has weight of "
                + this.weight_kg + " kg, and length of " + this.length_cm + " cm ";
    }

    @Override
    public String attack() {
       throw new java.lang.UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public String defend() {
        throw new java.lang.UnsupportedOperationException("Not implemented yet.");
    }

    public int getDamage() {
        return damage;
    }
}

