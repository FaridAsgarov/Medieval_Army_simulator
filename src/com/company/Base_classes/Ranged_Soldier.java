package com.company.Base_classes;

import com.company.Soldiers.Rank_enum;
import com.company.Base_classes.Distance_Weapon;

public class Ranged_Soldier extends Soldier {

    public Ranged_Soldier(Rank_enum rank, String name){
        super(rank,  name,null,100);
    }

    @Override
    public String toString() {
        return "rank: " + this.rank + ",name: " + this.name + ",arsenal: " + arsenal.toString() + "Health Points remaining:" + healthPoints + "HP";
    }

    @Override
    public String defend(){
        return "Impossible to defend with the Ranged type of a weapon";
    }

    @Override
    public String attack(){
        return super.attack();
    }


    public String reload(){
        if(this.arsenal.get_active_weapon() instanceof Distance_Weapon){
            ((Distance_Weapon)arsenal.get_active_weapon()).reload();
            return "reloaded current ranged weapon";
        }
        return "no ranged weapon in hand to reload";
    }

}
