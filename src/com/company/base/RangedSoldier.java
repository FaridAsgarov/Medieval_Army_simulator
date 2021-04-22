package com.company.base;

import com.company.soldiers.Rank;
import com.company.weapons.ranged.Bow;
import com.company.weapons.ranged.Crossbow;

public class RangedSoldier extends Soldier {

    public RangedSoldier(Rank rank, String name){
        super(rank,  name,null,100);
    }

    @Override
    public String toString() {
        return "rank: " + this.rank + ", name: " + this.name + ", arsenal: " + arsenal.toString() + ", Health Points remaining:" + healthPoints + "HP";
    }

    @Override
    public String defend(){
        return "Impossible to defend with the Ranged type of a weapon";
    }

    @Override
    public String attack(Soldier enemy){
        if(this.arsenal.getActiveWeapon() instanceof DistanceWeapon){
            if(((DistanceWeapon) this.arsenal.getActiveWeapon()).getArrow_num() > 0){
                return super.attack(enemy);
            }
            else{
                return "no arrows, so attack is not possible";
            }
        }
        return super.attack(enemy);
    }


    public String reload(){
        if(this.arsenal.getActiveWeapon() instanceof DistanceWeapon){
            ((DistanceWeapon)arsenal.getActiveWeapon()).reload();
            if (this.arsenal.getActiveWeapon() instanceof Bow) {
                return "reloaded the Bow in hand";
            }
            else if (this.arsenal.getActiveWeapon() instanceof Crossbow)
            {
                return "reloaded the Crossbow in hand";
            }
            return "reloaded current ranged weapon";
        }
        return "no ranged weapon in hand to reload";
    }

}
