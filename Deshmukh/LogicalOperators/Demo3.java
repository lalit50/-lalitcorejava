package LogicalOperators;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("Logical AND operation");
        System.out.println( 3 > 4 && 2 < 3);
        System.out.println( 6>9 && 8<4);

        System.out.println("Logical OR operation");
        System.out.println( 7<4 || 4>3);
        System.out.println( 3>7 || 6<3);
        System.out.println( 3>7 ^ 9<3);
        System.out.println(3>7 ^ 7<8 );



        // &, &&,AND : both operands should be true : Complution // mandate
        //| || OR : both operands false : false : optional
        //^ XOR : unique -: true

        System.out.println("Logical AND operation");
        System.out.println(10 > 3 && 3 > 2);//true
        System.out.println(10 < 3 && 3 < 2);//false
        System.out.println(10 > 3 && 3 < 2);//false
        System.out.println(10 < 3 && 3 > 2);//false

        System.out.println("Logical OR operation");
        System.out.println(10 > 3 || 3 > 2);//true
        System.out.println(10 < 3 || 3 < 2);//false
        System.out.println(10 > 3 || 3 < 2);//true
        System.out.println(10 < 3 || 3 > 2);//true

        System.out.println("Logical XOR operation"); // Unique
        System.out.println(10 > 3 ^ 3 > 2);//false
        System.out.println(10 < 3 ^ 3 < 2);//false
        System.out.println(10 > 3 ^ 3 < 2);//true
        System.out.println(10 < 3 ^ 3 > 2);//true
    }
}
