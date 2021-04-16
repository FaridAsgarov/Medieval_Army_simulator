package com.company.base;

import java.util.ArrayList;

public class Arsenal {
    protected Weapon activeWeapon;
    public ArrayList<Weapon> arsenal;

    public Arsenal(){
    this.arsenal = new ArrayList<>();
    }

    @Override
    public String toString() {
        String cur_arsenal = "";
        for (Weapon item : arsenal) {
            cur_arsenal += item.toString() + " ";
        }
        return cur_arsenal;
    }

    public void addWeapon(Weapon weapon){
        this.arsenal.add(weapon);
    }
    public void removeActiveWeapon(){
        ////removing current weapon
        this.arsenal.remove(arsenal.indexOf(activeWeapon));
        // checking if another weapon is available in the arsenal
        for (Weapon item : arsenal) {
            if(item != null){
                setActiveWeapon(item);
            }
        }
    }

    public void setActiveWeapon(Weapon activeWeapon) {
        this.activeWeapon = activeWeapon;
    }

    public Weapon getActiveWeapon(){
        if (activeWeapon != null)
            {
                return this.activeWeapon;
            }
            else
            {
                throw new java.lang.UnsupportedOperationException("no active weapon equipped");
            }
        }

    public boolean containsType(Class clazz) {
        for (Weapon weapon : arsenal) {
            if(weapon.getClass() == clazz) {
                return true;
            }
        }
        return false;
    }



}


