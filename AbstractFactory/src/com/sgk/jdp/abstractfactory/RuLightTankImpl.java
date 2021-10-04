package com.sgk.jdp.abstractfactory;

public class RuLightTankImpl implements LightTank {
    static final String DESCRIPTION = "Russian light tank";
    static final int ARMOUR_THICKNESS = 10;

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
