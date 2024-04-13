package ClassComponents;

public class A {
    class B {}//nested class- inner class or non- static nested class

    static class c {}//static nested clss

    public static void main(String[] args) {
        //local inner class
        class D {
            int a =100;
        }
        D d= new D();
        System.out.println(d.a);
    }

    A() {
        class D {
        }//local inneer class
    }

    {
        class D {
        }//locla inner class
    }
}
