package com.sgk.jdp.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Tank {
    public void makeHull() {
        log.info("make tank hull");
    }

    public void makeEngine() {
        log.info("make tank engine");
    }

    public void makeTurret(ITurret turret) {
        log.info("make tank turret - {}", turret.getTurretType());
    }

    public void makeGun() {
        log.info("make tank gun");
    }
}
