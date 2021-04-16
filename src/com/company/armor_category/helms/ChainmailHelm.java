package com.company.armor_category.helms;

import com.company.armor_category.helms.base.BaseHelm;
import com.company.base.armors.ArmorBodypart;
import com.company.base.armors.materials.Material;
import com.company.base.armors.materials.MaterialQuality;


public class ChainmailHelm extends BaseHelm {
    public ChainmailHelm() {
        super(ArmorBodypart.HEAD, new Material(MaterialQuality.CHAINMAIL,25,1.5, 100));

    }

    @Override
    public String toString() {
        return "Helm, protects the head, it's " + material.toString();
    }
}
