package oops.Inheritance.scenario2_CrCo.Case3_Borh;

public class Child extends Parent {
    int a = 100;
    void m1(){
        System.out.println("Child class m1 method");
    }

    public static void main(String[] args) {
        Child childRef =new Child();

        System.out.println("\n childRef verbale  a ----  "+childRef.a);//Parent: 100
        childRef.m1();// Parent m1()
    }
}