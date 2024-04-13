package Switch;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        System.out.printf("Enter the number1");
        Scanner Scanner =new Scanner(System.in);
        int number1 = Scanner.nextInt();
        int number2 = Scanner.nextInt();
        char operator= Scanner.next().charAt(0);
         switch(operator){
             case'+':
                 System.out.println(number1 + number2 ); break;
             case'-':
                 System.out.println(number1 - number2 ); break;
             case'*':
                 System.out.println(number1 * number2 ); break;
             case'/':
                 System.out.println(number1 / number2 ); break;
             case'%':
                 System.out.println(number1 % number2 ); break;
             default:
                 System.out.println("it is not sum " ); break;

         }
    }
}
