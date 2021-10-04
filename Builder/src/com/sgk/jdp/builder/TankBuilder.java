package com.sgk.jdp.builder;

public class TankBuilder {
    private Builder builder;

    public TankBuilder(int amountOfTurrets) {
        switch (amountOfTurrets) {
            case 1 :
                builder = new OneTurretTankBuilder();
                return;
            case 2 :
                builder = new TwoTurretsTankBuilder();
                return;
            default:
                throw new IllegalArgumentException("Illegal amount of tank turrets");
        }
    }

    public Tank buildTank() {
        return builder.buildTank();
    }
}
