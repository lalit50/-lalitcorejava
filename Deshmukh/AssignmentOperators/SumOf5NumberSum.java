package AssignmentOperators;

public class SumOf5NumberSum {
    public static void main (String[] args) {
         int  number =2735496;


        int digi1 , digi2, digi3  ;


          digi1 = number /100000;
         digi1 = digi1 %10;
        System.out.println("digi1   "+ digi1);


        digi2 = number / 1000;
         digi2 =digi2 %10 ;
        System.out.println("digi2   "+ digi2 );

        digi3 = number / 10;
        digi3 =digi3 %10 ;

        System.out.println("digi3   "+ digi3 );
        int SumOf3Number =  digi1+digi2+digi3 ;

        System.out.println("Sum of number 7+5+9 ="+"\t"+ SumOf3Number );
    }
}
