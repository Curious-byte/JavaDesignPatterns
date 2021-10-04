package com.sgk.jdp.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        SingleTank tank1 = SingleTank.getInstance("tank", 1);
        log.info("Requested tank1 and got {}{}", tank1.name, tank1.number);
        log.info("tank1 object reference = {}", tank1);

        SingleTank tank2 = SingleTank.getInstance("tank", 2);
        log.info("Requested tank2 but got {}{}", tank2.name, tank2.number);
        log.info("tank2 object reference = {}", tank2);

        SingleTank tank3 = SingleTank.getInstance("Sherman", 23);
        log.info("Requested Sherman23 but got {}{}", tank3.name, tank3.number);
        log.info("tank3 object reference = {}", tank3);
    }
}
