package com.company.Base_classes;

import com.company.Soldiers.Rank_enum;

import java.util.ArrayList;

public class Ranged_Soldier extends Soldier {


    public Ranged_Soldier(Rank_enum rank, String name, ArrayList<Weapon> arsenal){
        super(rank,  name, arsenal, null,100);
    }

    @Override
    public String toString() {
        String cur_arsenal = " ";
        for(Weapon item : arsenal) {
            cur_arsenal += item.toString() + " ";
        }
        return "rank: " + this.rank + ",name: " + this.name + ",arsenal: " + cur_arsenal + "Health Points remaining:" + healthPoints + "HP";
    }

    @Override
    public String defend(){
        return "Impossible to defend with the Ranged type of a weapon";
    }

    @Override
    public String attack(){
        return super.attack();
    }

    protected int reload(){
        if(this.arsenal.get(this.active_weapon_index) instanceof Distance_Weapon){
            return ((Distance_Weapon)arsenal.get(this.active_weapon_index)).reload();
        }
        return -1;
    }

}
