package ClassComponents;


public class HelloWorld {
    int m; //instace variable
    int n; //instace variable

    {
        int a = 10;
        System.out.println("instance block");
    }

     void Static() {
        int b = 100;
        System.out.println("static block");

    }

    HelloWorld() {
        int c = 1000;
    }

    public static void main(String[] args) {
        //local variable :a variable which is created
        // inside the method, insdie the constructon
        int a = 10000;
        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
    }
}
