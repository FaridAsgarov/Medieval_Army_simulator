package com.company.teams;

import com.company.base.BaseSquad;
import com.company.base.Soldier;
import com.company.soldiers.melee.Spearman;
import com.company.soldiers.melee.Swordsman;
import com.company.soldiers.ranged.Bowman;
import com.company.soldiers.ranged.Crossbowman;


import java.util.ArrayList;

public class GermanSquad extends BaseSquad {

    public GermanSquad() {
        super("Astrian_Deutsch", 8, 0, new ArrayList<Soldier>());
        this.Add_Soldier(new Spearman("German_Spearman"));
        this.Add_Soldier(new Swordsman("German_Swordsman"));
        this.Add_Soldier(new Bowman("German_Bowman"));
        this.Add_Soldier(new Crossbowman("German_Crossbowman"));
        this.Add_Soldier(new Spearman("German_Spearman_2"));
        this.Add_Soldier(new Swordsman("German_Swordsman_2"));
        this.Add_Soldier(new Bowman("German_Bowman_2"));
        this.Add_Soldier(new Crossbowman("German_Crossbowman_2"));
        this.commander_index = 6;
    }

}
