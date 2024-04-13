package StringHandling;

public class Demo16StringBuilder {
    public static void main(String[] args) {
//        StringBuilder stringBuilder = "string handling session";//CTE
        StringBuilder stringBuilderRef = new StringBuilder("string handling session");
        stringBuilderRef.reverse();
        System.out.println(stringBuilderRef);
    }
}