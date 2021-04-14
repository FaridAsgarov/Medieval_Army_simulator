package com.company.Base_classes;

import com.company.Soldiers.Rank_enum;

import java.util.ArrayList;

public class Soldier {
      Rank_enum rank;
      protected String name;
      protected ArrayList<Weapon> arsenal;
      protected int active_weapon_index;
      Shield shield;

      protected int healthPoints;

      public Soldier(Rank_enum rank, String name, ArrayList<Weapon> arsenal, Shield shield, int healthPoints){
              this.rank = rank;
              this.name = name;
              this.arsenal = new ArrayList<Weapon>();
              this.active_weapon_index = -1;
              this.shield = shield;
              this.healthPoints = healthPoints;
      }

    @Override
    public String toString() {
        String cur_arsenal = " ";
        for(Weapon item : arsenal) {
            cur_arsenal += item.toString() + " ";
        }
        return "rank: " + this.rank + ",name: " + this.name + ",arsenal:" + cur_arsenal + ",Health Points remaining:" + this.healthPoints+"HP";
    }

    public String defend(){
              String result = " ";
              try{
                      if (this.shield!=null){
                          result = this.shield.defend_shield();
                      }
                      else {
                          result = arsenal.get(active_weapon_index).defend();
                      }
              } catch (Exception ex){
                        result = "Impossible to defend with this type of a weapon";
              }
              return result;
        }

      public String attack(){
              return arsenal.get(active_weapon_index).attack();
      }

      public Weapon get_active_weapon(){
          if(active_weapon_index>=0)
          {
            return this.arsenal.get(active_weapon_index);
          }
        else
            {
                throw new java.lang.UnsupportedOperationException("Index can not be negative.");
            }
      }

      public void next_weapon(){
          if(active_weapon_index<this.arsenal.size()){
              active_weapon_index++;
          }
      }

    public void previous_weapon(){
        if(active_weapon_index>0){
            active_weapon_index--;
        }
    }

}
