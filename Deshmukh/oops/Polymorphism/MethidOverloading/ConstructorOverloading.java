package oops.Polymorphism.MethidOverloading;

public class ConstructorOverloading {
    int a;
    int b;
    int c;
    public ConstructorOverloading(){

    }

//    public ConstructorOverloading(int a, int b, int c) {
//        this.a = a;
//        this.b = b;
//        this.c = c;
//    }

    public ConstructorOverloading(int a) {
        this.a = a;
    }

    public ConstructorOverloading(int a,int b) {
        this.a = a;
        this.b = b;
    }

    public ConstructorOverloading(int a,int b,int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        ConstructorOverloading Ref1 = new ConstructorOverloading();
        ConstructorOverloading Ref2 = new ConstructorOverloading(77);
        ConstructorOverloading Ref3 = new ConstructorOverloading(44,83);
        ConstructorOverloading Ref4 = new ConstructorOverloading(87,86,75);
    }


}
