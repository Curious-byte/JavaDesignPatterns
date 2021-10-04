package com.sgk.jdp.abstractfactory;

public class GerTankFactoryImpl implements TankFactory {
    public LightTank createLightTank() {
        return new GerLightTankImpl();
    }

    public MediumTank createMediumTank() {
        return new GerMediumTankImpl();
    }

    public HeavyTank createHeavyTank() {
        return new GerHeavyTankImpl();
    }
}
