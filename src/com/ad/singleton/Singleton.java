package com.ad.singleton;

public class Singleton {
    int x = 5;

    private Singleton() {
        this.x += 1;
    }

    private static Singleton instance;

    static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
