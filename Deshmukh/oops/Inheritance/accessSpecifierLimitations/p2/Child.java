package oops.Inheritance.accessSpecifierLimitations.p2;
import oops.Inheritance.accessSpecifierLimitations.p1.Parent;

public class Child extends Parent {
    void display() {
        // System.out.println(a);//private
        System.out.println(b);//public
        System.out.println(c);//protected
        //System.out.println(d);//default
    }

    public static void main(String[] args) {
        Parent parent = new Child();
        System.out.println(parent instanceof Child);//true
        System.out.println(parent instanceof Parent);//true

        perent2 perent2 = new perent2();
        Chaild2 chaild2 = new Chaild2();
        GrandChild2 grandChild2 = new GrandChild2();

        System.out.println(perent2 instanceof perent2); //true
        System.out.println(chaild2 instanceof perent2); //true
        System.out.println(chaild2 instanceof Chaild2); //true
        System.out.println(grandChild2 instanceof perent2); //true
        System.out.println(grandChild2 instanceof Chaild2); //true
        System.out.println(grandChild2 instanceof GrandChild2); //true
    }
}
class perent2 {}
class Chaild2 extends perent2 {}
class GrandChild2 extends Chaild2 {}