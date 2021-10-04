package com.sgk.jdp.abstractfactory;

public class GerMediumTankImpl implements MediumTank {
    static final String DESCRIPTION = "German medium tank";
    static final int ARMOUR_THICKNESS = 25;

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public int getArmourThickness()
    {
        return ARMOUR_THICKNESS;
    }
}
