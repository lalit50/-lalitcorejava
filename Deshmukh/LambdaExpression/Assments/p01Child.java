package LambdaExpression.Assments;

public class p01Child {
    public static void main(String[] args) {
        p01 nanaRef = (int n1, int n2) -> {
            return n1 + n2;
        };
            System.out.println(nanaRef.nana(46, 35));

            p01 multiply = (int n1, int n2) -> n1 * n2;
                System.out.println(nanaRef.nana(46, 35));
                p01 negetive = (int n1, int n2) ->
                    n1 - n2;
                    System.out.println(nanaRef.nana(46, 35));
                    p01 moda = (int n1, int n2) -> n1 % n2;
                        System.out.println(nanaRef.nana(46, 35));



        }
}