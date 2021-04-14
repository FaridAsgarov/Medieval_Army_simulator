package com.company.Teams;

import com.company.Base_classes.Base_Squad;
import com.company.Base_classes.Soldier;
import com.company.Soldiers.Melee_Soldiers.Spearman;
import com.company.Soldiers.Melee_Soldiers.Swordsman;
import com.company.Soldiers.Ranged_Soldiers.Bowman;
import com.company.Soldiers.Ranged_Soldiers.Crossbow_man;


import java.util.ArrayList;

public class French_Squad extends Base_Squad {

    public French_Squad() {
        super("French", 8, 0, new ArrayList<Soldier>());
        this.Add_Soldier(new Spearman("French_Spearman"));
        this.Add_Soldier(new Swordsman("French_Swordsman"));
        this.Add_Soldier(new Bowman("French_Bowman"));
        this.Add_Soldier(new Crossbow_man("French_Crossbow_man"));
        this.Add_Soldier(new Spearman("French_Spearman_2"));
        this.Add_Soldier(new Swordsman("French_Swordsman_2"));
        this.Add_Soldier(new Bowman("French_Bowman_2"));
        this.Add_Soldier(new Crossbow_man("French_Crossbow_man_2"));
        this.commander_index = 5;
    }

    public String Quick_Surrender(){
        return "Special French Ability activated: Quick Surrender and run from battle";
    }

}
