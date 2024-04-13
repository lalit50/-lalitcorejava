package While;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sumofDigits = 0;
        while (number>0){
            int digit = number %10;
            sumofDigits = sumofDigits+digit;
            number =number /10;
        }
        System.out.println("sum of digits is "+sumofDigits);
    }
}
