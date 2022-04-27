package com.ad.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Singleton Class");
        Singleton a = Singleton.getInstance();
        System.out.println(a.x);
        Singleton b = Singleton.getInstance();
        System.out.println(b.x);
        Singleton c = Singleton.getInstance();
        System.out.println(c.x);
        System.out.println("Static Block");
        Static p = new Static();
        System.out.println(p.x);
        Static q = new Static();
        System.out.println(q.x);
        Static r = new Static();
        System.out.println(r.x);
    }
}
