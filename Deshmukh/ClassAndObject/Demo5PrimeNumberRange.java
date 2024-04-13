package ClassAndObject;

public class Demo5PrimeNumberRange {
    public static void main(String[] args) {
        for (int number = 1; number <= 1000; number++) {
            boolean isprime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                System.out.println(number);
            }

        }
    }
}
