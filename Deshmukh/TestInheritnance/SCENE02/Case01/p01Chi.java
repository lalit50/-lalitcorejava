package TestInheritnance.SCENE02.Case01;

public class p01Chi extends p01Par {
    public static void main(String[] args) {
        p01Chi p01ChiRef = new p01Chi();
        System.out.println("\n\n\t\t child Ref child Obj");
        System.out.println("\t\t\t\t Marks maths " + p01ChiRef.MarksMaths);


        System.out.print("\n\t\t\t\t call Method ---- " );
        p01ChiRef.parMethod();

    }

}
