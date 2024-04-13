package oops.Polymorphism.MethidOverloading;

public class Child extends parent {
//        method aveloading and not method overriding
static void display(int a){
        System.out.println("child class display method");
    }

    public static void main(String[] args) {
        Child child = new Child();
        Child. display();
        Child.display(10);

    }
}
