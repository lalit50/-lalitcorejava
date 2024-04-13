package oops.Inheritance.scenario3_PrCo.Case1_OnlyPa;


public class Child extends Parent {

    public static void main(String[] args) {
        Parent parentRef =new Child();
        System.out.println("\n child Ref varibale  a ----  "+parentRef.a);//Parent: 100
        parentRef.m1();// Parent m1()
    }
}