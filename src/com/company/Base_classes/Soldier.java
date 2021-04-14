package com.company.Base_classes;

import com.company.Soldiers.Rank_enum;


public class Soldier {
      Rank_enum rank;
      protected String name;
      Shield shield;
      protected int healthPoints;
      protected Arsenal arsenal;

      public Soldier(Rank_enum rank, String name, Shield shield, int healthPoints){
              this.rank = rank;
              this.name = name;
              this.shield = shield;
              this.healthPoints = healthPoints;
              this.arsenal = new Arsenal();
      }

    @Override
    public String toString() {

        return "rank: " + this.rank + ",name: " + this.name + ",arsenal:" + arsenal.toString() + ",Health Points remaining:" + this.healthPoints+"HP";
    }

    public String defend(){
              String result = " ";
              try{
                      if (this.shield!=null){
                          result = this.shield.defend_shield();
                      }
                      else {
                          result = arsenal.get_active_weapon().defend();
                      }
              } catch (Exception ex){
                        result = "Impossible to defend with this type of a weapon";
              }
              return result;
        }

      public String attack(){
              return arsenal.get_active_weapon().attack();
      }


}
