package AssignmentOperators;

public class SumOf2and3Digits {
    public static void main(String[] args) {
        int numInda = 32965;

        int digi2, digi3;
        digi2 = numInda / 1000;
        System.out.printf("\n digi2 " + digi2);
        digi2 = digi2 % 10;
        System.out.printf("\n digi2 " + digi2);

        digi3 = numInda / 10;
        System.out.printf("\n digi3 " + digi3);
        digi3 = digi3 % 10;
        System.out.printf("\n digi3 " + digi3);
    }
}
