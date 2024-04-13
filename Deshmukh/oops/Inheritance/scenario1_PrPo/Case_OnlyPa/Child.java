package oops.Inheritance.scenario1_PrPo.Case_OnlyPa;


public class Child extends Parent {

    public static void main(String[] args) {
       Parent parent = new Parent();
        System.out.println("\n ParentRef varibale  a ----  "+parent.a);//Parent: 100
        parent.m1();// Parent m1()
    }
}