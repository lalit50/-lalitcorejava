package TestInheritnance.SCENE01.Case02;

public class p02Chi extends p02Par {
    int MarksHindi = 77;

    void MethedHindi() {
        System.out.println("\t\t\t\t  You are top this Sub");
    }

    public static void main(String[] args) {
        p02Par p02ParRef = new p02Par();
        System.out.println("\t\t\t\t  Parent Ref parent Obj");

//        System.out.println("\t\t\t\t Marks of Hindi =" + p02ParRef.MarksHindi);


        System.out.println("\t\t\t\t Call the Metho ----");
//        p02ParRef.MethedHindi();
        System.out.println("\t\t\t parent cant not call child object");
    }

}
