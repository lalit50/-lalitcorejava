package AssignmentOperators;

public class Question3 {
    public static void main(String[] args) {
        //- Write a program to add 8 to the number 2345 and then divide it by 3.
          //      - Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5.
            //    - Display the final result

        int number =2345;
        number = number + 8;   //number+= 8 ;
        number = number / 3;    //number/= 3 ;
        number = number % 5;     //number%= 5 ;
        number = number * 5;      //number*= 5 ;


        System.out.println ("final  fesult   "   + number);

    }
}
