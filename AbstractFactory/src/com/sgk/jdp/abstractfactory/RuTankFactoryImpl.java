package com.sgk.jdp.abstractfactory;

public class RuTankFactoryImpl implements TankFactory {
    public LightTank createLightTank() {
        return new RuLightTankImpl();
    }

    public MediumTank createMediumTank() {
        return new RuMediumTankImpl();
    }

    public HeavyTank createHeavyTank() {
        return new RuHeavyTankImpl();
    }
}
