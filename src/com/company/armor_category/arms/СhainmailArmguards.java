package com.company.armor_category.arms;

import com.company.armor_category.arms.base.BaseArmguards;
import com.company.base.armors.ArmorBodypart;
import com.company.base.armors.materials.Material;
import com.company.base.armors.materials.MaterialQuality;


public class –°hainmailArmguards extends BaseArmguards {
    public –°hainmailArmguards() {
        super(ArmorBodypart.ARMS,
                new Material(MaterialQuality.CHAINMAIL,20,1.5, 100));
    }

    @Override
    public String toString() {
        return "Armguards, they protect the arms, they're " + material.toString();
    }
}

