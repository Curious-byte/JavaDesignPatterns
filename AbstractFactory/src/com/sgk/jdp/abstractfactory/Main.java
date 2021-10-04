package com.sgk.jdp.abstractfactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    private static final Army army = new Army();

    public static void createArmy(final Army.FactoryMaker.Country country) {
        final TankFactory tankFactory = Army.FactoryMaker.makeFactory(country);
        army.setLightTank(tankFactory.createLightTank());
        army.setMediumTank(tankFactory.createMediumTank());
        army.setHeavyTank(tankFactory.createHeavyTank());
    }

    public static void main(String[] args) {
        createArmy(Army.FactoryMaker.Country.RU);
        log.info(army.getLightTank().getDescription() + " has armour thickness: " + army.getLightTank().getArmourThickness());
        log.info(army.getMediumTank().getDescription() + " has armour thickness: " + army.getMediumTank().getArmourThickness());
        log.info(army.getHeavyTank().getDescription() + " has armour thickness: " + army.getHeavyTank().getArmourThickness() + "\n");

        createArmy(Army.FactoryMaker.Country.GER);
        log.info(army.getLightTank().getDescription() + " has armour thickness: " + army.getLightTank().getArmourThickness());
        log.info(army.getMediumTank().getDescription() + " has armour thickness: " + army.getMediumTank().getArmourThickness());
        log.info(army.getHeavyTank().getDescription() + " has armour thickness: " + army.getHeavyTank().getArmourThickness());
    }
}
