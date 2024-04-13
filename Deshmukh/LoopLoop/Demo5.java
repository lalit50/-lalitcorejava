package LoopLoop;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        System.out.printf("Fast number of =");
        Scanner Scanner =new Scanner(System.in);
        int number = Scanner.nextInt();

        if (number%2 ==0) {

            System.out.println(  number +  "= number is a even  ");
        }else {
            System.out.println(" this number is Odd = " + number);
        }

    }
}
