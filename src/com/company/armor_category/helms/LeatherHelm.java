package com.company.armor_category.helms;

import com.company.armor_category.helms.base.BaseHelm;
import com.company.base.armors.ArmorBodypart;
import com.company.base.armors.materials.Material;
import com.company.base.armors.materials.MaterialQuality;

public class LeatherHelm extends BaseHelm {
    public LeatherHelm() {
        super(ArmorBodypart.HEAD, new Material(MaterialQuality.LEATHER,15,1.2, 100));
    }

    @Override
    public String toString() {
        return "Helm, it protects the head, it's " + material.toString();
    }
}

