package TestInheritnance.SCENE01.Case03;

public class p03Chi extends p03Par {
    int MarksMACIT = 99;

    void Methed() {
        System.out.println("\t\t\t\t  this is your Marks");
    }

    public static void main(String[] args) {
        System.out.println("\t\t\t\t  Parent Ref parent Obj");
        p03Par p03ParRef = new p03Par();
        System.out.println("\t\t\t\t Marks MACIT =" + p03ParRef.MarksMACIT);

        System.out.println("\t\t\t\t Methed is == ");
        p03ParRef.parMethod();
    }
}
