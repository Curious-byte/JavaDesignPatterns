package com.sgk.jdp.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        log.info("Building tank with one turret...");
        buildTank(1);

        log.info("Building tank with two turrets...");
        buildTank(2);

        // throws exception
        // buildTank(3);
    }

    private static void buildTank(int i) {
        TankBuilder builder = new TankBuilder(i);
        builder.buildTank();
    }
}
