package com.ad.practiceStatic;

public class Static2 {

    String name;
    int age;
    static int population;

    Static2(String name, int age) {
        this.name = name;
        this.age = age;
        Static2.population += 1;
    }

    Static2() {
        System.out.println("LOL");
    }

    void fun() {
       fun2(); // possible because fun2 is static method, no need to create an instance to access it
    }

    static void fun2() {
        // fun();
        // not applicable because outer function is static
        Static2 st = new Static2();
        st.fun();
    }

    public static void main(String[] args) {
        Static2 a = new Static2("Amitrajit", 21);
        Static2 b = new Static2("Anish", 21);

        System.out.println(a.population);
    }

}
