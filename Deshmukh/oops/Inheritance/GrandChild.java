package oops.Inheritance;

public class GrandChild extends Child{
    public static void main(String[] args) {
        GrandChild grandChild = new GrandChild();
        System.out.println(grandChild.a);
        System.out.println(grandChild.b);
        System.out.println(grandChild.c);

        grandChild.display();
    }
}