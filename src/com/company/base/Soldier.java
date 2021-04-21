package com.company.base;

import com.company.base.armors.SoldierArmorSet;
import com.company.soldiers.Rank;


public class Soldier {
      Rank rank;
      protected String name;
      Shield shield;
      protected int healthPoints;
      protected Arsenal arsenal;
      public int currentHP;
      protected SoldierArmorSet soldierArmorSet;

      public Soldier(Rank rank, String name, Shield shield, int healthPoints){
              this.rank = rank;
              this.name = name;
              this.shield = shield;
              this.healthPoints = healthPoints;
              this.arsenal = new Arsenal();
              this.soldierArmorSet = new SoldierArmorSet();


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
                          result = arsenal.getActiveWeapon().defend();
                      }
              } catch (Exception ex){
                        result = "Impossible to defend with this type of a weapon";
              }
              return result;
        }

      public String attack(Soldier enemy){
              enemy.currentHP -= this.arsenal.getActiveWeapon().getDamage();
              return arsenal.getActiveWeapon().attack() + ", enemy health is at: " + enemy.currentHP +" HP";
      }

        public int getCurrentHP() {
            return currentHP;
        }

        public boolean getAliveStatus(){
              boolean aliveStatus = true;
                  if(this.currentHP <= 0) {
                      aliveStatus = false;
                    }
              return aliveStatus;
        }
}
