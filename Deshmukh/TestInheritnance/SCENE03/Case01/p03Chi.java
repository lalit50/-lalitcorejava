package TestInheritnance.SCENE03.Case01;

public class p03Chi extends p03Pra{
    int BookSize= 438;
    void Bookpink(){
        System.out.print("\t\t\t\t this Book very good");
    }

    public static void main(String[] args) {
        p03Pra p03PraRef =new p03Chi();
        System.out.println("\t\t\t\t parent Ref child Obj");
        System.out.println("\n\n\t\t\t\t what is the Size of Book = "+p03PraRef.BookSize);


        System.out.print("\t\t\t\t book Ref --");
        p03PraRef.Bookpink();

    }
}
