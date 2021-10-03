package com.sgk.jdp.singleton;

public class SingleTank {
    private static SingleTank instance;
    public String name;
    public int number;

    private SingleTank(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public static SingleTank getInstance(String name, int number) {
        if (instance == null) {
            instance = new SingleTank(name, number);
        }
        return instance;
    }
}
