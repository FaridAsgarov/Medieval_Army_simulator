package com.company.base;

import java.util.ArrayList;

public class BaseSquad {
    protected String squad_name;
    protected int max_num_soldiers;
    protected int commander_index;

    protected ArrayList<Soldier> squad;



    public BaseSquad(String squad_name, int max_num_soldiers, int commander_index, ArrayList<Soldier> squad) {
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
        String result = "";
        for (Soldier soldier : squad) {
            result += soldier.toString() + "\n";
        }
        return result;
    }

    public void RemoveTheDead(){
        for (int i=0; i<squad.size(); i++) {
            if(squad.get(i).getAliveStatus() == false) {
                squad.remove(squad.get(i));
            }
        }
    }

    public int Num_of_alive_soldiers(){
        int numOfAliveSoldiers = squad.size();
            for (Soldier soldier : squad) {
                if(soldier.getAliveStatus() == false){
                    numOfAliveSoldiers--;
                }
            }
        return numOfAliveSoldiers;
    }

    public Soldier Return_soldier_by_index(int soldierIndex){
        if(soldierIndex >= 0 && soldierIndex < squad.size()){
            return squad.get(soldierIndex);
        }
        return null;
    }


    public String Squad_attack_another_squad(BaseSquad enemySquad) {
        String tmp = "";

        for(int i=0; i<enemySquad.Num_of_alive_soldiers(); i++){
            tmp +=  Return_soldier_by_index(i).attack(enemySquad.Return_soldier_by_index(i)) + "\n";
        }

        return tmp;
    }

    public String Squad_attack_one_enemy(Soldier enemy){
        String tmp = "";

        for(Soldier soldier: squad){
            if(enemy.currentHP > 0){
               tmp += soldier.attack(enemy) + "\n";
            }
            else {
                break;
            }
        }

        return tmp;
    }

    public String Squad_defend() {
        String b = " ";
        for (Soldier soldier : squad) {
            b += soldier.defend() + "\n";
        }
        return b;
    }

    public String Squad_reload_ranged_weapons(){
        String tmp = "";
        for (Soldier soldier : squad) {
            if (soldier instanceof RangedSoldier) {
                tmp += ((RangedSoldier)soldier).reload() + "\n";
            }
        }
            if(tmp == ""){
                tmp = "Nothing to reload because there are no Ranged Soldier in the squad";
            }
            return tmp;
    }

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