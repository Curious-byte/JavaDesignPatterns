package com.sgk.jdp.prototype;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Tank tankPrototype = new Tank();
        log.info("tank prototype, type = {}", tankPrototype.getType() != null ? tankPrototype.getType().toString() : "null");

        Tank lightTank = tankPrototype.copy();
        lightTank.setType(TankType.LIGHT);
        log.info("light tank, type = {}", lightTank.getType().toString());

        Tank mediumTank = tankPrototype.copy();
        mediumTank.setType(TankType.MEDIUM);
        log.info("medium tank, type = {}", mediumTank.getType().toString());

        Tank heavyTank = tankPrototype.copy();
        heavyTank.setType(TankType.HEAVY);
        log.info("heavy tank, type = {}", heavyTank.getType().toString());
    }
}
