package ClassComponents;

public class InstanceVariables {
    //outside of all methods, constructors,blacks
    int a = 100;// instance variables
    int b = 200; // instance variable

    static int c = 300; //Statice variable
    static int d = 400; //statice variable

    public static void main(String[] args) {
        int a = 1000;
        int b = 2000;
        int c = 3000;
        int d = 4000;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


        InstanceVariables ref = new InstanceVariables();
        System.out.println("refarce variable = instance variable");
        System.out.println(ref.a);//100
        System.out.println(ref.b);//200

        System.out.println("refarce variable = Statice variable");
        System.out.println(InstanceVariables.c);
        System.out.println(InstanceVariables.d);
    }
}
