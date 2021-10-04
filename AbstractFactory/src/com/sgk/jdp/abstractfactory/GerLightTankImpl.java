package com.sgk.jdp.abstractfactory;

public class GerLightTankImpl implements LightTank {
    static final String DESCRIPTION = "German light tank";
    static final int ARMOUR_THICKNESS = 5;

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
