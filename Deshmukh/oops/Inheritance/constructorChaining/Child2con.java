package oops.Inheritance.constructorChaining;

public class Child2con extends Parent{
    Child2con(){
        this(100);
      //  super();
        System.out.println("Zero param con of Child class");
    }
    Child2con(int abcvd){
       // super();
        System.out.println("one param con of Child class");
    }

    public static void main(String[] args) {
        Child2con child = new Child2con();
    }
}