package AssignmentOperators;

public class Question10 {
    public static void main(String[] args) {
        int a = 276;
        int b = 276;
        // Swapping means interchanging the values of the two variables E.g.- If entered value of x is 5 and y is 10
        // then afterswapping the value of x and y should become 10 and 5 respectively.)
        System.out.println("  befourswaping  "+ a + "\t" + b );

        int temp = a;
        a   =   b;
        b  = temp;

        System.out.println("  afterswaping  "+ a + "\t" + b );

    }
}
