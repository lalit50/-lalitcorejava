package oops.Inheritance.scenario3_PrCo.Case2_OnlyCh;

public class Child extends Parent {
    int a = 1000;
    void m1(){
        System.out.println("Child class m1 method");
    }

    public static void main(String[] args) {
        Parent parentRef =new Child();


//        System.out.println("\n ParentRef varibale  a ----  "+parentRef.a);//Parent: 100
//        parentRef.m1();// Parent m1()
        System.out.println("\n\n parentRef   can not access child variables and methods");
    }
}