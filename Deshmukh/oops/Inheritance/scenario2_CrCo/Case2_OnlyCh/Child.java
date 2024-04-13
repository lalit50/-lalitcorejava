package oops.Inheritance.scenario2_CrCo.Case2_OnlyCh;

import java.util.concurrent.Callable;

public class Child extends Parent {
    int a = 1000;
    void m1(){
        System.out.println("Child class m1 method");
    }

    public static void main(String[] args) {
        Child childRef =new Child();


        System.out.println("\n ParentRef varibale  a ----  "+childRef.a);//Parent: 100
        childRef.m1();// Parent m1()
        System.out.println("\n\n parent object  can not access child variables and methods");
    }
}