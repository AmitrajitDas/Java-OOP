package com.ad.singleton;

public class Static {
    int x = 5;

    Static() {
        this.x += 1;
    }

    static {
        Static instance = new Static();
    }
}
