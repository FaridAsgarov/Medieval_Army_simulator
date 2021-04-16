package com.company.teams;

import com.company.base.BaseSquad;
import com.company.base.Soldier;
import com.company.soldiers.melee.Spearman;
import com.company.soldiers.melee.Swordsman;
import com.company.soldiers.ranged.Bowman;
import com.company.soldiers.ranged.Crossbowman;


import java.util.ArrayList;

public class PersianSquad extends BaseSquad {

    public PersianSquad() {
        super("Perseus", 4, 0, new ArrayList<Soldier>());
        this.Add_Soldier(new Spearman("Persian_Spearman"));
        this.Add_Soldier(new Swordsman("Persian_Swordsman"));
        this.Add_Soldier(new Crossbowman("Persian_Crossbow_man"));
        this.Add_Soldier(new Bowman("Persian_Bowman"));
        this.commander_index = 2;
    }

}
