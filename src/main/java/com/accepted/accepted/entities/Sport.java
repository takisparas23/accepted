package com.accepted.accepted.entities;

import lombok.Getter;


@Getter
public enum Sport {
    FOOTBALL(1),
    BASKETBALL(2);

    private final int value;

    Sport(int value) {
        this.value = value;
    }

}
