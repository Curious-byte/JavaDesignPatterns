package com.sgk.jdp.abstractfactory;

public class GerHeavyTankImpl implements HeavyTank {
    static final String DESCRIPTION = "German heavy tank";
    static final int ARMOUR_THICKNESS = 50;

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
