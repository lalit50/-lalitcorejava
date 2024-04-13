package RelatianlOperators;

public class Demo1 {
    public static void main(String[] args) {
        int a = 433 ;
        int b = 736 ;
        int c = 487 ;
        int d = 999 ;
        int e = 985 ;

        // a =a +983;
        a +=983;

        // b = b -384;
        b -= 384;

        // c = c* 487 ;
        c *=487;

        // d = d /9 ;
        d /= 9;

        // e = e % 76 ;
         e %= 76 ;

         System.out.println("A voule of " +a );
        System.out.println("B voule of " +b );
        System.out.println("C voule of " +c);
        System.out.println("D voule of " +d );
        System.out.println("E voule of " +e );

        int total = a+b+c+d+e;
        System.out.println("total " +total );


    }
}
