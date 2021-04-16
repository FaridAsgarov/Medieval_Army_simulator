package com.company;

import com.company.Soldiers.Melee_Soldiers.Spearman;
import com.company.Soldiers.Melee_Soldiers.Swordsman;
import com.company.Soldiers.Ranged_Soldiers.Bowman;
import com.company.Soldiers.Ranged_Soldiers.Crossbow_man;

public class Main {

    public static void main(String[] args) {
//Creating instance of Bowman class
          Crossbow_man legolas = new Crossbow_man("Legolas");

          for(int i=0;i<10;i++){
              System.out.println(legolas.reload());
              System.out.println(legolas.attack());
          }
          System.out.println(legolas.defend());
        System.out.println(legolas.reload());
          for(int i=0;i<2;i++){
              System.out.println(legolas.attack());
          }
          System.out.println();
////Creating instance of Spearman class
//          Spearman spear_thrower = new Spearman("Spear thrower");
//            System.out.println(spear_thrower.attack());
//            System.out.println(spear_thrower.throw_spear());
//            System.out.println(spear_thrower.attack());
//            System.out.println(spear_thrower.throw_spear());
//            System.out.println(spear_thrower.defend());

    }
}
