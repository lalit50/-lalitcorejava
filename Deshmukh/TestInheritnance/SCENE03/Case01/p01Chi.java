package TestInheritnance.SCENE03.Case01;

public class p01Chi extends p01Par {
    int BookPrice = 300;

    void bookName() {
        System.out.println("\t\t\t\t Im Taking out the clothes from the washing machine");
    }

    public static void main(String[] args) {
        p01Par p01ParRef = new p01Chi();
        System.out.println("\t\t\t\t parent Ref  child Obj");
        System.out.println("\t\t\t\t Book Price =" + p01ParRef.BookPrice);


        System.out.println("\t\t\t\t what is book Name ");
        p01ParRef.BookName();
    }
}
