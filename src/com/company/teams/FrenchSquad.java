package com.company.teams;

import com.company.base.BaseSquad;
import com.company.base.Soldier;
import com.company.soldiers.melee.Spearman;
import com.company.soldiers.melee.Swordsman;
import com.company.soldiers.ranged.Bowman;
import com.company.soldiers.ranged.Crossbowman;


import java.util.ArrayList;

public class FrenchSquad extends BaseSquad {

    public FrenchSquad() {
        super("French", 8, 0, new ArrayList<Soldier>());
        this.Add_Soldier(new Spearman("French_Spearman"));
        this.Add_Soldier(new Swordsman("French_Swordsman"));
        this.Add_Soldier(new Bowman("French_Bowman"));
        this.Add_Soldier(new Crossbowman("French_Crossbowman"));
        this.Add_Soldier(new Spearman("French_Spearman_2"));
        this.Add_Soldier(new Swordsman("French_Swordsman_2"));
        this.Add_Soldier(new Bowman("French_Bowman_2"));
        this.Add_Soldier(new Crossbowman("French_Crossbowman_2"));
        this.commander_index = 5;
    }

    public String Quick_Surrender(){
        return "Special French Ability activated: Quick Surrender and run from battle";
    }

}
