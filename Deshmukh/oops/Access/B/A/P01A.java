package oops.Access.B.A;

public class P01A {
     public int a = 200;
  private   int b = 300;
    protected int c = 500;
    int d = 600;

    public static void main(String[] args) {
        int totol =0;
        P01A  p01ARef =new P01A();
        System.out.println(p01ARef.a);
        System.out.println(p01ARef.b);
        System.out.println(p01ARef.c);
        System.out.println(p01ARef.d);
    }
}
