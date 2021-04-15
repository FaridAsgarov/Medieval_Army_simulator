package com.company;

import com.company.Soldiers.Melee_Soldiers.Spearman;
import com.company.Soldiers.Melee_Soldiers.Swordsman;
import com.company.Soldiers.Ranged_Soldiers.Bowman;

public class Main {

    public static void main(String[] args) {

          Bowman legolas = new Bowman("Legolas");
          System.out.println(legolas.reload());
          for(int i=0;i<12;i++){System.out.println(legolas.attack());}
          System.out.println(legolas.defend());

          for(int i=0;i<12;i++){System.out.println(legolas.attack());}
          System.out.println();

          Spearman spear_thrower = new Spearman("Spear thrower");
            System.out.println(spear_thrower.attack());
            System.out.println(spear_thrower.throw_spear());
            System.out.println(spear_thrower.attack());
            System.out.println(spear_thrower.throw_spear());
            System.out.println(spear_thrower.defend());

    }
}
