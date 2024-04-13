package oops.Inheritance.scenario2_CrCo.Case1_OnlyPa;


public class Child extends Parent {

    public static void main(String[] args) {
        Child childRef =new Child();
        System.out.println("\n Child Ref varibale  a ----  "+childRef.a);//Parent: 100
        childRef.m1();// Parent m1()
    }
}