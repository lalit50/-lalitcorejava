package LambdaExpression.Assments;

public class NunberLalitCall {
    public static void main(String[] args) {
        NunberLalit nunberLalitRef = (int a, int b) -> {
            return a + b;
        };
        System.out.println(nunberLalitRef.addd(2, 3));


        NunberLalit numRef = (int a, int b) -> a + b;
        System.out.println(numRef.addd(5, 4));

        NunberLalit avg = (int a, int b) -> (a+ b) / 2;
        System.out.println(avg.addd(8, 4));

        NunberLalit multiply = (int a, int b) -> a * b;
        System.out.println(multiply.addd(5, 4));

    }
}
