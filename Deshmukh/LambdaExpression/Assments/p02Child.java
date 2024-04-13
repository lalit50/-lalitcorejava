package LambdaExpression.Assments;

public class p02Child {
    public static void main(String[] args) {
        p02pre p02PreRef = (int g1, int g2) -> {
            return g1 + g2;
        };
        System.out.println(p02PreRef.lameda(64 ,76 ));

        p02pre avg = (int g1, int g2) ->  (g1 + g2)/2;
        System.out.println(p02PreRef.lameda(64 ,76 ));

    }


}
