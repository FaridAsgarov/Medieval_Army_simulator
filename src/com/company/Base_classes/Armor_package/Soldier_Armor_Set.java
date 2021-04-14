package com.company.Base_classes.Armor_package;

import com.company.Armor_category.Arms.Base.Base_Armguards;
import com.company.Armor_category.Helms.Base.Base_Helm;
import com.company.Armor_category.Legs.Base.Base_LegGuards;
import com.company.Armor_category.Torso.Base.Base_bodyArmor;

public class Soldier_Armor_Set {
    protected Base_Helm head_armor_piece;
    protected Base_Armguards arms_armor_piece;
    protected Base_LegGuards legs_armor_piece;
    protected Base_bodyArmor torso_armor_piece;

    @Override
    public String toString() {
        return this.head_armor_piece.toString() + ",\n" + this.arms_armor_piece.toString() + ",\n" +
                this.legs_armor_piece.toString() + ",\n" + this.torso_armor_piece;
    }

    public Base_Helm getHead_armor_piece() {
        return this.head_armor_piece;
    }

    public Base_Armguards getArms_armor_piece() {
        return this.arms_armor_piece;
    }

    public Base_LegGuards getLegs_armor_piece() {
        return this.legs_armor_piece;
    }

    public Base_bodyArmor getTorso_armor_piece() {
        return this.torso_armor_piece;
    }

    public void initializeInstance(Base_Helm head_armor_piece, Base_Armguards arms_armor_piece,
            Base_LegGuards legs_armor_piece, Base_bodyArmor torso_armor_piece) {
        this.head_armor_piece = head_armor_piece;
        this.arms_armor_piece = arms_armor_piece;
        this.legs_armor_piece = legs_armor_piece;
        this.torso_armor_piece = torso_armor_piece;

        if (head_armor_piece == null) {
            if ((head_armor_piece instanceof Base_Helm) == false) {
                throw new java.lang.UnsupportedOperationException("Head armor piece can not be null");
            }
        }

        if (arms_armor_piece == null) {
            if ((arms_armor_piece instanceof Base_Armguards) == false) {
                throw new java.lang.UnsupportedOperationException("Arms armor piece can not be null");
            }
        }

        if (legs_armor_piece == null) {
            if ((legs_armor_piece instanceof Base_LegGuards) == false) {
                throw new java.lang.UnsupportedOperationException("Legs armor piece can not be null");
            }
        }

        if (torso_armor_piece == null) {
            if ((torso_armor_piece instanceof Base_bodyArmor) == false) {
                throw new java.lang.UnsupportedOperationException("Torso armor piece can not be null");
            }
        }

    }
}
