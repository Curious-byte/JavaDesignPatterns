package com.sgk.jdp.abstractfactory;

public class RuMediumTankImpl implements MediumTank {
    static final String DESCRIPTION = "Russian medium tank";
    static final int ARMOUR_THICKNESS = 20;

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public int getArmourThickness() {
        return ARMOUR_THICKNESS;
    }
}
