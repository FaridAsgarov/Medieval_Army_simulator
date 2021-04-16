package com.company.Base_classes;

import java.util.ArrayList;

public class Arsenal {
    protected int active_weapon_index;
    public ArrayList<Weapon> arsenal;

    public Arsenal(){
    this.active_weapon_index = active_weapon_index;

    this.arsenal = new ArrayList<Weapon>();
    }

    @Override
    public String toString() {
        String cur_arsenal = "";
        for (Weapon item : arsenal) {
            cur_arsenal += item.toString() + " ";
        }
        return cur_arsenal;
    }

    public void add_weapon(Weapon weapon){
        this.arsenal.add(weapon);
    }
    public void remove_weapon(){
        this.arsenal.remove(active_weapon_index);
    }

    public void setActive_weapon_index(int active_weapon_index) {
        this.active_weapon_index = active_weapon_index;
    }

    public Weapon get_active_weapon(){
        if (active_weapon_index>=0 && active_weapon_index < arsenal.size())
            {
                return this.arsenal.get(active_weapon_index);
            }
            else
            {
                throw new java.lang.UnsupportedOperationException("Index can not be negative or out of bounds.");
            }
        }

    public boolean search_weapon_in_arsenal(Weapon weapon) {
       boolean isExist = false;

        for (Weapon item : arsenal) {
            if (item.equals(weapon)) {
                isExist = true;
                break;
            }
        }
            return isExist;
    }

}


