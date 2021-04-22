package com.company.teams;

import com.company.base.BaseSquad;
import com.company.base.Soldier;
import com.company.soldiers.melee.Spearman;
import com.company.soldiers.melee.Swordsman;
import com.company.soldiers.ranged.Bowman;
import com.company.soldiers.ranged.Crossbowman;


import java.util.ArrayList;

public class EnglishSquad extends BaseSquad {

    public EnglishSquad() {
        super("Anglo-Saxon", 8, 0, new ArrayList<Soldier>());
        this.Add_Soldier(new Spearman("English_Spearman"));
        this.Add_Soldier(new Swordsman("English_Swordsman"));
        this.Add_Soldier(new Bowman("English_Bowman"));
        this.Add_Soldier(new Crossbowman("English_Crossbowman"));
        this.Add_Soldier(new Spearman("English_Spearman_2"));
        this.Add_Soldier(new Swordsman("English_Swordsman_2"));
        this.Add_Soldier(new Bowman("English_Bowman_2"));
        this.Add_Soldier(new Crossbowman("English_Crossbowman_2"));
        this.commander_index = 1;
    }

}
