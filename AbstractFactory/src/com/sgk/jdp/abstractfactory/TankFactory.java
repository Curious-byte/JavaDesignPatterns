package com.sgk.jdp.abstractfactory;

public interface TankFactory {
    LightTank createLightTank();
    MediumTank createMediumTank();
    HeavyTank createHeavyTank();
}
