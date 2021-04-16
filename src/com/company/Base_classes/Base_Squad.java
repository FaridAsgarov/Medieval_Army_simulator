package com.company.Base_classes;

import java.util.ArrayList;

public class Base_Squad {
    protected String squad_name;
    protected int max_num_soldiers;
    protected int commander_index;

    ArrayList<Soldier> squad;

    public Base_Squad(String squad_name, int max_num_soldiers, int commander_index, ArrayList<Soldier> squad) {
        this.squad_name = squad_name;
        this.max_num_soldiers = max_num_soldiers;
        this.commander_index = commander_index;
        this.squad = squad;
    }

    protected void Add_Soldier(Soldier soldier) {
        if (squad.size() + 1 <= max_num_soldiers) {
            squad.add(soldier);
        }
    }

    protected void Delete_Soldier(int index) {
        if (index > 0 && index < squad.size()) {
            squad.remove(index);
        }
    }

    @Override
    public String toString() {
        String result = " ";
        for (Soldier soldier : squad) {
            result += soldier.toString() + "\n";
        }
        return result;
    }


    public String Squad_attack() {
        String b = " ";
        for (Soldier soldier : squad) {
            b += soldier.attack() + "\n";
        }
        return b;
    }

    public String Squad_defend() {
        String b = " ";
        for (Soldier soldier : squad) {
            b += soldier.defend() + "\n";
        }
        return b;
    }

//    public int Squad_reload_ranged_weapons() {
//        int reload_time = 0;
//        int max_reload_time = 0;
//        for (Soldier soldier : squad) {
//            if (soldier instanceof Ranged_Soldier) {
//                reload_time = ((Ranged_Soldier) soldier).reload();
//                if (reload_time > max_reload_time) {
//                    max_reload_time = reload_time;
//                }
//            }
//        }
//        return max_reload_time;
//    }

    public String Squad_Raise_Shields() {
        String soldiers_with_shields = " ";
        for (Soldier soldier : squad) {
            if (soldier.shield != null) {
                soldiers_with_shields += soldier.name + ", ";
            }
        }
        return soldiers_with_shields + " raised their shields!";
    }
}