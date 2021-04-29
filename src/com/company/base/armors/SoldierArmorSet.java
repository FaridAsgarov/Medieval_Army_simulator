package com.company.base.armors;

import com.company.armor_category.arms.base.BaseArmguards;
import com.company.armor_category.helms.base.BaseHelm;
import com.company.armor_category.legs.base.BaseLegGuards;
import com.company.armor_category.torso.base.BaseBodyArmor;

public class SoldierArmorSet {
    protected BaseHelm head_armor_piece;
    protected BaseArmguards arms_armor_piece;
    protected BaseLegGuards legs_armor_piece;
    protected BaseBodyArmor torso_armor_piece;

    @Override
    public String toString() {
        return this.head_armor_piece.toString() + ",\n" + this.arms_armor_piece.toString() + ",\n" +
                this.legs_armor_piece.toString() + ",\n" + this.torso_armor_piece;
    }

    public BaseHelm getHead_armor_piece() {
        return this.head_armor_piece;
    }

    public BaseArmguards getArms_armor_piece() {
        return this.arms_armor_piece;
    }

    public BaseLegGuards getLegs_armor_piece() {
        return this.legs_armor_piece;
    }

    public BaseBodyArmor getTorso_armor_piece() {
        return this.torso_armor_piece;
    }

    public int TotalArmorPoints(){
       return this.arms_armor_piece.material.getMaterialHP() + this.legs_armor_piece.material.getMaterialHP()
                + this.head_armor_piece.material.getMaterialHP() + this.torso_armor_piece.material.getMaterialHP();
    }

    public Object initializeInstance(BaseHelm head_armor_piece, BaseArmguards arms_armor_piece,
                                     BaseLegGuards legs_armor_piece, BaseBodyArmor torso_armor_piece) {
        this.head_armor_piece = head_armor_piece;
        this.arms_armor_piece = arms_armor_piece;
        this.legs_armor_piece = legs_armor_piece;
        this.torso_armor_piece = torso_armor_piece;

        if (head_armor_piece == null) {
            if ((head_armor_piece instanceof BaseHelm) == false) {
                throw new java.lang.UnsupportedOperationException("Head armor piece can not be null");
            }
        }

        if (arms_armor_piece == null) {
            if ((arms_armor_piece instanceof BaseArmguards) == false) {
                throw new java.lang.UnsupportedOperationException("Arms armor piece can not be null");
            }
        }

        if (legs_armor_piece == null) {
            if ((legs_armor_piece instanceof BaseLegGuards) == false) {
                throw new java.lang.UnsupportedOperationException("Legs armor piece can not be null");
            }
        }

        if (torso_armor_piece == null) {
            if ((torso_armor_piece instanceof BaseBodyArmor) == false) {
                throw new java.lang.UnsupportedOperationException("Torso armor piece can not be null");
            }
        }

        return null;
    }
}
