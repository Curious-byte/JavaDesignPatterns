package com.sgk.jdp.abstractfactory;

public class RuHeavyTankImpl implements HeavyTank {
    static final String DESCRIPTION = "Russian heavy tank";
    static final int ARMOUR_THICKNESS = 40;

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public int getArmourThickness() {
        return ARMOUR_THICKNESS;
    }
}
