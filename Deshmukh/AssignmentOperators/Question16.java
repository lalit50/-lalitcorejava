package AssignmentOperators;

public class Question16 {
    public static void main(String[] args) {

        //Write a program to reverse a 3-digit number. E.g.-Number : 132 Output : 231

        int num = 132, reversed = 0;

        System.out.println("Original Number: " + num);

        // run loop until num becomes 0
        while(num != 0) {

            // get last digit from num
            int digit = num % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}


