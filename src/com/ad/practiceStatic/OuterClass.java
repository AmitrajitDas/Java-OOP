package com.ad.practiceStatic;

public class OuterClass {

    static class InnerClass {
        static String name;
        //        String name;
        static int a = 4;
        static int b;

        InnerClass(String name) {
            this.name = name;
        }

        static {
            b = a * 6;
            System.out.println("static block");
        }
    }

    public static void main(String[] args) {
        InnerClass a = new InnerClass("Amitrajit");
        InnerClass b = new InnerClass("Anish");

        System.out.println(InnerClass.name);
        System.out.println(InnerClass.name);
        System.out.println(InnerClass.a);
        System.out.println(InnerClass.b);
        System.out.println(InnerClass.b);

//        System.out.println(a.name);
//        System.out.println(b.name);
    }

}
