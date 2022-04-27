package com.ad.practiceStatic;

public class OuterClass {

    static class InnerClass {
        static String name;
//        String name;
        InnerClass(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        InnerClass a = new InnerClass("Amitrajit");
        InnerClass b = new InnerClass("Anish");

        System.out.println(InnerClass.name);
        System.out.println(InnerClass.name);

//        System.out.println(a.name);
//        System.out.println(b.name);
    }

}
