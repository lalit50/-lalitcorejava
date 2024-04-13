package While;

import java.util.Scanner;

public class Demo6sumOfDigitCube {
    public static void main(String[] args) {
        // armtrong number : sum of digit cube =given number
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int originalNumbers = number;
        int sumofDigits = 0;
        while (number > 0) {
            int digit = number % 10;
            sumofDigits = sumofDigits + digit * digit * digit;
            number = number / 10;
        }

        System.out.println("sum of cube is " + sumofDigits);

        System.out.println(originalNumbers == sumofDigits ? "Arastrong number" : "not an Arastrong number");
    }
}
