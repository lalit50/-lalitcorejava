package LoopLoop;

public class Assignment2 {
    // Function to demonstrate pattern
    public static void printPattern(int n){

//                          1
//                        2 1 2
//                      3 2 1 2 3
//                    4 3 2 1 2 3 4
//                   5 4 3 2 1 2 3 4 5
//                 6 5 4 3 2 1 2 3 4 5 6
//


        int i, j;
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            // inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                // printing column values upto the row
                // value.
                System.out.print(j + " ");
            }

            // print new line for each row
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String args[])
    {
        int n =7;
        printPattern(n);
    }
}
