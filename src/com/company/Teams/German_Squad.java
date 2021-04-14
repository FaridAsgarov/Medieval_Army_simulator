package com.company.Teams;

import com.company.Base_classes.Base_Squad;
import com.company.Base_classes.Soldier;
import com.company.Soldiers.Melee_Soldiers.Spearman;
import com.company.Soldiers.Melee_Soldiers.Swordsman;
import com.company.Soldiers.Ranged_Soldiers.Bowman;
import com.company.Soldiers.Ranged_Soldiers.Crossbow_man;


import java.util.ArrayList;

public class German_Squad extends Base_Squad {

    public German_Squad() {
        super("Astrian_Deutsch", 8, 0, new ArrayList<Soldier>());
        this.Add_Soldier(new Spearman("German_Spearman"));
        this.Add_Soldier(new Swordsman("German_Swordsman"));
        this.Add_Soldier(new Bowman("German_Bowman"));
        this.Add_Soldier(new Crossbow_man("German_Crossbow_man"));
        this.Add_Soldier(new Spearman("German_Spearman_2"));
        this.Add_Soldier(new Swordsman("German_Swordsman_2"));
        this.Add_Soldier(new Bowman("German_Bowman_2"));
        this.Add_Soldier(new Crossbow_man("German_Crossbow_man_2"));
        this.commander_index = 6;
    }

}
