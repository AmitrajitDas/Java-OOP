package com.ad.interfaces;

interface In1 {

    // public, static and final
    final int a = 10;

    // public and abstract
    void display();
}

class Main implements In1 {
    public void display() {
        System.out.println("Geek");
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.display();
        System.out.println(a);
    }
}

