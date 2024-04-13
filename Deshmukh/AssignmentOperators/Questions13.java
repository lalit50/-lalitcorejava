package AssignmentOperators;

public class Questions13 {
    public static void main (String[] args) {
    //Write a program to calculate the sum of the first and the second last digit of a 5 digit number.
        //E.g.- NUMBER : 12345          OUTPUT : 1+4=5

    int number;
        number = 12345;
        int sum = 0;

    int digit =number %1000 ;
     sum =sum +digit ;
     number = number /1000 ;

      digit =number % 10;
             sum =sum +digit ;

      number = number %10 ;

      digit =number /10 ;
       sum =sum +digit ;

               System.out.println("sum of digit "+ sum );

    }
}
