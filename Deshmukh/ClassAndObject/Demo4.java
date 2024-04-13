package ClassAndObject;

public class Demo4 {
    public static void main(String[] args) {
        int number =100;
        boolean isprime = true;
         // 1, number
        for (int i = 2; i<=number/2; i++){
            if (number% i ==0){
                isprime =false ;
                break;
            }
        }
        System.out.println(isprime?"its prime": "its not a prime");

    }
}
