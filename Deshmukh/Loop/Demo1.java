package Loop;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Enter the number ot find the  factorial");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {

        factorial = factorial * i;
    }

System.out.println("factorial of "+number+"is : "+factorial);
    }

    public static class Demo5 {
        public static void main(String[] args) {
            //*****
            //****
            //***
            //**
            //*


            for (int r = 1; r <= 4; r++) {
                for (int j = 5; j >= r; j--) {
                    System.out.print(+j);
                }
                System.out.println();
            }
        }
    }
}
