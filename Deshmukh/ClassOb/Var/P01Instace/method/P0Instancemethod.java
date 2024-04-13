package ClassOb.Var.P01Instace.method;

import java.util.Scanner;

public class P0Instancemethod {
    static void  p01method( int num ){
        System.out.println("SQuare is --- "+ num* num );

    }

    public static void main(String[] args) {
        int OriginaNumber =0;
        System.out.println(" enter the number");
        Scanner scannerRef = new Scanner(System.in);
       OriginaNumber= scannerRef.nextInt();

        System.out.println(  "Instace method " );
        p01method(OriginaNumber);
    }
}
