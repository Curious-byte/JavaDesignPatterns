package com.sgk.jdp.abstractfactory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Army {
    private LightTank lightTank;
    private MediumTank mediumTank;
    private HeavyTank heavyTank;

    /**
     * Army factory uses concrete tank factories.
     */
    public static class FactoryMaker {
        public enum Country {
            RU, GER
        }

        /**
         * The factory method to create concrete tank objects.
         */
        public static TankFactory makeFactory(Country country) {
            switch (country) {
                case RU:
                    return new RuTankFactoryImpl();
                case GER:
                    return new GerTankFactoryImpl();
                default:
                    throw new IllegalArgumentException("Country not supported");
            }
        }
    }
}
