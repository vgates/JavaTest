package com.smredlabs.genexample;

public class Parentclass {
    void m1() {
        System.out.println("Superclass m1 method");
    }

    private static void m2() {
        System.out.println("Superclass m2 method");
    }
}

class Childclass extends Parentclass {
    void m1() {
        System.out.println("Chilclass m1 method");
    }

    static void m2() {
        System.out.println("Childclass m2 method");
    }
}

class Test {
    public static void main(String[] args) {
        // Creating an object of superclass.
        Parentclass p = new Parentclass();
        p.m1(); // Here, subclass members are not available to superclass.
        // So, we cannot access them using superclass reference variable.

        Childclass c = new Childclass();
        c.m1();

        Childclass.m2();
    }
}