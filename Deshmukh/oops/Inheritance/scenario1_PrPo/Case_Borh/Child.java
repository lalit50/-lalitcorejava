package oops.Inheritance.scenario1_PrPo.Case_Borh;

public class Child extends  Parent{
    int a = 1000;
    void m1(){
        System.out.println("Child class m1 method");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("\n ParentRef varibale  a ----  "+parent.a);//Parent: 100
        parent.m1();// Parent m1()
    }
}