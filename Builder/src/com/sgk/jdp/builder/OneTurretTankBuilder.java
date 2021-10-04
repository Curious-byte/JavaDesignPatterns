package com.sgk.jdp.builder;

public class OneTurretTankBuilder extends Builder {
    public OneTurretTankBuilder() {
        tank = new Tank();
    }

    public Tank buildTank() {
        tank.makeHull();
        tank.makeEngine();
        tank.makeGun();

        ITurret turret = new TurretOne();
        tank.makeTurret(turret);

        return tank;
    }
}
