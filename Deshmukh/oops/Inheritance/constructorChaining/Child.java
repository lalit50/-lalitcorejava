package oops.Inheritance.constructorChaining;

public class Child extends Parent{
    Child(){
        this(100);
      //  super();
        System.out.println("Zero param con of Child class");
    }
    Child(int abcvd){
       // super();
        System.out.println("one param con of Child class");
    }

    public static void main(String[] args) {
        Child child = new Child();
    }
}