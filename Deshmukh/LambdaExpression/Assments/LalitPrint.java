package LambdaExpression.Assments;

public class LalitPrint {
    public static void main(String[] args) {
        LalitPresa LalitRef = (String str2) -> System.out.print("Breking news" + str2);

         LalitRef.newsHeding("no good Breking news");


         LalitPrint2 lalitPrint2 = new LalitPrint2();
         lalitPrint2.newsHeding("in interface LalitPresa.java ");

    }
}
