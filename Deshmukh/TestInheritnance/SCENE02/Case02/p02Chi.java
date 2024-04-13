package TestInheritnance.SCENE02.Case02;

public class p02Chi extends p02Par {
    int MarksSci = 91;

    void chiMethod() {
        System.out.println("\t\t\t\t Method in Child");
    }

    public static void main(String[] args) {
        p02Chi p02ChiRef = new p02Chi();
        System.out.println("\n\n\t\t child Ref child Obj");
        System.out.println("\t\t\t\t Marks Sci " + p02ChiRef.MarksSci);

        System.out.print("\n\t\t\t\t call Method ---- " );
        p02ChiRef.chiMethod();


    }
}
