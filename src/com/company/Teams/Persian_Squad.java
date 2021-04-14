package com.company.Teams;

import com.company.Base_classes.Base_Squad;
import com.company.Base_classes.Soldier;
import com.company.Soldiers.Melee_Soldiers.Spearman;
import com.company.Soldiers.Melee_Soldiers.Swordsman;
import com.company.Soldiers.Ranged_Soldiers.Bowman;
import com.company.Soldiers.Ranged_Soldiers.Crossbow_man;


import java.util.ArrayList;

public class Persian_Squad extends Base_Squad {

    public Persian_Squad() {
        super("Perseus", 4, 0, new ArrayList<Soldier>());
        this.Add_Soldier(new Spearman("Persian_Spearman"));
        this.Add_Soldier(new Swordsman("Persian_Swordsman"));
        this.Add_Soldier(new Crossbow_man("Persian_Crossbow_man"));
        this.Add_Soldier(new Bowman("Persian_Bowman"));
        this.commander_index = 2;
    }

}
