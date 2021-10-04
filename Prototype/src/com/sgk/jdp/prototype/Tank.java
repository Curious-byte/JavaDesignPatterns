package com.sgk.jdp.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tank implements Copyable {
    private TankType type;

    public Tank copy() {
        return new Tank();
    }
}
