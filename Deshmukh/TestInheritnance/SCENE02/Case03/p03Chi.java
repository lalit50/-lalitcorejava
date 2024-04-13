package TestInheritnance.SCENE02.Case03;

public class p03Chi extends p03Par {
    int MarksLang = 79;
    void BothMethod() {
        System.out.println("\t\t\t\t Method in Child");
    }


    public static void main(String[] args) {
        p03Chi p03ChiRef = new p03Chi();
        System.out.println("\n\n\t\t child Ref child Obj");
        System.out.println("\t\t\t\t Marks Sci " + p03ChiRef.MarksLang);

        System.out.print("\n\t\t\t\t call Method ---- " );
        p03ChiRef.BothMethod();





    }
}
