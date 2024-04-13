package AssignmentOperators;

public class RobertMarks {
        public static void main (String[] args) {

    //If the marks of Robert in three subjects are 75,85 and 56,38,55,60 respectively (each out of 100 ),
    // write a program to calculate his total marks and percentage marks.

    int English = 85 ;
    int Marth   = 60 ;
    int Maths   = 56 ;
    int Biology  = 38 ;
    int History  = 75 ;
    int Science  = 55 ;

    float TotaleMarks = English + Marth + Maths + Biology + History + Science ;


    System.out.println("  TotaleMarks "+ TotaleMarks);

    System.out.println( "  robert  percentage   is  =  " + TotaleMarks / 600 *100 );
}
}







