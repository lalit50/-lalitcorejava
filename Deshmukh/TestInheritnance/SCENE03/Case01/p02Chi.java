package TestInheritnance.SCENE03.Case01;

public class p02Chi extends p02Par {
    int bookpages = 688;

    void Bookcolor() {
        System.out.println("\t\t\t\t Book color is pink");
    }

    public static void main(String[] args) {
        p02Par p02ParRef = new p02Chi();
//        p02Chi p02ChiRef =new p02Par();
        System.out.println("\t\t\t\t parent Ref child Obj");
        System.out.println("\t\t\t\t book Pages" + p02ParRef.Bookpages);

        System.out.println("\t\t\t\t What is the color is ");
        p02ParRef.Bookcolor();


    }
}
