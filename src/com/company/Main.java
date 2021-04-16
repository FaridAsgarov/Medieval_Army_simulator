package com.company;

import com.company.base.BaseSquad;
import com.company.soldiers.melee.Spearman;
import com.company.soldiers.ranged.Bowman;
import com.company.soldiers.ranged.Crossbowman;
import com.company.teams.EnglishSquad;

public class Main {

    public static void main(String[] args) {
//Creating instance of Bowman class
//          Crossbowman legolas = new Crossbowman("Legolas");
//
//          for(int i=0;i<10;i++){
//              System.out.println(legolas.reload());
//              System.out.println(legolas.attack());
//          }
//          System.out.println(legolas.defend());
//          System.out.println(legolas.reload());
//          for(int i=0;i<2;i++){
//              System.out.println(legolas.attack());
//          }
//          System.out.println();
//          System.out.println(legolas.toString());
// Creating instance of Spearman class
            Spearman spear_thrower = new Spearman("Spear thrower");
            System.out.println(spear_thrower.attack());
            System.out.println(spear_thrower.throw_spear());
            System.out.println(spear_thrower.throw_spear());
            System.out.println(spear_thrower.attack());
            System.out.println(spear_thrower.throw_spear());
            System.out.println(spear_thrower.defend());

//        BaseSquad base = new EnglishSquad();
////        System.out.println(base.Squad_defend());
//        System.out.println(base.Squad_reload_ranged_weapons());
//        System.out.println();
//        System.out.println(base.Squad_attack());
////        System.out.println(base.Squad_Raise_Shields());

    }
}
