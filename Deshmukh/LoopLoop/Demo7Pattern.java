package LoopLoop;

public class Demo7Pattern {
    public static void main(String[] args) {
        int row;
        for (row = 1; row <= 5; row++) {
            //Spaces
            for (int space = row; space <= row; space++) {
                System.out.print("   *  ");
            }
            System.out.println();
        }

        for (int column = 5; column >= row; column--) {

            System.out.print("   *   ");
        }
        System.out.println();
    }
}
