package com.sgk.jdp.builder;

public class TwoTurretsTankBuilder extends Builder {
    public TwoTurretsTankBuilder() {
        tank = new Tank();
    }

    public Tank buildTank() {
        tank.makeHull();
        tank.makeEngine();
        tank.makeGun();

        ITurret turret = new TurretOne();
        tank.makeTurret(turret);

        turret = new TurretTwo();
        tank.makeTurret(turret);

        return tank;
    }
}
