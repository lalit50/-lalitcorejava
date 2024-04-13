package ClassComponents;

public class InstanceVariablesDemo1 {
    int a = 1220;
    static int b = 200;

    public static void main(String[] args) {
        InstanceVariablesDemo1 ref = new InstanceVariablesDemo1();
        System.out.println(ref.a);
        System.out.println( InstanceVariablesDemo1.b); //static variable accessed With class name in the same classs
        System.out.println(b); //Static variabale accessed directly without class name in the same class
        System.out.println(ref.b); //Static variabale accessed directly With ref. --> it will be replaced with class name


    }
}
