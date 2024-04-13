package oops.Inheritance.scenario3_PrCo.Case3_Borh;

public class Child extends Parent {
    int a = 100;
    void m1(){
        System.out.println("Child class m1 method");
    }

    public static void main(String[] args) {
        Parent parentRef =new Child();
        System.out.println("\n  Parent parentRef =new Child(); ");

        System.out.println("\n  Money in hand ----  "+parentRef.a);//Parent: 100
        parentRef.m1();// Parent m1()
    }
}