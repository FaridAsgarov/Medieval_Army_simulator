package com.company.armor_category.helms;

import com.company.armor_category.helms.base.BaseHelm;
import com.company.base.armors.ArmorBodypart;
import com.company.base.armors.materials.Material;
import com.company.base.armors.materials.MaterialQuality;

public class PlateHelm extends BaseHelm {
    public PlateHelm() {
        super(ArmorBodypart.HEAD,
                new Material(MaterialQuality.PLATE,40,2.0, 100));

    }

    @Override
    public String toString() {
        return "Helm, it protects the head, it's " + material.toString();
    }
}