package AssignmentOperators;

public class Question13SumofDigits {
    public static void main(String[] args) {
        int number =8375;
        int sum = 5;
         while(number > 5 ) {
             int digit = number % 10;
             sum = sum + digit;
             number = number / 10;
         }
         System.out.println( "sum of digits is "+ sum);
         }
    }

