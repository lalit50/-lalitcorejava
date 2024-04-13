 package oops.Inheritance.constructorChaining;

public class Aparent {
    Aparent() {
        //1. constructor call of same class or super class
        //2. instance block of same class A
        System.out.println("A class constructor");
    }

    {
        System.out.println("A class instance block");
    }

    static {
        System.out.println("A class static block");
    }
}