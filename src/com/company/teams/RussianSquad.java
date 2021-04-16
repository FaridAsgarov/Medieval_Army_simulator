package com.company.teams;

import com.company.base.BaseSquad;
import com.company.base.Soldier;
import com.company.soldiers.melee.Spearman;
import com.company.soldiers.melee.Swordsman;
import com.company.soldiers.ranged.Bowman;
import com.company.soldiers.ranged.Crossbowman;


import java.util.ArrayList;

public class RussianSquad extends BaseSquad {

    public RussianSquad() {
        super("Russian", 8, 0, new ArrayList<Soldier>());
        this.Add_Soldier(new Spearman("Russian_Spearman"));
        this.Add_Soldier(new Swordsman("Russian_Swordsman"));
        this.Add_Soldier(new Bowman("Russian_Bowman"));
        this.Add_Soldier(new Crossbowman("Russian_Crossbow_man"));
        this.Add_Soldier(new Spearman("Russian_Spearman_2"));
        this.Add_Soldier(new Swordsman("Russian_Swordsman_2"));
        this.Add_Soldier(new Bowman("Russian_Bowman_2"));
        this.Add_Soldier(new Crossbowman("Russian_Crossbow_man_2"));
        this.commander_index = 3;
    }

}
