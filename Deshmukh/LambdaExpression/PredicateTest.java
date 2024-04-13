package LambdaExpression;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate predicate = (input) -> true;
        System.out.println(predicate.test(""));


        Predicate<Integer> numberTest = (number) -> number % 7 == 0;
        System.out.print("Enter the numbers =");
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        System.out.print("it is =  ");


        System.out.println(numberTest.test(number));//true
//        System.out.println(numberTest.test();//false

    }
}
